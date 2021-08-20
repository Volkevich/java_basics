package ru.skillbox;

public final class Dimensions {
    private int length;
    private int width ;
    private int height;

    public Dimensions(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Dimensions setlength(int length) {
        return new Dimensions(length, this.width, this.height);
    }

    public Dimensions setWidth(int width) {
        return new Dimensions(width, this.height , this.length);
    }

    public Dimensions setHeight(int height) {
        return new Dimensions(this.length, this.width, height);
    }


    public int getlength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public int volume(){
        return length * width * height;
    }
}