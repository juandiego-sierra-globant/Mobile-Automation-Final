package com.globant;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    public static AppiumDriver<MobileElement> appiumDriver;
    @BeforeTest(alwaysRun = true)
    public void signUp(){
        BaseScreen baseScreen = new BaseScreen();
        baseScreen.environmentSetUp();
        appiumDriver= baseScreen.getAppiumDriver();
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.setAppiumDriver(appiumDriver);
        signUpPage.signUpProcess();
        signUpPage.generateRandomEmail();
    }

    @Test(alwaysRun = true)
    public void loggingIn(){
        LoginPage loginPage = new LoginPage();
        loginPage.setAppiumDriver(appiumDriver);
        loginPage.loginProcess();
    }

}
