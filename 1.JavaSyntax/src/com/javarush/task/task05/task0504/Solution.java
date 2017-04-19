package com.javarush.task.task05.task0504;


public class Solution {

    public static void main(String[] args) {
        new Cat("Vasya", 2, 5, 5);
        new Cat("Fedia", 3, 3, 6);
        new Cat("Bob", 1, 2, 3);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
