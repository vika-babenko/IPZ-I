package com.lab111.labwork6;
/**
 * @author Viktoria Babenko
 */

public class PolaryStrategy extends Strategy {
    public void draw(Function function) {
        System.out.println("Function " + function.getName()
                + " draw in Polar coordinates");
    }
}
