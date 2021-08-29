package ru.skillbox;

public class Computer {

    private static final String VENDOR = " INTEL ";
    private static final String NAME = " MAVERLIK4 ";
    public CPU cpu;
    public Screen screen;
    public HDD hdd;
    public RAM ram;
    public Keyboard keyboard;


    public Computer(String VENDOR, String NAME, CPU cpu, RAM ram,  HDD hdd, Screen screen, Keyboard keyboard) {
        this.cpu = cpu;
        this.screen = screen;
        this.hdd = hdd;
        this.ram = ram;
        this.keyboard = keyboard;

    }

    public CPU getCpu() {
        return cpu;
    }

    public Screen getScreen() {
        return screen;
    }

    public HDD getHdd() {
        return hdd;
    }

    public RAM getRam() {
        return ram;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public double totalWeight(){
        return cpu.getWeight() + screen.getWeight() + hdd.getWeightHDD()+ ram.getWeight()+keyboard.getWeight();
    }

    @Override
    public String toString() {
        return "Мой персональный компьютер: " +
                "VENDOR - '" + VENDOR + '\'' +
                ", NAME - '" + NAME + '\'' +
                " \n Характеристики компьютера: " + getCpu() +
                " Монитор: " + getScreen() +
                " Жесткий диск: " + getHdd() +
                " Оперативная память: " + getRam() +
                " Клавиатура: " + getKeyboard() + "\n" + "Общая масса компьютера: " + totalWeight() + " грамм";

    }




}
