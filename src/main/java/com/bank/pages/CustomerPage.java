package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerPage extends Utility {

    By clickCustomerLoginLink = By.xpath("//button[@class='btn btn-primary btn-lg']");

    public void clickCustomerLoginLink(){
        clickOnElement(clickCustomerLoginLink);
    }
    By clickOnYourNameList = By.xpath("//select[@id='userSelect']");
    public void clickOnYourNameList(){
        selectByContainsTextFromDropDown(clickOnYourNameList,"Harry Potter");

    }
    By clickOnLogin = By.xpath("//button[contains(text(),'Login')]");
    public void clickOnLogin(){
        clickOnElement(clickOnLogin);
    }
    By verifyLogoutButtonDisplayed = By.xpath("//button[contains(text(),'Logout')]");
    public String verifyLogoutButtonDisplayed(){
        return getTextFromElement(verifyLogoutButtonDisplayed);
    }
    By verifyWelcomeMessage = By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/strong[1]");
    public String verifyWelcomeMessage(){
        return getTextFromElement(verifyWelcomeMessage);

    }
    By clickOnLogout = By.xpath("//button[contains(text(),'Logout')]");
    public void clickOnLogout(){
        clickOnElement(clickOnLogout);
    }
}
