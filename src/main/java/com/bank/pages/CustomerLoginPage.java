package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    By clickCustomerLoginLink = By.xpath("//button[@class='btn btn-primary btn-lg']");

    public void clickCustomerLoginLink(){
        clickOnElement(clickCustomerLoginLink);
    }
    By selectNameFromList = By.xpath("//select[@id='userSelect']");

    public void yourNameList(){
        selectByVisibleTextFromDropDown(selectNameFromList,"Harry Potter");
    }

}
