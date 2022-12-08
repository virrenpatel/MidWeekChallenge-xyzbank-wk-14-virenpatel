package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By verifyLinkTextHome = By.xpath("//button[contains(text(),'Home')]");
    By verifyTextXYZBank = By.xpath("//strong[contains(text(),'XYZ Bank')]");
    By clickCustomerLoginLink = By.xpath("//button[@class='btn btn-primary btn-lg']");
    By verifyYourNameText = By.xpath("//label[contains(text(),'Your Name :')]");

    By clickOnHomeTab = By.xpath("//button[contains(text(),'Home')]");
    By clickBankManagerLogin = By.xpath("//button[@ng-click='manager()']");
    By verifyAddCustomerText = By.xpath("//button[@ng-class = 'btnClass1']");
    public String verifyLinkTextHome(){
        return getTextFromElement(verifyLinkTextHome);
    }
    public String verifyTextXYZBank(){
        return getTextFromElement(verifyTextXYZBank);
    }
    public void clickCustomerLoginLink(){
        clickOnElement(clickCustomerLoginLink);
    }
    public String verifyYourNameText() {
        return getTextFromElement(verifyYourNameText);
    }

    public void clickOnHomeTab(){
        clickOnElement(clickOnHomeTab);
    }
    public void clickBankManagerLogin(){
        clickOnElement(clickBankManagerLogin);
    }
    public String verifyAddCustomerText() {
        return getTextFromElement(verifyAddCustomerText);
    }

}
