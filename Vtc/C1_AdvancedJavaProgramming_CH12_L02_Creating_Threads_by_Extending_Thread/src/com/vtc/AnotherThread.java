package com.vtc;

public class AnotherThread extends Thread {     
    public void run() {     
        for ( int i = 0; i < 10; i++ ) {     
             System.out.println("Another Thread");     
          }     
    }     
}
