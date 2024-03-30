package exercise;

import java.lang.reflect.Field;
// BEGIN
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN
public class Validator {

    public static List<String> validate(Address address) {
        List<String> nullList = new ArrayList<>();
        for (Field field : address.getClass().getDeclaredFields()) {
            try {
                field.setAccessible(true);
                if (field.getAnnotation(NotNull.class) != null && field.get(address) == null) {
                    nullList.add(field.getName());
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return nullList;
    }

    public static Map<String, List<String>> advancedValidate(Address address) {
        Map<String, List<String>> result = new HashMap<>();
        for (Field field : address.getClass().getDeclaredFields()) {
            NotNull notNull = field.getAnnotation(NotNull.class);
            MinLength minLength = field.getAnnotation(MinLength.class);
            List<String> list = new ArrayList<>();
            try {
                field.setAccessible(true);
                var value = field.get(address);
                if (notNull != null && value == null) {
                    list.add("can not be null");
                    result.put(field.getName(), list);
                } else {
                    if (minLength != null && (value == null || value.toString().length() < minLength.minLength())) {
                        list.add("length less than 4");
                        result.put(field.getName(), list);
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
// END
