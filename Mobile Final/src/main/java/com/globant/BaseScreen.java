package com.globant;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
//import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseScreen {

    public static AppiumDriver<MobileElement> appiumDriver;

    public void environmentSetUp() {

        try{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 7 Pro API 33");
        capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
        capabilities.setCapability("appPackage", "com.wdiodemoapp");
        capabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity");
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\juandiego.sierra\\Downloads\\Android-NativeDemoApp-0.4.0.apk");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723"), capabilities);
        URL appiumServer = new URL("http://127.0.0.1:4723");
        appiumDriver = new AppiumDriver<>(appiumServer,capabilities);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static AppiumDriver<MobileElement> getAppiumDriver() {
        return appiumDriver;
    }

}
