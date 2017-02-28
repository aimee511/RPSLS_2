package co.za.entelect.jbootcamp;
import java.io.IOException;
import java.util.*;


public class Game {

    public static void main(String[] args)throws IOException {
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        GameGetPropertyValues properties = new GameGetPropertyValues();
        Map<Player, Warrior> playerWarriorMap = new HashMap<>();
        List<Player> players = new ArrayList<>();
        List<Warrior> warriorList = new ArrayList<>();
        List<WarriorRelationship> warriorRelationshipList = new ArrayList<>();

        properties.loadWarriors(warriorList);

        System.out.println("--- The Warriors ---");
        for (Warrior warrior : warriorList) {
            System.out.println(warrior.getName());
        }

        properties.loadWarriorRelationships(warriorRelationshipList, warriorList);
        //  WarriorRelationship item0 = warriorRelationshipList.get(0);
        // System.out.println(warriorRelationshipList.get(0).getName());

        int userOption;

        System.out.println("Select option: ");
        System.out.println("1: Show warrior relationships");
        System.out.println("2: Continue with game");
        userOption = scanner.nextInt();

        switch (userOption){
            case 1: {
                for (WarriorRelationship warriorRelationship : warriorRelationshipList) {
                    System.out.println("*****");
                    System.out.println("Name: " + warriorRelationship.getName());
                    System.out.println("Action: " + warriorRelationship.getAction());
                    System.out.println("Victorious: " + warriorRelationship.getVictoriousWarrior().getName());
                    System.out.println("Defeated: " + warriorRelationship.getDefeatedWarrior().getName());
                } break;
            }
            case 2: break;
            default:
                System.out.println("Invalid option selected. Continuing to game... ");
                break;
        }

        System.out.println("Number of players: ");
        int numberPlayers = scanner.nextInt();

        //TODO while scanner hasnext()
        for (int i = 0; i < numberPlayers; i++) {
            System.out.println("Enter player " + (i+1));
            String playerName = scanner.next();
            players.add(new Player(playerName));
        }

        while (!quit) {
            for (Player player : players) {
                Warrior playerChosenWarrior;
                System.out.println(player.getName() + " please select your warrior");
                playerChosenWarrior = getWarriorByName(warriorList, scanner.next());

                player.setChosenWarriorObject(playerChosenWarrior);
                playerWarriorMap.put(player, playerChosenWarrior);

            }

            for (int i = 0; i < players.size() - 1; i++) {
                //System.out.println("Evaluating " + players.get(i).getName() + ": " + playerWarriorMap.get(players.get(i)));
                for (int j = i + 1; j < players.size(); j++) {
                    System.out.println(players.get(i).getName() + " is playing against " + players.get(j).getName());
                    String warriorName_i = playerWarriorMap.get(players.get(i)).getName();
                    String warriorName_j = playerWarriorMap.get(players.get(j)).getName();
                    WarriorRelationship warriorRelationship = getWarriorRelationship(warriorRelationshipList,
                            warriorName_i, warriorName_j);

                    if ( playerWarriorMap.get(players.get(i)).equals(playerWarriorMap.get(players.get(j))) ) {
                        System.out.println("Draw" + "\n");
                    } else if ( warriorRelationship.getVictoriousWarrior().getName().equals(playerWarriorMap.get(players.get(i)).getName()) ) {
                        players.get(i).incrementScore();
                        System.out.println("Victorious Warrior: " + warriorRelationship.getVictoriousWarrior().getName());
                        System.out.println(players.get(i).getName() + " beats " + players.get(j).getName() + " with");
                        System.out.println(playerWarriorMap.get(players.get(i)) + " " + warriorRelationship.getAction() + " " + playerWarriorMap.get(players.get(j)) + "\n");

                    } else if ( warriorRelationship.getVictoriousWarrior().getName().equals(playerWarriorMap.get(players.get(j)).getName()) ) {
                        players.get(j).incrementScore();
                        System.out.println("Victorious Warrior: " + warriorRelationship.getVictoriousWarrior().getName());
                        System.out.println(players.get(j).getName() + " beats " + players.get(i).getName() + " with");
                        System.out.println(playerWarriorMap.get(players.get(j)) + " " + warriorRelationship.getAction() + " " + playerWarriorMap.get(players.get(i))+ "\n");

                    }
                }
            }

            System.out.println("Score: ");
            for (Player player : players) {
                System.out.println(player.getName() + ": " + player.getScore());
            }

            System.out.println("Do you want to play again? ");
            if ( scanner.next().equals("yes") ) {
                playerWarriorMap.clear();
            } else {
                System.out.println("Sad parrot. K bye..");
                quit = true;
            }
        }
    }
    public static Warrior getWarriorByName(List<Warrior> warriorList, String warriorName){
        for(Warrior warrior : warriorList){
            if(warrior.getName().toLowerCase().equals(warriorName.toLowerCase())){
                return warrior;
            }
        }
        return null;
    }

    public static WarriorRelationship getWarriorRelationship(List<WarriorRelationship> warriorRelationshipList,
                                                             String warrior_i, String warrior_j){

        String relationshipName = warrior_i + "_" + warrior_j;
        String relationshipNameInvert = warrior_j + "_" + warrior_i;

        for(WarriorRelationship warriorRelationship : warriorRelationshipList){
            if ( warriorRelationship.getName().toLowerCase().equals(relationshipName.toLowerCase()) ||
                    warriorRelationship.getName().toLowerCase().equals(relationshipNameInvert.toLowerCase()) ) {
                //System.out.println(warriorRelationship.getName());
                return warriorRelationship;
            }
        }

        return null;
    }

//    public static Warrior getWinner(String warriorRelationshipName){
//        for(WarriorRelationship warriorRelationship : warriorRelationshipList){
//            if(warriorRelationship.toString().equals(warriorRelationshipName)){
//                return warriorRelationship;
//            }
//        }
//        return null;
//    }

//    public static Player getWinner(Map<Player, String>){
//
//    }
}






/*

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
 */