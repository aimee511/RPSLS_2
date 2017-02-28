package co.za.entelect.jbootcamp;

import java.util.Objects;

/**
 * Created by aimee.nortje on 2/21/2017.
 */
public class WarriorRelationship    {
    private String name;
    private String action;
    private Warrior defeatedWarrior;
    private Warrior victoriousWarrior;

    public WarriorRelationship(){}

    public WarriorRelationship(String name){
        this.name = name;
    }

    public WarriorRelationship(String name, String action, Warrior victoriousWarrior, Warrior defeatedWarrior){
        this.name = name;
        this.action = action;
        this.victoriousWarrior = victoriousWarrior;
        this.defeatedWarrior = defeatedWarrior;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Warrior getVictoriousWarrior() {
        return victoriousWarrior;
    }

    public void setVictoriousWarrior(Warrior victoriousWarrior) {
        this.victoriousWarrior = victoriousWarrior;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        WarriorRelationship warriorRelationship = (WarriorRelationship) obj;
        if(name != warriorRelationship.name) return false;
        if(action != warriorRelationship.action) return false;
        if(victoriousWarrior != warriorRelationship.victoriousWarrior) return false;
        if(defeatedWarrior != warriorRelationship.defeatedWarrior) return false;



        return Objects.equals(name, warriorRelationship.name) &&
                Objects.equals(action, warriorRelationship.action) &&
                Objects.equals(defeatedWarrior, warriorRelationship.defeatedWarrior) &&
                Objects.equals(victoriousWarrior, warriorRelationship.victoriousWarrior) ;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, action, victoriousWarrior, defeatedWarrior);
    }



    @Override
    public String toString(){
        return defeatedWarrior.getName();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Warrior getDefeatedWarrior() {
        return defeatedWarrior;
    }

    public void setDefeatedWarrior(Warrior defeatedWarrior) {
        this.defeatedWarrior = defeatedWarrior;
    }
}
