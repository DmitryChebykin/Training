
class KeyboardSession {
    String str1, str2;

    public void input() {
        System.out.println("Введите первый набор символов");
        KeyboardReading reader = new KeyboardReading();
        str1 = reader.submitString();
        System.out.println("Введите второй набор символов");
        str2 = reader.submitString();
    }


}
