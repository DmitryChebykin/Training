import java.util.ArrayList;

public class ArrayListProcessor {
private ArrayList<String> myTask;
private String[] commandsForTaskList;

    public ArrayListProcessor() {
        commandsForTaskList = new String[3];
        myTask = new ArrayList<String>(){{add("дело 1"); add("дело 2"); add("дело 3");}};
    }

    public void setCommandsForTaskList(String[] commandsForTaskList) {
        this.commandsForTaskList = commandsForTaskList;
    }
    public void runCommand (){
        int taskPointer = 1;
        if (!commandsForTaskList[1].equals("not defined")){
        taskPointer = Integer.parseInt(commandsForTaskList[1]) - 1;
        }

        switch (commandsForTaskList[0]){
            case "LIST":
                doList();
                break;
            case "ADD":
                doAdd(taskPointer);
                break;
            case "EDIT":
                doEdit(taskPointer);
                break;
            case "DELETE":
                doDelete(taskPointer);
                break;


        }
    }
    private void doList() {
        if (myTask.isEmpty()) { System.out.println("Список дел пустой");}
        else{
            System.out.println("Текущий список дел следующий:");
            int currentTask = 1;
            for ( int i = 0; i < myTask.size(); i++ ){
                System.out.println(Program.ANSI_RED + "Дело № " + currentTask + Program.ANSI_RESET + " " + myTask.get(i));
                currentTask++;
            }
        }
    }
    private void doAdd(int taskPointer){
        if (commandsForTaskList[1].equals("not defined")){
            myTask.add(commandsForTaskList[2]);
        }
        else{
            if (myTask.size() < taskPointer) {
                taskPointer = myTask.size();
                System.out.println("Дело будет добавлено в конец списка под номером "  +  Program.ANSI_RED + (taskPointer + 1) +  Program.ANSI_RESET);
            }
            myTask.add(taskPointer, commandsForTaskList[2]);
        }
    }
    private void doEdit (int taskPointer){
        if( taskPointer > myTask.size()){
            System.out.println("Дела с таким номером " +  Program.ANSI_RED + (taskPointer+1) +  Program.ANSI_RESET + " нет в списке. Отредактировать невозможно");
        }
        else {myTask.set(taskPointer, commandsForTaskList[2]);}
    }
    private void doDelete (int taskPointer){
        if( taskPointer > myTask.size()){
            System.out.println("Дела с таким номером " +  Program.ANSI_RED + (taskPointer+1) +  Program.ANSI_RESET + " нет в списке. Удаление не производится");
        }
        else {myTask.remove(taskPointer);}
    }
}
