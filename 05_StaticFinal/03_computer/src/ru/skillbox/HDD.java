package ru.skillbox;

public final class HDD {




    public final TypeHDD typeHDD;
    public final int volumeHDD;
    public final int weightHDD;

    public HDD(TypeHDD typeHDD, int volumeHDD, int weightHDD) {
        this.volumeHDD = volumeHDD;
        this.weightHDD = weightHDD;
        this.typeHDD = typeHDD;
    }


    public int getVolumeHDD() {
        return volumeHDD;
    }

    public HDD setVolumeHDD(int volumeHDD) {
        return new HDD(typeHDD,volumeHDD,weightHDD);
    }
    public HDD setTypeHDD(TypeHDD typeHDD) {
        return new HDD(typeHDD,volumeHDD,weightHDD);
    }
    public int getWeightHDD() {
        return weightHDD;
    }

    public HDD setWeightHDD(int weightHDD) {
        return new HDD(typeHDD,volumeHDD,weightHDD);
    }

    public TypeHDD getTypeHDD() {
        return typeHDD;
    }

    @Override
    public String toString() {
        return " " +
                "тип - " + getTypeHDD() +
                ", объёмом - " + getVolumeHDD() + " ГБ" +
                ", вес - " + getWeightHDD() +
                " грамм\n";
    }


}
