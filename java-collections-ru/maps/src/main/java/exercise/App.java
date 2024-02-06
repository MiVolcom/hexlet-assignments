package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static Map getWordCount(String sentence) {
        String[] wordsArray = sentence.split(" ");
        Map<String, Integer> result = new HashMap<>();
        if (sentence.equals("") ) {
            return result;
        }
        for (String word: wordsArray) {
            result.put(word, 1);
        }
        for (String uniqWord: result.keySet()) {
            int wordCount = 0;
            for (String wordFromArray: wordsArray) {
                if (uniqWord.equals(wordFromArray)) {
                    wordCount++;
                }
            }
            result.put(uniqWord, wordCount);
        }
        return result;
    }

    public static String toString(Map<String, Integer> wordCounts) {
        if (wordCounts.isEmpty()) {
            return "{}";
        }
        var current = "";
        for (String key : wordCounts.keySet()) {
            current = current + "  " + key + ":" + " " + wordCounts.get(key) + "\n";
        }
        var result = "{" + "\n" + current + "}";
        return result;
    }
}
//END
