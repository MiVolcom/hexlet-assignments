package exercise;

import java.util.stream.*;
import java.util.Arrays;

// BEGIN
public class App {
    public static String getForwardedVariables(String content) {
        return Stream.of(content.split("\n"))
                .filter(str -> str.startsWith("environment"))
                .map(str -> str.replaceAll("environment=", ""))
                .map(str -> str.replaceAll("\"", ""))
                .map(String::trim)
                .map(str -> str.split(","))
                .flatMap(Stream::of)
                .filter(str -> str.startsWith("X_FORWARDED_"))
                .map(str -> str.replaceAll("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END
