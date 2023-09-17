package com.globant;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Random;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SignUpPage {

    public static AppiumDriver<MobileElement> appiumDriver;

    public static void setAppiumDriver(AppiumDriver<MobileElement> appiumDriver) {
        SignUpPage.appiumDriver = appiumDriver;
    }

    public void signUpProcess(){
        appiumDriver.manage().timeouts().implicitlyWait(30L,TimeUnit.SECONDS);
        MobileElement loginLabel = appiumDriver.findElementByAccessibilityId("Login");
        loginLabel.click();

        appiumDriver.manage().timeouts().implicitlyWait(30L,TimeUnit.SECONDS);
        MobileElement signUpLabel = appiumDriver.findElementByAccessibilityId("button-sign-up-container");
        signUpLabel.click();
    }

    public void generateRandomEmail() {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder randomEmail = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(allowedChars.length());
            char randomChar = allowedChars.charAt(randomIndex);
            randomEmail.append(randomChar);
        }

        randomEmail.append("@example.com");
        MobileElement emailLabel = appiumDriver.findElementByAccessibilityId("input-email");
        MobileElement passwordLabel = appiumDriver.findElementByAccessibilityId("input-password");
        MobileElement passwordRepeatLabel = appiumDriver.findElementByAccessibilityId("input-repeat-password");
        MobileElement signUpLabel = appiumDriver.findElementByAccessibilityId("button-SIGN UP");
        emailLabel.sendKeys(randomEmail.toString());
        passwordLabel.sendKeys("Globant123");
        passwordRepeatLabel.sendKeys("Globant123");
        appiumDriver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        signUpLabel.click();

        MobileElement okButtonLabel = appiumDriver.findElementById("android:id/button1");
        appiumDriver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        okButtonLabel.click();
    }

}


