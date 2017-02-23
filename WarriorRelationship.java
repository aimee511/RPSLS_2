package co.za.entelect.jbootcamp;

import java.util.AbstractCollection;
import java.util.ArrayList;

/**
 * Created by aimee.nortje on 2/21/2017.
 */
public class WarriorRelationship    {
    private Warrior victoriousWarrior;
    private Warrior defeatedWarrior;
     private String action;


     //class inherited from: default constructor
//    public WarriorRelationship(String name) {
//        super(name);
//    }


    public WarriorRelationship(Warrior defeatedWarrior, String action){
         this.victoriousWarrior = victoriousWarrior;
        this.defeatedWarrior = defeatedWarrior;
        this.action = action;
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

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public static WarriorRelationship createWarriorRelationship(Warrior defeatedWarrior, String action){
         return new WarriorRelationship(defeatedWarrior, action);
    }
}
