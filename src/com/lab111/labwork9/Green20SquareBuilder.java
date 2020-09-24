package com.lab111.labwork9;
/**
 * @author Viktoria Babenko
 * Realize Builder design pattern. This is the a concrete Builder.
 * Its creates green square with 20% transparency.
 */

public class Green20SquareBuilder extends ElementBuilder {
    @Override
    public void createColor() {
        myEl.setColor("GREEN");
    }

    @Override
    public void createTransperencyPT() {
        myEl.setTransparencyPRT(20);
    }

    @Override
    public void createType() {
        myEl.setType("Square");
    }

}
