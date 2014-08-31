package com.core.beans;

/**
 * Created by Viachaslau_Karnausha on 8/31/2014.
 */
public class ParkingPlace {
    private int width;
    private int height;
    private boolean empty = true;

    public boolean isEmpty() {
        return empty;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
