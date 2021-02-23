import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ConsoleDialog {
    String commandStringByUser;

    private void showMenu() {
        System.out.println("Введите нужную команду: ");
        System.out.println("•\tLIST — выводит дела с их порядковыми номерами;\n" +
                "•\tADD — добавляет дело в конец списка или дело на определённое место, сдвигая остальные дела вперёд, если указать номер; \n" +
                "•\tEDIT — заменяет дело с указанным номером;\n" +
                "•\tDELETE — удаляет. \n" +
                "•\tДля завершения работы программы введите 0 \n");
    }

    private void acceptCommandStringByUser() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String title = null;
        try {
            title = reader.readLine();
            commandStringByUser = title;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void tryInput (){
        showMenu();
        acceptCommandStringByUser();
    }
}
