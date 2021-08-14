package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions( 4, 5, 5);
        Gruz gruz = new Gruz(10, "г.Минск, ул. Пушкинская, д.44, кв.33", true, "4545CC7", dimensions.volume(4,4,4));
        System.out.println(gruz.toString());


    }
}
