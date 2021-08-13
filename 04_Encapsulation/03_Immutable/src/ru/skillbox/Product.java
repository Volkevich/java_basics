package ru.skillbox;

public class Product {

    public Product(String name, int barCode) {
        this.name = name;
        this.barCode = barCode;
    }
    private final int barCode;
    private final String name;
    private int prise;

    public int getPrise(int prise) {
        return prise;
    }

    public String getName() {
        return name;
    }

    public int getBarCode() {
        return barCode;
    }






}
