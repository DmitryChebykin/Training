class StringHandler {
    String detectType(String string) {
        try {
            Integer.parseInt(string);
            return "integer";
        } catch (NumberFormatException ex) {
            switch (string) {
                case "true":
                case "false":
                    return "boolean";
            }

        }
        return "string";
    }

}
