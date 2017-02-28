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



    //GET warriorActions
    public String getActions(int position){
        return warriorAction.get(position);
    }
}
