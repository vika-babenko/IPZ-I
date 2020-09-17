package com.lab111.labwork4;
/**
 * Class Point defines a point that will be used in flyweight pattern,
 * Color is intrinsic, Coordinates of point - extrinsic.
 * @author Viktoria Babenko
 */

public class Point implements PointInterface   {
    private Color color;
    /**
     * @param color - Color of the point
     */
    public Point(Color color) {
        this.color = color;
    }

    @Override
    public void draw(Coordinate coordinate) {
        System.out.println("Drawing " + color +
                " point at (" + coordinate.getX() + ", " + coordinate.getY() + ")");
    }

}
