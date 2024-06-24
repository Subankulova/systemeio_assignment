package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MakeMoneyHome extends BasePage {
    @FindBy(css = "h1#blog-post_title-7b9fffef")
    WebElement blogPostTitle;

    @FindBy(xpath = "//input[@id='form-input-f8b8a814']")
    WebElement emailInput;
    @FindBy(xpath = "//button[@id='button-0a65a969']")
    WebElement buttonIWantMyCopy;
    @FindBy(css = "a[data-testid='popup-close-icon']")
    private WebElement closeIcon;
    @FindBy(id = "text-376657c1")
    WebElement financialFreedomText;

    @FindBy(className = "FieldErrors__FieldErrorUi-sc-1t97nsl-0")
    private WebElement errorMessageElement;




    public void verifyblogPostTitleIsDisplayed(){

        Assert.assertTrue(blogPostTitle.isDisplayed());
    }
    public void verifyFinancialFreeedomTextIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement iframe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[contains(@id, 'systemeio-iframe')]")));
        driver.switchTo().frame(iframe);
        Assert.assertTrue(financialFreedomText.isDisplayed());
    }

    public void enterEmail(String email) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement iframe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[contains(@id, 'systemeio-iframe')]")));
        driver.switchTo().frame(iframe);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(emailInput));
        emailInput.sendKeys(email);
    }
    public void clickButton() {
        buttonIWantMyCopy.click();
    }
    public void setCloseIcon(){
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement iframe = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[contains(@id, 'systemeio-iframe')]")));
        driver.switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(closeIcon));
        closeIcon.click();
    }
    public void verifyInvalidLoginErrorIsDisplayed(){

        Assert.assertTrue(errorMessageElement.isDisplayed());
    }
}
