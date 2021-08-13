package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Product product = new Product("Молоко", 222);
        System.out.println("Имеющийся товар: " + product.getName() + "\n цена: " + product.getPrise(35) + " рублей \n штрих код товара: " + product.getBarCode() );


    }
}
