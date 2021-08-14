package ru.skillbox;

public final class Dimensions {


    private final int isLong;
    private final int width;
    private final int height;

    public Dimensions(int isLong, int width, int height) {
        this.isLong = isLong;
        this.width = width;
        this.height = height;
    }

    public int getIsLong() {
        return isLong;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int volume(int width, int isLong, int height){

     return isLong * width * height;
    }


}
