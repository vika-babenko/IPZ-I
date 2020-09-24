package com.lab111.labwork8;

/**
 * @author Viktoria Babenko
 * Realize Factory design pattern. This is the second type of objects which we will create.
 */
public class SecondIterator implements MyIterator {
    @Override
    public void searchNextEllement() {
        System.out.println("Second iterator search algorithm");
    }
}
