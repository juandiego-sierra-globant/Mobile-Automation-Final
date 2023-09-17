package com.globant;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SwipePage {
    public static AppiumDriver<MobileElement> appiumDriver;

    public static void setAppiumDriver(AppiumDriver<MobileElement> appiumDriver) {
        SwipePage.appiumDriver = appiumDriver;
    }

    public void clickSwipe(){
        appiumDriver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        MobileElement swipeLabel = appiumDriver.findElementByAccessibilityId("Swipe");
        swipeLabel.click();
    }
    public static void swipe(double startPercentage, double endPercentage) {


        MobileElement cardlabel = appiumDriver.findElementByXPath(
                "(//android.view.ViewGroup[@content-desc=\"card\"])[1]");
        int elementX = cardlabel.getLocation().getX();
        int elementY = cardlabel.getLocation().getY();
        int elementWidth = cardlabel.getSize().getWidth();
        int elementHeight = cardlabel.getSize().getHeight();

        int centerX = elementX + (elementWidth / 2);
        int centerY = elementY + (elementHeight / 2);

        int screenWidth = appiumDriver.manage().window().getSize().getWidth();
        int endPointX = (int) (screenWidth * endPercentage);

        TouchAction ta = new TouchAction(appiumDriver);
        ta.press(PointOption.point(centerX, centerY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(endPointX, centerY))
                .release()
                .perform();

    }
}
