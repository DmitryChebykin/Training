import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Program {
    public static final String[] arrayCommand = {"LIST","ADD","EDIT","DELETE"};

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";


    public static void main(String[] args) {
        MyApp myApp = new MyApp();
        myApp.start();
    }

}

