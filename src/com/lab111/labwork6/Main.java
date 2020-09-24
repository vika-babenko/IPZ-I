package com.lab111.labwork6;
/**
 * @author Viktoria Babenko
 */

public class Main {
    /**
     * @param args
     *            Main method of program
     */
    public static void main(String[] args) {
        Strategy decStrategy = new DecartStrategy();
        Strategy polStrategy = new PolaryStrategy();
        Function sinus = new Sinus(decStrategy, polStrategy);
        sinus.draw(1);
        sinus.draw(2);
        // TODO Auto-generated method stub

    }
}
