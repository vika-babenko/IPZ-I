package com.lab111.labwork5;
/**
 * Class, which check parameters of elements compatibility to each other
 * @author Viktoria Babenko
 *
 *
 */

public class Checker {
    private PlayField playfield = new PlayField(100,100);
    private GameElementData el1;
    private GameElementData el2;

    public Checker(GameElementData el1, GameElementData el2){
        this.el1=el1;
        this.el2=el2;
    }
    /*
     * Check, if elements in the field
     */
    public void checkField(GameElementData element){
        if (element.getCoordinateX()<=playfield.getWidth() && element.getCoordinateX()>=0 &&
                element.getCoordinateY()<=playfield.getHeight() && element.getCoordinateY()>=0){
            System.out.println("Your element in field");
        } else {
            System.out.println("YOur element doesn`t in field");
        }
    }
    /*
     * Check, if there is no other element in right way
     */
    public void checkRight(GameElementData element1, GameElementData element2){
        if ((element1.getCoordinateX()+1)!=element2.getCoordinateX()){
            System.out.println("You can move right");
        } else if ((element1.getCoordinateX()+1)==element2.getCoordinateX()){
            System.out.println("You can`t move right");
        }
    }
    /*
     * Check, if there is no other element in left way
     */
    public void checkLeft(GameElementData element1, GameElementData element2){
        if ((element1.getCoordinateX()-1)!=element2.getCoordinateX()){
            System.out.println("You can move left");
        } else if ((element1.getCoordinateX()+1)==element2.getCoordinateX()){
            System.out.println("You can`t move left");
        }
    }
    /*
     * Check, if there is no other element in front way
     */

    public void checkUp(GameElementData element1, GameElementData element2){
        if ((element1.getCoordinateY()+1)!=element2.getCoordinateY()){
            System.out.println("You can move up");
        } else if ((element1.getCoordinateY()+1)==element2.getCoordinateY()){
            System.out.println("You can`t move up");
        }
    }
    /*
     * Check, if there is no other element in back way
     */
    public void checkDown(GameElementData element1, GameElementData element2){
        if ((element1.getCoordinateY()-1)!=element2.getCoordinateY()){
            System.out.println("You can move down");
        } else if ((element1.getCoordinateY()-1)==element2.getCoordinateY()){
            System.out.println("You can`t move down");
        }
    }
    /*
     * Realize all methods before that in this class
     */
    public void checkingMove(){
        System.out.println("Checking 1st element in field:");
        checkField(el1);
        System.out.println("Checking 2d element in field:");
        checkField(el2);
        checkRight(el1, el2);
        checkLeft(el1,el2);
        checkUp(el1,el2);
        checkDown(el1,el2);

    }

}
