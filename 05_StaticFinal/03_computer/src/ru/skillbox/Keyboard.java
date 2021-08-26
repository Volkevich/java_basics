package ru.skillbox;

public final class Keyboard {


    public TypeKeyboard typeKeyboard;



    public boolean backlight;
    public int weight;

    public Keyboard(TypeKeyboard typeKeyboard, boolean backlight, int weight) {
        this.backlight = backlight;
        this.weight = weight;
        this.typeKeyboard = typeKeyboard;
    }

    public TypeKeyboard getTypeKeyboard() {
        return typeKeyboard;
    }

    public void setTypeKeyboard(TypeKeyboard typeKeyboard) {
        this.typeKeyboard = typeKeyboard;
    }

    public boolean isBacklight() {
        return backlight;
    }

    public void setBacklight(boolean backlight) {
        this.backlight = backlight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return " " +
                "тип - " + getTypeKeyboard() +
                ", имеется подсветка: " + backlight +
                ", вес - " + weight + " грамм";
    }
}
