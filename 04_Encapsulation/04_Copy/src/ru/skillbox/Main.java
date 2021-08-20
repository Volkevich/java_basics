package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(3,4,2);
        Cargo cargo = new Cargo(111,"Минск", true, "4455СС7", dimensions, true);
        System.out.println(cargo);
        cargo = cargo.setAddress("Слуцк");
        cargo = cargo.setMass(333);
        System.out.println(cargo);
        cargo = cargo.setDimensions(dimensions.setHeight(22));
        System.out.println(cargo);





    }
}