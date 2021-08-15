package ru.skillbox;

public class Product {

    public Product(String name, int barCode) {
        this.name = name;
        this.barCode = barCode;
    }
    private final int barCode;
    private final String name;
    private int price;

    public void setPrice(int price) {
        this.price = price;
    }



    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getBarCode() {
        return barCode;
    }






}
