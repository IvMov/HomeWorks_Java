package com.company.homeWorks.budget;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cost {

    private static int totalNrOfCosts;

    private int operationUnciqueNr;
    private BigDecimal summ;
    private CategoryOfCost category;
    private LocalDateTime dateAndTimeOfOperation;
    private PaymentMethods paymentMethod;
    private CreditCards creditCard;

    public Cost(BigDecimal summ,
                CategoryOfCost category,
                PaymentMethods paymentMethod,
                CreditCards creditCard) {
        totalNrOfCosts++;
        this.operationUnciqueNr = totalNrOfCosts;
        this.summ = summ;
        this.category = category;
        this.dateAndTimeOfOperation = LocalDateTime.now();
        this.paymentMethod = paymentMethod;
        this.creditCard = creditCard;
    }

    public String dateTimeToString() {
        return dateAndTimeOfOperation.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public void getInfoAboutNewCost() {
        System.out.println(String.format(
                "Islaida Nr%d suformota. Suma: %E, category: %s, " +
                        "time of operation: %s, atsiskaitimo buda: %s, kortele: %s.",
                operationUnciqueNr, summ, category,
                dateTimeToString(), paymentMethod, creditCard));
    }

    public void getInfoAboutCost() {
        System.out.println(String.format(
                "INFO ABOUT Islaida Nr%d: Suma: %E, category: %s," +
                        " time of operation: %s, atsiskaitimo buda: %s, kortele: %s.",
                operationUnciqueNr, summ, category,
                dateTimeToString(), paymentMethod, creditCard));
    }


    //GET and SET METHODS

    public static int getTotalNrOfCosts() {
        return totalNrOfCosts;
    }

    public int getOperationUnciqueNr() {
        return operationUnciqueNr;
    }

    public void setOperationUnciqueNr(int operationUnciqueNr) {
        this.operationUnciqueNr = operationUnciqueNr;
    }

    public BigDecimal getSumm() {
        return summ;
    }

    public CategoryOfCost getCategory() {
        return category;
    }

    public PaymentMethods getPaymentMethod() {
        return paymentMethod;
    }

    public CreditCards getCreditCard() {
        return creditCard;
    }

}
