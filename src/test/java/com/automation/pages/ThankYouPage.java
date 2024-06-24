package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ThankYouPage extends BasePage{

    @FindBy(id = "text-880c52ab")
    WebElement thankYouMessage;

    public void verifyThankYouText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(thankYouMessage));
        Assert.assertTrue(thankYouMessage.isDisplayed());
    }


}

