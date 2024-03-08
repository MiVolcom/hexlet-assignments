package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String text;

    public ReversedSequence(String text) {
        this.text = text;
    }

    @Override
    public int length() {
        return text.length();
    }

    @Override
    public char charAt(int index) {
        char[] chars = text.toCharArray();
        return chars[index];
    }

    @Override
    public String subSequence(int start, int end) {
        char[] chars = text.toCharArray();
        String result = "";
        for (var i = start; i < end; i++) {
            result = result + chars[i];
        }
        return result;
    }
    public String toString(String str) {
        char[] chars = str.toCharArray();
        String result = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            result = result + chars[i];
        }
        return result;
    }
}
// END
