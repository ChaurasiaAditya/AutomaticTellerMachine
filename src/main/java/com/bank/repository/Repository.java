package com.bank.repository;

import java.sql.Connection;

public interface Repository {

    void getAll(Connection connection);
    void searchByAccountNumber (Connection connection, int accountNumber);
    void updateFirstName(Connection connection, int firstName, int accountNumber);
    void updateLastName(Connection connection, int lastName, int accountNumber);
    void changeAtmPin(Connection connection, int newAtmPin, int oldAtmPin, int accountNumber);
    void withdrawCash(Connection connection, int atmPin, double cashToWithdraw);
    void depositCash(Connection connection, int atmPin, double cashToDeposit);
    void transferMoney(Connection connection, int atmPin, double cashToTransfer);
}
