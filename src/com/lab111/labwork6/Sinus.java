package com.lab111.labwork6;
/**
 * @author Viktoria Babenko
 */

public class Sinus extends Function{
    /**
     * @param decStrategy
     *            is strategy for drawing in Decart coordinates
     * @param polStrategy
     *            is strategy for drawing in Polar coordinates
     */
    public Sinus(Strategy decStrategy, Strategy polStrategy) {
        super(decStrategy, polStrategy, "Sinus(x)");
    }
}
