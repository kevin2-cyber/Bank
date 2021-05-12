package com.Bank1;

public class Bank {
    public double interestAdded;int index;int Index; public double overDraft;int b=2;int count = 0; String string=" ";
    //this array stores the list of Accounts created.
    private SavingsAccount[] the = new SavingsAccount[10000000];
    //this method deals with creating of accounts
    public void createOrCloseAccount(SavingsAccount d,String create,int index) {
           //this statements check the in coming ague. and direct it to where it's suppose to.
        if (create == "create"||create == "Create"||create == "CREATE") {
            the[1 + count] = d;
              if(1 + count<the.length)
                    System.out.println("The account with the index number "+index+" is current working");
            count++;
        } else if(create == "close"||create == "Close"||create == "CLOSE")  {
            the[1 + count] = d;
            if((1+count>0))
            System.out.println("The account with the index number "+index+" is been closed");
            count--;
        }else {
            System.out.println("invalid input for creating or closing if account");
        }
    }
    public void SavingsAccountUpdate(double interestAdded,int index){
        this.interestAdded=interestAdded;
        this.index=index;
    }
    //this method just returns a string to printout the update of the Savings Account.
    public String toString3(){
        System.out.println(interestAdded+" interest was added to the Account with the index number "+index);
        return string;
    }
    //this method deals with the update of current accounts.
    public void CurrentAccountUpdate(double overDraft,int Index){
        this.overDraft=overDraft;
        this.Index=Index;

    }
    //this method just returns a string to printout the update of the current Account.
    public String toString2(){
        if(overDraft>0){
            System.out.println("You have "+overDraft+" $ in your account("+Index+").You can withdraw additional "+(overDraft-20)+"$ from your Account");
        }else{
            System.out.println("The money left in your account("+Index+") can't be withdraw, but you can negotiate with us for a loan");
        }
        return string;
    }
}
