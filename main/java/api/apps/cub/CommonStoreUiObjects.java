package api.apps.cub;

import core.UiObject;
import core.UiSelector;

/**
 * Created by ssha05u on 11/7/2016.
 */
public abstract class CommonStoreUiObjects extends CommonUiObjects {

    public static UiObject selectAStore,
            storesList,
            storeLayout,
            storeName, addressLine1, addressLine2, distance;

    public UiObject storeLayout() {
        if (storeLayout == null)
            storeLayout = new UiSelector().resourceId("com.supervalu.android.cub:id/cont_store").makeUiObject();
        return storeLayout;
    }

    public UiObject selectAStore() {
        if (selectAStore == null)
            selectAStore = new UiSelector().resourceId("com.supervalu.android.cub:id/select_store_header").text("Select a store").makeUiObject();
        return selectAStore;
    }

    public UiObject storeList() {
        if (storesList == null)
            storesList = new UiSelector().resourceId("com.supervalu.android.cub:id/stores_list").makeUiObject();
        return storesList;
    }

    public UiObject storeName() {
        if (storeName == null)
            storeName = new UiSelector().resourceId("com.supervalu.android.cub:id/txtStoreName").makeUiObject();
        return storeName;
    }

    public UiObject addressLine1() {
        if (addressLine1 == null)
            addressLine1 = new UiSelector().resourceId("com.supervalu.android.cub:id/txtAdressLine1").makeUiObject();
        return addressLine1;
    }

    public UiObject addressLine2() {
        if (addressLine2 == null)
            addressLine2 = new UiSelector().resourceId("com.supervalu.android.cub:id/txtAdressLine2").makeUiObject();
        return addressLine2;
    }

    public UiObject distance() {
        if (distance == null)
            distance = new UiSelector().resourceId("com.supervalu.android.cub:id/txtDistance").makeUiObject();
        return distance;
    }
}
