package ru.skillbox;

public class Gruz {

   public void addDimensions(){
       Dimensions copy = new Dimensions(dimensions.getIsLong(), dimensions.getWidth(), dimensions.getHeight());
   }

    public Gruz(int massa, String adress, boolean coup, String regNumber, int volume) {
        this.massa = massa;
        this.adress = adress;
        this.coup = coup;
        this.regNumber = regNumber;
    }

    private final int massa;
    private final String adress;
    private final boolean coup;
    private final String regNumber;
    private Dimensions dimensions;


    @Override
    public String toString() {
        return "Грузы: " +
                "масса товара: " + massa +
                ", адресс доставки: " + adress + '\'' +
                ", возможно ли переворачивать товар: " + coup +
                ", регистрационный номер: " + regNumber + '\'' +
                ", объём товара: " + dimensions + " м3";
    }

}














