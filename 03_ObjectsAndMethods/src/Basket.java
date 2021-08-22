public class Basket {

    private static int count = 0;
    private static int totalCount = 0;
    private static String items = " ";
    private int totalPrice = 0;
    private int limit;
    public double totalWeight = 0;
    private static int totalAllPrice = 0;


    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;


    }



    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items) {
        this();
        Basket.items = Basket.items + items;

    }

    public static int getCount() {
        return count;
    }

    public void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }
    public static int getTotalCount() {
        return Basket.totalCount;
    }


    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n " + name + " ,стоимостью : " + price + " рубл. " + " в количестве - " + count + " шт. " + " весом - " + weight + " грамм";
        totalWeight = totalWeight + weight;
        totalCount = totalCount + count;
        totalPrice = totalPrice + count * price;
        totalAllPrice = totalAllPrice + count * price;
    }




    public double getTotalWeight()
    {
        return totalWeight;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public static int getTotalAllPrice() {
        return Basket.totalAllPrice;
    }


    public static double averagePrice() {
        return getTotalAllPrice() / getTotalCount();
    }

    public static double averageBasket() {
        return getTotalAllPrice()/ getCount();
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
            System.out.println("Cумма товаров в корзине: " + getTotalPrice() + " рубл.");
            System.out.println("Общий вес корзины: " + getTotalWeight() + " граммм");
        }
    }
    public static void clear() {
        Basket.items = "";
        Basket.totalAllPrice = 0;
        Basket.totalCount = 0;

    }

}
