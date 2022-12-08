package com.bank.testsuite;

import com.bank.pages.CustomerLoginPage;
import com.bank.testbase.BaseTest;
import org.testng.annotations.Test;

public class CustomerLoginPageTest extends BaseTest {

    CustomerLoginPage customerLoginPage = new CustomerLoginPage();

    @Test
    public void verifyCustomerLoginPage() {
        customerLoginPage.clickCustomerLoginLink();
        customerLoginPage.yourNameList();


    }
}