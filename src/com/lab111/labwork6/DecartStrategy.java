package com.lab111.labwork6;
/**
 * @author Babenko Viktoria
 */

public class DecartStrategy extends Strategy {
    public void draw(Function function) {
        System.out.println("Function " + function.getName()
                + " draw in Decarts coordinates");
    }
}


