package com.lab111.labwork5;
/**
 * Class, that implements interface Observer
 *
 * @author Viktoria Babenko
 *
 */

public class CurrentConditionsShow implements Observer {
    private int posX;
    private int posY;
    GameElementData gameElementData;

    public CurrentConditionsShow (GameElementData gameElementData){
        this.gameElementData = gameElementData;
        gameElementData.attach(this);
    }
    @Override
    public void update(int posX, int posY){
        this.posX=posX;
        this.posY=posY;
        display();
    }
    public void display(){
        System.out.print("Coordinates of this gameelement at this moment: "+posX+"; "+ posY+"\n");
    }


}
