package com.core.beans;

import java.util.Map;

/**
 * Created by Viachaslau_Karnausha on 8/31/2014.
 */
abstract public class Road {

    private Map<Integer,Integer> coordinateRoadLeft;
    private Map<Integer,Integer> coordinateRoadRight;


    public Map<Integer, Integer> getCoordinateRoadLeft() {
        return coordinateRoadLeft;
    }

    public void setCoordinateRoadLeft(Map<Integer, Integer> coordinateRoadLeft) {
        this.coordinateRoadLeft = coordinateRoadLeft;
    }

    public Map<Integer, Integer> getCoordinateRoadRight() {
        return coordinateRoadRight;
    }

    public void setCoordinateRoadRight(Map<Integer, Integer> coordinateRoadRight) {
        this.coordinateRoadRight = coordinateRoadRight;
    }
}
