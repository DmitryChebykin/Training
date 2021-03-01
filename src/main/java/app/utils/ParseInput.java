package app.utils;

import app.model.TaskEntity;

public class ParseInput {

    public String getWillToAddTask(String input) {
        try {
            return input.substring(4);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getWillToDeleteTask(String input) {
        try {
            input = input.substring(7,8);
            return Integer.parseInt(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int getWillToEditTask(String input) {
        try {
            input = input.substring(5,6);
            return Integer.parseInt(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public String getWillToStringEditTask(String input) {
        try {
            return  input.substring(6,input.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
