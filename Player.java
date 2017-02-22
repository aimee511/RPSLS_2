package co.za.entelect.jbootcamp;

/**
 * Created by aimee.nortje on 2/21/2017.
 */
public class Player {
    private String name;
    private int score;
    private int chosenWarrior;

    public int getChosenWarrior() {
        return chosenWarrior;
    }

    public void setChosenWarrior(int chosenWarrior) {
        this.chosenWarrior = chosenWarrior;
    }

    //outcome: won=1 lost=0
    private int outcome;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //increase the c=score of the playere that won the round
    private void winIncrease(String name, int outcome){

    }


}
