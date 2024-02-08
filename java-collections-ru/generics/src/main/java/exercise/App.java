package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static <M extends Map<? extends String, ? extends String>> List<M> findWhere(List<M> books, M where) {
        boolean bookMustBeAdded;
        List<M> result = new ArrayList<>();
        for (M book : books) {
            bookMustBeAdded = true;
            for (String key : where.keySet()) {
                if (!book.containsValue(where.get(key))) {
                    bookMustBeAdded = false;
                    break;
                }
            }
            if (bookMustBeAdded) result.add(book);
        }
        return result;

    }
}
//END
