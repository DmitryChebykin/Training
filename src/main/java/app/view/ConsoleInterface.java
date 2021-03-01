package app.view;

import app.service.TaskService;
import app.utils.CommandCodes;
import app.utils.CommandLineType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class ConsoleInterface {

    private TaskService taskService;
    private ConsoleShow consoleShow;


    public ConsoleInterface(TaskService taskService) {
        this.taskService = taskService;
        consoleShow = new ConsoleShow(taskService);
    }

    public void waitInput() {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            while (true) {
                String input = reader.readLine();
                if (Objects.equals(input, CommandLineType.LIST.getType())) {
                    consoleShow.allTaskShow();
                    continue;
                }
                if (input.startsWith(CommandLineType.ADD.getType())) {
                    taskService.addTask(input);
                    consoleShow.addTaskShow();
                    continue;
                }
                if (input.startsWith(CommandLineType.DELETE.getType())) {
                    taskService.deleteTask(input);
                    consoleShow.deleteTskShow();
                    continue;
                }
                if (input.startsWith(CommandLineType.EDIT.getType())) {
                    consoleShow.editTaskShow(taskService.editTask(input));
                    continue;
                }
                if (Integer.parseInt(input) == CommandCodes.ZERO) {
                    consoleShow.exitProgramShow();
                    break;
                }
            }
        } catch (IOException e) {
            consoleShow.userFriendlyShow();
        }
    }
}