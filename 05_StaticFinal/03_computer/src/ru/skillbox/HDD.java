package ru.skillbox;

public final class HDD {



    public TypeHDD typeHDD;
    public int volumeHDD;
    public int weightHDD;

    public HDD(TypeHDD typeHDD, int volumeHDD, int weightHDD) {
        this.volumeHDD = volumeHDD;
        this.weightHDD = weightHDD;
        this.typeHDD = typeHDD;
    }


    public int getVolumeHDD() {
        return volumeHDD;
    }

    public void setVolumeHDD(int volumeHDD) {
        this.volumeHDD = volumeHDD;
    }

    public int getWeightHDD() {
        return weightHDD;
    }

    public void setWeightHDD(int weightHDD) {
        this.weightHDD = weightHDD;
    }

    public TypeHDD getTypeHDD() {
        return typeHDD;
    }

    @Override
    public String toString() {
        return " " +
                "тип - " + getTypeHDD() +
                ", объёмом - " + volumeHDD +
                ", вес - " + weightHDD +
                " грамм\n";
    }


}
