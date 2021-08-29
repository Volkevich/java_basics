package ru.skillbox;

public final class RAM {

    public final int weight;
    public final int volumeRam;
    public final TypesRam typesRam;

        public RAM(TypesRam typesRam,int volumeRam, int weight){
            this.volumeRam = volumeRam;
            this.weight = weight;
            this.typesRam = typesRam;
        }



    public int getWeight() {
        return weight;
    }

    public RAM setWeight(int weight) {
        return new RAM(typesRam,volumeRam,weight);
    }

    public int getVolumeRam() {
        return volumeRam;
    }

    public RAM setVolumeRam(int volumeRam) {
        return new RAM(typesRam,volumeRam,weight);
    }
    public TypesRam getTypesRam() {
        return typesRam;
    }
    public RAM setTypesRam(TypesRam typesRam) {
        return new RAM(typesRam,volumeRam,weight);
    }

    @Override
    public String toString() {
        return " " +
                "объём - " + getVolumeRam() + " ГБ" +
                ", вес - " + getWeight() + " грамм" +
                ", тип памяти - " + getTypesRam() + "\n";
    }


}
