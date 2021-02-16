import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        String text = "Каждый охотник желает знать, где сидит фазан";
        System.out.println(text);
        String[] arrText = text.split(",?\\s+");
        System.out.println(Arrays.toString(arrText));
        // При помощи коллекций

        List<String> strings = Arrays.asList(arrText);
        Collections.reverse(strings);
        System.out.println(Arrays.toString(strings.toArray()));
        // возвращаем назад массив
        Collections.reverse(strings);
        arrText = (String[]) strings.toArray();

        // Без колллекций
        for (int i = 0; i <= (arrText.length - 1) / 2; i++) {
            String tempText = arrText[i];
            arrText[i] = arrText[arrText.length - 1 - i];
            arrText[arrText.length - i - 1] = tempText;
        }
        System.out.println(Arrays.toString(arrText));
    }
}
