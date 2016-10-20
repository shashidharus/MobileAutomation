import api.android.Android;
import core.ADB;
import core.MyLogger;
import core.UiObject;
import core.UiSelector;
import core.managers.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Level;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by ssha05u on 10/11/2016.
 */
public class Runner {
    public static void main(String[] args) throws MalformedURLException {

        MyLogger.log.setLevel(Level.DEBUG);
        AndroidDriver driver = null;
        try{
            DriverManager.createDriver();
            Android.adb.openAppsActivity("org.zwanoo.android.speedtest","com.ookla.speedtest.softfacade.MainActivity");
            UiObject testAgainButton = new UiSelector().resourceId("org.zwanoo.android.speedtest:id/o2_button_text").makeUiObject();
            UiObject download = new UiSelector().resourceId("org.zwanoo.android.speedtest:id/downloadSpeed").makeUiObject();
            UiObject upload = new UiSelector().resourceId("org.zwanoo.android.speedtest:id/uploadSpeed").makeUiObject();
            UiObject ping = new UiSelector().resourceId("org.zwanoo.android.speedtest:id/pingSpeed").makeUiObject();
            testAgainButton.waitToAppear(5).tap().waitToDisappear(5).waitToAppear(120);
            MyLogger.log.info("Ping: "+ping.getText());
            MyLogger.log.info("Download: "+download.getText());
            MyLogger.log.info("Upload: "+upload.getText());
            DriverManager.killDriver();
        }finally {
            if(driver != null) driver.quit();
        }
    }
}
