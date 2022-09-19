package com.bank.repository;

import com.bank.model.ATM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AtmRepository implements Repository<ATM> {
    @Override
    public List<ATM> getAll(Connection connection) {
        List<ATM> atmList = new ArrayList<>();
        return null;
    }

    @Override
    public ATM searchByAccountNumber(Connection connection, int accountNumber) throws SQLException {
        ATM atm = new ATM();
        String query = "SELECT * FROM `bank`.`atm` WHERE (`Account_Number` = ? )";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1,accountNumber);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){

            }

        }
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
