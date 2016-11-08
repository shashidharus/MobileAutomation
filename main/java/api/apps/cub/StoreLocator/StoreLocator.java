package api.apps.cub.StoreLocator;

import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by ssha05u on 11/7/2016.
 */
public class StoreLocator {

    public StoreLocatorUiObjects  uiObject = new StoreLocatorUiObjects();

    public void tapAllow() {
        try {
            MyLogger.log.info("Tapping on Allow");
            uiObject.allow().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Allow. Element absent or disabled");
        }
    }

    public void tapDeny() {
        try {
            MyLogger.log.info("Tapping on Deny");
            uiObject.deny().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Deny. Element absent or disabled");
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

    public void tapListTab() {
        try {
            MyLogger.log.info("Tapping on List tab");
            uiObject.listTab().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on List tab. Element absent or disabled");
        }
    }

    public void tapMapTab() {
        try {
            MyLogger.log.info("Tapping on Map tab");
            uiObject.mapTab().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Map tab. Element absent or disabled");
        }
    }

    public void tapSearch() {
        try {
            MyLogger.log.info("Tapping on Search icon");
            uiObject.search().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Search icon. Element absent or disabled");
        }
    }
}
