package co.za.entelect.jbootcamp;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * Created by aimee.nortje on 2/21/2017.
 */
public class Warrior {

    private String name;

    public Warrior() {
    }

    public Warrior(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Warrior warrior = (Warrior) obj;

        if(name != warrior.name) return false;
        return Objects.equals(name, warrior.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name);
    }

    @Override
    public String toString(){
        return name;
    }
}












    /*
    //test method to print relationship
    public void displpayWarriorRelationshipList(){

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
*/