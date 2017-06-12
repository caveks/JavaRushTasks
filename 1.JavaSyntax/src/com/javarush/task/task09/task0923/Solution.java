package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        ArrayList<Character> listVowels = new ArrayList<>();
        ArrayList<Character> listNonVowels = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        char[] s = text.toCharArray();
        for (char x : s) {
            boolean letter = isVowel(x);
            if (letter){
                listVowels.add(x);
            } else if (!letter && x!= ' '){
                listNonVowels.add(x);
            }
        }

        for (Character v : listVowels) {
            System.out.print(v + " ");
        }

        System.out.println();

        for (Character nV : listNonVowels) {
            System.out.print(nV + " ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}