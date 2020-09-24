package com.lab111.labwork8;
/**
 * @author Viktoria Babenko
 * Realize Factory design pattern. This is the first factory creator.
 */

public class FirstCreator implements MyCreator {
    @Override
    public MyIterator createIterator() {
        return new FirstIterator();
    }
}
