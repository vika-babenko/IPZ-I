package com.lab111.labwork6;
/**
 * @author Babenko Viktoria
 */

public class Function {
    /**
     * @param name
     *            is name of function
     * @param decStrategy
     *            is strategy for drawing in decart coordinates
     * @param polStrategy
     *            is strategy for drawing in polar coordinates
     */
    private String name;
    private Strategy decStrategy;
    private Strategy polStrategy;

    /**
     * Constructor set data
     *
     * @param decStrategy
     *            is strategy for drawing in decart coordinates
     * @param polStrategy
     *            is strategy for drawing in polar coordinates
     * @param name
     *            is name of function
     */
    public Function(Strategy decStrategy, Strategy polStrategy, String name) {
        this.decStrategy = decStrategy;
        this.polStrategy = polStrategy;
        this.name = name;
    }

    /**
     * The method is a specific strategy for drawing functions depending on the
     * selected key.
     *
     * @param key
     *            is key of strategy
     */
    public void draw(int key) {
        switch (key) {
            case 1:
                decStrategy.draw(this);
                break;
            case 2:
                polStrategy.draw(this);
        }
    }

    /**
     * @return neme of function
     */
    public String getName() {
        return name;
    }
}
