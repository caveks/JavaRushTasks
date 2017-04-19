package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg [] zerg = new Zerg[10];
        for (int i = 0; i < 10; i++){
            zerg[i] = new Zerg();
            zerg[i].name = "zerg" + i;
        }
        Protoss [] protoss = new Protoss[5];
        for (int i = 0; i < 5; i++){
            protoss[i] = new Protoss();
            protoss[i].name = "protoss" + i;
        }
        Terran [] terran = new Terran[12];
        for (int i = 0; i < 12; i++){
            terran[i] = new Terran();
            terran[i].name = "terran" + i;
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
