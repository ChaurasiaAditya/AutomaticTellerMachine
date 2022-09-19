package com.bank.repository;

import com.bank.model.ATM;

import java.sql.Connection;
import java.util.List;

public interface Repository<T> {

    List<T> getAll(Connection connection);
    T searchByAccountNumber (Connection connection, int accountNumber);
    void updateFirstName(Connection connection, int firstName, int accountNumber);
    void updateLastName(Connection connection, int lastName, int accountNumber);
    void changeAtmPin(Connection connection, int newAtmPin, int oldAtmPin, int accountNumber);
    double withdrawCash(Connection connection, int atmPin, double cashToWithdraw);
    double depositCash(Connection connection, int atmPin, double cashToDeposit);
    double transferMoney(Connection connection, int atmPin, double cashToTransfer);
}
