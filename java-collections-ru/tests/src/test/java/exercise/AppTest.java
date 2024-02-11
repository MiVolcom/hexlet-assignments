package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
            List<Integer> numbers1 = new ArrayList<>();
            numbers1.add(1);
            numbers1.add(2);
            numbers1.add(3);
            numbers1.add(4);
            numbers1.add(5);
            numbers1.add(6);

            List<Integer> numbers2 = Arrays.asList();

            Assertions.assertEquals(App.take(numbers1, 2), Arrays.asList(1, 2));
            Assertions.assertEquals(App.take(numbers1, 0), Arrays.asList());
            Assertions.assertEquals(App.take(numbers1, 100), Arrays.asList(1, 2, 3, 4, 5, 6));
            Assertions.assertEquals(App.take(numbers2, 3), Arrays.asList());
        }
        // END
    }

