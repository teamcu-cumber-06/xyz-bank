package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By lcDropDownYourName = By.id("userSelect");
    By lcButtonLogin = By.xpath("//button[contains(text(),'Login')]");
    By lcLabelYourName = By.xpath("//label[normalize-space()='Your Name :']");

    public void selectYourName() {
        selectByValueFromDropDown(lcDropDownYourName, "1");
    }

    public void clickOnLoginButton() {
        clickOnElement(lcButtonLogin);

    }
}
