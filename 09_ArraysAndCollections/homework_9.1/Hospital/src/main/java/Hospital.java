import java.util.Random;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[]tempricha = new float[patientsCount];
        float max = 40;
        float min = 32;
        for (int i = 0;i < tempricha.length;i++){
            tempricha[i] += (Math.random()*((max-min)+1))+min;
            tempricha[i] = Math.round(tempricha[i]);

        }

        //TODO: напишите метод генерации массива температур пациентов

        return tempricha;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */

        String report =
                "Температуры пациентов: " + 0 +
                        "\nСредняя температура: " + 0 +
                        "\nКоличество здоровых: " + 0;

        return report;
    }
}
