package ru.skillbox;

public final class Cargo {

    private final int mass;
    private final String Address;
    private final Boolean coup;
    private final String regNumber;
    private final Dimensions dimensions;
    private final Boolean fragile;

    public Cargo(int mass, String Address, boolean coup, String regNumber, Dimensions dimensions, boolean fragile) {
        this.mass = mass;
        this.Address = Address;
        this.coup = coup;
        this.regNumber = regNumber;
        this.dimensions = new Dimensions(dimensions.getHeight(),dimensions.getWidth(),dimensions.getlength());
        this.fragile = fragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(mass,Address,coup,regNumber,dimensions,fragile);
    }

    public int getmass() {
        return mass;
    }
    public Cargo setMass(int mass) {
        return new Cargo(mass,Address,coup,regNumber,dimensions,fragile);
    }

    public String getAddress(){
        return Address;
    }

    public Cargo setAddress(String Address) {
        return new Cargo(mass,Address,coup,regNumber,dimensions,fragile);
    }
    public Boolean getCoup() {
        return coup;
    }

    public Cargo setCoup(boolean coup) {
        return new Cargo(mass,Address,coup,regNumber,dimensions,fragile);
    }

    public String getRegNumber() {
        return regNumber;
    }

    public Cargo setRegNumber(String regNumber) {
        return new Cargo(mass,Address,coup,regNumber,dimensions,fragile);
    }

    public Boolean isFragile() {
        return fragile;
    }

    public Cargo setFragile(boolean fragile) {
        return new Cargo(mass,Address,coup,regNumber,dimensions,fragile);
    }





    @Override
    public String toString() {
        return "Грузы: " +
                "масса товара: " + getmass() +
                ", адресс доставки: " + getAddress() + '\'' +
                ", возможно ли переворачивать товар: " + getCoup() +
                ", регистрационный номер: " + getRegNumber() + '\n' + " является груз хрупким: " + isFragile() +
                ", объём товара: " + dimensions.volume() + " м3";
    }


}