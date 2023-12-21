package util;

public enum PostType {
    E("情感"),
    S("社会"),
    I("国际"),
    EN("娱乐");

    private String type;

    PostType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}