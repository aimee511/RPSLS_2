package co.za.entelect.jbootcamp;

/**
 * Created by aimee.nortje on 2/22/2017.
 */
public class Score extends Player{

    private int score;
    private Player player1;
    private Player player2;

    //Win: 1 vs Lost: -1 vs Draw: 0
    private int outcome;

    //SCORE handler
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //increase the c=score of the player that won the round
    private void winIncrease(String name, int outcome){

    }
}
