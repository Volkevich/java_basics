package ru.skillbox;

public class Gruz {

    private final int massa;
    private final String adress;
    private final Boolean coup;
    private final String regNumber;
    private final Dimensions dimensions;
    private final Boolean fragile;

    public Gruz(int massa, String adress, boolean coup, String regNumber, Dimensions dimensions, boolean fragile) {
        this.massa = massa;
        this.adress = adress;
        this.coup = coup;
        this.regNumber = regNumber;
        this.dimensions = new Dimensions(dimensions.getHeight(),dimensions.getWidth(),dimensions.getIsLong());
        this.fragile = fragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Gruz setDimensions(Dimensions dimensions) {
        return new Gruz(massa,adress,coup,regNumber,dimensions,fragile);
    }

    public int getMassa() {
        return massa;
    }
    public Gruz setMassa(int massa) {
        return new Gruz(massa,adress,coup,regNumber,dimensions,fragile);
    }

    public String getAdress(){
        return adress;
    }

    public Gruz setAdress(String adress) {
        return new Gruz(massa,adress,coup,regNumber,dimensions,fragile);
    }
    public Boolean getCoup() {
        return coup;
    }

    public Gruz setCoup(boolean coup) {
        return new Gruz(massa,adress,coup,regNumber,dimensions,fragile);
    }

    public String getRegNumber() {
        return regNumber;
    }

    public Gruz setRegNumber(String regNumber) {
        return new Gruz(massa,adress,coup,regNumber,dimensions,fragile);
    }

    public Boolean isFragile() {
        return fragile;
    }

    public Gruz setFragile(boolean fragile) {
        return new Gruz(massa,adress,coup,regNumber,dimensions,fragile);
    }





    @Override
    public String toString() {
        return "Грузы: " +
                "масса товара: " + getMassa() +
                ", адресс доставки: " + getAdress() + '\'' +
                ", возможно ли переворачивать товар: " + getCoup() +
                ", регистрационный номер: " + getRegNumber() + '\n' + " является груз хрупким: " + isFragile() +
                ", объём товара: " + getDimensions() + " м3";
    }


}