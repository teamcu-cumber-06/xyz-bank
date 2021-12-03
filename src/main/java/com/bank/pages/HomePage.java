package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By lcTabCustomerLogin = By.xpath("//button[contains(text(),'Customer Login')]");
    By lcTabBankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    By lcTabAddCustomer = By.xpath("//button[normalize-space()='Add Customer']");


    public void clickOnBankManagerLoginButton(){
        clickOnElement(lcTabBankManagerLogin);
    }
    public void clickOnAddCustomerButton(){
        clickOnElement(lcTabAddCustomer);
    }
    public String actualTextFromPopUp(){
        System.out.println(getTextFromAlert());
        return getTextFromAlert();
    }

    public String expectedTextFromPopUp(String text){
        return text;
    }

    public void clickonOkfromPopup(){
        acceptAlert();
    }
    public void clickOnCustomerLogin(){
        clickOnElement(lcTabCustomerLogin);

    }
}
