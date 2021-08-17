package ru.skillbox;

public class Dimensions {
    private final int isLong;
    private final int width ;
    private final int height;

    public Dimensions(int height, int width, int isLong) {
        this.height = height;
        this.width = width;
        this.isLong = isLong;
    }

    public Dimensions setIsLong(int isLong) {
        return new Dimensions(height,width,isLong);
    }

    public Dimensions setWidth(int width) {
        return new Dimensions(height,width,isLong);
    }

    public Dimensions setHeight(int height) {
        return new Dimensions(height,width,isLong);
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
    public int volume(){
        return this.isLong * width * height;
    }
}