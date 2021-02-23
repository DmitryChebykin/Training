import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

public class CommandStringHandler {

    String commandTask = "UNKNOWN";
    String numberTask = "not defined";
    String contentTask = "not defined";
    boolean rightCommand = false;
    boolean rightNumberTask = false;
    private String[] arrText;

    public String checkExitCode (String anyString){
        parseStringToWord(anyString);
        String FirstSymbol = this.arrText[0];
        return FirstSymbol;
        }


    private void parseStringToWord(String anyString) {
        arrText = anyString.split("\\s+");
        //System.out.println(Arrays.toString(arrText));
    }

    private void checkCommandInFirstWord() {

        for (String word : Program.arrayCommand) {
            if (arrText[0].equals(word)) {
                commandTask = word;
                break;
            }
        }
    }

    private void checkDigitInSecondWord() {
        if (arrText.length > 1 && !(arrText[1].equals(null)) )
        try {
            Integer.parseInt(arrText[1]);
            if (Integer.parseInt(arrText[1]) > 0)
            {numberTask = arrText[1];}
        } catch (NumberFormatException e) { }
    }

    public void defineTaskContent() {
        String textFromArray = new String();
        int j;
        switch (numberTask){
            case ("not defined"):
                j = 1;
                break;
            default:
                j = 2;
        }
        StringBuilder resultTask = new StringBuilder();
        for (int i = j; i < arrText.length; i++) {
            resultTask.append(arrText[i]).append(" ");
        }
        contentTask = resultTask.toString();
    }

    public void  checkRightCommand(String anyString){
        parseStringToWord(anyString);
        checkCommandInFirstWord();
        if (commandTask.equals("UNKNOWN"))
        {System.out.println("Введеная строка не начинается с допустимой команды, повторите ввод");
        }
        else {System.out.println("Вы ввели команду " +  commandTask);
            rightCommand = true;
        }
    }

    public void checkTaskNumberIfNeeded(){
        switch (commandTask){

            case ("ADD"):
                checkDigitInSecondWord();
            case ("LIST"):
                rightNumberTask = true;
                break;
            case ("EDIT"):
            case ("DELETE"):

                checkDigitInSecondWord();
                if (numberTask.equals("not defined")){
                    System.out.println("Для команд EDIT или DELETE требуется указать номер дела - положительное целое число");
                }
                else {rightNumberTask = true;}
        }



    }

    public void reset() {
        commandTask = "UNKNOWN";
        numberTask = "not defined";
        contentTask = "not defined";
        rightCommand = false;
        rightNumberTask = false;
        arrText = null;
    }
}

