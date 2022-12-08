package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By clickOnBankManagerLoginTab = By.xpath("//button[@ng-click='manager()']");

    public void clickOnBankManagerLoginTab(){
        clickOnElement(clickOnBankManagerLoginTab);
    }
    By verifyAddCustomerText = By.xpath("//button[@ng-class = 'btnClass1']");
    public String verifyAddCustomerText(){
        return getTextFromElement(verifyAddCustomerText);
    }
    By verifyOpenAccountText = By.xpath("//button[@ng-class = 'btnClass2']");
    public String verifyOpenAccountText(){
        return getTextFromElement(verifyOpenAccountText);
    }
    By verifyCustomerText = By.xpath("//button[@ng-class = 'btnClass3']");
    public String verifyCustomerText(){
        return getTextFromElement(verifyCustomerText);
    }

}
