public class Basket {

    private static int count = 0;
    private static int totalCount = 0;
    private static String items = " ";
    private static int totalPrice = 0;
    private int limit;
    public double totalWeight = 0;


    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;


    }



    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        Basket.items = Basket.items + items;
        Basket.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }
    public static int getTotalCount() {
        return Basket.totalCount;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }


    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (Basket.totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " + price + " руб.";
       Basket.totalPrice = Basket.totalPrice + count * price;

    }


    public void add(String name, int price, int count, double weight)
    {
        add(name,price);
        totalWeight = totalWeight + weight;
        totalCount = totalCount + count;
        items = items +  " " + count + " шт. " + " весом - " + weight + " грамм";

    }



    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public double getTotalWeight()
    {
        return totalWeight;
    }

    public static double getTotalPrice() {
        return totalPrice;
    }
    public static double averagePrice() {
        return getTotalPrice() / getTotalCount();
    }

    public static double averageBasket() {
        return getTotalPrice() / Basket.getCount();
    }


    public boolean contains(String name) {
        return items.contains(name);
    }


    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
            System.out.println("Общий вес корзины: " + getTotalWeight() + " граммм");
        }
    }
}
