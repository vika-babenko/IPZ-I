package com.lab111.labwork3;

/**
 * Creating different classes,
 * making an image and using special methods
 */

public class MyCache {
    static Image image = new Image();
    /**
     * Creating void method,
     * that has used for discover images`  new size
     */
    public static void getSize(){
        System.out.println(image.x + " ,  " + image.y);
    }
    /**
     * Creating void method,
     * that has used for clear caching
     */
    public static void fromCash(){
        System.out.println("Clear caching has done succsefuly");
    }
    /**
     * Creating static method,
     * that has used for discover images` colors
     */
    public static String getColor(int x, int y, int a, int b){
        if (x + y == 3 ){return "Green";        }
        if (b - a == 1) { return "Red";}
        else return "Black";
    }
}


