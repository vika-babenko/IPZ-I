package com.lab111.labwork4;

/**
 * Defines (x, y) coordinates in rectangular coordinate system
 * @author Babenko Viktoria
 */

public class Coordinate {
    private int X;
    private int Y;
    /**
     * @param X coordinate X
     * @param Y coordinate Y
     */
    public Coordinate(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }
    /**
     * @return coordinate X
     */
    public int getX() {
        return X;
    }
    /**
     * @return coordinate Y
     */
    public int getY() {
        return Y;
    }

}
