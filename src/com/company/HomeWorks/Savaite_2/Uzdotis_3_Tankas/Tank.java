package com.company.HomeWorks.Savaite_2.Uzdotis_3_Tankas;

import java.util.Locale;

public class Tank {

    private int positionX = 0;
    private int positionY = 0;
    private TankDirections presentDirectionOfTank = TankDirections.NORTH;
    private int shotsInNorth = 0;
    private int shotsInEast = 0;
    private int shotsInSouth = 0;
    private int shotsInWest = 0;

    private static int nrOfTanks;

    public Tank() {
        nrOfTanks++;
        System.out.println("Tank Nr-" + nrOfTanks + " created");
    }

    public Tank(int positionX, int positionY, TankDirections presentDirectionOfTank) { //constructor with start position
        this.positionX = positionX;
        this.positionY = positionY;
        this.presentDirectionOfTank = presentDirectionOfTank;
        nrOfTanks++;
        System.out.println("Tank Nr-" + nrOfTanks + " created");
    }

    public void getInfoAboutTank() {
        System.out.println("INFO-1: Tanko koordinatė: (" + positionX + ":" + positionY + "), kryptis: " + presentDirectionOfTank.getInLithuanianWay().toUpperCase(Locale.ROOT) + ";");
        System.out.println("INFO-2: Tanko šūviai: " + shotsInNorth + " - į Šiaurę, " + shotsInSouth + " - į Rytus, " + shotsInSouth + " - į Pietus, " + shotsInWest + " - į Vakarus. Iš viso šūvių: " + getSummOfShots() + ";");
    }

    public void doShot() {
        if (presentDirectionOfTank == TankDirections.NORTH) {
            shotsInNorth++;
            System.out.println("Šūvis į " + presentDirectionOfTank.getInLithuanianWay());
        } else if (presentDirectionOfTank == TankDirections.EAST) {
            shotsInEast++;
            System.out.println("Šūvis į " + presentDirectionOfTank.getInLithuanianWay());
        } else if (presentDirectionOfTank == TankDirections.SOUTH) {
            shotsInSouth++;
            System.out.println("Šūvis į " + presentDirectionOfTank.getInLithuanianWay());
        } else {
            shotsInWest++;
            System.out.println("Šūvis į " + presentDirectionOfTank.getInLithuanianWay());
        }
    }

    //------Moving of Tank -- START
    public void moveForward() {
        positionY++;
        presentDirectionOfTank = TankDirections.NORTH;
        System.out.println("Tankas pajuda į " + presentDirectionOfTank.getInLithuanianWay() + ". Position (" + positionX + ":" + positionY + ") ");
    }

    public void moveRight() {
        positionX++;
        presentDirectionOfTank = TankDirections.EAST;
        System.out.println("Tankas pajuda į " + presentDirectionOfTank.getInLithuanianWay() + ". Position (" + positionX + ":" + positionY + ") ");
    }

    public void moveBack() {
        positionY--;
        presentDirectionOfTank = TankDirections.SOUTH;
        System.out.println("Tankas pajuda į " + presentDirectionOfTank.getInLithuanianWay() + ". Position (" + positionX + ":" + positionY + ") ");
    }

    public void moveLeft() {
        positionX--;
        presentDirectionOfTank = TankDirections.WEST;
        System.out.println("Tankas pajuda į " + presentDirectionOfTank.getInLithuanianWay() + ". Position (" + positionX + ":" + positionY + ") ");
    }

    //------Moving of Tank -- END

    private int getSummOfShots() {
        return shotsInNorth + shotsInEast + shotsInSouth + shotsInWest;
    }

    // GET methods
    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public TankDirections getPresentDirectionOfTank() {
        return presentDirectionOfTank;
    }

    public int getShotsInNorth() {
        return shotsInNorth;
    }

    public int getShotsInEast() {
        return shotsInEast;
    }

    public int getShotsInSouth() {
        return shotsInSouth;
    }

    public int getShotsInWest() {
        return shotsInWest;
    }
}
