package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By clickOnDeposit = By.xpath("//button[@ng-click = 'deposit()']");
    public void clickOnDeposit(){
        clickOnElement(clickOnDeposit);
    }
    By enterAmount100 = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]");
    public void enterAmount100(String amount){
        sendTextToElement(enterAmount100,amount);
    }
    By clickOnDepositButton = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]");
    public void clickOnDepositButton(){
        clickOnElement(clickOnDepositButton);
    }
    By verifyMessageDepositSuccessfully = By.xpath("//span[contains(text(),'Deposit Successful')]");
    public String verifyMessageDepositSuccessfully(){
        return getTextFromElement(verifyMessageDepositSuccessfully);
    }

    By clickOnWithdrawButton = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[3]");
    public void clickOnWithdrawButton(){
        clickOnElement(clickOnWithdrawButton);
    }
    By enterAmount = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]");
    public void enterAmount(String amount){
        sendTextToElement(enterAmount,amount);
    }
    By clickOnWithdraw = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]");
    public void clickOnWithdraw(){
        clickOnElement(clickOnWithdraw);
    }
    By verifyMessageTransactionSuccessful = By.xpath("//span[contains(text(),'Transaction successful')]");
    public String verifyMessageTransactionSuccessful(){
        return getTextFromElement(verifyMessageTransactionSuccessful);
    }
}
