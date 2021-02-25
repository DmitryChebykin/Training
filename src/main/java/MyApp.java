
class MyApp {

    private KeyboardSession keyboardSession;

    private  Processor processor;

    void run() {
        keyboardSession = new KeyboardSession();
        keyboardSession.input();
        processor = new Processor();
        processor.setString1(keyboardSession.str1);
        processor.setString2(keyboardSession.str2);
        processor.detectOperation();
        processor.doSum();

    }
}
