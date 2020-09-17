package com.lab111.labwork5;
/**
 *  Determines playfield, where game elements is stay.
 * @author Viktoria Babenko
 *
 *
 *
 */

public class PlayField {
    private int width;
    private int height;

    public PlayField(int width, int height){
        this.width=width;
        this.height=height;
    }

    /*
     * Getters
     */
    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

}
