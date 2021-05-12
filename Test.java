package com.Bank1;

public class Test {
    public static void main(String[] args){
        //This for depositing Cash in your Savings Account
        SavingsAccount A1=new SavingsAccount();
        //You need to input the amount followed by the days you are keeping it the account and last the index(Every Account must has a unique index).
        A1.Deposit(10000,5,1);
        System.out.println(A1.toString1());

        SavingsAccount A2=new SavingsAccount();
        A2.Deposit(5000,5,2);
        System.out.println(A2.toString1());

        SavingsAccount A3=new SavingsAccount();
        A3.Deposit(10000,5,3);
        System.out.println(A3.toString1());


        //Here for Current account, you can deposit here to which you will get no interest
        CurrentAccount C1=new CurrentAccount();
        //input the amount you want to deposit
        C1.deposit(300);
        //if you want to withdraw too, here is where you can do your withdrawing.
        System.out.println(C1.withdraw(30,1));

        CurrentAccount C2=new CurrentAccount();
        C2.deposit(7030);
        System.out.println(C2.withdraw(0,2));

        CurrentAccount C3=new CurrentAccount();
        C3.deposit(10000);
        System.out.println(C3.withdraw(10,3));


        //if you want to create an account, you can do the here by typing "create"
        //And if you want to close an account too, you can do that by typing "close"
        Bank g=new Bank();
        //After typing "close" or "create" you have to also input the index of the account
        g.createOrCloseAccount(A1,"Create",1);
        g.createOrCloseAccount(A2,"CREATE",2);
        g.createOrCloseAccount(A3,"create",3);

        //you can fetch the updates of the Savings accounts here,here you need to provide the index number of the Account.
        g.SavingsAccountUpdate(A1.balance,1);
        System.out.println(g.toString3());
        g.SavingsAccountUpdate(A2.balance,2);
        System.out.println(g.toString3());
        g.SavingsAccountUpdate(A3.balance,3);
        System.out.println(g.toString3());

        //you can fetch the updates of the Current accounts here,here you need to provide the name of the Account and the index.
        g.CurrentAccountUpdate(C1.limit,1);
        System.out.println(g.toString2());
        g.CurrentAccountUpdate(C2.limit,2);
        System.out.println(g.toString2());
        g.CurrentAccountUpdate(C3.limit,3);
        System.out.println(g.toString2());




    }
}
