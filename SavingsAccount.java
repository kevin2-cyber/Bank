package com.Bank1;

public class SavingsAccount extends Account {

    public double simpleInterest;double interest;double name;
    //THis method calculates the interest
    public double calInterest() {
        double rate = 0.03875;

        simpleInterest = (getInitialBalance()*(1+(rate*days)));
        interest=simpleInterest-balance;
        return simpleInterest;
    }
    //This method adds the interest to the balance
    public double addInterest() {
        return balance =balance+interest;
    }
    //This method returns the interest
    public double interest(){
        return balance=calInterest()-getInitialBalance();
    }
    //This method returns the string
    public String toString1(){
        return String.format("%s",totalBalance()+"$ is saved in the account with index "+index);
    }
}
