import app.MyAppController;
import app.service.TaskService;
import app.view.ConsoleInterface;

public class Program {

    public static void main(String[] args) {
        new MyAppController(new ConsoleInterface(new TaskService())).run();
    }
}
