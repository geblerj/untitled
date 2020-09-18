package com.James;

public class Duck extends WalkingAnimal implements IMoveable {
    @Override
    public void getAround() {
        System.out.println("I am flying.");
    }

    @Override
    public void swim() {
        System.out.println("I am swimming.");
    }

    @Override
    public void walk() {
        System.out.println("I am walking.");
    }
}
