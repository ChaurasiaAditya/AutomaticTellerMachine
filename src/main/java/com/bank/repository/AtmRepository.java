package com.bank.repository;

import com.bank.model.ATM;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AtmRepository implements Repository<ATM> {
    @Override
    public List<ATM> getAll(Connection connection) throws SQLException {
        List<ATM> atmList = new ArrayList<>();
        String selectQuery = "SELECT * FROM `atm`;";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                ATM atm = new ATM();
                atm.setFirstName(resultSet.getString("First_Name"));
                atm.setLastName(resultSet.getString("Last_Name"));
                atm.setAccountNumber(resultSet.getInt("Account_Number"));
                // atm.setAccountBalance(resultSet.getDouble("Amount_Saving_Account"));
            }
        }
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
