package com.bank.model;

public class ATM {
    private String firstName;
    private String lastName;
    private int accountNumber;
    private int atmPin;

    public ATM() {
    }

    public ATM(String firstName, String lastName, int accountNumber, int atmPin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.atmPin = atmPin;
    }
}
