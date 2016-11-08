package tests;

import api.android.Android;
import api.apps.cub.Cub;
import core.managers.TestManager;
/*import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;*/
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by ssha05u on 10/26/2016.
 */
public class Navigation extends TestManager {

    private static Cub cub = Android.app.cub;

    @BeforeClass
    public static void beforeClass(){
        cub.open();
    }

    @BeforeTest
    public void before(){
        testInfo.suite("Navigation");
    }

    @Test
    public void test1(){
        cub.home.waitToLoad();
        testInfo.id("test1").name("Verify that Home Activity has all the elements");
        Assert.assertTrue(cub.home.uiObject.addItem().exists());
        //Assert.assertTrue(cub.home.uiObject.barcodeScan().exists());
        Assert.assertTrue(cub.home.uiObject.carousel().exists());
        //Assert.assertTrue(cub.home.uiObject.cubRewards().exists());
        Assert.assertTrue(cub.home.uiObject.featuredCoupons().exists());
        Assert.assertTrue(cub.home.uiObject.menu().exists());
        Assert.assertTrue(cub.home.uiObject.myStore().exists());
        Assert.assertTrue(cub.home.uiObject.shoppingList().exists());
        Assert.assertTrue(cub.home.uiObject.thisWeeksAd().exists());
    }

    @Test (dependsOnMethods={"test1"})
    public void test2(){
        cub.home.uiObject.menu().waitToAppear(5).tap();
        testInfo.id("test2").name("Verify that menu activity has all elements");
        Assert.assertTrue(cub.menu.uiObject.cub().exists());
        Assert.assertTrue(cub.menu.uiObject.weeklyAd().exists());
        Assert.assertTrue(cub.menu.uiObject.coupons().exists());
        Assert.assertTrue(cub.menu.uiObject.myCubRewards().exists());
        Assert.assertTrue(cub.menu.uiObject.shoppingList().exists());
        Assert.assertTrue(cub.menu.uiObject.productLocator().exists());
        Assert.assertTrue(cub.menu.uiObject.prescriptionRefill().exists());
        /*Dimension test = Android.driver.manage().window().getSize();

        int starty = test.getHeight(); //y coordinate for the bottom of the screen

        int endy = test.getHeight()/2; //y coordinate for middle of the screen

        int startx = test.getWidth()/2;

        int endx = startx;

        //WebElement itemToScrollTo = Android.driver.findElementByAndroidUIAutomator("text(\"Terms of Use\")");
        Android.driver.swipe(startx,starty,endx,endy,3000);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //cub.menu.uiObject.menuList().scrollListView("DOWN","Terms of Use");
        /*Assert.assertTrue(cub.menu.uiObject.storeLocator().exists());
        Assert.assertTrue(cub.menu.uiObject.myStore().exists());
        Assert.assertTrue(cub.menu.uiObject.myAccount().exists());
        Assert.assertTrue(cub.menu.uiObject.faqs().exists());
        Assert.assertTrue(cub.menu.uiObject.contactUs().exists());
        Assert.assertTrue(cub.menu.uiObject.rewardsProgramDetails().exists());
        Assert.assertTrue(cub.menu.uiObject.privacyPolicy().exists());
        Assert.assertTrue(cub.menu.uiObject.termsOfUse().exists());*/

    }

    @Test (dependsOnMethods={"test1"})
    public void test3(){
        if(!cub.menu.uiObject.cub().exists())
            cub.home.uiObject.menu().waitToAppear(5).tap();
        cub.menu.uiObject.weeklyAd().waitToAppear(5).tap();
        testInfo.id("test3").name("Verify that Weekly Ad has all elements");
        Assert.assertTrue(cub.weeklyAd.uiObject.menu().exists());
        Assert.assertTrue(cub.weeklyAd.uiObject.shoppingList().exists());
        if(cub.weeklyAd.uiObject.adAvailability().exists()) {
            Assert.assertTrue(cub.weeklyAd.uiObject.adAvailability().exists());
            Assert.assertTrue(cub.weeklyAd.uiObject.weeklySavings().exists());
            Assert.assertTrue(cub.weeklyAd.uiObject.couponPreview().exists());
        }else {
            Assert.assertTrue(cub.weeklyAd.uiObject.search().exists());
            Assert.assertTrue(cub.weeklyAd.uiObject.selectAStore().exists());
            Assert.assertTrue(cub.weeklyAd.uiObject.storeList().exists());
            Assert.assertTrue(cub.weeklyAd.uiObject.storeLayout().exists());
            Assert.assertTrue(cub.weeklyAd.uiObject.storeName().exists());
            Assert.assertTrue(cub.weeklyAd.uiObject.addressLine1().exists());
            Assert.assertTrue(cub.weeklyAd.uiObject.addressLine2().exists());
            Assert.assertTrue(cub.weeklyAd.uiObject.distance().exists());
        }
    }

}
