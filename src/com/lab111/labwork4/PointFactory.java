package com.lab111.labwork4;
/**
 * PointFactory is responsible for creating new points,
 * taking into consideration that only one point of each color should be created,
 * the user doesn’t care about it, maintains flyweight pattern
 * @author Viktoria Babenko
 */

import java.util.Random;

public class PointFactory {
    private static int colorSize = 6;
    private Point[] points;
    private Random rand;

    public PointFactory()	{
        points = new Point[colorSize] ;
        rand = new Random();
    }
    /**
     *
     * @param color real color
     * @return point of specific color
     */
    public Point getPoint(Color color) {
        if (null == points[color.ordinal()]){
            points[color.ordinal()] = new Point(color);
            System.out.println("Creating " + color + " point.");
        }
        return points[color.ordinal()];
    }
    /**
     * @return random color
     */
    public Color getRandomColor() {
        return Color.values()[rand.nextInt(colorSize)];
    }

}
