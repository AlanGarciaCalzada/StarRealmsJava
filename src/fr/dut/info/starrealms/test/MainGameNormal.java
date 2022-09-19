package fr.dut.info.starrealms.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import fr.dut.info.starrealms.*;
import static fr.dut.info.starrealms.GameNormal.*;
import static fr.dut.info.starrealms.sets.Set.*;
import static fr.dut.info.starrealms.sets.ChooseSet.*;

public class MainGameNormal {

	public static void main(String[] args, Scanner scanner) throws IOException, ClassNotFoundException {
		
		String saveChoice = "n";
		
		if (Files.exists(Path.of("gameN"))) {
			
			System.out.println("Charger la sauvegarde ? Y/N");
			saveChoice = scanner.nextLine();
		}
		
		if (saveChoice.equals("Y")) {
			GameNormal game = restore();
			
			Player player1 = game.getPlayer1();
			Player player2 = game.getPlayer2();
			
			Shop shop = game.getShop();
			
			boolean player1Turn;
			
			if (game.getTour() == 1) {
				player1Turn = true;
			}
			else {
				player1Turn = false;
			}
			
			while (!player1.isDead() && !player2.isDead()) {
				if (player1Turn) {
						
					System.out.println("\nC'est au tour de " + player1.getName());
					
					menu(player1, player2, shop, scanner, game);
					
					player1.endTurn();
					
					player1Turn = false;
				}
				else {
					
					System.out.println("\nC'est au tour de " + player2.getName());
					
					menu(player2, player1, shop, scanner, game);
									
					player2.endTurn();
					
					player1Turn = true;
				}
				
			}
			
			scanner.close();
			
		}
		else {
			
			ArrayList<String> setName = chooseSet();
			
			while (setName.isEmpty()) {
				
				System.out.println("\nVous n'avez pas choisi de set(s)");
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
			
			System.out.println("\nEntrez le nom du joueur 1 : ");
			String player1Name = scanner.nextLine();
			Deck deckPlayer1 = playerDeck();
			Player player1 = new Player(player1Name, deckPlayer1, shop);
			
			
			System.out.println("\nEntrez le nom du joueur 2 : ");
			String player2Name = scanner.nextLine();
			Deck deckPlayer2 = playerDeck();
			Player player2 = new Player(player2Name, deckPlayer2, shop);
			
			Random rd = new Random();
			boolean	player1Turn = rd.nextBoolean();
			
			int tour;
			
			if (player1Turn) {
				
				tour = 1;
				
				System.out.println("\n" + player1.getName() + " c'est à vous de commencer !");
				
			}
			else {
				
				tour = 2;
				
				System.out.println("\n" + player2.getName() + " c'est à vous de commencer !");
			
			}
			
			player1.draw(5);
			player2.draw(5);
			
			GameNormal game = new GameNormal(player1, player2, shop, tour);		
			
			while (!player1.isDead() && !player2.isDead()) {
				if (player1Turn) {
					
					System.out.println("\nC'est au tour de " + player1.getName());
					
					menu(player1, player2, shop, scanner, game);
					
					
					player1.endTurn();
					game.nextTour();
				
					player1Turn = false;
				}
				else {
					
					System.out.println("\nC'est au tour de " + player2.getName());
					
					menu(player2, player1, shop, scanner, game);
									
					player2.endTurn();
					game.nextTour();
					
					player1Turn = true;
				}
				
			}
			
			if (player1.isDead()) {
				
				System.out.println("\nFélicitations " + player2.getName() + " pour ta victoire !");
			}
			else {
				
				System.out.println("\nFélicitations " + player1.getName() + " pour ta victoire !");
			}
			
			System.out.println("\nAppuyez pour stopper le programme.");
			scanner.nextLine();
			
			scanner.close();
			
		}
		
		
	}

}
