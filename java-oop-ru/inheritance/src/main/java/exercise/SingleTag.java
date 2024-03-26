package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag(String name, Map<String, String> attributes) {
        super(name, attributes);
    }


    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<" + name);
        for (Map.Entry<String, String> attribute : attributes.entrySet()) {
            stringBuilder.append(" " + attribute.getKey() + "=\"" + attribute.getValue() + "\"");
        }
        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}
// END
