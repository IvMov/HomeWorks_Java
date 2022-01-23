package com.company.HomeWorks.Savaite_2.Uzdotis_3_Tankas;

import java.util.Random;

public class Enemy {
    private byte sizeOfTarget = 1;
    private int targetPositionX;
    private int targetPositionY;
    private EnemyDirections directionOfEnemy = EnemyDirections.HORISONTAL;
    private static int nrOfEnemies;

    public Enemy(byte sizeOfTarget, int targetPositionX, int targetPositionY, EnemyDirections directionOfEnemy) {
        this.sizeOfTarget = sizeOfTarget;
        this.targetPositionX = targetPositionX;
        this.targetPositionY = targetPositionY;
        this.directionOfEnemy = directionOfEnemy;
        nrOfEnemies++;
        System.out.println("Enemy Nr " + nrOfEnemies + " - created");
    }

    public Enemy() { //create xs enemy with random position ir horisontal direction;
        this.targetPositionX = randomNumberForPosition();
        this.targetPositionY = randomNumberForPosition();
        nrOfEnemies++;
        System.out.println("Enemy Nr " + nrOfEnemies + " - created, position of enemy - (" + targetPositionX + ":" + targetPositionY + ").");
    }

    public void getPositionOfEnemy() {
        System.out.println("position of enemy - (" + targetPositionX + ":" + targetPositionY + ").");
    }

    private int randomNumberForPosition() {
        Random random = new Random();
        int randomNumber = (int) (Math.floor((Math.random() * 100) + 1) * (random.nextBoolean() ? -1 : 1));
        return randomNumber;
    }
}
