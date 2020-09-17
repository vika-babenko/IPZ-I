package com.lab111.labwork3;


import static com.lab111.labwork3.Editor.changeSize;
import static com.lab111.labwork3.Editor.getImage;
import static com.lab111.labwork3.MyCache.*;

    /**
     * General class,
     * @author Viktoria Babenko
     */

    public class Main {

        /**
         * Creating variables
         */

        static Image image = new Image();
        static Image img = new Image();

        /**
         * Using different methods
         */

        public static void main(String[] args) {
            getImage();
            changeSize();
            getSize();
            fromCash();

            /**
             * Checking result
             */

            String output = getColor(image.x, image.y,image.a, image.b);
            System.out.println(output);
            String output1 = getColor(0, 0,img.a, img.b);
            System.out.println(output1);
        }
    }


