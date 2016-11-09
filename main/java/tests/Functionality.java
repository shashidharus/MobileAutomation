package tests;

import api.android.Android;
import api.apps.cub.Cub;
import core.managers.TestManager;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by ssha05u on 10/26/2016.
 */
public class Functionality extends TestManager {

    private static Cub cub = Android.app.cub;

    @Test (dependsOnGroups={"g1"})
    public void test4(){
        testInfo.id("test4").suite("Functionality").name("Verify that you can Test Again");
        cub.home.uiObject.menu().waitToAppear(5).tap();
        cub.menu.uiObject.cub().waitToAppear(5).tap();
        Assert.assertTrue(cub.home.uiObject.findItem().exists());
        //Assert.assertTrue(cub.home.uiObject.barcodeScan().exists());
        Assert.assertTrue(cub.home.uiObject.carousel().exists());
        //Assert.assertTrue(cub.home.uiObject.cubRewards().exists());
        Assert.assertTrue(cub.home.uiObject.featuredCoupons().exists());
        Assert.assertTrue(cub.home.uiObject.menu().exists());
        Assert.assertTrue(cub.home.uiObject.myStore().exists());
        Assert.assertTrue(cub.home.uiObject.shoppingList().exists());
        Assert.assertTrue(cub.home.uiObject.thisWeeksAd().exists());
    }
}
