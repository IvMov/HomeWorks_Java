package com.company.homeWorks.budget;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Income {

    private static int totalNrOfIncomes;

    private int operationUniqueNr;
    private BigDecimal summ;
    private CategoryOfCost category;
    private LocalDate dateAndTimeOfOperation;
    private boolean isIncomeGeted;
    private String comment;


    public Income(BigDecimal summ,
                  CategoryOfCost category,
                  boolean isIncomeGeted,
                  String comment) {

        totalNrOfIncomes++;
        this.operationUniqueNr = totalNrOfIncomes;
        this.dateAndTimeOfOperation = LocalDate.now();

        this.summ = summ;
        this.category = category;
        this.isIncomeGeted = isIncomeGeted;
        this.comment = comment;
    }

    public String getStringFormatedData() {
        return dateAndTimeOfOperation.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public String getReceivedIncomeStatus() {
        return isIncomeGeted ? "gauta".toUpperCase() : "ne gauta".toUpperCase();
    }

    public void getInfoAboutNewIncome() {
        System.out.println(String.format(
                "Pajama Nr%d suformota %s. Suma: %E, category: %s, pajama %s, komentarus: %s.",
                totalNrOfIncomes, getStringFormatedData(), summ, category, getReceivedIncomeStatus(), comment));
    }

    public void getInfoAboutIncome() {
        System.out.println(String.format(
                "INFO ABOUT pajama Nr%d, data - %s: Suma: %E, category: %s, pajama %s, komentarus: %s",
                operationUniqueNr, getStringFormatedData(), summ, category,
                getReceivedIncomeStatus(), comment));
    }

    //GET and SET methods


    public static int getTotalNrOfIncomes() {
        return totalNrOfIncomes;
    }

    public int getOperationUniqueNr() {
        return operationUniqueNr;
    }

    public BigDecimal getSumm() {
        return summ;
    }

    public CategoryOfCost getCategory() {
        return category;
    }

    public String getComment() {
        return comment;
    }

}
