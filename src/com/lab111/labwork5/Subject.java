package com.lab111.labwork5;
/**
 * Interface, which determines methods for attaching, detaching and notifying Observers
 * @author Viktoria Babenko
 *
 *
 */

public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObserver();

}
