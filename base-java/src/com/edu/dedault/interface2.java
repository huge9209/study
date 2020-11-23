package com.edu.dedault;

public interface interface2 {
    default void defaulthello(){
        System.out.println("defaulthello!");
    }
    static void statichello(){
        System.out.println("statichello!");
    }
}