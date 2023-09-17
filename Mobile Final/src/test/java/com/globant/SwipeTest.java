package com.globant;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwipeTest {
    public static AppiumDriver<MobileElement> appiumDriver;
    @BeforeTest(alwaysRun = true)
    public void signUp() {
        BaseScreen baseScreen = new BaseScreen();
        baseScreen.environmentSetUp();
        appiumDriver = baseScreen.getAppiumDriver();
    }

    @Test(alwaysRun = true)
    public void swiping(){
        SwipePage swipePage = new SwipePage();
        swipePage.setAppiumDriver(appiumDriver);
        swipePage.clickSwipe();

        //Right Swipe
        swipePage.swipe(0.7, 0.3);
    }
}
