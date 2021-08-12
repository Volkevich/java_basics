package ru.skillbox;

public class Product {


    private final int barCode;
    private final String name;
    private int prise;

    public int getPrise() {
        return prise;
    }

    public String getName() {
        return name;
    }

    public int getBarCode() {
        return barCode;
    }

    public Product(String name, int barCode) {
        this.name = name;
        this.barCode = barCode;
    }




}
