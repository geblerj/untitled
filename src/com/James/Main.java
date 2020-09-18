package com.James;

public class Main {

    public static void main(String[] args) {
	Duck duck = new Duck();
	duck.getAround();
	Dog dog = new Dog();
	dog.getAround();
	Snake snake = new Snake();
	snake.getAround();
	makeSwim(dog);
	makeSwim(snake);
	makeSwim(duck);
    }
    public static void makeSwim(Animal animal) {
    	animal.swim();
	}
}
abstract class Animal {
	public abstract void swim();
}

abstract class WalkingAnimal extends Animal {
	public abstract void walk();
}