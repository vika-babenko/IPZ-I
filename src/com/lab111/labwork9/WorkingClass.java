package com.lab111.labwork9;

/**
 * @author Viktoria Babenko
 * Only workclass.
 */

public class WorkingClass {
    public static void main(String[] args) {

        //Create file and client for our future working
        ConfigFile myFile= new ConfigFile();
        MyClient client = new MyClient();

        //Create builder with the first variant
        ElementBuilder red50CircleBuilder = new Red50CircleBuilder();

        //talk to client about buiding
        client.setBuilder(red50CircleBuilder);
        client.constructElement();

        //get information
        MyElement myEl1= client.getMyEl();
        myEl1.getMyElInfo();
        System.out.println();

        //download configuration from file
        client.loadConfigfromFile(myFile);
        client.constructElement();

        //get information
        MyElement myEl2= client.getMyEl();
        myEl2.getMyElInfo();
    }

}
