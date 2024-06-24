package com.automation.tests;

 import org.testng.annotations.Test;

public class PopUpTest extends BaseTest {

    @Test
    public void verifyButtonWithoutEnteringEmail(){
        makeMoneyHome.verifyblogPostTitleIsDisplayed();
        makeMoneyHome.verifyFinancialFreeedomTextIsDisplayed();
        makeMoneyHome.clickButton();
        makeMoneyHome.verifyInvalidLoginErrorIsDisplayed();
    }

    @Test
    public void verifyPresenceOfButton(){
        makeMoneyHome.verifyblogPostTitleIsDisplayed();
        makeMoneyHome.enterEmail("chusi.sub@gmail.com");
        makeMoneyHome.clickButton();

    }

    @Test
    public void verifyWorkingOfClosePopUp(){
        makeMoneyHome.verifyblogPostTitleIsDisplayed();
        makeMoneyHome.setCloseIcon();
      }




}
