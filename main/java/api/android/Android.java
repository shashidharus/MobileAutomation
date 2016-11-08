package api.android;

import api.apps.Apps;
import core.ADB;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by ssha05u on 10/11/2016.
 */
public class Android {
    public static AndroidDriver driver;
    public static AppiumDriver appiumDriver;
    public static ADB adb;
    public static Apps app = new Apps();
}
