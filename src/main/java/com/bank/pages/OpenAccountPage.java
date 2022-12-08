package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {

    By clickOnOpenAccountLink = By.xpath("//button[@ng-click ='openAccount()']");

    public void clickOnOpenAccountLink() {
        clickOnElement(clickOnOpenAccountLink);
    }

    By clickCustomerNameList = By.xpath("//select[@id='userSelect']");

    public void customerNameList() {
        selectByVisibleTextFromDropDown(clickCustomerNameList,"Harry Potter");

    }

    By clickCurrency = By.xpath("//select[@id='currency']");

    public void currencyList() {
        selectByContainsTextFromDropDown(clickCurrency,"Pound");
    }

    By clickOnProcessButton = By.xpath("//button[contains(text(),'Process')]");

    public void clickOnProcessButton() {
        clickOnElement(clickOnProcessButton);
        driver.switchTo().alert();
        String text = driver.switchTo().alert().getText();// Getting the text from alert
        System.out.println(text);
        driver.switchTo().alert().accept();
    }

}
