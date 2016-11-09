package tests;

import api.android.Android;
import api.apps.cub.Cub;
import core.managers.TestManager;
/*import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;*/
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by ssha05u on 10/26/2016.
 */
@Listeners({TestManager.class})
public class Navigation extends TestManager {

    private static Cub cub = Android.app.cub;

    @BeforeClass
    public static void beforeClass() {
        cub.open();
    }

    @BeforeTest
    public void before() {
        testInfo.suite("Navigation");
    }

    /*Check to see if all home UI components exists*/
    @Test(groups = {"g1"})
    public void home() {
        cub.home.waitToLoad();
        testInfo.id("home").name("Verify that Home Activity has all the elements");
        if (!cub.home.uiObject.addItem().exists())
            Assert.assertTrue(cub.home.uiObject.findItem().exists());
        else if (!cub.home.uiObject.findItem().exists())
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

    /*Check to see if all Menu UI components exists*/
    @Test(dependsOnMethods = {"home"})
    public void menu() {
        cub.home.uiObject.menu().waitToAppear(5).tap();
        testInfo.id("menu").name("Verify that menu activity has all elements");
        Assert.assertTrue(cub.menu.uiObject.cub().exists());
        Assert.assertTrue(cub.menu.uiObject.weeklyAd().exists());
        Assert.assertTrue(cub.menu.uiObject.coupons().exists());
        Assert.assertTrue(cub.menu.uiObject.myCubRewards().exists());
        Assert.assertTrue(cub.menu.uiObject.shoppingList().exists());
        Assert.assertTrue(cub.menu.uiObject.productLocator().exists());
        Assert.assertTrue(cub.menu.uiObject.prescriptionRefill().exists());
        cub.menu.scrollDown();
        //commented as scroll functionality needs to be written

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

    /*Check to see if all Weekly Ad UI components exists*/
    @Test(dependsOnMethods = {"home"})
    public void weeklyAd() {
        if (!cub.menu.uiObject.cub().exists())
            cub.home.uiObject.menu().waitToAppear(5).tap();
        cub.menu.uiObject.weeklyAd().waitToAppear(5).tap();
        testInfo.id("weeklyAd").name("Verify that Weekly Ad has all elements");
        Assert.assertTrue(cub.weeklyAd.uiObject.menu().exists());
        Assert.assertTrue(cub.weeklyAd.uiObject.shoppingList().exists());
        if (cub.weeklyAd.uiObject.adAvailability().exists()) {
            Assert.assertTrue(cub.weeklyAd.uiObject.adAvailability().exists());
            Assert.assertTrue(cub.weeklyAd.uiObject.weeklySavings().exists());
            Assert.assertTrue(cub.weeklyAd.uiObject.couponPreview().exists());
        } else {
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

    /*Check to see if all Coupons UI components exists*/
    @Test(dependsOnMethods = {"home"})
    public void coupons() {
        if (!cub.menu.uiObject.cub().exists())
            cub.home.uiObject.menu().waitToAppear(5).tap();
        cub.menu.uiObject.coupons().waitToAppear(5).tap();
        testInfo.id("coupons").name("Verify that Coupons has all elements");
        Assert.assertTrue(cub.coupon.uiObject.couponList().exists());
        Assert.assertTrue(cub.coupon.uiObject.shoppingList().exists());
        Assert.assertTrue(cub.coupon.uiObject.headerLabel().exists());
        Assert.assertTrue(cub.coupon.uiObject.signIn().exists());
        Assert.assertTrue(cub.coupon.uiObject.filter().exists());
        Assert.assertTrue(cub.coupon.uiObject.searchCoupon().exists());
    }

    /*Check to see if all My Cub Rewards UI components exists*/
    @Test(dependsOnMethods = {"home"})
    public void myCubRewards() {
        testInfo.id("myCubRewards").name("Verify that My Cub Rewards has all elements");
        if (!cub.menu.uiObject.cub().exists())
            cub.home.uiObject.menu().waitToAppear(5).tap();
        cub.menu.uiObject.myCubRewards().waitToAppear(5).tap();
        Assert.assertTrue(cub.myCubRewards.uiObject.cancelActivity().exists());
        Assert.assertTrue(cub.myCubRewards.uiObject.signInWith().exists());
        Assert.assertTrue(cub.myCubRewards.uiObject.fbButton().exists());
        Assert.assertTrue(cub.myCubRewards.uiObject.orText().exists());
        Assert.assertTrue(cub.myCubRewards.uiObject.username().exists());
        Assert.assertTrue(cub.myCubRewards.uiObject.password().exists());
        Assert.assertTrue(cub.myCubRewards.uiObject.passwordRemind().exists());
        Assert.assertTrue(cub.myCubRewards.uiObject.needAccount().exists());
        Assert.assertTrue(cub.myCubRewards.uiObject.signUp().exists());
        Assert.assertTrue(cub.myCubRewards.uiObject.signInButton().exists());
        Assert.assertTrue(cub.myCubRewards.uiObject.terms().exists());
        Assert.assertTrue(cub.myCubRewards.uiObject.termsNotice().exists());
        Assert.assertTrue(cub.myCubRewards.uiObject.privacy().exists());
    }

    /*Check to see if all Shopping List UI components exists*/
    @Test(dependsOnMethods = {"home"})
    public void shoppingList() {
        if (!cub.menu.uiObject.cub().exists())
            cub.home.uiObject.menu().waitToAppear(5).tap();
        cub.menu.uiObject.shoppingList().waitToAppear(5).tap();
        testInfo.id("shoppingList").name("Verify that Shopping List has all elements");
        Assert.assertTrue(cub.shoppingList.uiObject.back().exists());
        Assert.assertTrue(cub.shoppingList.uiObject.myShoppingList().exists());
        Assert.assertTrue(cub.shoppingList.uiObject.editIcon().exists());
        Assert.assertTrue(cub.shoppingList.uiObject.addItem().exists());
        Assert.assertTrue(cub.shoppingList.uiObject.barcodeScan().exists());
    }
}
