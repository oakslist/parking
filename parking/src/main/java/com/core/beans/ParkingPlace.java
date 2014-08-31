package com.core.beans;
/**
 * Created by Viachaslau_Karnausha on 8/31/2014.
 */
public class ParkingPlace {
    private int width;
    private int height;
    private int startCoordinateX;
    private int startCoordinateY;
    private int endCoordinateX;
    private int endCoordinateY;
    private boolean empty;

    public ParkingPlace(int startCoordinateX, int startCoordinateY, int endCoordinateX, int endCoordinateY) {
        this.startCoordinateX = startCoordinateX;
        this.startCoordinateY = startCoordinateY;
        this.endCoordinateX = endCoordinateX;
        this.endCoordinateY = endCoordinateY;
    }

    public ParkingPlace(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public ParkingPlace() {
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

    public boolean isEmpty() {
        return empty;
    }
}