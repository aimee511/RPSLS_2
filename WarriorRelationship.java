package co.za.entelect.jbootcamp;

import java.util.AbstractCollection;
import java.util.ArrayList;

/**
 * Created by aimee.nortje on 2/21/2017.
 */
public class WarriorRelationship   {
     private Warrior defeatedWarrior;
     private String action;

     public WarriorRelationship(Warrior defeatedWarrior, String action){
         this.defeatedWarrior = defeatedWarrior;
         this.action = action;
     }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
