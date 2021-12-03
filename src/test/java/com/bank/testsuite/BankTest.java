package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends TestBase {
    HomePage homePage=new HomePage();
    AddCustomerPage addCustomerPage=new AddCustomerPage();
    BankManagerLoginPage bankManagerLoginPage=new BankManagerLoginPage();
    OpenAccountPage openAccountPage=new OpenAccountPage();
    CustomerLoginPage customerLoginPage=new CustomerLoginPage();
    CustomersPage customersPage=new CustomersPage();


    @Test
    public void bankManagerShouldAddCustomerSuccessfully(){
        homePage.clickOnBankManagerLoginButton();
        homePage.clickOnAddCustomerButton();
        addCustomerPage.enterYourFirstName();
        addCustomerPage.enterYourLastName();
        addCustomerPage.enterYourPostalCode();
        addCustomerPage.clickOnAddCustomerButton();
        Assert.assertEquals(homePage.actualTextFromPopUp(),homePage.expectedTextFromPopUp("Customer added successfully with customer id :6"),"Popup message not matched");
        homePage.clickonOkfromPopup();

    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully(){
      homePage.clickOnBankManagerLoginButton();
      bankManagerLoginPage.clickonOpenAccountPage();
      openAccountPage.selectCustomerName();
      openAccountPage.selectCurrency();
      openAccountPage.clickOnProcessButton();
      Assert.assertEquals(homePage.actualTextFromPopUp(),homePage.expectedTextFromPopUp("Account created successfully with account Number :1016"),"Popup message not matched");
      homePage.clickonOkfromPopup();
}
@Test
    public void customerShouldLoginAndLogoutSuceessfully(){
        homePage.clickOnCustomerLogin();
        customerLoginPage.selectYourName();
        customerLoginPage.clickOnLoginButton();
        customersPage.verifyLogoutButtonDisplay();
        customersPage.clickOnLogoutButton();
        customersPage.verifyYourNameIsDisplayed();

}
@Test
    public void customerShouldDepositMoneySuccessfully(){
    homePage.clickOnCustomerLogin();
    customerLoginPage.selectYourName();
    customerLoginPage.clickOnLoginButton();
    customersPage.clickOnDepositeButton();
    customersPage.enterAmountYouWantToDeposit();
//    String actualmsg=customersPage.actualSuccessMsg();
//    String expectedmsg="Deposit Successful";
//    Assert.assertEquals(expectedmsg,actualmsg,"invalid click");


}
@Test
    public void customerShouldWithdrawMoneySuccessfully(){
    homePage.clickOnCustomerLogin();
    customerLoginPage.selectYourName();
    }



}

