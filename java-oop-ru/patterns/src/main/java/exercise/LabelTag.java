package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String stringTag;
    private TagInterface tag;

    public LabelTag(String stringTag, TagInterface tag) {
        this.stringTag = stringTag;
        this.tag = tag;
    }

    @Override
    public String render() {
        return "<label>" + stringTag + tag + "</label>";
    }
}
// END
