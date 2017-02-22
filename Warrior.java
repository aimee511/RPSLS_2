package co.za.entelect.jbootcamp;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by aimee.nortje on 2/21/2017.
 */
public class Warrior<T> {

    //calling the empty constructor
    private ArrayList<String> warriorList = new ArrayList<String>();

    public void addDefault(){
        warriorList.add("Rock");
        warriorList.add("Paper");
        warriorList.add("Scissors");
        warriorList.add("Lizard");
        warriorList.add("Spock");
    }

    //get random warrior
    public int getRandom(){

        Random generator = new Random();
        int randIndex = generator.nextInt(warriorList.size());
        return randIndex;
    }

    //ADD warrior list item
    public void addWarrior(String warrior){
        warriorList.add(warrior);
    }

    //REMOVE warrior list item
    public void removeWarrior(int position){
       String theItemToRemove = warriorList.get(position);
       warriorList.remove(theItemToRemove);
    }

    //MODIFY Existing warrior list item
    public String modifyExisting(int position, String newWarrior){
        warriorList.set(position, newWarrior);
        String modifiedWarrior = warriorList.get(position);
        return modifiedWarrior;
    }

    //QUERY warrior list item
    public String findWarrior(String searchItem){
        //could do a for loop - expensive - use contains
        //boolean exists = warriorList.contains(searchItem);

        //use index - returns the index position of the item searched - if it's -1, the items does not exist
        int position = warriorList.indexOf(searchItem);
        if(position >= 0){
            return warriorList.get(position);
        }

        return null;
    }

    public void displayWarriors(){
        // OLD way to loop
//        for(int i = 0; i < warriorList.size(); i++){
//            System.out.println(i + ": " + warriorList.get(i));
//        }

        //NEW way to loop
        for(String temp : warriorList){
            System.out.println(warriorList.indexOf(temp) + ": " + temp);
        }

    }


}
