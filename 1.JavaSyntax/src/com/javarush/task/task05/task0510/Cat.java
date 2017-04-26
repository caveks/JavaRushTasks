package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void initialize(String name){
        this.name = name;
        age = 5;
        weight = 6;
        color = "white";
    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "black";
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        weight = 4;
        color = "red";
    }
    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        age = 4;
    }
    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 3;
    }


    public static void main(String[] args) {

    }
}