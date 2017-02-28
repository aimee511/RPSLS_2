package co.za.entelect.jbootcamp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * Created by aimee.nortje on 2/27/2017.
 */
public class GameGetPropertyValues {
    int result;
    InputStream inputStream;


    public int getWinner(Warrior playerWarrior, Warrior opponentWarrior) throws IOException {

        try {
            Properties prop = new Properties();
            String propFileName = "config.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

                if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

                for (String key : prop.stringPropertyNames()) {

                    if (warrior1(key).equals(playerWarrior.toString()) && warrior2(key).equals(opponentWarrior.toString())) {
                        System.out.println(playerWarrior.toString() + " wins: " + warrior1(key) + prop.get(warrior1(key) + "_" + warrior2(key)) + warrior2(key));
                        result = 1;


                    } else if (playerWarrior.toString().equals((opponentWarrior.toString()))) {
                        System.out.println("Draw");
                        result = 0;

                    } else if(warrior2(key).equals(playerWarrior.toString()) && warrior1(key).equals(opponentWarrior.toString())) {
                        String keySwap = warrior2(key) + "_" + warrior1(key);
                       // if (prop.get(keySwap) != null) {
                            System.out.println(opponentWarrior.toString() + " wins: " + warrior2(keySwap) + " " + prop.get(warrior2(keySwap) + "_" + warrior1(keySwap)) + " " + warrior1(keySwap));
                            result = -1;
                       // } else {
                        //    System.out.println("Relationship does not exist. Could not determine winner");
                        //    result = 0;
                       // }
                    }
                }

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return result;
    }

    public String warrior1(String warriorActionName) {
        char separator = '_';
        //int dot = warriorActionName.lastIndexOf(extensionSeparator);
        int sep = warriorActionName.lastIndexOf(separator);
        return warriorActionName.substring(0, sep);
    }

    public String warrior2(String warriorActionName) {
        char separator = '_';
        //int dot = warriorActionName.lastIndexOf(extensionSeparator);
        int sep = warriorActionName.lastIndexOf(separator);
        return warriorActionName.substring(sep+1);
    }

    public void loadWarriors(List<Warrior> warriors) throws IOException {

        try {
            Properties prop = new Properties();
            String propFileName = "warriors.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            for(String key : prop.stringPropertyNames()){
                warriors.add(new Warrior(prop.getProperty(key)));
            }



        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        //return result;
    }

    public List<WarriorRelationship> loadWarriorRelationships(List<WarriorRelationship> warriorRelationshipList,
                                                              List<Warrior> warriorList)
            throws IOException {

        try {


            Properties prop = new Properties();
            String propFileName = "config.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            for (String key : prop.stringPropertyNames()) {
                Warrior victoriousWarrior = getWarriorByName(warriorList, warrior1(key));
                Warrior defeatedWarrior = getWarriorByName(warriorList, warrior2(key));

                WarriorRelationship newWarriorRelationship = new WarriorRelationship(key, prop.getProperty(key),
                        victoriousWarrior, defeatedWarrior);
                warriorRelationshipList.add(newWarriorRelationship);
                //System.out.println(newWarriorRelationship.getName() + " added");
  //              System.out.println(newWarriorRelationship.getDefeatedWarrior().getName() + " added");
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return warriorRelationshipList;

    }


    public Warrior getWarriorByName(List<Warrior> warriorList, String warriorName){
        for(Warrior warrior : warriorList){
            if(warrior.getName().toLowerCase().equals(warriorName.toLowerCase())){
                return warrior;
            }
        }
        return null;
    }




}
