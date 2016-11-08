package api.apps.cub.ProductLocator;

import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by ssha05u on 11/7/2016.
 */
public class ProductLocator {

    public ProductLocatorUiObjects uiObject = new ProductLocatorUiObjects();

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

    public void tapChangeStore() {
        try {
            MyLogger.log.info("Tapping on Change Store Link");
            uiObject.changeStore().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Change Store Link. Element absent or disabled");
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

}
