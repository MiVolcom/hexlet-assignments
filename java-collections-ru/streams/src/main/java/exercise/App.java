package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static Long getCountOfFreeEmails(List<String> emails) {
        var result = emails.stream()
                .filter(email -> email.endsWith("gmail.com") || email.endsWith("yandex.ru") || email.endsWith("hotmail.com"))
                .count();
        return result;
    }
}
// END
