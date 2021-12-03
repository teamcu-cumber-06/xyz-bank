package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {
    By lcTabLogout = By.xpath("//button[@class='btn logout']");
    By lcYourNameText=By.xpath("//label[normalize-space()='Your Name :']");
    By lcTabLogoutByXpath = By.xpath("//button[normalize-space()='Logout']");
    By lcTabTransactions = By.xpath("//button[normalize-space()='Transactions']");
    By lcTabDeposit = By.xpath("//button[normalize-space()='Deposit']");
    By lcTabWithdrawl = By.xpath("//button[normalize-space()='Withdrawl']");
    By lcAmountInputBox = By.xpath("//input[@placeholder='amount']");
    By lcButtonDeposit = By.xpath("//button[normalize-space()='Deposit']");
    By lcMessageDepositSuccess = By.xpath("//span[@class='error ng-binding' and contains(text(),'Deposit Successful')]");
    By lcAmountWithdrawlInputBoxByCss = By.cssSelector("input[placeholder='amount']");
    By lcButtonWithdrawalByCss = By.cssSelector("button[type='submit']");
    By lcMessageWithdrawalSuccessByXpath = By.xpath("//span[@class='error ng-binding']");

    public void verifyLogoutButtonDisplay(){
        isDisplayed(lcTabLogout);
    }
    public void clickOnLogoutButton(){
        clickOnElement(lcTabLogout);
    }
    public void verifyYourNameIsDisplayed(){
        isDisplayed(lcYourNameText);
    }
    public void clickOnDepositeButton(){
        clickOnElement(lcButtonDeposit);
    }
    public void enterAmountYouWantToDeposit(){
        sendTextToElement(lcAmountInputBox,"500");
    }
    public String actualSuccessMsg(){
        return getTextFromElement(lcMessageWithdrawalSuccessByXpath);
    }

}
