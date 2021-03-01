package app;

import app.view.ConsoleInterface;

public class MyAppController {

    ConsoleInterface consoleInterface;

    public MyAppController(ConsoleInterface consoleInterface) {
        this.consoleInterface = consoleInterface;
    }

    public void run() {
        consoleInterface.waitInput();
    }
}