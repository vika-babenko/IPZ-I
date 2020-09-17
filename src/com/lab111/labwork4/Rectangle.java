package com.lab111.labwork4;
/**
 * Class Rectangle draws rectangles in raster graphics.
 * Its points are created using flyweight pattern.
 * @author Viktoria Babenko
 */

public class Rectangle {
    private Point[][] points;
    private Coordinate A;
    private Coordinate B;
    private int dx = 0;
    private int dy = 0;
    private PointFactory pg;
    /**
     * @param A - left bottom point of the rectangle
     * @param B - right top point of the rectangle
     */
    public Rectangle(Coordinate A, Coordinate B) {
        this.A = new Coordinate (A.getX(), A.getY());
        this.B = new Coordinate (B.getX(), B.getY());
        pg = new PointFactory();
        fillPoints();
    }
    /**
     * fills Rectangle with points
     */
    private void fillPoints(){
        dx = B.getX() - A.getX() + 1;
        dy = B.getY() - A.getY() + 1;
        points = new Point[dx][];
        for (int i = 0; i < dx; i++){
            points [i] = new Point[dy];
        }
        for (int i = 0; i < dx; i++){
            for (int j =0; j < dy; j++)	{
                points[i][j] = pg.getPoint(pg.getRandomColor());
            }
        }
    }
    /**
     * Draws the rectangle
     */
    public void print(){
        for (int і = 0; і < dx; і++){
            for (int j =0; j < dy; j++)	{
                points[і][j].draw(new Coordinate(A.getX() + і, A.getY() + j));
            }
        }
    }
}
