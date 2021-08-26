package ru.skillbox;

public final class RAM {

    public int weight;


    public int volumeRam;
    public TypesRam typesRam;

        public RAM(TypesRam typesRam,int volumeRam, int weight){
            this.volumeRam = volumeRam;
            this.weight = weight;
            this.typesRam = typesRam;


        }



    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getVolumeRam() {
        return volumeRam;
    }

    public void setVolumeRam(int volumeRam) {
        this.volumeRam = volumeRam;
    }
    public TypesRam getTypesRam() {
        return typesRam;
    }

    @Override
    public String toString() {
        return " " +
                "объём - " + volumeRam + " ГБ" +
                ", вес - " + weight + " грамм" +
                ", тип памяти - " + typesRam + "\n";
    }


}
