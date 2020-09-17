package com.lab111.labwork5;
/**
 * Executive class
 * @author Viktoria Babenko
 */

public class DoingClass {
    /**
     * @param args
     */
    static GameElementData element1 = new GameElementData();
    static GameElementData element2 = new GameElementData();
    static Checker checker = new Checker(element1, element2);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        setGameElementData();
        checker.checkingMove();

    }

    public static void setGameElementData(){
        CurrentConditionsShow currentShowElement1= new CurrentConditionsShow(element1);
        CurrentConditionsShow currentShowElement2= new CurrentConditionsShow(element2);

        element1.setCoordinates(27,40);
        element2.setCoordinates(28, 65);


    }

}
