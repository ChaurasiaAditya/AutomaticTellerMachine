package com.bank.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ATM atm)) return false;
        return getAccountNumber() == atm.getAccountNumber() && getAtmPin() == atm.getAtmPin() && Objects.equals(getFirstName(), atm.getFirstName()) && Objects.equals(getLastName(), atm.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getAccountNumber(), getAtmPin());
    }

    @Override
    public String toString() {
        return "ATM{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", accountNumber=" + accountNumber + ", atmPin=" + atmPin + '}';
    }
}
