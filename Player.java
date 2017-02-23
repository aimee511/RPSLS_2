package co.za.entelect.jbootcamp;

/**
 * Created by aimee.nortje on 2/21/2017.
 */
public class Player {
    private String name;
    //private int score;
    private int chosenWarrior;

    public int getChosenWarrior() {
        return chosenWarrior;
    }

    public void setChosenWarrior(int chosenWarrior) {
        this.chosenWarrior = chosenWarrior;
    }

    public Player() {
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





}
