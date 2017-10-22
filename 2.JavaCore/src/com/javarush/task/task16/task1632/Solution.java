package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static{
        class FirstThread extends Thread {
            public void run() {
                while(true);
            }
        }
        class SecondThread extends Thread {
            public void run() {
               try {
                   Thread.sleep(1);
               } catch (InterruptedException e){
                   System.out.println("InterruptedException");
                }
            }
        }
        class ThirdThread extends Thread {
            public void run() {
                try {
                    while (true) {
                        System.out.println("Ура");
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        class FourthThread extends Thread implements Message {
            public void showWarning() {
                interrupt();
            }

            public void run() {
                if (!isAlive()) showWarning();
            }
        }

        class FifthThread extends Thread {
            public void run() {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int sum = 0;
                try {
                    String word = reader.readLine();
                    while (!word.toLowerCase().equals("n")){
                        int i = Integer.parseInt(word);
                        sum += i;
                        word = reader.readLine();
                    }
                reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(sum);
            }
        }
    threads.add(new FirstThread());
    threads.add(new SecondThread());
    threads.add(new ThirdThread());
    threads.add(new FourthThread());
    threads.add(new FifthThread());
    }

    public static void main(String[] args) {
    }
}