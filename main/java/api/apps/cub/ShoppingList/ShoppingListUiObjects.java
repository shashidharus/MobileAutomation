package api.apps.cub.ShoppingList;

import core.UiObject;
import core.UiSelector;

/**
 * Created by ssha05u on 11/7/2016.
 */
public class ShoppingListUiObjects {

    private static UiObject
            myStore,
            purchased,
            itemName,
            noItemsTxtView,
            editIcon,addItem,back,barcodeScan,myShoppingList;

    public UiObject addItem(){
        if(addItem == null)
            addItem = new UiSelector().resourceId("com.supervalu.android.cub:id/editSearchItemNotLoggedIn").makeUiObject();
        return addItem;
    }

    public UiObject myShoppingList(){
        if(myShoppingList == null)
            myShoppingList = new UiSelector().resourceId("com.supervalu.android.cub:id/txtTitle").makeUiObject();
        return myShoppingList;
    }

    public UiObject barcodeScan(){
        if(barcodeScan == null)
            barcodeScan = new UiSelector().resourceId("com.supervalu.android.cub:id/imgScannerNotLoggedIn").makeUiObject();
        return barcodeScan;
    }

    public UiObject editIcon(){
        if(editIcon == null)
            editIcon = new UiSelector().resourceId("com.supervalu.android.cub:id/editIcon").makeUiObject();
        return editIcon;
    }

    public UiObject noItemsTxtView(){
        if(noItemsTxtView == null)
            noItemsTxtView = new UiSelector().resourceId("com.supervalu.android.cub:id/txtvwNoItemsinList").makeUiObject();
        return noItemsTxtView;
    }

    public UiObject itemName(){
        if(itemName == null)
            itemName = new UiSelector().resourceId("com.supervalu.android.cub:id/txtitemName").makeUiObject();
        return itemName;
    }

    public UiObject purchased(){
        if(purchased == null)
            purchased = new UiSelector().resourceId("com.supervalu.android.cub:id/chkPurchasedFlag").makeUiObject();
        return purchased;
    }

    public UiObject back(){
        if(back == null)
            back = new UiSelector().resourceId("com.supervalu.android.cub:id/imgBanner_list").makeUiObject();
        return back;
    }
}
