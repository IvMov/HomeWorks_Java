package com.company.homeWorks.savaite_2.uzdotis_3_Tankas;

public class Main {
    public static void main(String[] args) {

//        Map thisMap = new Map(40, 40);
//        System.out.println(Arrays.toString(thisMap.getAreaOfMap()));
//        Enemy myFirstEnemy = new Enemy();

        Tank tank1 = new Tank();

        tank1.moveForward();
        tank1.moveRight();
        tank1.moveForward();
        tank1.doShot();
        tank1.doShot();
        tank1.moveLeft();
        tank1.doShot();
        tank1.moveForward();
        tank1.getInfoAboutTank();
        tank1.moveLeft();
        tank1.moveLeft();
        tank1.doShot();
        tank1.getInfoAboutTank();

    }
}
