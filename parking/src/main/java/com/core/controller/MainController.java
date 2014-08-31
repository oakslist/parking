package com.core.controller;

import com.core.beans.Parking;
import com.core.beans.Road;
import com.core.beans.Route;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Viachaslau_Karnausha on 8/31/2014.
 */
public class MainController {

    public Route getRoute(Parking parking, int[] coordinate){
        Road road = parking.getRoad();
        Map<Integer,Integer> resultCoordinate = new HashMap<Integer, Integer>();
        Map<Integer,Integer> coordinateLeft = road.getCoordinateRoadLeft();
        Map<Integer,Integer> coordinateRight = road.getCoordinateRoadRight();
        Set<Map.Entry<Integer,Integer>> coordinateRSet = coordinateRight.entrySet();
        Iterator<Map.Entry<Integer,Integer>> coordinateR = coordinateRSet.iterator();
        int stopX = coordinate[0];
        int stopY = coordinate[1];
        for (Map.Entry<Integer,Integer> coordinateL : coordinateLeft.entrySet()){
            int xL = coordinateL.getKey();
            int yL = coordinateL.getValue();
            int xR = coordinateR.next().getKey();
            int yR = coordinateR.next().getValue();
            int resultX;
            int resultY;
            if (xL == xR){
                resultX = xL;
            }
            else {
                resultX = Math.abs(xR - xL) / 2;
            }
            if (yL == yR){
                resultY=yL;
            }
            else {
                resultY = Math.abs(yL - yR) / 2;
            }


            resultCoordinate.put(resultX,resultY);
        }


        return null;
    }

    public int[] getStartCoordinate() {

        return null;
    }
}
