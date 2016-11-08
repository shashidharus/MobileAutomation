package api.apps.cub.MyStore;

import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by ssha05u on 11/7/2016.
 */
public class MyStore {

    public MyStoreUiObjects uiObject = new MyStoreUiObjects();

    public void tapGetDirections() {
        try {
            MyLogger.log.info("Tapping on Get Directions button");
            uiObject.getDirections().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Get Directions button. Element absent or disabled");
        }
    }

    public void tapSetMyStore() {
        try {
            MyLogger.log.info("Tapping on to favourite My Store");
            uiObject.setMyStore().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on favourite My Store. Element absent or disabled");
        }
    }

    public void tapStoreMap() {
        try {
            MyLogger.log.info("Tapping on Store Map Button");
            uiObject.storeMap().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Store Map Button. Element absent or disabled");
        }
    }

    public void tapImgPhone() {
        try {
            MyLogger.log.info("Tapping on Phone icon");
            uiObject.imgPhone().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Phone icon. Element absent or disabled");
        }
    }

    public void tapMenu() {
        try {
            MyLogger.log.info("Tapping on 3 line menu button");
            uiObject.menu().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on menu item. Element absent or disabled");
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
}
