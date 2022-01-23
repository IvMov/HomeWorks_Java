package com.company.HomeWorks.Savaite_2.Uzdotis_3_Tankas;

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
