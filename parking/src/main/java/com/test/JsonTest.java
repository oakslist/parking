package com.test;

import com.core.beans.Point;
import com.core.beans.Route;
import com.core.beans.Transport;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * Created by zetsubou_0 on 31.8.14.
 */
public class JsonTest {

    public String getJSON(Transport transport) {
        String jsonString = "";
        JSONArray jsonArray = new JSONArray();
        Route route = transport.getRoute();
        List<Point> routes = route.getRoutes();

        Point p = new Point(3, 7);
//        JSONObject jsonObject =

        return jsonString;
    }

}
