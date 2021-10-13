import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[]temperature = new float[patientsCount];
        final int max = 40;
        final int min = 32;
        float scele = (float) Math.pow(10,1);
        for (int i = 0;i < patientsCount;i++){
            temperature[i] = Math.round((Math.random()*((max - min)) + min)*scele)/scele;
        }

        //TODO: напишите метод генерации массива температур пациентов

        return temperature;
    }

    public static String getReport(float[] temperatureData) {
        float temperatureCount = 0;
        float temperatureMidl;
        int helsPiople = 0;
        final float maxTempricha = 36.9f;
        final float minTempricha = 36.2f;
        float step = (float) Math.pow(10,2);
       for (int i = 0; i < temperatureData.length ;i++){
           temperatureCount += temperatureData[i];
           if (temperatureData[i] >= minTempricha && temperatureData[i] <= maxTempricha)
               helsPiople++;

       }
        temperatureMidl = temperatureCount / temperatureData.length;
        temperatureMidl = Math.round((temperatureMidl)*step)/step;


        //TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
           // а также температуры всех пациентов.

        String report =
                "Температуры пациентов: " + Arrays.toString(temperatureData).replaceAll(",","").replaceAll("]","").replaceAll("\\[","") +
                        "\nСредняя температура: " + temperatureMidl +
                        "\nКоличество здоровых: " + helsPiople;

        return report;
    }
}
