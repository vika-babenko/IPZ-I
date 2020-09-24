package com.lab111.labwork7;
/**
 * @author Viktoria Babenko
 * Realize Command design pattern. This is the Receiver part.
 */

public class UserSidePart {
    /**
     * Just first operation, that say "All is ok on Server !".
     */
    public void sayOK(){
        System.out.println("All is ok on Server !");
    }

    /**
     * Just second operation, that say "Hello from DB !".
     */
    public void request(){
        System.out.println("Hello from DB !");
    }

}
