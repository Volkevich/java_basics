public class Basket {

    private static int count = 0;
    private static int totalCount = 0;
    private static String items = " ";
    private int totalPrice = 0;
    private int limit;
    public double totalWeight = 0;
    private static int totalAllPrice = 0;
    public int productCount = 0;


    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
        increasePrice(0);
        increaseProductCount(0);
        Basket.items = Basket.items + items;

    }



    public Basket(int limit) {
        this();
        this.limit = limit;
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



    private static void increasePrice(int price) {
        totalAllPrice += price;
    }
    private static void increaseProductCount(int count) {
        totalCount += count;
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

        items = items + "\n " + name + " ,стоимостью : " + price + " рубл. " + " в количестве - " + count + " шт. " + " весом - " + weight + " грамм\n" +
                "==============================================================================";
        totalWeight = totalWeight + weight;
        totalPrice = totalPrice + count * price;
        increaseProductCount(count);
        increasePrice(count * price);
        productCount = productCount + count;

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
        return getTotalAllPrice() /(double) getTotalCount();
    }

    public static double averageBasket() {
        return getTotalAllPrice()/(double) getCount();
    }


    public boolean contains(String name) {
        return items.contains(name);
    }


    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.print("==============");
            System.out.print("Корзина пуста");
            System.out.println("==============\n");
        } else {
            System.out.println(items);
            System.out.println("Cумма товаров в корзине: " + getTotalPrice() + " рубл.");
            System.out.println("Общий вес корзины: " + getTotalWeight() + " граммм");
            System.out.println("Количество товаров в корзине: " + productCount);
            System.out.println("===================================================================");

        }
    }
    public void clear() {
        Basket.items = "";
        totalAllPrice = totalAllPrice - totalPrice;
        totalCount = totalCount - productCount;
        totalPrice = 0;
        productCount = 0;
    }

}
