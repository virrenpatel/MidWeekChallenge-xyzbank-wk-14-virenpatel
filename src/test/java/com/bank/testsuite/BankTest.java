package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    AddCustomerPage addCustomerPage = new AddCustomerPage();
    BankManagerLoginPage bankManagerLoginPage =new BankManagerLoginPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerPage customerPage = new CustomerPage();
    AccountPage accountPage = new AccountPage();

    @Test
    public void BankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        bankManagerLoginPage.clickOnBankManagerLoginTab();
        addCustomerPage.clickOnAddCustomerTab();
        addCustomerPage.sendTextToFirstName("Manan");
        addCustomerPage.sendTextToLastName("Shah");
        addCustomerPage.sendTextToPostCode("HA8 9LA");
        addCustomerPage.clickOnAddCustomer();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        bankManagerLoginPage.clickOnBankManagerLoginTab();
        openAccountPage.clickOnOpenAccountLink();
        openAccountPage.customerNameList();
        openAccountPage.currencyList();
        Thread.sleep(5000);
        openAccountPage.clickOnProcessButton();
    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {

        customerPage.clickCustomerLoginLink();
        customerPage.clickOnYourNameList();
        Thread.sleep(10000);
        customerPage.clickOnLogin();
        customerPage.verifyLogoutButtonDisplayed();
        customerPage.verifyWelcomeMessage();
        Assert.assertEquals(customerPage.verifyWelcomeMessage(),"Welcome Harry Potter !!");
        customerPage.clickOnLogout();
    }
    @Test
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        customerPage.clickCustomerLoginLink();
        customerPage.clickOnYourNameList();
        //Thread.sleep(10000);
        customerPage.clickOnLogin();
        accountPage.clickOnDeposit();
        accountPage.enterAmount100("100");
        accountPage.clickOnDepositButton();
        accountPage.verifyMessageDepositSuccessfully();
        Assert.assertEquals(accountPage.verifyMessageDepositSuccessfully(),"Deposit Successful");
    }
    @Test
    public void customerShouldWithdrawMoneySuccessful(){
        customerPage.clickCustomerLoginLink();
        customerPage.clickOnYourNameList();
        //Thread.sleep(10000);
        customerPage.clickOnLogin();
        accountPage.clickOnWithdrawButton();
        accountPage.enterAmount("50");
        accountPage.clickOnWithdraw();
       // accountPage.verifyMessageTransactionSuccessful();
        //Assert.assertEquals(accountPage.verifyMessageTransactionSuccessful(),"Transaction successful");

    }
}
