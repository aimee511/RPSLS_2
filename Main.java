package co.za.entelect.jbootcamp;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();
        Warrior playerChosenWarrior;
        Warrior compChosenWarrior;
        int score;
        int quit = 1;



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

         //   while (quit != 0) {
                //TODO the below to a list that can be iteration through (based on the "Warrior" list)
                WarriorRelationship rock_scissors = rock.createRelationship(scissors);
                System.out.println("Display Relationship: " + "\n"
                                    + "Victorious: " + rock_scissors.getVictoriousWarrior().getName() + "\n"
                                    + "Defeated: " + rock_scissors.getDefeatedWarrior().getName()+ "\n");

                rock.createRelationship(lizard);

                paper.createRelationship(rock);
                paper.createRelationship(spock);

                scissors.createRelationship(lizard);
                scissors.createRelationship(paper);

                lizard.createRelationship(paper);
                lizard.createRelationship(spock);

                spock.createRelationship(scissors);
                spock.createRelationship(rock);

                //DISPLAY WARRIORS DYNAMICALLY
                System.out.println("*** - THE WARRIORS - ***" + "\n");
                for (Warrior temp : warriors) {
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

                while (quit != 0) {
//      SELECT OPPONENT
                System.out.println("Do you  want to play against the computer? Y/N" + "\r");
                if (scanner.next().toLowerCase().trim().equals("y")) {
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

                //TODO add the same functionality as below for when the user is ot playing against the computer
                System.out.println("Your opponent has selected: " + compChosenWarrior.getName());
                player2.setChosenWarriorObject(compChosenWarrior);

                playerChosenWarrior.displayWarriorRelationshipList();

                System.out.println("Play again? 1 = YES, 0 = NO: " + "\n");
                quit = scanner.nextInt();
            }

        }
   // }
}
