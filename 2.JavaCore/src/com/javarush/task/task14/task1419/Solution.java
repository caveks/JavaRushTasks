package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] mass = new int[5];
            System.out.println(mass[6]);
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            int[] mass = new int[-5];
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            List<Integer> list = new ArrayList<>();
            list.get(5);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String s = null;
            s.length();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int i = Integer.parseInt(null);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            List<Integer> list = new ArrayList<>();
            list.add(5);
            list.add(6);
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()){
                iterator.remove();
            }
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String s = "Hello World!";
            s.charAt(20);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Solution solution = new Solution();
            solution.clone();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object object = new Object();
            Solution solution = (Solution) object;
        } catch (Exception e) {
            exceptions.add(e);
        }

    }
}