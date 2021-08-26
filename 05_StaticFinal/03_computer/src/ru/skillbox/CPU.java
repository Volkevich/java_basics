package ru.skillbox;

public final class CPU {


    private final int frequency;                //частота
    private final double numberofCores;         //количество ядер
    private final double weight;                //вес
    public final Manufacturer manufacturer;


    public CPU(int frequency, double numberofCores, Manufacturer manufacturer, double weight) {
        this.frequency = frequency;
        this.numberofCores = numberofCores;
        this.weight = weight;
        this.manufacturer = manufacturer;
    }

    public int getFrequency() {
        return frequency;
    }

    public double getNumberofCores() {
        return numberofCores;
    }

    public Manufacturer getManufacturer() {
        return  manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "процессор " +
                " с частотой - " + frequency + " ггц" +
                ", количество ядер: " + numberofCores + " производитель: " + getManufacturer() +
                ", вес: " + weight + " грамм\n";
    }


}
