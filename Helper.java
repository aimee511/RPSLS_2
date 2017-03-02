package co.za.entelect.jbootcamp;

import java.util.Collection;
import java.util.Map;

/**
 * Created by aimee.nortje on 3/2/2017.
 */
public class Helper {

    public static boolean isNullOrEmpty(final Collection<?> collection ){
        return collection == null || collection.isEmpty();
    }

    public static boolean isNullOrEmpty(Map<?,?> map){
        return map == null || map.isEmpty();
    }

    public static boolean isInteger(final String input){
        String regex = "[0-9]*";
        return input.matches(regex);
    }




}
