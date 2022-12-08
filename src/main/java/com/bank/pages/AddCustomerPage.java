package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {

    By clickOnAddCustomerTab = By.xpath("//button[@ng-class = 'btnClass1']");
    public void clickOnAddCustomerTab(){
        clickOnElement(clickOnAddCustomerTab);
    }
    By sendTextToFirstName = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]");
    public void sendTextToFirstName(String firstName){
        sendTextToElement(sendTextToFirstName, firstName);
    }
    By sendTextToLastName = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]");
    public void sendTextToLastName(String lastName){
        sendTextToElement(sendTextToLastName, lastName);
    }
    By sendTextToPostCode = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]");
    public void sendTextToPostCode(String postCode){
        sendTextToElement(sendTextToPostCode, postCode);
    }
    By clickOnAddCustomer =By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]");

    public void clickOnAddCustomer(){
        clickOnElement(clickOnAddCustomer);
        driver.switchTo().alert();
        String text = driver.switchTo().alert().getText();// Getting the text from alert
        System.out.println(text);
        driver.switchTo().alert().accept();
    }
}
