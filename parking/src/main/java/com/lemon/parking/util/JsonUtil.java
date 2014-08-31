package com.lemon.parking.util;

import com.core.beans.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;
import java.util.List;

/**
 * Created by zetsubou_0 on 31.8.14.
 */
public class JsonUtil {
    private static final String ROAD = "road";
    private static final String PARKING = "parking";
    private static final String ENTER_CAR = "enterCar";
    private static final String ROUTE = "route";
    private static final String LEFT_ROAD = "left";
    private static final String RIGHT_ROAD = "right";
    private static final String WIDTH = "width";
    private static final String HEIGHT = "height";
    private static final String LENGTH = "length";
    private static final String IS_EMPTY = "isEmpty";
    private static final String PARKING_PLACES = "parkingPlaces";

    private static final int DEFAULT_TRANSPORT_LENGHT = 1;
    private static final int DEFAULT_TRANSPORT_WIDTH = 1;

    public static JSONObject parkingJSON(Parking parking) throws JSONException {
        List<ParkingPlace> parkingPlaces = parking.getParkingPlaceList();
        JSONArray parkingPlacesJSON = new JSONArray();
        Iterator<ParkingPlace> i = parkingPlaces.iterator();
        while (i.hasNext()) {
            ParkingPlace parkingPlace = i.next();
            JSONObject parkingPlaceJSON = new JSONObject();
            parkingPlaceJSON.put(WIDTH, parkingPlace.getWidth());
            parkingPlaceJSON.put(HEIGHT, parkingPlace.getWidth());
            parkingPlaceJSON.put(IS_EMPTY, parkingPlace.getWidth());
        }

        JSONObject parkingJSON = new JSONObject();
        parkingJSON.put(PARKING_PLACES, parkingPlaces);
        parkingJSON.put(LENGTH, parking.getEndCoordinateY());
        parkingJSON.put(WIDTH, parking.getEndCoordinateX());

        return parkingJSON;
    }

    public static JSONObject roadJSON(Parking parking) throws JSONException {
        Road road = parking.getRoad();

        JSONObject roadJSON = new JSONObject();
        roadJSON.put(LEFT_ROAD, pointsToJson(road.getLeft()));
        roadJSON.put(RIGHT_ROAD, pointsToJson(road.getRight()));

        return roadJSON;
    }

    public static JSONObject trasportJSON(Transport transport) throws JSONException {
        Route route = transport.getRoute();

        JSONObject trasportJSON = new JSONObject();
        trasportJSON.put(LENGTH, DEFAULT_TRANSPORT_LENGHT);
        trasportJSON.put(WIDTH, DEFAULT_TRANSPORT_WIDTH);
        trasportJSON.put(ROUTE, pointsToJson(route.getRouteList()));

        return trasportJSON;
    }

    public static JSONArray pointsToJson(List<Point> points) throws JSONException {
        JSONArray jsonArray = new JSONArray();
        Iterator<Point> i = points.iterator();
        while(i.hasNext()) {
            JSONObject obj = new JSONObject();
            Point p = i.next();
            obj.put("x", p.getX());
            obj.put("y", p.getY());
            jsonArray.put(obj);
        }
        return jsonArray;
    }


}
