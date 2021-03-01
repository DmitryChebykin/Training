package app.service;

import app.model.TaskEntity;
import app.utils.ParseInput;

import java.util.LinkedList;

public class TaskService {

    private LinkedList<TaskEntity> taskEntities;
    ParseInput parseInput;

    public TaskService() {
        taskEntities = new LinkedList<>();
        parseInput = new ParseInput();
    }

    public void addTask(String input) {
        String value = parseInput.getWillToAddTask(input);
        taskEntities.add(new TaskEntity(value));
    }

    public void deleteTask(String input) {
        int index = parseInput.getWillToDeleteTask(input);
        taskEntities.remove(index);
    }

    public int editTask(String input) {
        int index = parseInput.getWillToEditTask(input);
        String description = parseInput.getWillToStringEditTask(input);
        taskEntities.add(index, new TaskEntity(description));
        return index;
    }

    public LinkedList<TaskEntity> getAllTask() {
        return taskEntities;
    }

    public TaskEntity getTask(int index) {
        return taskEntities.get(index);
    }
}
