package com.core.beans;

import java.util.List;

/**
 * Created by Viachaslau_Karnausha on 8/31/2014.
 */
abstract public class Transport  {

    private Route route;

    public abstract List<int[][]> move();

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
