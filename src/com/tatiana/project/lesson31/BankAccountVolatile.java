package com.tatiana.project.lesson31;


public class BankAccountVolatile {
    private volatile int balance;

    public synchronized void putMoney(int value) {
        this.balance += value; //чтение, потом изменение, потом запись, поэтому это не атомарная операция
    }

    //public void putMoney(int value) { this.balance = value; }
    //это атомарная операция, д-ие происходит 1 раз, т.к. просто записали свойство


    public int getBalance() {
        return balance;
    }
}
