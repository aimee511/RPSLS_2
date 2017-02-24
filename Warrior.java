package co.za.entelect.jbootcamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
  //  private ArrayList<WarriorRelationship> defeatedWarriors;
    private ArrayList<WarriorRelationship> warriorRelationshipList;

    public Warrior(){}

    //Default constructor to initialize name and the list of other warriors this warrior defeats (creates empty list)
    public Warrior(String name) {
        this.name = name;
      //  this.defeatedWarriors = new ArrayList<WarriorRelationship>();
        this.warriorRelationshipList = new ArrayList<WarriorRelationship>();
    }

    public static Warrior createNewWarrior(String name){
        return new Warrior(name);
    }

    private ArrayList<WarriorRelationship> getWarriorRelationship() {
        return warriorRelationshipList;
    }

    public void getWarriorRelationshipList(){

        for(int i = 0; i < this.warriorRelationshipList.size(); i++){

            System.out.println(this.getName() + " beats " +  this.warriorRelationshipList.get(i).getDefeatedWarrior().getName() );
        // this.warriorRelationshipList.get(i).getAction()
        }
    }

    //ADD a warrior to the defeatedWarrior array
    public void createDefeatedWarrior(Warrior warrior) {
        if (findDefeatedWarrior(warrior) < 0) {
            //warrior.getDefeatedWarriors();
            WarriorRelationship newDefeated = new WarriorRelationship(this, warrior);
            warriorRelationshipList.add(newDefeated);
        }
    }

    public WarriorRelationship createRelationship(Warrior defeatedWarrior) {

       return new WarriorRelationship(this, defeatedWarrior);
    }

    //pass a warrior obj to check if warrior exists in the defeated warriors list
    private int findDefeatedWarrior(Warrior warrior) {
     return this.warriorRelationshipList.indexOf(warrior);
    }

    public void displayWarriorRelationshipList(){

        for(int i = 0; i < this.warriorRelationshipList.size(); i++){
            System.out.println(this.getName() + " beats " +  this.warriorRelationshipList.get(i).getDefeatedWarrior().getName() );
            //" + this.warriorRelationshipList.get(i).getAction() + "
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Warrior)){
            return false;
        }

        Warrior warrior = (Warrior) obj;
        return Objects.equals(name, warrior.name) &&
                Objects.equals(warriorRelationshipList, warrior.warriorRelationshipList);

//        return super.equals(obj);

    }

    @Override
    public int hashCode(){
        return Objects.hash(name, warriorRelationshipList);
    }


}
