public class Main {

    public static void main(String[] args) {
        Basket basketVasia = new Basket();
        basketVasia.add("Milk", 10,22);
        basketVasia.print("Корзина Васи");
        System.out.println("//-----------------------------------//");
        Basket basketMax = new Basket();
        basketMax.add("Apple", 10, 3, 20);
        basketMax.add("Cucumber", 10, 3, 33);
        basketMax.add("Лимон", 2, 3, 30);
        basketMax.add("Персик", 10, 3, 30);
        basketMax.print("Корзина Макса - ");
        System.out.println("=========================================================================");
        System.out.println("Общая сумма товаров со всех корзин: " + Basket.getTotalPrice() + " руб.");
        Basket basketMaxx = new Basket();
        basketMaxx.add("Apple", 2, 3, 20);
        System.out.println("Количество корзин: " + Basket.getCount());
        System.out.println("Количество товаров: " + Basket.getTotalCount() + " шт.");
        System.out.println("Средняя цена: " + Basket.averagePrice() + " руб.");
        System.out.println("Средняя стоимость корзины: " + Basket.averageBasket() + " руб.");





    }
}
