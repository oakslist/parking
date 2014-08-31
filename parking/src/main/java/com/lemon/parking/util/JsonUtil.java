package com.lemon.parking.util;

import com.core.beans.Point;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;
import java.util.List;

/**
 * Created by zetsubou_0 on 31.8.14.
 */
public class JsonUtil {
    public static JSONObject pointsToJson(List<Point> points) throws JSONException {
        JSONArray jsonArray = new JSONArray();
        Iterator<Point> i = points.iterator();
        while(i.hasNext()) {
            JSONObject obj = new JSONObject();
            Point p = i.next();
            obj.put("x", p.getX());
            obj.put("y", p.getY());
            jsonArray.put(obj);
        }

        return new JSONObject().put("coordinate", jsonArray);
    }
}
