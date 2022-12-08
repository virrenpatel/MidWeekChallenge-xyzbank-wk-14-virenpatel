package com.bank.testsuite;

import com.bank.pages.BankManagerLoginPage;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankManagerLoginPageTest extends BaseTest {
    BankManagerLoginPage bankManagerLoginPage =new BankManagerLoginPage();

    @Test
    public void bankManagerLoginPage(){
        bankManagerLoginPage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.verifyAddCustomerText();
        Assert.assertEquals(bankManagerLoginPage.verifyAddCustomerText(),"Add Customer");
        bankManagerLoginPage.verifyOpenAccountText();
        Assert.assertEquals(bankManagerLoginPage.verifyOpenAccountText(),"Open Account");
        bankManagerLoginPage.verifyCustomerText();
        Assert.assertEquals(bankManagerLoginPage.verifyCustomerText(),"Customers");

    }
}
