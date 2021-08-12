package ru.skillbox;

public class Country {

    private String name;
    private int population;
    private double square;
    private String nameCountry;
    private boolean accessSea;


    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public void setAccessSea(boolean accessSea) {
        this.accessSea = accessSea;
    }


    public Country(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getSquare() {
        return square;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public boolean isAccessSea() {
        return accessSea;
    }


}