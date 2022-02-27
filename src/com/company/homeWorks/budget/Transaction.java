package com.company.homeWorks.budget;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import static com.company.homeWorks.budget.Programa.*;
import static java.lang.Double.*;

public abstract class Transaction implements Serializable {

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

    public static Cost createNewCost() {

        BigDecimal newSumm = createSumm("išlaidos");
        TransactionCategory newCategory = createCategory();
        PaymentMethods newPaymentMethod = createPaymentMethod();
        CreditCards newCreditCard = createCreditCard();
        String newComment = createComment();

        return new Cost(newSumm,
                newCategory,
                newPaymentMethod,
                newCreditCard,
                newComment);
    }

    public static Income createNewIncome() {

        BigDecimal newSumm = createSumm("pajamos");
        TransactionCategory newCategory = createCategory();
        Boolean newGetPayment = createGetPaymetnBoolean();
        String newComment;
        newComment = createComment();

        return new Income(newSumm,
                newCategory,
                newGetPayment,
                newComment);
    }

    public void changeTransaction() {
        changeSumm();
        changeCategory();
        changeComment();
    }



    //methods to create new COST/INCOME
    private static BigDecimal createSumm(String type) {
        BigDecimal newSumm = null;
        while (true) {
            try {
                System.out.println("Įveskite " + type + " summa: ");
                newSumm = BigDecimal.valueOf(Double.parseDouble(SC.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Klaida ivestas ne skaičius");
            }
        }
        return newSumm;
    }

    private static TransactionCategory createCategory() {
        TransactionCategory newCategory = null;
        while (true) {
            try {
                System.out.println("Įveskite Kategorija: MAISTA, ZAIDIMAI, POILSIS, KURAS, REMONTAS, KITAS? ");
                newCategory = TransactionCategory.valueOf(SC.nextLine().toUpperCase());
                System.out.println("Nauja kategorija išsaugota!");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Klaida! Įveskite vienu iš kategorijos: \n " +
                        "MAISTA, ZAIDIMAI, POILSIS, KURAS, REMONTAS, KITAS.");
            }
        }
        return newCategory;
    }

    private static PaymentMethods createPaymentMethod() {
        PaymentMethods newPaymentMethod = null;
        while (true) {
            try {
                System.out.println("Įveskite payment method: GRYNAIS, KORTELE, BANKOMATAS, PERVEDIMAS, KITAS? ");
                newPaymentMethod = PaymentMethods.valueOf(SC.nextLine().toUpperCase());
                System.out.println("payment method išsaugotas!");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Klaida! Įveskite vienu iš kategorijos: \n " +
                        "GRYNAIS, KORTELE, BANKOMATAS, PERVEDIMAS, KITAS.");
            }
        }
        return newPaymentMethod;
    }

    private static CreditCards createCreditCard() {
        CreditCards newCreditCard = null;
        while (true) {
            try {
                System.out.println("Įveskite korteles pavadinimas: KORTELE1, KORTELE2, KORTELE3, NOCARD? ");
                newCreditCard = CreditCards.valueOf(SC.nextLine().toUpperCase());
                System.out.println("payment method išsaugotas!");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Klaida! Įveskite vienu iš kategorijos: \n " +
                        "KORTELE1, KORTELE2, KORTELE3, NOCARD.");
            }
        }
        return newCreditCard;
    }

    private static String createComment() {
        String newComment;
        System.out.println("Iveskite komentarą: ");
        newComment = SC.nextLine();
        return newComment;
    }

    private static Boolean createGetPaymetnBoolean() {
        Boolean newGetPayment = false;
        while (true) {
            try {
                System.out.println("Įveskite ar gauta pajama: \"true\" arba \"false\"? ");
                newGetPayment = Boolean.valueOf(SC.nextLine());
                System.out.println("Puiku!");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Klaida! Įveskite -  \"true\" arba \"false\"?");
            }
        }
        return newGetPayment;
    }



    //Inside Methods to change some info in COST/INCOME

    private String checkYesOrNo(String whatToChange) {
        String command = "";
        do {
            System.out.println("Ar norite pakeisti " + whatToChange + " [taip] / [ne].");
            command = SC.nextLine();
        } while (!"taip".equals(command) && !"ne".equals(command));
        return command;
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


    abstract String dateTimeToString();

    abstract void printNewTransactionInfo();

    abstract void printTransactionInfo();

    @Override
    public String toString() {
        return id +
                ";" + dateAndTimeOfOperation.toLocalDate() +
                ";" + summ +
                ";" + category +
                ";" + comment;
    }

}
