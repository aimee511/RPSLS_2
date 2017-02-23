package co.za.entelect.jbootcamp;

/**
 * Created by aimee.nortje on 2/22/2017.
 */
public class Score extends Player{

    private int score;
    private Player player1;
    private Player player2;
    private Warrior player1Warrior;
    private Warrior player2Warrior;

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

    // returns 1 if player 1 wins, 0 if draw and -1 if player 1 loses
    public static int determineWinner(Warrior player1Warrior, Warrior player2Warrior){

        if(player2Warrior.isInDefeatedList(player1Warrior)) {

            return 1;
        }


            else if(player1Warrior.getName().equals(player2Warrior.getName())) return 0;
                else return -1;
    }







}
