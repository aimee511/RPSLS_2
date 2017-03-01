package co.za.entelect.jbootcamp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.Properties;

/**
 * Created by aimee.nortje on 2/21/2017.
 */
public class WarriorRelationship    {
    private String name;
    private String action;
    private Warrior defeatedWarrior;
    private Warrior victoriousWarrior;
    private static InputStream inputStream;


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

    public static void setWarriorRelationships(List<WarriorRelationship> warriorRelationshipList,
                                               List<Warrior> warriorList)
            throws IOException {

        try {


            Properties prop = new Properties();
            String propFileName = "config.properties";

            inputStream = WarriorRelationship.class.getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            for (String key : prop.stringPropertyNames()) {
                Warrior victoriousWarrior = Warrior.getWarriorByName(warriorList, getVictoriousWarrior(key));
                Warrior defeatedWarrior = Warrior.getWarriorByName(warriorList, getDefeatedWarrior(key));

                WarriorRelationship newWarriorRelationship = new WarriorRelationship(key, prop.getProperty(key),
                        victoriousWarrior, defeatedWarrior);
                warriorRelationshipList.add(newWarriorRelationship);
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
    }


    private static String getVictoriousWarrior(String warriorActionName) {
        char separator = '_';
        int sep = warriorActionName.lastIndexOf(separator);
        return warriorActionName.substring(0, sep);
    }

    private static String getDefeatedWarrior(String warriorActionName) {
        char separator = '_';
        int sep = warriorActionName.lastIndexOf(separator);
        return warriorActionName.substring(sep+1);
    }

    public static WarriorRelationship getWarriorRelationship(List<WarriorRelationship> warriorRelationshipList,
                                                      String warrior_i, String warrior_j){

        String relationshipName = warrior_i + "_" + warrior_j;
        String relationshipNameInvert = warrior_j + "_" + warrior_i;

        for(WarriorRelationship warriorRelationship : warriorRelationshipList){
            if ( warriorRelationship.getName().toLowerCase().equals(relationshipName.toLowerCase()) ||
                    warriorRelationship.getName().toLowerCase().equals(relationshipNameInvert.toLowerCase()) ) {
                return warriorRelationship;
            }
        }
        return null;
    }





    @Override
    public String toString(){
        return defeatedWarrior.getName();
    }

}
