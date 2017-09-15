package com.javarush.task.task14.task1409;

public class WaterBridge implements Bridge {

    final int countCars = 15;

    @Override
    public int getCarsCount() {
        return countCars;
    }
}