package com.company.Pamoka_7_LocalDateTime;

import java.time.LocalDate;

public class ClassForExper {
    private int metas1;
    private int metas2;

    public ClassForExper(int metas1, int metas2) {
        this.metas1 = metas1;
        this.metas2 = metas2;
    }

    public String showWhichAreBigger() {
        System.out.println("year1 = " + metas1 + " arba ");
        System.out.println("year2 = " + metas2 + " arba ");
        if (metas1 >= metas2) {
            return "First year win";
        } else
            return "Second year win";
    }

    public int getMetas1() {
        return metas1;
    }

    public int getMetas2() {
        return metas2;
    }
}
