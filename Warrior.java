package co.za.entelect.jbootcamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by aimee.nortje on 2/21/2017.
 */
public class Warrior {

    //calling the empty constructor
   // private ArrayList<String> warriorList = new ArrayList<String>();

    //private String name;
    private String name;

    //a list of Warriors that warrior defeats
    private ArrayList<Warrior> defeatedWarriors;


    //Default constructor to initialize name and the list of other warriors this warrior defeats
    public Warrior(String name) {
        this.name = name;
        this.defeatedWarriors = new ArrayList<Warrior>();
    }

    public ArrayList<Warrior> getDefeatedWarriors() {
        return defeatedWarriors;
    }

//    public static Warrior createWarrior(String name){
//       return new Warrior(name);
//    }

    //ADD a warrior to the defeatedWarrior array
    private void addDefeatedWarrior(Warrior warrior){
        //if(findWarrior(warrior.getName()) >= 0 ){
        defeatedWarriors.add(warrior);
    }

    //TODO: check if the print method here is correct - to get the name
    private void displayDefeatedWarriors(Warrior warrior){

        for(int i = 0; i < warrior.defeatedWarriors.size(); i++){
            System.out.println(warrior.getName() + " beats " + warrior.defeatedWarriors.get(i).getName());
        }
    }

    private String getName() {
        return name;
    }







//    public void addDefault(){
//        warriorList.add("Rock");
//        warriorList.add("Paper");
//        warriorList.add("Scissors");
//        warriorList.add("Lizard");
//        warriorList.add("Spock");
//
//    }

    //create new ArrayList for each warrior to determine which other warriors they beat


    //get name





//    public String getDefeatedName(int warriorIndex){
//        return  defeatedWarriors.get(warriorIndex);
//    }





//    //get random warrior
//    public int getRandom(){
//
//        Random generator = new Random();
//        int randIndex = generator.nextInt(warriorList.size());
//        return randIndex;
//    }

//    //ADD warrior list item
//    public void addWarrior(String warrior){
//        warriorList.add(warrior);
//    }
//
//    //GET warrior list item NAME
//    public String getWarrior(int warriorIndex){
//        return  warriorList.get(warriorIndex);
//    }
//
//    //REMOVE warrior list item
//    public void removeWarrior(int position){
//       String theItemToRemove = warriorList.get(position);
//       warriorList.remove(theItemToRemove);
//    }
//
//    //MODIFY Existing warrior list item
//    public String modifyExisting(int position, String newWarrior){
//        warriorList.set(position, newWarrior);
//        String modifiedWarrior = warriorList.get(position);
//        return modifiedWarrior;
//    }
//
//    //QUERY warrior list item
//    public String findWarrior(String searchItem){
//        //could do a for loop - expensive - use contains
//        //boolean exists = warriorList.contains(searchItem);
//
//        //use index - returns the index position of the item searched - if it's -1, the items does not exist
//        int position = warriorList.indexOf(searchItem);
//        if(position >= 0){
//            return warriorList.get(position);
//        }
//
//        return null;
//    }

//    public void displayWarriors(){
//        // OLD way to loop
////        for(int i = 0; i < warriorList.size(); i++){
////            System.out.println(i + ": " + warriorList.get(i));
////        }
//
//        //NEW way to loop
//        for(String temp : warriorList){
//            System.out.println(warriorList.indexOf(temp) + ": " + temp);
//        }
//    }


}
