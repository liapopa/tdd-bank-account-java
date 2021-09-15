package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;



import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.isEquals;
//import static org.hamcrest.*;

public class AccountTest {

    @Test
	//@Disabled
    public void depositAnAmountToIncreaseTheBalance()  {

        //arrange
        Account account = new Account();
        account.deposit(10);
        assertThat(account.balance).isEqualTo(10) ;
        //act (add some money)

        //assert

        //assertThat("your first test").isBlank();
        //if ("gd".contains("d")) throw new Exception("Exception !!!");
    }

    @Test
    public void startingBalanceIsZero(){
        Account account = new Account();
        assertThat(account.balance).isEqualTo(0);
    }

    @Test
    public void checkBalance(){
        Account account = new Account();
        account.deposit(100);
        account.deposit(200);
        assertThat(account.balance).isEqualTo(300);
    }

    @Test
    public void withdrawToDecreaseTheBalance()
    {
        Account account = new Account();
        account.deposit(500);
        account.withdraw(100);
        assertThat(account.balance).isEqualTo(400);
    }

    @Test
    public void transferMoney()
    {
     Account srcAccount = new Account();
     srcAccount.deposit(5000);

     Account tgtAccount = new Account();
     tgtAccount.deposit(10);

     srcAccount.transfer(tgtAccount, 1000);

     assertThat(srcAccount.balance).isEqualTo(4000);
     assertThat(tgtAccount.balance).isEqualTo(1010);

    }

}
