package com.javarush.games.minesweeper;

public class GameObject {
    
    public int x;
    public int y;
    public boolean isMine;
    public int countMineNeighbors;
    public boolean isOpen;
    public boolean isFlag;
    
    public GameObject (int coordX, int coordY, boolean isMine) {
        x = coordX;
        y = coordY;
        this.isMine = isMine;
    }
}