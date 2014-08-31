package com.core.beans;

import java.util.List;
import java.util.Map;

/**
 * Created by Viachaslau_Karnausha on 8/31/2014.
 */
public class Road {

    private List<Point> left;
    private List<Point> right;

    public List<Point> getLeft() {
        return left;
    }

    public void setLeft(List<Point> left) {
        this.left = left;
    }

    public List<Point> getRight() {
        return right;
    }

    public void setRight(List<Point> right) {
        this.right = right;
    }
}
