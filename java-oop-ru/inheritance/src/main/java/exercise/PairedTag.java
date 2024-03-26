package exercise;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

// BEGIN
class PairedTag extends Tag {

    private String body;
    private List<Tag> children;

    PairedTag(String name, Map<String, String> attributes, String body, List<Tag> children) {
        super(name, attributes);
        this.body = body;
        this.children = children;
    }

    public String toString() {
        String attributes = stringifyAttributes();
        String name = getName();
        String value = children.stream()
                .map(Object::toString)
                .collect(Collectors.joining(""));

        return String.format("<%s%s>%s%s</%s>", name, attributes, body, value, name);
    }
}
// END
