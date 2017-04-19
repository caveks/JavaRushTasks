package com.javarush.task.task05.task0502;


public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        return this.age > anotherCat.age || this.strength > anotherCat.strength || this.weight > anotherCat.weight;
    }

    public static void main(String[] args) {
    }
}