package co.za.entelect.jbootcamp;
import java.util.Base64;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Warrior warriors = new Warrior();
        Player player1 = new Player();
        int chosenWarrior;

        //TODO: Create the warrior relationships - make it configurable?

        //TODO: ability to configure to not use the default warriors
        warriors.addDefault();
        warriors.displayWarriors();


        //Display the warriors with the index number for user to select
        //TODO: Ensure the Player class keeps the score and that te user can choose when to quit
//        System.out.println("Please select your warrior: ");
//        player1.setChosenWarrior(scanner.nextInt());
//        chosenWarrior = player1.getChosenWarrior();

        //System.out.println("You have chosen to play with: " + warriors.get(chosenWarrior);





















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
