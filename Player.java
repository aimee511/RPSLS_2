package co.za.entelect.jbootcamp;

/**
 * Created by aimee.nortje on 2/21/2017.
 */
public class Player {
    private String name;
    private Warrior chosenWarriorObject;
    private String choseWarriorString;
    private int score = 0;

    public String getChoseWarriorString() {
        return choseWarriorString;
    }

    public void setChoseWarriorString(String choseWarriorString) {
        this.choseWarriorString = choseWarriorString;
    }

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
        return chosenWarriorObject;
    }

    public void setChosenWarriorObject(Warrior chosenWarriorObject) {
        this.chosenWarriorObject = chosenWarriorObject;
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
