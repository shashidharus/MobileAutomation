package api.apps.cub.Home;

import api.android.Android;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by ssha05u on 10/20/2016.
 */
public class Home implements Activity {

    public HomeUiObjects uiObject = new HomeUiObjects();

    public void tapMenu() {
        try {
            MyLogger.log.info("Tapping on 3 line menu button");
            uiObject.menu().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on menu item. Element absent or disabled");
        }
    }

    public void tapMyStore() {
        try {
            MyLogger.log.info("Tapping on My Store");
            uiObject.myStore().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on my store item. Element absent or disabled");
        }
    }

    public void tapCubRewards() {
        try {
            MyLogger.log.info("Tapping on Cub Rewards");
            uiObject.cubRewards().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Cub Rewards. Element absent or disabled");
        }
    }

    public void tapThisWeeksAd() {
        try {
            MyLogger.log.info("Tapping on This Week's Ad");
            uiObject.thisWeeksAd().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on This Week's Ad. Element absent or disabled");
        }
    }

    public void tapFeaturedCoupons() {
        try {
            MyLogger.log.info("Tapping on Featured Coupon");
            uiObject.featuredCoupons().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Featured Coupon. Element absent or disabled");
        }
    }

    public void tapFindItem() {
        try {
            MyLogger.log.info("Tapping on Find Item");
            uiObject.findItem().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Find Item. Element absent or disabled");
        }
    }

    public void tapAddItem() {
        try {
            MyLogger.log.info("Tapping on Add Item");
            uiObject.addItem().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Add Item. Element absent or disabled");
        }
    }

    public void tapBarcodeScan() {
        try {
            MyLogger.log.info("Tapping on Barcode Scan");
            uiObject.barcodeScan().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Barcode Scan. Element absent or disabled");
        }
    }

    public void tapShoppingList() {
        try {
            MyLogger.log.info("Tapping on Shopping List");
            uiObject.shoppingList().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Shopping List. Element absent or disabled");
        }
    }

    @Override
    public Object waitToLoad() {
        try {
            MyLogger.log.info("Waiting for home activity");
            uiObject.carousel().waitToAppear(15);
            return Android.app.cub.home;
        } catch (NoSuchElementException e) {
            throw new AssertionError("");
        }
    }
}
