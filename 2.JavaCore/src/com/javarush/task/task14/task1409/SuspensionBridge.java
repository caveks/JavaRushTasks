package com.javarush.task.task14.task1409;

public class SuspensionBridge implements Bridge {

    final int countCars = 20;

    @Override
    public int getCarsCount() {
        return countCars;
    }
}