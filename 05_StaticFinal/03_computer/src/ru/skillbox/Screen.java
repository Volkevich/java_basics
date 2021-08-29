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

    public Screen setDiogonal(int diogonal) {
        return new Screen(diogonal,typeScreen,weight);
    }

    public TypeScreen getTypeScreen() {
        return typeScreen;
    }

    public Screen setTypeScreen(TypeScreen typeScreen) {
        return new Screen(diogonal,typeScreen,weight);
    }

    public int getWeight() {
        return weight;
    }

    public Screen setWeight(int weight) {
        return new Screen(diogonal,typeScreen,weight);
    }

    @Override
    public String toString() {
        return " " +
                "диагональ - " + getDiogonal() + " дюймов" +
                ", тип экрана - " + getTypeScreen() +
                ", вес - " + getWeight() + " грамм\n";
    }

}
