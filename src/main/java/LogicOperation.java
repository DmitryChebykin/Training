
class LogicOperation implements CombineInput {

    String str1, str2;
    boolean result;

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }


    @Override
    public void doCombine() {
        result = Boolean.parseBoolean(str1) || Boolean.parseBoolean(str2);
    }
}
