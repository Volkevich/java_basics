public class Main {

    public static void main(String[] args) {
        Basket basketVasia = new Basket();
        basketVasia.add("Персик", 2, 20, 100);
        basketVasia.print("Корзина Васи: ");
        Basket basketMax = new Basket();
        basketMax.add("Apple", 11, 3, 20);
        basketMax.add("Cucumber", 10, 3, 33);
        basketMax.add("Лимон", 2, 3, 30);
        basketMax.add("Персик", 10, 3, 30);
        basketMax.print("Корзина Макса - ");
        Basket basketOla = new Basket();
        basketOla.add("Apple", 11, 3, 20);
        basketOla.add("Cucumber", 10, 3, 33);
        basketOla.add("Лимон", 2, 3, 30);
        basketOla.add("Персик", 10, 3, 30);
        basketOla.clear();
        basketOla.print("Корзина Оли - ");
        System.out.println("Общая стоимость товаров со всех корзин: " + Basket.getTotalAllPrice() + " руб.");
        System.out.println("Количество корзин: " + Basket.getCount());
        System.out.println("Средняя цена: " + Basket.averagePrice() + " руб.");
        System.out.println("Средняя стоимость корзины: " + Basket.averageBasket() + " руб.");
        System.out.println("Общее количество товаров: " + Basket.getTotalCount());







    }
}
