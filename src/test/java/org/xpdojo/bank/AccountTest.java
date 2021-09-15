package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
//import static org.hamcrest.*;

public class AccountTest {

    @Test
	//@Disabled
    public void depositAnAmountToIncreaseTheBalance() throws Exception {

        //arrange
        Account account = new Account();
        account.deposit(10);
        assertThat(account.balance);
        //act (add some money)


        //assert


        //assertThat("your first test").isBlank();
        //if ("gd".contains("d")) throw new Exception("Exception !!!");
    }
}
