package com.company.homeWorks.savaite_2.uzdotis_3_Tankas;

import java.util.Scanner;

public class MainMy {
    public static void main(String[] args) {

        Tank myTank = new Tank();
        Enemy myEnemy = new Enemy();
        getInfoAboutControls();
        boolean playTanks = true;
        Scanner sc = new Scanner(System.in);

        while (playTanks) {
            String inputCommand = sc.next();
            switch (inputCommand) {
                case "w":
                    myTank.moveForward();
                    break;
                case "s":
                    myTank.moveBack();
                    break;
                case "a":
                    myTank.moveLeft();
                    break;
                case "d":
                    myTank.moveRight();
                    break;
                case "p":
                    myTank.doShot();

                    if (myTank.getPresentDirectionOfTank() == TankDirections.NORTH && myTank.getPositionX() == myEnemy.getTargetPositionX() && myTank.getPositionY() <= myEnemy.getTargetPositionY()) {
                        System.out.println("You SHOT enemy on position:(" + myEnemy.getTargetPositionX() + ":" + myEnemy.getTargetPositionY() + "). YOU WIN!");
                        playTanks = false;
                    } else if (myTank.getPresentDirectionOfTank() == TankDirections.EAST && myTank.getPositionY() == myEnemy.getTargetPositionY() && myTank.getPositionX() <= myEnemy.getTargetPositionX()) {
                        System.out.println("You SHOT enemy on position:(" + myEnemy.getTargetPositionX() + ":" + myEnemy.getTargetPositionY() + "). YOU WIN!");
                        playTanks = false;
                    } else if (myTank.getPresentDirectionOfTank() == TankDirections.SOUTH && myTank.getPositionX() == myEnemy.getTargetPositionX() && myTank.getPositionY() >= myEnemy.getTargetPositionY()) {
                        System.out.println("You SHOT enemy on position:(" + myEnemy.getTargetPositionX() + ":" + myEnemy.getTargetPositionY() + "). YOU WIN!");
                        playTanks = false;
                    } else if (myTank.getPresentDirectionOfTank() == TankDirections.WEST && myTank.getPositionY() == myEnemy.getTargetPositionY() && myTank.getPositionX() >= myEnemy.getTargetPositionX()) {
                        System.out.println("You SHOT enemy on position:(" + myEnemy.getTargetPositionX() + ":" + myEnemy.getTargetPositionY() + "). YOU WIN!");
                        playTanks = false;
                    } else {
                        System.out.println("You MISS, the enemy is on position:(" + myEnemy.getTargetPositionX() + ":" + myEnemy.getTargetPositionY() + ") => move on and try again!");
                    }
                    break;
                case "i":
                    myTank.getInfoAboutTank();
                    break;
                case "c":
                    MainMy.getInfoAboutControls();
                    break;
                case "e":
                    myEnemy.getPositionOfEnemy();
                    break;
                case "x":
                    playTanks = false;
                    break;
                default:
                    System.out.println("Klaida - tokios komandos nėra!");
                    break;
            }
        }
        sc.close();
    }

    private static void getInfoAboutControls() {
        System.out.println("CONTROLS: w - move forward, s - move back, a - move left, d - move right, p - press to shot, i - info, c - controls, e - info about enemy x - close game");
    }


}
