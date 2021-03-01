package app.view;

import app.service.TaskService;

public class ConsoleShow {

    private TaskService taskService;

    public ConsoleShow(TaskService taskService) {
        this.taskService = taskService;
    }

    public void addTaskShow() {
        System.out.println("Task added");
    }

    public void deleteTskShow() {
        System.out.println("Task deleted");
    }

    public void editTaskShow(int index) {
        System.out.println("Task edited " + taskService.getTask(index).toString());
    }

    public void allTaskShow() {

        if (taskService.getAllTask().size() == 0) notFoundTasks();

        taskService.getAllTask().forEach(System.out::println);

    }

    public void exitProgramShow() {
        System.out.println("Wait to exit program");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userFriendlyShow() {
        System.out.println("Something wrong");
    }

    public void notFoundTasks(){
        System.out.println("Doesn't task exist");
    }
}
