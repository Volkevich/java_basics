package ru.skillbox;

public class Computer {

    private static final String VENDOR = "INTEL";
    private static final String NAME = "I5";
    public final CPU cpu;
    public final Screen screen;
    public final HDD hdd;
    public final RAM ram;
    public final Keyboard keyboard;

    public Computer(CPU cpu, RAM ram,  HDD hdd, Screen screen, Keyboard keyboard) {
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


    @Override
    public String toString() {
        return "Мой персональный компьютер: " +
                "VENDOR - '" + VENDOR + '\'' +
                ", NAME - '" + NAME + '\'' +
                " \n Характеристики компьютера: " + getCpu() +
                " Монитор: " + getScreen() +
                " Жесткий диск: " + getHdd() +
                " Оперативная память: " + getRam() +
                " Клавиатура: " + getKeyboard();
    }




}
