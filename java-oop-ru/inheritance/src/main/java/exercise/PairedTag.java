package exercise;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

// BEGIN
public class PairedTag extends Tag {
    String body;
    List<Tag> children;

    public PairedTag(String name, Map<String, String> attributes, String body, List<Tag> children) {
        super(name, attributes);
        this.body = body;
        this.children = children;
    }

    public String tooString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<" + name);
        for (Map.Entry<String, String> attribute : attributes.entrySet()) {
            stringBuilder.append(" " + attribute.getKey() + "=\"" + attribute.getValue() + "\"" + ">" + body);
        }
        for (var child : children) {
            stringBuilder.append(child.tooString());
        }
        stringBuilder.append("</" + name + ">");

        return stringBuilder.toString();
    }
}
// END