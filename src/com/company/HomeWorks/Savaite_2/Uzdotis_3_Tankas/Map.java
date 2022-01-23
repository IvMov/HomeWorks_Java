package com.company.HomeWorks.Savaite_2.Uzdotis_3_Tankas;

import java.util.Random;

public class Map { // vizualizacija bus

    private int mapWidth;
    private int mapHeight;
    private int[][] areaOfMap;

    public Map(int mapWidth, int mapHeight) {
        this.mapWidth = mapWidth;
        this.mapHeight = mapHeight;
        this.areaOfMap = new int[this.mapHeight][this.mapWidth];
    }

    private int randomNumberForX() {
        Random random = new Random();
        int randomNumber = (int) (Math.floor((Math.random() * this.mapWidth/2) + 1) * (random.nextBoolean() ? -1 : 1));
        return randomNumber;
    }
    private int randomNumberForY() {
        Random random = new Random();
        int randomNumber = (int) (Math.floor((Math.random() * this.mapHeight/2) + 1) * (random.nextBoolean() ? -1 : 1));
        return randomNumber;
    }

    public int getMapWidth() {
        return mapWidth;
    }

    public int getMapHeight() {
        return mapHeight;
    }

    public int[][] getAreaOfMap() {
        return areaOfMap;
    }
}
