package com.test;

import com.core.beans.Route;
import com.core.beans.Transport;
import org.json.JSONArray;

/**
 * Created by zetsubou_0 on 31.8.14.
 */
public class JsonTest {

    public String getJSON(Transport transport) {
        String jsonString = "";
        JSONArray jsonArray = new JSONArray();
        Route route = transport.getRoute();
        
        return jsonString;
    }

}
