package ru.skillbox;

public final class CPU {



    private final int frequency;                //частота
    private final int numberofCores;         //количество ядер
    private final double weight;                //вес
    public final Manufacturer manufacturer;


    public CPU(int frequency, int numberofCores, Manufacturer manufacturer, double weight) {
        this.frequency = frequency;
        this.numberofCores = numberofCores;
        this.weight = weight;
        this.manufacturer = manufacturer;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getNumberofCores() {
        return numberofCores;
    }

    public Manufacturer getManufacturer() {
        return  manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    // СЕТТЕРЫ..................................
    public CPU setFrequency(int frequency) {
        return new CPU(frequency,numberofCores,manufacturer,weight);
    }

    public CPU setNumberofCores(int numberofCores) {
        return new CPU(frequency,numberofCores,manufacturer,weight);
    }

    public CPU setWeight(double weight) {
        return new CPU(frequency,numberofCores,manufacturer,weight);

    }

    public CPU setManufacturer(Manufacturer manufacturer) {
        return new CPU(frequency,numberofCores,manufacturer,weight);
    }


    @Override
    public String toString() {
        return "процессор " +
                " с частотой - " + getFrequency() + " ггц" +
                ", количество ядер: " + getNumberofCores() + " производитель: " + getManufacturer() +
                ", вес: " + getWeight() + " грамм\n";
    }


}
