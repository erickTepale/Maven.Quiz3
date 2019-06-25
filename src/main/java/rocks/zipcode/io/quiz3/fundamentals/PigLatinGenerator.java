package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        if(!VowelUtils.hasVowels(str))
            return appendAy(str);
        if(VowelUtils.startsWithVowel(str))
            return appendWay(str);
        else if (!VowelUtils.startsWithVowel(str))
            return appendAy(shift(str));
        else return appendAy(str);
    }

    public String appendWay(String str){
        return str + "way";
    }

    public String appendAy(String str){
        return str + "ay";
    }

    public String shift(String word){
        String result = "";
        Integer indexFirst = VowelUtils.getIndexOfFirstVowel(word);
        String [] split = word.split("");
        String [] shifted = new String[split.length];
        for (int i = 0; i < split.length ; i++) {
            if(indexFirst + i < split.length)
                shifted[i] = split[indexFirst + i];
            else{
                shifted[i] = split[split.length - i - 1];
            }
        }

        for (String each: shifted) {
            result += each;
        }

        return result;
    }
}
