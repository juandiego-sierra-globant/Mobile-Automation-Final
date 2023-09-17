package com.globant;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    public static AppiumDriver<MobileElement> appiumDriver;

    public static void setAppiumDriver(AppiumDriver<MobileElement> appiumDriver) {
        LoginPage.appiumDriver = appiumDriver;
    }

    public void loginProcess() {
        appiumDriver.manage().timeouts().implicitlyWait(30L,TimeUnit.SECONDS);
        MobileElement loginLabel = appiumDriver.findElementByAccessibilityId("Login");
        loginLabel.click();

        appiumDriver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        MobileElement login2Label = appiumDriver.findElementByAccessibilityId("button-login-container");
        login2Label.click();

        appiumDriver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        MobileElement login3Label = appiumDriver.findElementByAccessibilityId("button-LOGIN");
        login3Label.click();

    }


}
