package co.za.entelect.jbootcamp;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by aimee.nortje on 2/21/2017.
 */
public class Player {
    private String name;
    private Warrior chosenWarrior;
    private int score = 0;
    Scanner scanner = new Scanner(System.in);
    //private static Scanner scanner = new Scanner(System.in);


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void incrementScore() {
        this.score++;
    }

    public Warrior getChosenWarriorObject(int warriorIndex) {
        return chosenWarrior;
    }

    public void setChosenWarrior(Warrior chosenWarrior) {
        this.chosenWarrior = chosenWarrior;
    }

    public Player(String name) {
        this.name = name;
    }

    //get PLAYER name
    public String getName() {
        return name;
    }

    //set PLAYER name
    public void setName(String name) {
        this.name = name;
    }

    public static void setPlayers(List<Player> players, String playerName){
            players.add(new Player(playerName));
    }

    public void setPlayerWarrior(Map<Player, Warrior> playerWarriorMap, List<Warrior> warriorList,
                                        Player player) {

            player.chosenWarrior = Warrior.getWarriorByName(warriorList, scanner.next());
            playerWarriorMap.put(player, player.chosenWarrior);
    }
}
