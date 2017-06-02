package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> grandParents = new ArrayList<>();
        ArrayList<Human> son = new ArrayList<>();
        ArrayList<Human> daughter = new ArrayList<>();
        ArrayList<Human> kids = new ArrayList<>();

        Human grandFather = new Human();
        grandFather.name = "Jack";
        grandFather.sex = true;
        grandFather.age = 70;
        grandFather.children = son;

        Human grandMother = new Human();
        grandMother.name = "Sofia";
        grandMother.sex = false;
        grandMother.age = 68;
        grandMother.children = son;

        Human grandFather1 = new Human();
        grandFather1.name = "Tom";
        grandFather1.sex = true;
        grandFather1.age = 71;
        grandFather1.children = daughter;

        Human grandMother1 = new Human();
        grandMother1.name = "Angelika";
        grandMother1.sex = false;
        grandMother1.age = 70;
        grandMother1.children = daughter;

        Human father = new Human();
        father.name = "Bob";
        father.sex = true;
        father.age = 45;
        father.children = kids;

        Human mother = new Human();
        mother.name = "Bella";
        mother.sex = false;
        mother.age = 41;
        mother.children = kids;

        Human child1 = new Human();
        child1.name = "Fill";
        child1.sex = true;
        child1.age = 10;
        child1.children = new ArrayList<>();

        Human child2 = new Human();
        child2.name = "Steave";
        child2.sex = true;
        child2.age = 7;
        child2.children = new ArrayList<>();

        Human child3 = new Human();
        child3.name = "Poly";
        child3.sex = false;
        child3.age = 4;
        child3.children = new ArrayList<>();

        grandParents.add(grandFather);
        grandParents.add(grandFather1);
        grandParents.add(grandMother);
        grandParents.add(grandMother1);

        son.add(father);
        daughter.add(mother);

        kids.add(child1);
        kids.add(child2);
        kids.add(child3);


        for (Human h : grandParents) {
            System.out.println(h);
        }

        for (Human h : son) {
            System.out.println(h);
        }

        for (Human h : daughter) {
            System.out.println(h);
        }

        for (Human h : kids) {
            System.out.println(h);
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}