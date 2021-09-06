import java.util.Scanner;

public class Main {
    public static final int BOXES_IN_CONTAINER = 27;
    public static final int CONTAINERS_IN_TRUCKS = 12;
    public static int containerNumber = 1;
    public static int truckNumber = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();
        int boxesCount = Integer.parseInt(boxes);

        if (boxesCount != 0) {
            System.out.println("Грузовик: " + truckNumber);
            System.out.println("\tКонтейнер: " + containerNumber);
            for (int i = 1; i <= boxesCount; i++) {
                System.out.println("\t\tЯщик: " + i);
                if (i % (BOXES_IN_CONTAINER * CONTAINERS_IN_TRUCKS) == 0) {
                    truckNumber += 1;
                    System.out.println("Грузовик: " + truckNumber);
                }
                if (i % BOXES_IN_CONTAINER == 0) {
                    if(i != boxesCount){
                        containerNumber ++;
                        System.out.println("\tКонтейнер: " + containerNumber);
                    }
                }


            } System.out.println("Необходимо:"+System.lineSeparator()+"грузовиков - "+ truckNumber +" шт."+System.lineSeparator()+"контейнеров - "
                    + containerNumber +" шт.");


        }else System.out.println("Необходимо:"+System.lineSeparator()+"грузовиков - "+ --truckNumber +" шт."+System.lineSeparator()+"контейнеров - "
                + --containerNumber +" шт.");
    }
}




        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */



