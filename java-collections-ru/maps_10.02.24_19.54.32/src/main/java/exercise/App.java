package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static Map getWordCount(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        if (sentence.equals("") ) {
            return result;
        }
        String[] wordsArray = sentence.split(" ");

        for (String word: wordsArray) {
            var count = result.getOrDefault(word, 0);
            result.put(word, count +1);
        }
        return result;
        }
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
