package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    By lcFirstNameInputBox = By.xpath("//input[@placeholder='First Name']");
    By lcLastNameInputBox = By.xpath("//input[@placeholder='Last Name']");
    By lcPostCodeInputBox = By.xpath("//input[@placeholder='Post Code']");
    By lcAddCustomerButtonByCss = By.cssSelector("button[type='submit']");
    By lcFirstNameLabel = By.xpath("//label[contains(text(),'First Name :')]");


    public void enterYourFirstName(){
        sendTextToElement(lcFirstNameInputBox,"Kishan");
    }
    public void enterYourLastName(){
        sendTextToElement(lcLastNameInputBox,"Patel");
    }
    public void enterYourPostalCode(){
        sendTextToElement(lcPostCodeInputBox,"04516");
    }
    public void clickOnAddCustomerButton(){
        clickOnElement(lcAddCustomerButtonByCss);
    }

}
