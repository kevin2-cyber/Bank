package com.Bank1;

public class Account {
    public double balance;private double initialBalance; public int days; public double simpleInterest;public double interest;int index;
    double totalBalance;
    public void Deposit(double initialBalance,int days,int index) {
        this.days=days;
        this.index=index;
        if (initialBalance > 0.0)
            this.initialBalance = initialBalance;

    }public double calInterest() {
        double rate = 0.03875;

        simpleInterest = (getInitialBalance()*(1+(rate*days)));
        interest=simpleInterest-balance;
        return simpleInterest;
    }

    public double deposit(double amount) {
       return balance = balance + amount;
    }
    public double withdraw(double amount){
        balance=balance-amount;
        return balance;
    }
    public double getInitialBalance(){
        return initialBalance;
    }
    public double addInterest() {
       return balance = balance + interest;
    }
    public double totalBalance(){
        return totalBalance=getDeposit()+interest();
    }
    public double getDeposit(){
        return getInitialBalance();
    }
    public double interest(){
        return balance=calInterest()-getInitialBalance();
    }
}
