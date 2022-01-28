package com.company.homeWorks.savaite_2.uzdotis_3_Tankas;

public enum EnemyDirections {
    HORISONTAL("Horisontalinis"),
    VERTICAL("Vertikalinis");

    private String inLithuanianWay;

    EnemyDirections(String inLithuanianWay) {
        this.inLithuanianWay = inLithuanianWay;
    }

    public String getInLithuanianWay() {
        return inLithuanianWay;
    }
}
