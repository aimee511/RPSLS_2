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
    private static InputStream inputStream;


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

    public static void setWarriors(List<Warrior> warriors) throws IOException {

        try {
            Properties prop = new Properties();
            String propFileName = "warriors.properties";

            inputStream = Warrior.class.getClassLoader().getResourceAsStream(propFileName);

            if ( inputStream != null ) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            for (String key : prop.stringPropertyNames()) {
                warriors.add(new Warrior(prop.getProperty(key)));
            }


        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }

    }

    public static Warrior getWarriorByName(List<Warrior> warriorList, String warriorName){
        for(Warrior warrior : warriorList){
            if(warrior.getName().toLowerCase().equals(warriorName.toLowerCase())){
                return warrior;
            }
        }
        return null;
    }



    @Override
    public String toString() {
        return name;
    }
}

