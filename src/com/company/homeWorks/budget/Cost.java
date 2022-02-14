package com.company.homeWorks.budget;

import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;

public class Cost extends Transaction {

    private PaymentMethods paymentMethod;
    private CreditCards creditCard;

    public Cost(BigDecimal summ,
                TransactionCategory category,
                PaymentMethods paymentMethod,
                CreditCards creditCard,
                String comment) {

        super(summ, category, comment);
        this.paymentMethod = paymentMethod;
        this.creditCard = creditCard;
    }

    @Override //nes pirmam uždotije buvo skirtumas - išlaidos turejo ir data ir laikas, pajama turejo tik data
    public String dateTimeToString() {
        return dateAndTimeOfOperation.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public void getNewTransactionInfo() {
        System.out.println(String.format(
                "IŠLAIDA ID-%d suformota. Suma: %.2f EUR, category: %s, time of operation: %s," +
                        " atsiskaitimo buda: %s, kortele: %s, komentarus: %s.",
                id, summ, category, dateTimeToString(),
                paymentMethod, creditCard, comment));
    }

    @Override
    public void getTransactionInfo() {
        System.out.println(String.format(
                "IŠLAIDA ID-%d: Suma: %.2f EUR, category: %s, time of operation: %s," +
                        " atsiskaitimo buda: %s, kortele: %s, komentarus: %s.",
                id, summ, category, dateTimeToString(),
                paymentMethod, creditCard, comment));
    }

}
