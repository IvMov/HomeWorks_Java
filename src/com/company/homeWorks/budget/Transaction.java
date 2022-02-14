package com.company.homeWorks.budget;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

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
        System.out.printf("Summa: %.2f  EUR\n", summ);
        System.out.println("Ar norite pakeisti summa? [taip] / [ne].");
        String command1 = Programa.SC.nextLine();
        if ("taip".equals(command1)) {
            Budget.setBudgetBalance(Budget.getBudgetBalance().subtract(summ));
            System.out.println("Įveskite nauja summa: ");
            BigDecimal newSumm = BigDecimal.valueOf(Double.parseDouble(Programa.SC.nextLine()));
            summ = newSumm;
            Budget.setBudgetBalance(Budget.getBudgetBalance().add(summ));
        }
        System.out.println("Kategorija: " + category);
        System.out.println("Ar norite pakeisti kategorija? [taip] / [ne].");
        String command2 = Programa.SC.nextLine();
        if ("taip".equals(command2)) {
            System.out.println("Įveskite nauja Kategorija: ");
            String newCategory = Programa.SC.nextLine();
            category = TransactionCategory.valueOf(newCategory);
        }
        System.out.println("Komentaras: " + comment);
        System.out.println("Ar norite pakeisti komentaras? [taip] / [ne].");
        String command3 = Programa.SC.nextLine();
        if ("taip".equals(command3)) {
            System.out.println("Įveskite nauja Kategorija: ");
            String newComment = Programa.SC.nextLine();
            comment = newComment;
        }
    }

    abstract String dateTimeToString();

    abstract void getNewTransactionInfo();

    abstract void getTransactionInfo();

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
