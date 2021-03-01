package app.utils;

public enum CommandLineType {
    LIST("List"),
    ADD("Add"),
    EDIT("Edit"),
    DELETE("Delete");

    private String type;

    CommandLineType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
