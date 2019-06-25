package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return new StringBuilder(str).replace(indexToCapitalize, indexToCapitalize+1, String.valueOf(str.charAt(indexToCapitalize)).toUpperCase()).toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        //n*(n+1)/2
        Integer counter = 0;
        String [] sub = new String[string.length() * (string.length() +1) / 2];
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                sub[counter] = string.substring(i, j);
                counter++;
            }
        }
        return sub;
    }

    public static Integer getNumberOfSubStrings(String input){
        return (input.length() * (input.length() +1)) / 2 - 1;
    }
}
