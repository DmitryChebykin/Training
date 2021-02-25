class StringOperation implements CombineInput {

    String string1, string2, result;

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    @Override
    public void doCombine() {
        StringBuilder temporaryResult = new StringBuilder();
        temporaryResult.append(string1).append(string2);
        result = temporaryResult.toString();

    }
}
