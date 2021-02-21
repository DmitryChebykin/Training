import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Program {

    public static final int COUNT_OF_PATIENTS = 500; //количество пациентов
    public static final float LOWEST_TEMP_HEALTH = 36.2f, HIGHEST_TEMP_HEALTH = 36.9f; //границы диапазона температур здоровых пациентов
    public static final int LOWEST_TEMP = 32, HIGHEST_TEMP = 40; //граница температур всех пациентов
    public static void main(String[] args) {

        float[] patients = CreateArrayPatients(COUNT_OF_PATIENTS, LOWEST_TEMP, HIGHEST_TEMP);
        HashMap<Integer, Float> healthPatients = getHealthPatients(patients, LOWEST_TEMP_HEALTH, HIGHEST_TEMP_HEALTH); //создаем хэшмапу здоровых пациентов
        float middle = GetMiddleTemperature(patients); // получаем среднюю температуру
        float min = getBorderTemp(healthPatients, "min"); //определяем нижнюю температуру
        float max = getBorderTemp(healthPatients, "max"); //определяем верхнюю температуру
        int countHealth = healthPatients.size();//получаем количество здоровых пациентов

        ConsoleOutHealthPatients(healthPatients);
        System.out.println( "Средняя температура " + middle);
        System.out.println( "Количество здоровых пациентов " + countHealth);
        System.out.println( "Нижняя температура здоровых " + min);
        System.out.println( "Верхняя температура здоровых " + max);

    }


    private static float getBorderTemp(HashMap<Integer, Float> healthPatients, String TypeBorder) {
        float temp;
        temp = healthPatients.get(healthPatients.keySet().toArray()[0]);

        for (Map.Entry<Integer, Float> pair : healthPatients.entrySet())
        {
            switch (TypeBorder){
                case "min":
                    if (pair.getValue() <= temp) {temp = pair.getValue();}
                break;
                case "max":
                    if (pair.getValue() >= temp) {temp = pair.getValue();}
                break;
            }
        }

        return temp;
    }

    private static HashMap getHealthPatients(float[] patients, float lowestTempHealth, float highestTempHealth) {

        HashMap<Integer, Float> healthPatients = new HashMap<>();

    for (int i=0; i < patients.length; i++) {

        if (patients[i] >= lowestTempHealth && patients[i] <= highestTempHealth){
            healthPatients.put(i,patients[i]);
        }

    }

        return 	healthPatients;
    }

    private static float GetMiddleTemperature(float[] patients) {

        DoubleStream ds = IntStream.range(0, patients.length).mapToDouble(i -> patients[i]);
        OptionalDouble obj = ds.average();

        return (float)obj.getAsDouble();
    }

    private static float[] CreateArrayPatients(int countOfPatients, float lowestTemp, float highestTemp) {

        float[] arrTemp = new float[countOfPatients];

        for (int i = 0; i <= arrTemp.length - 1; i++) {
            arrTemp[i] = lowestTemp + (int) ((float) Math.random() * (highestTemp - lowestTemp)) + (int) ((float) Math.random() * 100) / 100f;
            System.out.println("Пациент № " + (i+1) + " " + arrTemp[i]);
        }

        return arrTemp;
    }

    private static void ConsoleOutHealthPatients(HashMap<Integer, Float> patients) {

        for (Map.Entry<Integer, Float> pair : patients.entrySet()){
            System.out.println( "Пациент № " + (pair.getKey()+1) + " здоров :  " + pair.getValue());
        }



    }
}
