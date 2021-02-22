import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static final String[] arrayCommand = {"LIST","ADD","EDIT","DELETE"};


    public static void main(String[] args) {
        MyApp myApp = new MyApp();
        myApp.start();
    }

}

