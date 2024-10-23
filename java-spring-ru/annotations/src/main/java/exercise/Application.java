package exercise;

import exercise.model.Address;
import exercise.annotation.Inspect;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {
        var address = new Address("London", 12345678);

        // BEGIN
        for (Method method : Address.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Inspect.class)) {
                var name = method.getName();
                var type = method.getReturnType().toString();

                try {
                    method.invoke(address);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                String regex = "java\\.lang\\.[A-Z][a-zA-Z]*";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(type);
                String matched = "";
                String result = type;
                while (matcher.find()) {
                    matched = matcher.group();
                    result = matched.replace("java.lang.", "");
                }
                System.out.println("Method " + name + " returns a value of type " +  result + ".");
            }
        }
        // END
    }
}
