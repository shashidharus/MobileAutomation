import api.android.Android;
import api.apps.cub.Home.Home;
import core.ADB;
import core.MyLogger;
import core.UiObject;
import core.UiSelector;
import core.managers.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Level;
import org.junit.runner.JUnitCore;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import tests.Functionality;
import tests.Navigation;
import tests.TestPrimer;

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
            //JUnitCore.runClasses(TestPrimer.class);
            TestListenerAdapter tla = new TestListenerAdapter();
            TestNG testng = new TestNG();
            testng.setTestClasses(new Class[]{Navigation.class,Functionality.class});
            testng.addListener(tla);
            testng.run();
        }finally {
            DriverManager.killDriver();
        }
    }
}
