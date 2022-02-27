package com.company.homeWorks.budget;

import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;

public class Income extends Transaction {

    private boolean isIncomeGeted;

    public Income(BigDecimal summ,
                  TransactionCategory category,
                  boolean isIncomeGeted,
                  String comment) {
        super(summ, category, comment);
        this.isIncomeGeted = isIncomeGeted;
    }


    public String getReceivedIncomeStatus() { //gal geriau panaudoti Enum?
        return isIncomeGeted ? "gauta".toUpperCase() : "ne gauta".toUpperCase();
    }

    @Override
    public String dateTimeToString() { //nes pirmam uždotije buvo skirtumas - išlaidos turejo ir data ir laikas, pajama turejo tik data
        return dateAndTimeOfOperation.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    @Override
    public void printNewTransactionInfo() {
        System.out.println(String.format(
                "Pajama ID-%d suformota %s. Suma: %.2f EUR, category: %s," +
                        " pajama %s, komentarus: %s.",
                id, dateTimeToString(), summ, category,
                getReceivedIncomeStatus(), comment));
    }

    @Override
    public void printTransactionInfo() {
        System.out.println(String.format(
                "PAJAMA ID-%d, data - %s: Suma: %.2f EUR, category: %s," +
                        " pajama %s, komentarus: %s",
                id, dateTimeToString(), summ, category,
                getReceivedIncomeStatus(), comment));
    }


}
