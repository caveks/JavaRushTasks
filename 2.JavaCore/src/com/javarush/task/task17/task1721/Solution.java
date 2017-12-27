package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();

        BufferedReader inputDate1 = new BufferedReader(new FileReader(filename1));
        String s1;
        while ((s1 = inputDate1.readLine()) != null) {
            allLines.add(s1);
        }
        inputDate1.close();

        BufferedReader inputDate2 = new BufferedReader(new FileReader(filename2));
        String s2;
        while ((s2 = inputDate2.readLine()) != null){
            forRemoveLines.add(s2);
        }
        inputDate2.close();

        try {
            Solution solution = new Solution();
            solution.joinData();
        } catch (CorruptedDataException e) {
        }
    }

    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        } else {
           allLines.clear();
            throw new CorruptedDataException();
        }
    }
}