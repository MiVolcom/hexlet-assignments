package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
public class AppTest {
    @Test
    public void enlargeArrayImageTest() {
        String[][] arr = {
                {"*", "*", "*", "*"},
                {"*", " ", " " ,"*"},
                {"*",  " ",  " ", "*"},
                {"*", "*", "*", "*"}
        };
        String[][] expectedArr = {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"}
        };
        String[][] actualArr = App.enlargeArrayImage(arr);
        for (int i = 0; i < expectedArr.length; i++) {
            for (int j = 0; j < expectedArr[i].length; j++) {
                assert expectedArr[i][j].equals(actualArr[i][j]) : "Not works with" + i + " " + j;
            }
        }
    }
}
// END
