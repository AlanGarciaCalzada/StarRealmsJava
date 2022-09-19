package fr.dut.info.starrealms;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import fr.dut.info.starrealms.Card;

public class GameCombatMort implements Serializable{
	
	protected final ArrayList<Player> players;
	
	private final Shop shop;
	
	private int tour;
	protected int playersNo;
	
	public GameCombatMort(ArrayList<Player> players, Shop shop, int tour) {
			
		this.players = players;
		this.playersNo = players.size();
		this.shop = shop;
		this.tour = tour % playersNo;;
			
	}
	

	public Player getPlayer(int index) {	
		return players.get(index);
	}
	

	public Shop getShop() {
		return shop;
	}
	

	public int getTour() {
		return tour;
	}

	
	public int nextTour() {
		tour = (tour + 1) % playersNo;
		return tour;
	}
	
	
	public int getPlayersNo() {
		return playersNo;
	}
	
	
	public int playerDead(int i) {
		players.remove(i);
		playersNo--;
		return playersNo;
	}
	
	
	public boolean checkDead() {
		
		for (int i = 0; i < playersNo; i++) {
			
			if (players.get(i).isDead()) {
				
				this.playerDead(i);
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	
	public boolean hasWinner() {
		
		return playersNo <= 1;
		
	}
	
	
	public Player battlePlayer(Player player, Scanner scanner) {
		
		StringBuilder sb = new StringBuilder();
		
		HashMap<Integer, Player> help = new HashMap<>();
		
		int choice = 1;
		
		for (int i = 0; i < playersNo; i++) {
			
			if (player.equals(players.get(i))) {
				continue;
			}
			
			help.put(i + 1, players.get(i));
			
			sb.append(i + 1).append(" : ").append(players.get(i)).append("\n");
		}
		System.out.println("Qui voulez vous combattre ?");
		System.out.println(sb.toString());
		
		choice = scanner.nextInt();
		scanner.nextLine();
			
		while (!help.containsKey(choice)) {
			System.out.println("\nMauvais choix " + choice);
			System.out.println("Qui voulez vous combattre ?");
			System.out.println(sb.toString());
			
			choice = scanner.nextInt();
			
		}
		
		return help.get(choice);
		
	}
	

	public boolean menu(Player player, Shop shop, Scanner scanner) throws IOException {
		int choice = -2;
		int oldChoice = choice;
		
		while (choice != 5) {
			System.out.println("\nVotre main :\n" + player.getHandRow());
			System.out.println("\nCartes en jeu :\n\tSpaceShips : \n" +  player.getPlayRow() + "\n\tBases/Heroes : \n" + player.getBasesRow().toString());
			System.out.println(player);
			System.out.println("\n # [ 1 : Poser une carte | 2 : Shop | 3 : Actionner une carte | 4 : Attaquer | 5 : Fin de tour | 6 : Sauvegarder et quitter ]");
			choice = scanner.nextInt();
			
			switch (choice) {
			case 5: {
				if (!player.getHandRow().isEmpty()) {
					System.out.println("\nImpossible, vous avez encore des des cartes à jouer !");
					choice = -2;
					break;
				}
				System.out.println("\nTour terminé !");
				return true;
			}
			case 1: {
				
				if (player.getHandRow().isEmpty()) {
					System.out.println("\nImpossible, toutes les cartes ont été posées.");
					break;
				}
				
				playCardMenu(player, scanner); break;
				
			}
			case 2: {
				
				goShop(player, shop, scanner); break;
				
			}
			case 3: {
				
				useCard(player, scanner); break;
				
			}
			case 4: {
				
				if (player.getCombat() <= 0) {
					System.out.println("\nVous n'avez pas de point de combat.");
					break;
				}
				
				this.checkDead();
				
				
				attack(player, battlePlayer(player, scanner), scanner); break;
				
			}
			case 6: {
				
				this.save(scanner);
				
			}
			default:
				oldChoice = choice;
				choice = -2;
				System.out.println("\nMauvais choix : " + oldChoice);
			}
			
		}
		return false;
		
	}
	
	public static boolean playCardMenu(Player player, Scanner scanner) {
		
		int choice = -2;
		int oldChoice = choice;
		
		while (choice != 3) {
			
			System.out.println("\nVotre main :\n" + player.getHandRow());
			System.out.println(player);
			System.out.println("\n # [ 1 : Poser une carte | 2 : Poser toutes les cartes | 3 : Retour ]");
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1: {
				
				putCard(player, scanner);
				System.out.println("\nVoici les cartes que vous venez de poser\n");
				System.out.println("\nCartes en jeu :\n\tSpaceShips : \n" +  player.getPlayRow() + "\n\tBases/Heroes : \n" + player.getBasesRow().toString());
				if (player.getHandRow().isEmpty()) {
					System.out.println("\nToutes les cartes ont été posées, retour . . .");
					return true;
				}
				break;
			}
			case 2: {
				
				player.playAllCard();
				System.out.println("\nVoici les cartes que vous venez de poser\n");
				System.out.println("\nCartes en jeu :\n\tSpaceShips : \n" +  player.getPlayRow() + "\n\tBases/Heroes : \n" + player.getBasesRow().toString());
				System.out.println("\nToutes les cartes ont été posées, retour . . .");
				return true;
				
			}
			case 3: {
				System.out.println("\nRetour . . .");
				return true;
			}
			default:
				oldChoice = choice;
				choice = -2;
				System.out.println("\nMauvais choix : " + oldChoice);
			}
			
		}
		return false;
		
	}
	
	public static boolean putCard(Player player, Scanner scanner) {
		
		
		int choice = -2;
		
		while (choice != -1) {
			if (player.getHandRow().isEmpty()) {
				return true;
			}
			System.out.println("\n" + player.getHandRow());
			System.out.println(player);
			System.out.println("Choissez une carte à poser : ");
			System.out.println("(-1 pour revenir en arrière)");
					
			choice = scanner.nextInt();
			
			if (choice == -1) {
				
				System.out.println("\nRetour . . .");
				return true;
			}
			
			try {
				player.playCard(player.getHandRow().getCard(choice - 1));
				player.refreshAlly();
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("\nMauvais choix : " + choice);
			}
		}
		return false;
		
	}
	
	public static boolean goShop(Player player, Shop shop, Scanner scanner) {
		
		
		
		int choice = -2;
		int oldChoice = choice;
		
		
		while (choice != 0) {
			System.out.println("\nShop : " + shop);
			System.out.println("\n" + player);
			System.out.println(" # [ 1 : Acheter une carte | 2 : Acheter un Explorer | 3 : Retour ]");
			choice = scanner.nextInt();
			
			switch (choice) {
			case 0: {
				
				System.out.println("\nRetour . . .");
				return true;
			}
			case 1: {
				
				buyInShop(player, shop, scanner); break;
				
			}
			case 2: {
				
				if (!buyExplorer(player, shop, scanner)) {System.out.println("\nVous n'avez pas assez de points d'échange.");}
				else {System.out.println("\nEchange effectué avec succès!");}
				break;
			}
			case 3: {
				
				System.out.println("\nRetour . . .");
				return true;
			}
			default:
				oldChoice = choice;
				choice = -2;
				System.out.println("\nMauvais choix : " + oldChoice);
			}
			
		}
		return false;
	}
	
	public static boolean buyInShop(Player player, Shop shop, Scanner scanner) {
		
		
		int choice = -2;
		
		while (choice != -1) {
			
			System.out.println("\nShop : \n" + shop);
			System.out.println(player);
            System.out.println("Choisissez une carte à acheter : ");
            System.out.println("(-1 pour revenir en arrière)");
            
            choice = scanner.nextInt();
            
            if (choice == -1) {
            	
				System.out.println("\nRetour . . .");
				break;
			}
            
            try {
            	Card cardToBuy = shop.getCard(choice - 1); 
    			
                if (player.buy(cardToBuy)){
                   System.out.println("\nAchat bien effectué !");
                   System.out.println("\nIl vous reste " + player.getTrade() + " point(s) d'échange");
            	   continue;
            	}
            	else{
            	  System.out.println("\nVous ne pouvez pas acheter cette carte."); 
            	}
                
            } catch (Exception e) {
            	System.out.println(e);
            	System.out.println("\nMauvais choix : " + choice); continue;
            }
            
		}
		return false;
	}
	
	public static boolean buyExplorer(Player player, Shop shop, Scanner scanner) {
		return player.buyExplorer();		
	}
	
	public static boolean useCard(Player player, Scanner scanner) {
		
		
		int choice = -2;
		
		while (choice != -1) {
			
			System.out.println("\n" + player.getPlayRow());
			System.out.println(player);
            System.out.println("Choisissez une carte à jouer : ");
            System.out.println("(-1 pour revenir en arrière)");
            
            choice = scanner.nextInt();
            
            if (choice == -1) {
            	
				System.out.println("\nRetour . . .");
				return true;
			}
            
            try {
            	Card cardToUse = player.getPlayRow().getCard(choice - 1);
            	
            	activateCardEvents(player, cardToUse, scanner);
            	
            } catch (Exception e) {
            	System.out.println(e);
            	System.out.println("\nMauvais choix : " + choice); continue;
            }
            
            
            
		}
		return false;
		
	}
	
	public static boolean activateCardEvents(Player player, Card cardToUse, Scanner scanner) {
		
		
		int choice = -2;
		int oldChoice = choice;
		
		while (choice != 4) {
			
			boolean drawEvent = cardToUse.getDraw()!=0 && !cardToUse.isDrawActivated();
			boolean scrapEvent = cardToUse.hasScrap() && !cardToUse.isScrapActivated() && cardToUse.getScrap().isPossible(player.getPlayRow().getBaseNo(), player.getPlayRow().getSpaceShipNo());
			boolean allyEvent = cardToUse.hasAlly() && !cardToUse.isAllyActivated() && cardToUse.getAlly().isPossibleWithFactNo(player.getPlayRow().getBaseNo(), player.getPlayRow().getSpaceShipNo(), player.getPlayRow().getCardNoByFaction(cardToUse.getFaction()));
			
			StringBuilder toShow = new StringBuilder();
			toShow.append("\n # [ ");
						
			if (drawEvent) {
				toShow.append("1 : Piocher ").append(cardToUse.getDraw()).append(" cartes");
			}
			
			if (scrapEvent) {
				if (drawEvent) {
					toShow.append("| ");
				}
				toShow.append("2 : Détruire la carte");
			}
			
			if (allyEvent) {
				
				if (drawEvent || scrapEvent) {
					toShow.append(" | ");
				}
				
				toShow.append("3 : Activer le bonus de faction de la carte");
			}
			
			if (allyEvent || drawEvent || scrapEvent) {
				toShow.append(" | ");
			}
			
			toShow.append("4 : Retour ]\nDescription de la carte :\n");
			
			toShow.append(cardToUse);
			
			System.out.println(player);
			System.out.println(toShow.toString());
			
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1: {
				if (!drawEvent) {
					System.out.println("\nMauvais choix : " + choice);
					break;
				}
				
				player.toggleCardEvent(cardToUse); break;
			}
			case 2:{
				if (!scrapEvent) {
					System.out.println("\nMauvais choix : " + choice);
					break;
				}
				
				player.scrapCard(cardToUse); return true;			
			}
			case 3:{
				if (!allyEvent) {
					System.out.println("\nMauvais choix : " + choice);
					break;
				}
				
				player.allyCard(cardToUse); break;
			}
			case 4:{
				
				System.out.println("\nRetour . . .");
				return true;
			}
			default:
				oldChoice = choice;
				choice = -2;
				System.out.println("\nMauvais choix : " + oldChoice);
			}
			
		}
		
		return false;
	}
	
	public static boolean attack(Player player, Player opponent, Scanner scanner) {
		
		int choice = -2;
		int oldChoice = choice;
		
		while (choice != 3) {
			
			System.out.println("\nVous : " + player);
			System.out.println("Adversaire : " + opponent);
			System.out.println(" # [ 1 : Base | 2 : Joueur | 3 : Retour ]");
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1: {
				
				attackBase(player, opponent, scanner);
				choice = 3;
				break;
				
			}
			case 2:{
				if (opponent.isProtected()) {
					System.out.println("\nLe joueur adverse est protégé par une base, détruisez la avant de l'attaquer directement!");
					break;
				}
				else {
					System.out.println("");
				}
				System.out.println("Vous attaquez l'adversaire...");
				System.out.println("Vous lui infligez " + player.getCombat() + " point(s) d'attaque");
				player.attackPlayer(opponent);
				System.out.println("L'adversaire a mainteanant " + opponent.getAuthority() + " point(s) d'authorité.");
				choice = 3;
				break;
			}
			case 3:{
				break;
			}
			default:
				oldChoice = choice;
				choice = -2;
				System.out.println("\nMauvais choix : " + oldChoice);
				break;
			}
			
		}
		return true;
	}
	
	public static boolean attackBase(Player player, Player opponent, Scanner scanner) {
		
		int choice = -2;
		
		while (choice != -1) {
			
			System.out.println("\n" + opponent.getBasesRow());
			System.out.println("Vous : " + player);
			System.out.println("Adversaire : " + opponent);
            System.out.println("Choisissez une carte à jouer : ");
            System.out.println("(-1 pour revenir en arrière)");
            
            choice = scanner.nextInt();
            
            if (choice == -1) {
            	
				System.out.println("\nRetour . . .");
				return true;
			}
            
            try {
            	Base cardToUse = (Base) player.getBasesRow().getCard(choice - 1);
            	
            	System.out.println("\nVous attaquez la base ennemie...");
				System.out.println("Vous lui infligez " + player.getCombat() + " point(s) d'attaque");
            	
            	player.attackBase(cardToUse);
            	if (cardToUse.isDead()) {
					opponent.discardCard(cardToUse);
					System.out.println("La base est détruite.");
				}
            	else {
            		System.out.println("La base a maintenant " + cardToUse.getDefense() + " point(s) de défense.");
				}
            	
            } catch (Exception e) {
            	System.out.println(e);
            	System.out.println("\nMauvais choix : " + choice); continue;
            }
            
            
            
		}
		return false;
	}
	
	public void save(Scanner scanner) throws IOException {
        
        scanner.close();
        
        Path path = Path.of("gameCM");
        
        try (OutputStream back = Files.newOutputStream(path);
                 ObjectOutputStream out = new ObjectOutputStream(back)){
                out.writeObject(this);// sauvegarde
            }
        
        System.exit(1);
        
    }
    
    public static GameCombatMort restore() throws IOException, ClassNotFoundException {
        
        Path path = Path.of("gameCM");
        
        try(InputStream back = Files.newInputStream(path);
            ObjectInputStream in = new ObjectInputStream(back)){
            return (GameCombatMort) in.readObject(); // recuperation
        }
    }
}
