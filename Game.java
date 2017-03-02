package co.za.entelect.jbootcamp;
import java.io.IOException;
import java.util.*;


public class Game {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)throws IOException {
        boolean quit = false;
        int userOption;
        int numberPlayers;
        Game game = new Game();

       // Player player;
        Map<Player, Warrior> playerWarriorMap = new HashMap<>();
        List<Player> players = new ArrayList<>();
        List<Warrior> warriorList = new ArrayList<>();
        List<WarriorRelationship> warriorRelationshipList = new ArrayList<>();

        Warrior.setWarriors(warriorList);

        System.out.println("--- The Warriors ---");
        for (Warrior warrior : warriorList) {
            System.out.println(warrior.getName());
        }

        WarriorRelationship.setWarriorRelationships(warriorRelationshipList, warriorList);

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
        String numberPlayersIn = scanner.next();
        if(Helper.isInteger(numberPlayersIn)){
            numberPlayers = (Integer.parseInt(numberPlayersIn));
        } else numberPlayers = 0;

        for (int i = 0; i < numberPlayers; i++) {
            System.out.println("Enter player " + (i+1));
            String playerName = scanner.next();
            Player.setPlayers(players, playerName);
        }

        while (!quit) {

                for (Player player : players) {
                    System.out.println(player.getName() + " please select your warrior");
                    player.setPlayerWarrior(playerWarriorMap, warriorList, player);
            }


            game.getResults(playerWarriorMap, players, warriorRelationshipList);

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

    private Game() {
    }

    private void getResults(Map<Player, Warrior> playerWarriorMap, List<Player> players,
                            List<WarriorRelationship> warriorRelationshipList){

        for (int i = 0; i < players.size() - 1; i++) {
            for (int j = i + 1; j < players.size(); j++) {
                System.out.println(players.get(i).getName() + " is playing against " + players.get(j).getName());
                String warriorName_i = playerWarriorMap.get(players.get(i)).getName();
                String warriorName_j = playerWarriorMap.get(players.get(j)).getName();
                WarriorRelationship warriorRelationship = WarriorRelationship.getWarriorRelationship(warriorRelationshipList,
                        warriorName_i, warriorName_j);

                if ( playerWarriorMap.get(players.get(i)).equals(playerWarriorMap.get(players.get(j))) ) {
                    System.out.println("Draw" + "\n");
                } else if ( warriorRelationship.getVictoriousWarrior().getName().equals(playerWarriorMap.get(players.get(i)).getName()) ) {
                    players.get(i).incrementScore();
                    System.out.println("Victorious Warrior: " + warriorRelationship.getVictoriousWarrior().getName());
                    System.out.println(players.get(i).getName() + " beats " + players.get(j).getName() + "...");
                    System.out.println(playerWarriorMap.get(players.get(i)) + " " + warriorRelationship.getAction() + " " + playerWarriorMap.get(players.get(j)) + "\n");

                } else if ( warriorRelationship.getVictoriousWarrior().getName().equals(playerWarriorMap.get(players.get(j)).getName()) ) {
                    players.get(j).incrementScore();
                    System.out.println("Victorious Warrior: " + warriorRelationship.getVictoriousWarrior().getName());
                    System.out.println(players.get(j).getName() + " beats " + players.get(i).getName() + "...");
                    System.out.println(playerWarriorMap.get(players.get(j)) + " " + warriorRelationship.getAction() + " " + playerWarriorMap.get(players.get(i))+ "\n");

                }
            }
        }
    }
}

/*

//        GENERATE RANDOM
                Random generator = new Random();
                int randIndex = generator.nextInt(warriors.size());
                compChosenWarrior = warriors.get(randIndex);

                //TODO add the same functionality as below for when the user is ot playing against the computer
                System.out.println("Your opponent has selected: " + compChosenWarrior.getName());
                player2.setChosenWarrior(compChosenWarrior);

                playerChosenWarrior.displayWarriorRelationshipList();

                System.out.println("Play again? 1 = YES, 0 = NO: " + "\n");
                quit = scanner.nextInt();
            }

        }
   // }
 */