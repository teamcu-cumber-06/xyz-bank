package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By lcCustomerLabel = By.xpath("//label[contains(text(),'Customer :')]");
    By lcDropDownCustomer = By.xpath("//select[@id='userSelect']");
    By lcDropDownCurrency = By.xpath("//select[@id='currency']");
    By lcButtonProcess = By.xpath("//button[contains(text(),'Process')]");

     public void selectCustomerName(){
         selectByValueFromDropDown(lcDropDownCustomer,"1");
     }
     public void selectCurrency(){
         selectByValueFromDropDown(lcDropDownCurrency,"Pound");
     }
     public void clickOnProcessButton(){
         clickOnElement(lcButtonProcess);
     }
}
