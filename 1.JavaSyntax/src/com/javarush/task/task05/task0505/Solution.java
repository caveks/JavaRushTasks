package com.javarush.task.task05.task0505;


public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasya", 2, 5, 5);
        Cat cat2 = new Cat("Fedia", 3, 3, 6);
        Cat cat3 = new Cat("Bob", 1, 2, 3);
        if(cat1.fight(cat2)) {
            System.out.println("Vasya победил");
        } else {
            System.out.println("Fedya победил");
        }

        if(cat1.fight(cat3)) {
            System.out.println("Vasya победил");
        } else {
            System.out.println("Bob победил");
        }

        if(cat2.fight(cat3)) {
            System.out.println("Fedya победил");
        } else {
            System.out.println("Bob победил");
        }
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
