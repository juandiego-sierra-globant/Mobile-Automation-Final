package com.globant;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;
import java.net.URL;

public class NavigationPage {
    public static AppiumDriver<MobileElement> appiumDriver;


    public static void setAppiumDriver(AppiumDriver<MobileElement> appiumDriver) {
        NavigationPage.appiumDriver = appiumDriver;
    }

    public void navigationBottomBar() {

        // Set an implicit wait for 30 seconds
        appiumDriver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

        // Find the "Webview" element by its accessibility ID and click on it
        MobileElement webviewLabel = appiumDriver.findElementByAccessibilityId("Webview");
        webviewLabel.click();

        // Find the "webViewImage" element using XPath
        MobileElement webViewImage = appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View");

        // Check if the "webViewImage" element is visible
        boolean isWebViewImageVisible = webViewImage.isDisplayed();

        // Assert that the "webViewImage" is visible
        Assert.assertTrue(isWebViewImageVisible, "webViewImage is visible");

        // Find the "Login" element by its accessibility ID and click on it
        MobileElement loginLabel = appiumDriver.findElementByAccessibilityId("Login");
        loginLabel.click();

        // Find the "inputEmail" element by its accessibility ID
        MobileElement inputEmail = appiumDriver.findElementByAccessibilityId("input-email");

        // Check if the "inputEmail" element is visible
        boolean isInputEmailVisible = inputEmail.isDisplayed();

        // Assert that the "inputEmail" is visible
        Assert.assertTrue(isInputEmailVisible, "Input Email is visible");

        // Find the "Forms" element by its accessibility ID and click on it
        MobileElement formsLabel = appiumDriver.findElementByAccessibilityId("Forms");
        formsLabel.click();

        // Find the "formsText" element using XPath
        MobileElement formsText = appiumDriver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"Forms-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView");

        // Check if the "formsText" element is visible
        boolean isFormsTextVisible = formsText.isDisplayed();

        // Assert that the "formsText" is visible
        Assert.assertTrue(isFormsTextVisible, "Forms Text is visible");

        // Find the "Swipe" element by its accessibility ID and click on it
        MobileElement swipeLabel = appiumDriver.findElementByAccessibilityId("Swipe");
        swipeLabel.click();

        // Find the "swipeCard1" element using XPath
        MobileElement swipeCard1 = appiumDriver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"card\"])[1]");

        // Check if the "swipeCard1" element is visible
        boolean isSwipeCard = swipeCard1.isDisplayed();

        // Assert that the "swipeCard1" is visible
        Assert.assertTrue(isSwipeCard, "Swipe Card is visible");

        // Find the "Drag" element by its accessibility ID and click on it
        MobileElement dragLabel = appiumDriver.findElementByAccessibilityId("Drag");
        dragLabel.click();

        // Find the "dragText" element using XPath
        MobileElement dragText = appiumDriver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Drag-drop-screen\"]/android.view.ViewGroup[1]/android.widget.TextView");

        // Check if the "dragText" element is visible
        boolean isDragText = dragText.isDisplayed();

        // Assert that the "dragText" is visible
        Assert.assertTrue(isDragText, "Drag Text is visible");
    }


}
