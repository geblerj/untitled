package com.James;

public class Snake extends Animal implements IMoveable {
    @Override
    public void getAround() {
        System.out.println("I am slithering.");
    }

    @Override
    public void swim() {
        System.out.println("I am swimming.");
    }
}
