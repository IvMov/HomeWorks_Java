package com.company.HomeWorks.Savaite_2.Uzdotis_3_Tankas;

public enum TankDirections {
    NORTH("Šiaurę", 'N', 0),        //Šiaurė
    EAST("Rytus", 'E', 90),         //Rytai
    SOUTH("Pietus", 'S', 180),      //Pietus
    WEST("Vakarus", 'W', 270);      //Vakarai

    private String inLithuanianWay;
    private char shortName;
    private int angleOfDirection;

    TankDirections(String inLithuanianWay, char shortName, int angleOfDirection) {
        this.inLithuanianWay = inLithuanianWay;
        this.shortName = shortName;
        this.angleOfDirection = angleOfDirection;
    }


    public String getInLithuanianWay() {
        return inLithuanianWay;
    }

    public char getShortName() {
        return shortName;
    }

    public int getAngleOfDirection() {
        return angleOfDirection;
    }
}

