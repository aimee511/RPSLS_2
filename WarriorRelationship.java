package co.za.entelect.jbootcamp;

import java.nio.file.Watchable;
import java.util.Objects;

import java.util.AbstractCollection;
import java.util.ArrayList;

/**
 * Created by aimee.nortje on 2/21/2017.
 */
public class WarriorRelationship    {

    private Warrior victoriousWarrior;
    private Warrior defeatedWarrior;
    private String name;
   //  private String action;


     //class inherited from: default constructor
//    public WarriorRelationship(String name) {
//        super(name);
//    }


    public WarriorRelationship(Warrior victoriousWarrior ,Warrior defeatedWarrior){
        this.name = victoriousWarrior + " " + defeatedWarrior;
        this.victoriousWarrior = victoriousWarrior;
        this.defeatedWarrior = defeatedWarrior;
     //   this.action = action;
     }

    public Warrior getVictoriousWarrior() {
        return victoriousWarrior;
    }

    public void setVictoriousWarrior(Warrior victoriousWarrior) {
        this.victoriousWarrior = victoriousWarrior;
    }

    public Warrior getDefeatedWarrior() {
        return defeatedWarrior;
    }

    public void setDefeatedWarrior(Warrior defeatedWarrior) {
        this.defeatedWarrior = defeatedWarrior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    public String getAction() {
//        return action;
//    }
//
//    public void setAction(String action) {
//        this.action = action;
//    }

    public static WarriorRelationship createWarriorRelationship(Warrior victoriousWarrior, Warrior defeatedWarrior){

         return new WarriorRelationship(victoriousWarrior, defeatedWarrior);
    }

    public void displayRelationship(){
        System.out.println("Victorious: " + victoriousWarrior.getName() + "\n"
                + "Defeated: " + defeatedWarrior.getName() + "\n");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof WarriorRelationship)){
            return false;
        }

        WarriorRelationship warriorRelationship = (WarriorRelationship) obj;
        return Objects.equals(name, warriorRelationship.name) &&
                Objects.equals(victoriousWarrior, warriorRelationship.victoriousWarrior) &&
                Objects.equals(defeatedWarrior, warriorRelationship.defeatedWarrior) ;

//        return super.equals(obj);

    }

    @Override
    public int hashCode(){
        return Objects.hash(name, victoriousWarrior, defeatedWarrior);
    }





}
