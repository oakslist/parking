package com.core.controller;

import com.core.beans.Parking;
import com.core.beans.Point;
import com.core.beans.Road;
import com.core.beans.Route;

import java.util.*;

/**
 * Created by Viachaslau_Karnausha on 8/31/2014.
 */
public class MainController {

    public Route getRoute(Parking parking, int[] coordinate) {
        Route route = new Route();
        Road road = parking.getRoad();
        List<Point> resultCoordinate = new ArrayList<Point>();
        List<Point> coordinateLeft = road.getLeft();
        List<Point> coordinateRight = road.getRight();
        Iterator<Point> coordinateR = coordinateRight.iterator();
        int stopX = coordinate[0];
        int stopY = coordinate[1];
        int parkingPlaceLength = parking.getParkingPlaceList().get(0).getHeight();
        for (Point point : coordinateLeft) {
            int xL = point.getX();
            int yL = point.getY();
            int xR = coordinateR.next().getX();
            int yR = coordinateR.next().getY();
            int resultX;
            int resultY;

                if (xL == xR) {
                    resultX = xL;
                } else {
                    resultX = Math.abs(xR - xL) / 2;
                }
                if (yL == yR) {
                    resultY = yL;
                } else {
                    resultY = Math.abs(yL - yR) / 2;
                }

                if (xL == stopX && yL == stopY) {
                    for (int i = 0; i < parkingPlaceLength; i++) {
                        resultCoordinate.add(new Point(resultX - i, resultY));
                    }
                    route.setRouteList(resultCoordinate);
                    return route;
                }

                if (xR == stopX && yL == stopY) {
                    for (int i = 0; i < parkingPlaceLength; i++) {
                        resultCoordinate.add(new Point(resultX + i, resultY));
                    }
                    route.setRouteList(resultCoordinate);
                    return route;
                }
                else {
                    if (yL == stopY && xL == stopX) {
                        for (int i = 0; i < parkingPlaceLength; i++) {
                            resultCoordinate.add(new Point(resultX, resultY - 1));
                        }
                        route.setRouteList(resultCoordinate);
                        return route;
                    }

                    if (yL == stopY && xL == stopX) {
                        for (int i = 0; i < parkingPlaceLength; i++) {
                            resultCoordinate.add(new Point(resultX, resultY + 1));
                        }
                        route.setRouteList(resultCoordinate);
                        return route;
                    }
                }

                resultCoordinate.add(new Point(resultX, resultY));
        }
        return route;


    }

    public int[] getStartCoordinate() {

        return null;
    }
}
