package co.za.entelect.jbootcamp;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String warriorName;
        Player player1 = new Player();
        Player player2 = new Player();
        String opponentSelect;
        int playerChosenWarriorInt;
        int compChosenWarriorInt;
        Warrior playerChosenWarrior;
        Warrior compChosenWarrior;
        int score;


        //TODO add all warriors to the list so that the list can be dynamically changed to display all game options
        ArrayList<Warrior> warriors = new ArrayList<>();


        //CREATE NEW WARRIORS
        //TODO: create method to "Create Warriors" that adds them to the array list
        //TODO: LATER - create method to remove warriors
        Warrior rock = new Warrior("Rock");
        warriors.add(rock);
        Warrior paper = new Warrior("Paper");
        warriors.add(paper);
        Warrior scissors = new Warrior("Scissors");
        warriors.add(scissors);
        Warrior lizard = new Warrior("Lizard");
        warriors.add(lizard);
        Warrior spock = new Warrior("Spock");
        warriors.add(spock);



        //NEW defeated warriors after classes have been split (WarriorRelationship class)

        //CREATE DEFEATS

        //TODO the below to a list that can be iteration through (based on the "Warrior" list)
        rock.createDefeatedWarrior(scissors, "crushes");
        rock.createDefeatedWarrior(lizard, "crushes");

        paper.createDefeatedWarrior(rock, "covers");
        paper.createDefeatedWarrior(spock, "disproves");

        scissors.createDefeatedWarrior(lizard, "decapitates");
        scissors.createDefeatedWarrior(paper, "cuts");

        lizard.createDefeatedWarrior(paper,"eats");
        lizard.createDefeatedWarrior(spock, "poisons");

        spock.createDefeatedWarrior(scissors, "smashes");
        spock.createDefeatedWarrior(rock, "vaporizes");


        //DISPLAY WARRIORS DYNAMICALLY
        System.out.println("*** - THE WARRIORS - ***" + "\n");
        for(Warrior temp : warriors){
            System.out.println(warriors.indexOf(temp) + ": " + temp.getName() + "\n");
        }

        //DISPLAY ALL RELATIONSHIPS
        //TODO - create method to display these in order
        System.out.println("*** - THE RULES - ***");
        rock.displayWarriorRelationshipList();
        paper.displayWarriorRelationshipList();
        scissors.displayWarriorRelationshipList();
        lizard.displayWarriorRelationshipList();
        spock.displayWarriorRelationshipList();

//      SELECT OPPONENT
        System.out.println("Do you  want to play against the computer? Y/N" + "\r");
        if(scanner.next().toLowerCase().trim().equals("y")){
            player2.setName("computer");
        } else {
            System.out.println("Please enter Player 2's name: " + "\r");
            player2.setName(scanner.next());
        }

//      SHOW SELECTED OPPONENT
        System.out.println("\n" + "Your opponent is: " + player2.getName() + "\n");
//        TODO DoSomething if the opponent in not "Computer"


//      TODO: Ensure the Player class keeps the score
//      TODO: user can choose when to quit
//      SELECT Warrior!!
        System.out.println("Please select your warrior: " + "\r");

        playerChosenWarrior = warriors.get(scanner.nextInt());

        //setPlayer1 warrior
        player1.setChosenWarriorObject(playerChosenWarrior);

        System.out.println(playerChosenWarrior.getName());


//        GENERATE RANDOM
        Random generator = new Random();
        int randIndex = generator.nextInt(warriors.size());
        compChosenWarrior = warriors.get(randIndex);

        //TODO add the sam functionality as below for when the user is ot playing against the computer
        System.out.println("Your opponent has selected: " + compChosenWarrior.getName());
        player2.setChosenWarriorObject(compChosenWarrior);

        //DETERMINE WINNER
        score = Score.determineWinner(playerChosenWarrior, compChosenWarrior);

        if(score == 1) System.out.println("Player 1 is the winner" + "\n");
        else if (score == -1) System.out.println("Player 2 is the winner" + "\n");
        else System.out.println("DRAW" + "\n");













        //TODO: Compare the player's warrior with the user's warrior

//        System.out.println("You have chosen to play with: "  );





















////        Warrior rock = new Warrior("rock");
////        Warrior paper = new Warrior("paper");
////        Warrior scissors = new Warrior("scissors");
////        Warrior lizard = new Warrior("lizard");
////        Warrior spock = new Warrior("spock");
//        Player player1 = new Player();
//        Player player2 = new Player();
//        //Boolean playComputer = new Boolean();
//
////        System.out.println("Do you  want to play against the computer? Y/N" + "\n");
////        use scanner to add new warrior OR set the standard warrior list in the class
//
////        User to select if they want to play with the default warriors
////        System.out.println("Do you  want to play with the default warriors? Y/N");
//
//
//
//
//        System.out.println("Please enter Player 1: ");
//        player1.setName(scanner.next());
//
//        System.out.println("Please enter Player 2: ");
//        player2.setName(scanner.next());
//
//        System.out.println("Player 1: " + player1.getName() + "\n" + "Player 2: " + player2.getName());
//
//        System.out.println(player1.getName() + ", you're up - please choose your warrior: ");
//       // player1.setChosenWarrior(scanner.next());
//
//






    }
}
