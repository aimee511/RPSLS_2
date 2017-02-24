package co.za.entelect.jbootcamp;

import java.util.ArrayList;

/**
 * Created by aimee.nortje on 2/21/2017.
 */
public class Action {
    private ArrayList<String> warriorAction;

    //ADD warriorAction
    public void addWarriorAction(String actionName){
        warriorAction.add(actionName);
    }

    //SET DEFAULTS for Rock Paper Scissors Lizard Spock
    public void setDefaults(){
        addWarriorAction("cuts");
        addWarriorAction("covers");
        addWarriorAction("crushes");
        addWarriorAction("poisons");
        addWarriorAction("smashes");
        addWarriorAction("decapitates");
        addWarriorAction("eats");
        addWarriorAction("disproves");
        addWarriorAction("vaporizes");
    }

    //GET warriorActions
    public String getActions(int position){
        return warriorAction.get(position);
    }
}
