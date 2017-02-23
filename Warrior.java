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
    private ArrayList<WarriorRelationship> defeatedWarriors;
    private List<WarriorRelationship> warriorRelationshipList;

    public Warrior(){}

    //Default constructor to initialize name and the list of other warriors this warrior defeats (creates empty list)
    public Warrior(String name) {
        this.name = name;
        this.defeatedWarriors = new ArrayList<WarriorRelationship>();
        this.warriorRelationshipList = new ArrayList<WarriorRelationship>();
    }



    private List<WarriorRelationship> getWarriorRelationship() {
        return warriorRelationshipList;
    }

//    public static Warrior createWarriorRelationship(Warrior defeatedWarrior, String actionName){
//       return new Warrior(name);
//    }

    //ADD a warrior to the defeatedWarrior array
    public void createDefeatedWarrior(Warrior warrior, String action) {
        if (findDefeatedWarrior(warrior) < 0) {
            //warrior.getDefeatedWarriors();
            WarriorRelationship newDefeated = new WarriorRelationship(warrior, action);
            warriorRelationshipList.add(newDefeated);
        }
    }





    //pass a warrior obj to check if warrior exists in the defeated warriors list
    private int findDefeatedWarrior(Warrior warrior) {
     return this.defeatedWarriors.indexOf(warrior);
    }


    //OR pass the warrior name to check if the name exists
//    private int findDefeatedWarrior(String warriorName){
//        for(int i = 0; i < this.defeatedWarriors.size(); i++){
//         //   Warrior defeatedWarrior = this.defeatedWarriors.get(i);
//            if(defeatedWarrior.getName().equals(warriorName)){
//                return i;
//            }
//        }
//        return -1;
//    }

    public void displayWarriorRelationshipList(){

        for(int i = 0; i < this.warriorRelationshipList.size(); i++){
            System.out.println(this.getName() + " " + this.warriorRelationshipList.get(i).getAction() + " " +  this.warriorRelationshipList.get(i).getDefeatedWarrior().getName() );
        }
    }


    public String getName() {
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
