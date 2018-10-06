package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(consoleStream);

        String s = outputStream.toString();
        String[] mass = s.split(" ");

        if (mass[1].equals("+")){
            int c = Integer.parseInt(mass[0]) + Integer.parseInt(mass[2]);
            System.out.println(mass[0] + " + " + mass[2] + " = " + c);
        } else if (mass[1].equals("-")){
            int c = Integer.parseInt(mass[0]) - Integer.parseInt(mass[2]);
            System.out.println(mass[0] + " - " + mass[2] + " = " + c);
        }else if (mass[1].equals("*")){
            int c = Integer.parseInt(mass[0]) * Integer.parseInt(mass[2]);
            System.out.println(mass[0] + " * " + mass[2] + " = " + c);
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}
