package com.example.artificialsoft;

public class InternetBalanceDetails
{
    String datasize;
    String balance;

    public InternetBalanceDetails(String datasize, String balance)
    {
        this.datasize = datasize;
        this.balance = balance;
    }

    public String getDatasize() {
        return datasize;
    }

    public void setDatasize(String datasize) {
        this.datasize = datasize;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
