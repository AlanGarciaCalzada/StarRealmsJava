package fr.dut.info.starrealms.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import fr.dut.info.starrealms.*;
import static fr.dut.info.starrealms.GameCombatMort.*;
import static fr.dut.info.starrealms.sets.Set.*;
import static fr.dut.info.starrealms.sets.ChooseSet.*;

public class MainGameCombatMort {

	public static void main(String[] args, Scanner scanner) throws IOException, ClassNotFoundException {
		
		String saveChoice = "n";
		
		if (Files.exists(Path.of("gameCM"))) {
			
			System.out.println("Charger la sauvegarde ? Y/N");
			saveChoice = scanner.nextLine();
		}
		
		if (saveChoice.equals("Y")) {
			GameCombatMort game = restore();
			
			Shop shop = game.getShop();
									
			while (!game.hasWinner()) {
												
				Player player = game.getPlayer(game.getTour());
				
				if (player.isDead()) {
					game.playerDead(game.getTour());
					
					System.out.println(player.toString() + " est hors jeu, il est mort.");
					continue;
				}
				
				System.out.println("C'est au tour de " + player.getName() + " .");
				
				game.menu(player, shop, scanner);
				
				player.endTurn();
				
				game.nextTour();
				
				
			}
			
			scanner.close();
			
		}
		else {
			
			ArrayList<String> setName = chooseSet();
			
			while (setName.isEmpty()) {
				
				System.out.println("Vous n'avez pas choisi de set(s)");
				setName = chooseSet();
				
			}
			
			Deck setsDeck = new Deck();
			
			for (String string : setName) {
				
				setsDeck.addAllFrom(shopSet(string));
				
			}
			
			setsDeck.shuffle();
			
			Shop shop = new Shop(setsDeck);
			
			for (int i = 0; i < 5; i++) {
				
				shop.refresh();
				
			}
			
			System.out.println("Nombre de joueurs (>2) : ");
			int noOfPlayers = scanner.nextInt();
			while (noOfPlayers < 3) {
				
				System.out.println("Il faut être plus de 2 :)");
				
				System.out.println("Nombre de joueurs (>2) : ");
				noOfPlayers = scanner.nextInt();
				scanner.nextLine();
				
			}
			
			scanner.nextLine();
			
			ArrayList<Player> players = new ArrayList<>();
			
			for (int i = 0; i < noOfPlayers; i++) {
				
				System.out.println("Entrez le nom du joueur " + (i + 1) + " : ");
				players.add(new Player(scanner.nextLine(), playerDeck(), shop));
				
			}
			
			players.get(0).draw(3);
			players.get(1).draw(4);
			
			for (int i = 2; i < noOfPlayers; i++) {
				players.get(i).draw(5);
			}
			
			Random rd = new Random();
			int	tour = rd.nextInt();
			while (tour < 0) {
				tour = rd.nextInt();
			}			
			
			GameCombatMort game = new GameCombatMort(players, shop, tour);		
			
			while (!game.hasWinner()) {
				
				Player player = game.getPlayer(game.getTour());
				
				if (player.isDead()) {
					game.playerDead(game.getTour());
					
					System.out.println(player.toString() + " est hors jeu, il est mort.");
					continue;
				}
				
				System.out.println("C'est au tour de " + player.getName() + " .");
				
				game.menu(player, shop, scanner);
				
				player.endTurn();
				
				game.nextTour();
				
				
			}
			
			System.out.println("Félicitations " + game.getPlayer(0).toString() + " ! Vous venez de gagner ce combat à mort !\n");
			
			System.out.println("Appuyez pour stopper le programme.");
			scanner.nextLine();
			
			scanner.close();
			
		}
		
		
	}

}
