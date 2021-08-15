package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Product product = new Product("Молоко", 222);
        product.setPrice(44);
        System.out.println("Имеющийся товар: " + product.getName() + "\n цена: " + product.getPrice() + " рублей \n штрих код товара: " + product.getBarCode() );


    }
}
