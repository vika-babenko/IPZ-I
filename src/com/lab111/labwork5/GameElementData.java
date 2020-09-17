package com.lab111.labwork5;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implements interface Subject and have coordinates of game-elements
 * on the field
 * @author Viktoria Babenko
 *
 */

public class GameElementData implements Subject {private List<Observer> observers;
    private int posX;
    private int posY;

    public GameElementData(){
        observers = new ArrayList<Observer>();
    }
    /*
     * Realization of interface Subject
     * @see com.lab111.labwork5.Subject#attach(com.lab111.labwork5.Observer)
     */
    @Override
    public void attach(Observer o){
        observers.add(o);
    }
    @Override
    public void detach (Observer o){
        observers.remove(o);
    }
    @Override
    public void notifyObserver(){
        for(Observer observer: observers){
            observer.update(posX,posY);
        }
    }
    /*
     *  Set coordinates of element
     */
    public void setCoordinates(int posX, int posY){
        this.posX=posX;
        this.posY=posY;
        notifyObserver();
    }

    /*
     * Getters
     */
    public int getCoordinateX(){
        return this.posX;
    }

    public int getCoordinateY(){
        return this.posY;
    }

}


