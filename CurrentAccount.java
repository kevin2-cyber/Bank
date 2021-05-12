package com.Bank1;

public class CurrentAccount extends SavingsAccount{
    //This two variables works actually does the same work,but "limit" is also used when fetching updates.
    public double limit;private double limit1;String string=" ";
    //The Bank has an over draft limit and it is stored in ths variable.
    private double overDraftLimit=20;
    //This method handles deposit issues.
    public double deposit(double amount) {
        return  balance = amount;
    }
    //This method handles withdrawing issues
    public String withdraw(double amount, int name) {

        limit= deposit() - amount;
        //this method ensures that the amount entered does not exceed the over draft limit.
        if(limit>overDraftLimit&&amount>0){
            limit1=deposit()-amount;
            System.out.println("You have successfully withdraw "+amount+"$ from the account with index "+name+",the balance is "+limit1+"$");
        }
        else if(amount==0){
            System.out.println("you made no withdraw,the balance in the account with the index "+name+" is "+deposit()+"$");
        }
        else{
            System.out.println("Please withdrawing unsuccessful, the balance is "+deposit());
        }
        //please this return statement actually return nothing.

        return string;
    }
    //this method works in collaboration with the above deposit method.
    private double deposit() {
        return balance;
    }
}
