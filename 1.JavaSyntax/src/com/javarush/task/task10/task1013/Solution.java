package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String surname;
        private int age;
        private String address;
        private int height;
        private int weight;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Human(String name, String surname, int age, String address) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.address = address;
        }

        public Human(String name, String surname, int age, String address, int height) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.address = address;
            this.height = height;
        }

        public Human(String name, String surname, int age, String address, int height, int weight) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.address = address;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, String surname, int age, int height, int weight) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, String surname, int age, int height) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.height = height;
        }

        public Human(String surname, int age) {
            this.surname = surname;
            this.age = age;
        }

        public Human(String surname, int age, int height, int weight) {
            this.surname = surname;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }
    }
}
