package com.lab111.labwork8;
/**
 * @author Viktoria Babenko
 * Realize Factory design pattern. This is the interface for our factory.
 */

public interface MyCreator {
    /**
     * Create our new object.
     * @return object we must have.
     */
    MyIterator createIterator();
}
