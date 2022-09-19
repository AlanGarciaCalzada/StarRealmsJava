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
import java.util.Scanner;

import fr.dut.info.starrealms.Card;

public class GameChasseHomme extends GameCombatMort implements Serializable{

	public GameChasseHomme(ArrayList<Player> players, Shop shop, int tour) {
		super(players, shop, tour);
	}
	
	@Override
	public Player battlePlayer(Player player, Scanner scanner) {
		return players.get((super.getTour() + 1) % playersNo);
	}
	
	public static GameChasseHomme restore() throws IOException, ClassNotFoundException {
        
        Path path = Path.of("gameCH");
        
        try(InputStream back = Files.newInputStream(path);
            ObjectInputStream in = new ObjectInputStream(back)){
            return (GameChasseHomme) in.readObject(); // recuperation
        }
    }
    
    @Override
    public void save(Scanner scanner) throws IOException {
        
        scanner.close();
        
        Path path = Path.of("gameCH");
        
        try (OutputStream back = Files.newOutputStream(path);
                 ObjectOutputStream out = new ObjectOutputStream(back)){
                out.writeObject(this);// sauvegarde
            }
        
        System.exit(1);
        
    }
	
}
