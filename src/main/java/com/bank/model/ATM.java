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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAtmPin() {
        return atmPin;
    }

    public void setAtmPin(int atmPin) {
        this.atmPin = atmPin;
    }
}
