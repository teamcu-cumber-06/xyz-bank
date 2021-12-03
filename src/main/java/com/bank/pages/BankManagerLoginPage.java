package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By lcTabAddCustomer = By.xpath("//button[normalize-space()='Add Customer']");
    By lcTabOpenAccount = By.xpath("//button[normalize-space()='Open Account']");
    By lcTabCustomer = By.xpath("//button[normalize-space()='Customers']");

    public void clickonOpenAccountPage(){
        clickOnElement(lcTabOpenAccount);
    }

}
