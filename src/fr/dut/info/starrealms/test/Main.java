package fr.dut.info.starrealms.test;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		System.out.print(
				"╔════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗\r\n" +
				"║      _______.___________.    ___      .______         .______       _______     ___       __      .___  ___.      _______. ║\r\n" + 
				"║     /       |           |   /   \\     |   _  \\        |   _  \\     |   ____|   /   \\     |  |     |   \\/   |     /       | ║\r\n" + 
				"║    |   (----`---|  |----`  /  ^  \\    |  |_)  |       |  |_)  |    |  |__     /  ^  \\    |  |     |  \\  /  |    |   (----` ║\r\n" + 
				"║     \\   \\       |  |      /  /_\\  \\   |      /        |      /     |   __|   /  /_\\  \\   |  |     |  |\\/|  |     \\   \\     ║\r\n" + 
				"║ .----)   |      |  |     /  _____  \\  |  |\\  \\----.   |  |\\  \\----.|  |____ /  _____  \\  |  `----.|  |  |  | .----)   |    ║\r\n" + 
				"║ |_______/       |__|    /__/     \\__\\ | _| `._____|   | _| `._____||_______/__/     \\__\\ |_______||__|  |__| |_______/     ║\r\n" + 
				"║                                                                                                                            ║\r\n" +
				"╚════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝\r\n");
		
		System.out.println("Choisissez une partie :\n\t1 : Partie normale\n\t2 : Combat à Mort\n\t3 : Chasse à l'homme");
		
		Scanner scanner = new Scanner(System.in);
		
		int choice = scanner.nextInt();
		
		while (choice > 3 || choice < 1) {
			System.out.println("Mauvais choix, veuillez choisir un mode de jeu valide.");
			choice = scanner.nextInt();
		}
		
		scanner.nextLine();
		
		switch (choice) {
		case 1: {
			
			MainGameNormal.main(args, scanner);
			break;
		}
		case 2: {
			
			MainGameCombatMort.main(args, scanner);
			break;
		}
		case 3: {
			
			MainGameChasseHomme.main(args, scanner);
			break;
		}
		default:
			scanner.close();
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}

	}

}
