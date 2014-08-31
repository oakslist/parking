package com.core.beans;

import java.util.List;

/**
 * Created by Viachaslau_Karnausha on 8/31/2014.
 */
abstract public class Parking implements Place {

    private int startCoordinateX;
    private int startCoordinateY;

    private int endCoordinateX;
    private int endCoordinateY;

    private Road road;

    public Road getRoad() {
        return road;
    }

    private List<ParkingPlace> parkingPlaceList;

    public void setRoad(Road road) {
        this.road = road;
    }

    public int getStartCoordinateX() {
        return startCoordinateX;
    }

    public void setStartCoordinateX(int startCoordinateX) {
        this.startCoordinateX = startCoordinateX;
    }

    public int getStartCoordinateY() {
        return startCoordinateY;
    }

    public void setStartCoordinateY(int startCoordinateY) {
        this.startCoordinateY = startCoordinateY;
    }

    public int getEndCoordinateX() {
        return endCoordinateX;
    }

    public void setEndCoordinateX(int endCoordinateX) {
        this.endCoordinateX = endCoordinateX;
    }

    public int getEndCoordinateY() {
        return endCoordinateY;
    }

    public void setEndCoordinateY(int endCoordinateY) {
        this.endCoordinateY = endCoordinateY;
    }

    public List<ParkingPlace> getParkingPlaceList() {
        return parkingPlaceList;
    }

    public void setParkingPlaceList(List<ParkingPlace> parkingPlaceList) {
        this.parkingPlaceList = parkingPlaceList;
    }
}
