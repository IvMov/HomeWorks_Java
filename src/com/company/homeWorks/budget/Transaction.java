package com.company.homeWorks.budget;

import jdk.jfr.Category;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Locale;

import static com.company.homeWorks.budget.Programa.*;
import static java.lang.Double.*;

public abstract class Transaction {

    protected static int totalNrOfTransactions;

    protected int id;
    protected BigDecimal summ;
    protected LocalDateTime dateAndTimeOfOperation;
    protected TransactionCategory category;
    protected String comment;

    public Transaction(BigDecimal summ,
                       TransactionCategory category,
                       String comment) {
        totalNrOfTransactions++;
        this.id = totalNrOfTransactions;
        this.summ = summ;
        this.dateAndTimeOfOperation = LocalDateTime.now();
        this.category = category;
        this.comment = comment;
    }

    public void changeTransaction() {
        changeSumm();
        changeCategory();
        changeComment();
    }

    private void changeSumm() {
        System.out.printf("Summa: %.2f  EUR\n", summ);
        String command = checkYesOrNo("summa");

        if ("taip".equals(command)) { //change summ
            Budget.setBudgetBalance(Budget.getBudgetBalance().subtract(summ));

            while (true) {
                try {
                    System.out.println("Įveskite nauja summa: ");
                    summ = BigDecimal.valueOf(parseDouble(SC.nextLine()));
                    Budget.setBudgetBalance(Budget.getBudgetBalance().add(summ));
                    System.out.println("Nauja summa įšsaugota!");
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Klaida Įvestas ne skaičius");
                }
            }
        } else {
            System.out.println("Ne -> keliaujame toliau!");
        }
    }

    private void changeCategory() {
        System.out.println("Kategorija: " + category);
        String command = checkYesOrNo("kategorija");

        if ("taip".equals(command)) { //change category

            while (true) {
                try {
                    System.out.println("Įveskite nauja Kategorija: ");
                    category = TransactionCategory.valueOf(SC.nextLine().toUpperCase());
                    System.out.println("Nauja kategorija išsaugota!");
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Klaida! Įveskite vienu iš kategorijos: \n " +
                            "MAISTA, ZAIDIMAI, POILSIS, KURAS, REMONTAS, KITAS.");
                }
            }
        } else {
            System.out.println("Ne -> keliaujame toliau!");
        }
    }

    private void changeComment() {
        System.out.println("Komentaras: " + comment);
        String command = checkYesOrNo("komentarus");
        if ("taip".equals(command)) { //change comment
            System.out.println("Įveskite naujas komentarus: ");
            comment = SC.nextLine();
        } else {
            System.out.println("Ne -> keliaujame toliau!");
        }
    }

    private String checkYesOrNo(String whatToChange) {
        String command = "";
        do {
            System.out.println("Ar norite pakeisti " + whatToChange + " [taip] / [ne].");
            command = SC.nextLine();
        } while (!"taip".equals(command) && !"ne".equals(command));
        return command;
    }


    abstract String dateTimeToString();

    abstract void printNewTransactionInfo();

    abstract void printTransactionInfo();

    @Override
    public String toString() {
        return "Transaction[" +
                "unciqueNr=" + id +
                ", summ=" + summ +
                ", dateAndTimeOfOperation=" + dateAndTimeOfOperation +
                ", category=" + category +
                ", comment='" + comment + '\'' +
                ']';
    }

}
