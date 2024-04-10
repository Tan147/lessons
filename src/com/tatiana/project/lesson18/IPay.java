package com.tatiana.project.lesson18;

@FunctionalInterface
public interface IPay {
    boolean makePayment (double amount);
    default IPay additionalPay (IPay next){
        return amount -> {
            if (!makePayment(amount)) return next.makePayment(amount);
            return true;
        };
    }
}
