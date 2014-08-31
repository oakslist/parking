package com.core.beans;

import com.core.beans.constant.Data;
import com.sun.corba.se.impl.orbutil.closure.Constant;

import java.util.ArrayList;
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
        List<Point> coordinateLeft = new ArrayList<>();
        List<Point> coordinateRight = new ArrayList<>();
        parkingPlaceList = new ArrayList<>();
        int sizeY = (startCoordinateY-startCoordinateY)/ Data.PARKING_PLACE_WIDTH;
        for (int i=0; i < sizeY; i++){
            parkingPlaceList.add(new ParkingPlace(i,i,i+sizeY,i+sizeY));
            coordinateLeft.add(new Point(i+sizeY,i+sizeY));
        }
        int sizeX = (startCoordinateX - endCoordinateX)/Data.PARKING_PLACE_WIDTH;
        for (int i=0; i< sizeX; i++){
            parkingPlaceList.add(new ParkingPlace(i+sizeY,i+sizeY,i,i));
            coordinateRight.add(new Point(i+sizeY,i+sizeY));
        }

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
