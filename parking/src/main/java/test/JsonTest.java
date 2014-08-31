package test;

import com.core.beans.Point;
import com.core.beans.Route;
import com.core.beans.Transport;
import com.lemon.parking.util.JsonUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zetsubou_0 on 31.8.14.
 */
public class JsonTest {
    public String test() {
        String test = "";
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 2));
        points.add(new Point(1, 3));
        points.add(new Point(1, 4));
        points.add(new Point(1, 5));
        points.add(new Point(1, 6));
        points.add(new Point(1, 7));
        points.add(new Point(1, 8));

        try {
            test = JsonUtil.pointsToJson(points).toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return test;
    }

    public String getJSON(Transport transport) {
        String jsonString = "";
        JSONArray jsonArray = new JSONArray();
        Route route = transport.getRoute();
        List<Point> routes = route.getRoutes();

        return jsonString;
    }

}
