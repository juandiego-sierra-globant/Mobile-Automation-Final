package com.globant;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;


public class OpenAppTest {
    public static AppiumDriver<MobileElement> appiumDriver;
      @Test
      public void openAppTest(){
        BaseScreen baseScreen = new BaseScreen();
        baseScreen.environmentSetUp();
        appiumDriver= baseScreen.getAppiumDriver();
    }
}
