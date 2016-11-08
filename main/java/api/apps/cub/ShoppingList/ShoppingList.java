package api.apps.cub.ShoppingList;

import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by ssha05u on 11/7/2016.
 */
public class ShoppingList {

    public ShoppingListUiObjects uiObject = new ShoppingListUiObjects();

    public void tapMenu() {
        try {
            MyLogger.log.info("Tapping on menu button");
            uiObject.back().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on menu item. Element absent or disabled");
        }
    }
    public void tapEditIcon() {
        try {
            MyLogger.log.info("Tapping on Edit Shopping List");
            uiObject.editIcon().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Edit Shopping List. Element absent or disabled");
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
    public void tapMyShoppingList() {
        try {
            MyLogger.log.info("Tapping on My Shopping List");
            uiObject.myShoppingList().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on My Shopping List. Element absent or disabled");
        }
    }
}
