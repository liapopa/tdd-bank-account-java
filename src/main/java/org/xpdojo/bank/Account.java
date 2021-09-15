package org.xpdojo.bank;

public class Account {

    public int balance;

    public void deposit(int i) {
        balance += i;
    }

    public void withdraw(int i) {
        balance -= i;
    }

    public boolean transfer(Account tgtAccount, int i) {
        if (i< 0) { //throw new Exception("Transfer correct amount");
         return false; }
        else {
            this.balance -= i;
            tgtAccount.balance += i;
            return true;
        }
    }
}
