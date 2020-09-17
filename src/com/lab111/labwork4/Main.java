package com.lab111.labwork4;
/**
 * Demo class.
 * @author Viktoria Babenko
 */

public final class Main {
    /**
     * @param args command line arguments
     */
    public static void main(String[] args) {
        /**
         * Creating coloured rectangle
         */
        System.out.println("Creating coloured rectangle");
        Rectangle r = new Rectangle(new Coordinate(1, 2), new Coordinate(5, 4)); r.print();
    }
}
