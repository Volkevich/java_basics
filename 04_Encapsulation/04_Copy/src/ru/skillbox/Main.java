package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(3,4,2);
        Gruz gruz = new Gruz(111,"Минск", true, "4455СС7", dimensions, true);
        dimensions.setIsLong(434);
        System.out.println(gruz);
        dimensions.setHeight(44);
        dimensions.setWidth(44);
        System.out.println(gruz);




    }
}