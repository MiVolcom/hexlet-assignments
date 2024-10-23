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
                var type = method.getReturnType().getSimpleName();

                try {
                    method.invoke(address);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("Method " + name + " returns a value of type " +  type + ".");
            }
        }
        // END
    }
}
