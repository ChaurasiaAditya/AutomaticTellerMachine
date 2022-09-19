package com.bank.repository;

import com.bank.model.ATM;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class AtmRepository implements Repository<ATM> {
    @Override
    public List<ATM> getAll(Connection connection) {
        List<ATM> atmList = new ArrayList<>();
        return null;
    }

    @Override
    public ATM searchByAccountNumber(Connection connection, int accountNumber) {
        ATM atm = new ATM();
        return null;
    }

    @Override
    public void updateFirstName(Connection connection, int firstName, int accountNumber) {

    }

    @Override
    public void updateLastName(Connection connection, int lastName, int accountNumber) {

    }

    @Override
    public void changeAtmPin(Connection connection, int newAtmPin, int oldAtmPin, int accountNumber) {

    }

    @Override
    public double withdrawCash(Connection connection, int atmPin, double cashToWithdraw) {
        return 0;
    }

    @Override
    public double depositCash(Connection connection, int atmPin, double cashToDeposit) {
        return 0;
    }

    @Override
    public double transferMoney(Connection connection, int atmPin, double cashToTransfer) {
        return 0;
    }
}
