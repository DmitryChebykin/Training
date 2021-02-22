import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

public class CommandStringHandler {
    String commandTask = "UNKNOWN";
    String numberTask = "not defined";
    String contentTask = "not defined";
    private String[] arrText;

    private void parseStringToWord(String anyString) {
        arrText = anyString.split("\\s+");
        System.out.println(Arrays.toString(arrText));
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
        try {
            Integer.parseInt(arrText[1]);
            numberTask = arrText[1];
        } catch (NumberFormatException e) {
            numberTask = "not defined";
        }
    }

    private void defineTaskContent() {
        String textFromArray = null;
        for (int i = 2; i < this.arrText.length; i++) {
            textFromArray = textFromArray.concat(" " + this.arrText[i]);
        }
        contentTask = textFromArray;
    }

    public void  handleUserCommand(String anyString){
        parseStringToWord(anyString);
        checkCommandInFirstWord();
        if (commandTask.equals("UNKNOWN"))
        {System.out.println("Введеная строка не начинается с допустимой команды");}
        else {System.out.println("Вы ввели команду " +  commandTask);}


    }
}

