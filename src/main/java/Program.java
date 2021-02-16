import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

    public static final int COUNT_OF_PATIENTS = 30;

    public static final float LOWEST_TEMP_HEALTH = 32.2f, HIGHEST_TEMP_HEALTH = 38.9f;
    public static final int LOWEST_TEMP = 32, HIGHEST_TEMP = 40;

    public static float res;

    public static void main(String[] args) {

        float[] patients = CreateArrayPatients(COUNT_OF_PATIENTS, LOWEST_TEMP, HIGHEST_TEMP);
        List<Integer> healthPatients = getHealthPatients(patients, LOWEST_TEMP_HEALTH, HIGHEST_TEMP_HEALTH);
        float middle = GetMiddleTemperature(patients, LOWEST_TEMP, HIGHEST_TEMP);
        float min = getMinHealth(healthPatients);
        float max = getMaxHealth(healthPatients);


//        float[] arrTemp;
//        float tempSummary = 0.0F;
//        float tempLowHealth = 0.0F;
//        float tempHighHealth = 0.0F;
//        arrTemp = new float[COUNT_OF_PATIENTS];
//        float tempMiddle = 0.0F; //средняя температура
//        int health = 0; //количество здоровых пациентов
//        // как быстро сгенерировать 500 флоат значений в диапазоне от 32 до 40 для массива элементов
//        List<Integer> health_dude = new ArrayList<>();
//
//
//        for (int i = 0; i <= arrTemp.length - 1; i++) {
//            arrTemp[i] = LOWEST_TEMP + (int) ((float) Math.random() * 8) + (int) ((float) Math.random() * 10) / 10f;
//            System.out.println("Пациент номер - " + " " + i +  " " +" " + arrTemp[i]);
//            if (arrTemp[i] >= LOWEST_TEMP_HEALTH && arrTemp[i] <= HIGHEST_TEMP_HEALTH) {
//                health_dude.add(i);
//                health = health + 1;
//                switch (health) {
//                    case 1:
//                        tempLowHealth = arrTemp[i];
//                        tempHighHealth = arrTemp[i];
//                        break;
//                    default:
//                        if (arrTemp[i] <= tempLowHealth) {
//                            tempLowHealth = arrTemp[i];
//                        }
//                        if (arrTemp[i] >= tempHighHealth) {
//                            tempHighHealth = arrTemp[i];
//                        }
//                }
//            }
//            tempSummary = tempSummary + arrTemp[i];
//        }
//        tempMiddle = (tempSummary / (arrTemp.length - 1));
//
//        System.out.println(health_dude.toString());
//        System.out.println("Средняя температура по больнице равна " + tempMiddle);
//        System.out.println("Количество здоровых равно  " + health);
//        System.out.println("Самая низкая здоровая температура " + tempLowHealth);
//        System.out.println("Самая высокая здоровая температура " + tempHighHealth);
//        String printOutX = "";

    }

    private static float getMaxHealth(List<Integer> healthPatients) {
        return 0;
    }

    private static float getMinHealth(List<Integer> healthPatients) {
        return 0;
    }

    private static List<Integer> getHealthPatients(float[] patients, float lowestTempHealth, float highestTempHealth) {


        Stream.of(patients).forEach(el -> Stream.of(el).filter(temp -> temp > lowestTempHealth && temp < highestTempHealth)).count();


        //Theme actualTheme =  Stream.of(Theme.values()).filter(value -> !value.getTheme().equals(NewTheme)).findFirst().get();

        return null;
    }

    private static float GetMiddleTemperature(float[] patients, int lowestTemp, int highestTemp) {


        return 0;
    }

    private static float[] CreateArrayPatients(int countOfPatients, float lowestTemp, float highestTemp) {

        float[] arrTemp = new float[countOfPatients];

        for (int i = 0; i <= arrTemp.length - 1; i++) {
            arrTemp[i] = lowestTemp + (int) ((float) Math.random() * (highestTemp - lowestTemp) + (int) ((float) Math.random() * 10) / 10f);
        }

        return arrTemp;
    }


}
