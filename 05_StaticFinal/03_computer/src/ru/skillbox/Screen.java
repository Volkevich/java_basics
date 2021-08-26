package ru.skillbox;

public final class Screen {

    public double diogonal;
    public TypeScreen typeScreen;
    public int weight;

    public Screen(double diogonal, TypeScreen typeScreen, int weight) {
        this.diogonal = diogonal;
        this.weight = weight;
        this.typeScreen = typeScreen;
    }


    public double getDiogonal() {
        return diogonal;
    }

    public void setDiogonal(int diogonal) {
        this.diogonal = diogonal;
    }

    public TypeScreen getTypeScreen() {
        return typeScreen;
    }

    public void setTypeScreen(TypeScreen typeScreen) {
        this.typeScreen = typeScreen;
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
                "диагональ - " + diogonal + " дюймов" +
                ", тип экрана - " + typeScreen +
                ", вес - " + weight + " грамм\n";
    }

}
