package co.za.entelect.jbootcamp;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        //Warrior warriors = new Warrior();
        Player player1 = new Player();
        Player player2 = new Player();
        String opponentSelect;
        int playerChosenWarrior;
        int compChosenWarrior;

        //TODO: Create the warrior relationships - make it configurable?
        //TEST relationship and create warriors

        //CREATE NEW WARRIORS
        Warrior rock = new Warrior("Rock");
        Warrior paper = new Warrior("Paper");
        Warrior scissors = new Warrior("Scissors");
        Warrior lizard = new Warrior("Lizard");
        Warrior spock = new Warrior("Spock");

        //CREATE DEFEATS
        rock.addDefeatedWarrior(scissors);
        rock.addDefeatedWarrior(lizard);

        paper.addDefeatedWarrior(rock);
        paper.addDefeatedWarrior(spock);

        scissors.addDefeatedWarrior(lizard);
        scissors.addDefeatedWarrior(paper);

        lizard.addDefeatedWarrior(paper);
        lizard.addDefeatedWarrior(spock);

        spock.addDefeatedWarrior(scissors);
        spock.addDefeatedWarrior(rock);


        //DISPLAY RELATIONSHIPS
        rock.displayDefeatedWarriors(rock);
        paper.displayDefeatedWarriors(paper);
        scissors.displayDefeatedWarriors(scissors);
        lizard.displayDefeatedWarriors(lizard);
        spock.displayDefeatedWarriors(spock);




//        Display the warriors with the index number for user to select
       //warriors.displayWarriors();

        //Select OPPONENT
//        System.out.println("Do you  want to play against the computer? Y/N" + "\n");
//        if(scanner.next().toLowerCase().trim().equals("y")){
//            player2.setName("computer");
//        } else {
//            System.out.println("Please enter Player 2's name: ");
//            player2.setName(scanner.next());
//        }
//
//        //show the selected opponent
//        System.out.println("Your opponent is: " + player2.getName());
//
//        //TODO: Ensure the Player class keeps the score
//        //TODO: user can choose when to quit
//        System.out.println("Please select your warrior: ");
//        player1.setChosenWarrior(scanner.nextInt());
//        playerChosenWarrior = player1.getChosenWarrior();
//        System.out.println(warriors.getWarrior(playerChosenWarrior));

        //get random computer warrior
        //test if random generator works
//        int quit = 0;
//        while(quit != 1){
//            compChosenWarrior = warriors.getRandom();
//            System.out.println("Random Number: " + compChosenWarrior + "\n" + "Generate another? 0 = YES; 1 = NO" + "\r");
//            quit = scanner.nextInt();
//        }

//        compChosenWarrior = warriors.getRandom();
//        player2.setChosenWarrior(compChosenWarrior);
//        System.out.println(player2.getName() + " has selected " + player2.getChosenWarrior());


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
