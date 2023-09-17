package com.globant;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NavigationTest {
    public static AppiumDriver<MobileElement> appiumDriver;
    @BeforeTest(alwaysRun = true)
    public void signUp(){
        BaseScreen baseScreen = new BaseScreen();
        baseScreen.environmentSetUp();
        appiumDriver= baseScreen.getAppiumDriver();
    }
    @Test(alwaysRun = true)
    public void navigate() {
        NavigationPage navigationPage = new NavigationPage();
        navigationPage.setAppiumDriver(appiumDriver);
        navigationPage.navigationBottomBar();
    }
}
