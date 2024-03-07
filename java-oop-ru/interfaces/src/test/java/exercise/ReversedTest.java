import interfaces.ReversedSequence;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversedTest {
    @Test
    public void testReversed() {
        CharSequence text = new ReversedSequence("abcdef");
        var expected = "fedcba";
        String actual = text.toString();
        assertEquals(expected, actual);

        var actual1 = text.charAt(1);
        String expected1 = "e";
        assertEquals(expected1, actual1);

        var actual2 = text.length();
        int expected2 = 6;
        assertEquals(expected2, actual2);

        var actual3 = text.subSequence(1, 4).toString();
        String expected3 = "edc";
        assertEquals(expected3, actual3);

    }
}
