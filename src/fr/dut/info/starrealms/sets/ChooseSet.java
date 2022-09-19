package fr.dut.info.starrealms.sets;

import java.util.ArrayList;
import java.util.Scanner;

import fr.dut.info.starrealms.Base;

public class ChooseSet {

	public static ArrayList<String> chooseSet() {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> result = new ArrayList<>();
		
		System.out.println("Choisissez un set : ");
		
		int choice = 1;
		
		while (choice > 0 && choice < 6) {
			
			StringBuilder sb = new StringBuilder();
			
			if (result.contains("CoreSet")) {
				sb.append("\t[o] 1 : Core Set\n");
			}
			else {
				sb.append("\t[ ] 1 : Core Set\n");
			}
			
			if (result.contains("United")) {
				sb.append("\t[o] 2 : United\n");
			}
			else {
				sb.append("\t[ ] 2 : United\n");
			}
			
			if (result.contains("Crisis")) {
				sb.append("\t[o] 3 : Crisis\n");
			}
			else {
				sb.append("\t[ ] 3 : Crisis\n");
			}
			
			if (result.contains("ColonyWars")) {
				sb.append("\t[o] 4 : Colony Wars\n");
			}
			else {
				sb.append("\t[ ] 4 : Colony Wars\n");
			}
			
			if (result.contains("Gambit")) {
				sb.append("\t[o] 5 : Gambit\n");
			}
			else {
				sb.append("\t[ ] 5 : Gambit\n");
			}
			
			sb.append("\t(Tapez un autre nombre pour valider)");
			
			System.out.println(sb.toString());
			
			
			
            choice = scanner.nextInt();
            
        	switch (choice) {
			case 1: {
				if (result.contains("CoreSet")) {
					result.remove("CoreSet");
					break;
				}
				result.add("CoreSet"); break;
			}
			case 2: {
				if (result.contains("United")) {
					result.remove("United");
					break;
				}
				result.add("United"); break;
			}
			case 3: {
				if (result.contains("Crisis")) {
					result.remove("Crisis");
					break;
				}
				result.add("Crisis"); break;
			}
			case 4: {
				if (result.contains("ColonyWars")) {
					result.remove("ColonyWars");
					break;
				}
				result.add("ColonyWars"); break;
			}
			case 5: {
				if (result.contains("Gambit")) {
					result.remove("Gambit");
					break;
				}
				result.add("Gambit"); break;
			}
			default:
				break;
			}
            
            
            
		}
		
		return result;
	}

}
