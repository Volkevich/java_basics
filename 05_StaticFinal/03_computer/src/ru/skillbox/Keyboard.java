package ru.skillbox;

public final class Keyboard {


    public final TypeKeyboard typeKeyboard;
    public final boolean backlight;
    public final int weight;

    public Keyboard(TypeKeyboard typeKeyboard, boolean backlight, int weight) {
        this.backlight = backlight;
        this.weight = weight;
        this.typeKeyboard = typeKeyboard;
    }

    public TypeKeyboard getTypeKeyboard() {
        return typeKeyboard;
    }

    public Keyboard setTypeKeyboard(TypeKeyboard typeKeyboard) {
        return new Keyboard(typeKeyboard,backlight,weight);
    }

    public boolean isBacklight() {
        return backlight;
    }

    public Keyboard setBacklight(boolean backlight) {
        return new Keyboard(typeKeyboard,backlight,weight);
    }

    public int getWeight() {
        return weight;
    }

    public Keyboard setWeight(int weight) {
        return new Keyboard(typeKeyboard,backlight,weight);
    }

    @Override
    public String toString() {
        return " " +
                "тип - " + getTypeKeyboard() +
                ", имеется подсветка: " + isBacklight() +
                ", вес - " + getWeight() + " грамм";
    }
}
