package utils;

import java.util.ArrayList;
import java.util.StringTokenizer;

//put in utilities folder

public class Analyzer {
    public static String lowerText(String text){
        text = text.toLowerCase(); //lower text
        return text;
    }
    public static String removePunctuation(String text) {
        text = text.replaceAll("\\p{Punct}", ""); //remove puncuation
        return text;
    }
    public static String removeStopwords(String text) {
        //remove stop words
        String[] stopwords = new String[] { " the " ,  " be " ,  " to " ,  " of " ,  " and " ,  " a " ,  " in " ,  " that " ,  " have " ,
                " i " ,  " it " ,  " for " ,  " not " ,  " on " ,  " with " ,  " he " ,  " as " ,  " you " ,
                " do " ,  " at " ,  " this " ,  " but " ,  " his " ,  " by " ,  " from "};
        for (int i = 0; i < stopwords.length; i++) {
            text = text.replaceAll(stopwords[i], " "); //remove stopwords
        }
        return text;
    }
    public static ArrayList<String> tokenizeText(String text) {
        ArrayList<String> myTokensText = new ArrayList<String>();
        //tokenize text
        StringTokenizer tokens = new StringTokenizer(text, " ");
        String[] newText = new String[tokens.countTokens()];
        int index = 0;
        while(tokens.hasMoreTokens()) {
            newText[index] = tokens.nextToken();
            myTokensText.add(newText[index]);
            index++;
        }
        return myTokensText;
    }

    public static ArrayList<String> analyzeText(String text){
        text = lowerText(text);
        text = removePunctuation(text);
        text = removeStopwords(text);
        return tokenizeText(text);
    }
}
