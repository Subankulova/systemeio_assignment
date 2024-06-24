package com.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverUtils {
    static WebDriver driver;
     public static void createDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Wait for each command to get success response till 20 sec maximum
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //  1. Open Website
        driver.get(ConfigReader.getProperty("application.url"));
    }
    public static WebDriver getDriver(){
        return driver;
    }

}