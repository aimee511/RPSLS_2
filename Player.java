package co.za.entelect.jbootcamp;

/**
 * Created by aimee.nortje on 2/21/2017.
 */
public class Player {
    private String name;
    //private int score;
    private int chosenWarrior;
    private Warrior chosenWarriorObject;
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Warrior getChosenWarriorObject(int warriorIndex) {
        return chosenWarriorObject;
    }

    public void setChosenWarriorObject(Warrior chosenWarriorObject) {
        this.chosenWarriorObject = chosenWarriorObject;
       // System.out.println("Player Class - player chosen warrior set: " + chosenWarriorObject.getName());
    }

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
