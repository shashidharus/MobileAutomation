package api.apps.cub.ProductLocator;

import api.apps.cub.CommonStoreUiObjects;
import api.apps.cub.CommonUiObjects;
import core.UiObject;
import core.UiSelector;

/**
 * Created by ssha05u on 11/7/2016.
 */
public class ProductLocatorUiObjects extends CommonStoreUiObjects {
    private static UiObject
            findItem, storeTitle, changeStore, mapView, permission, allow, deny;

    private String permissionMessage = "Allow Cub Foods to access this device's location?";

    public UiObject findItem() {
        if (findItem == null)
            findItem = new UiSelector().resourceId("com.supervalu.android.cub:id/findItem").makeUiObject();
        return findItem;
    }

    public UiObject storeTitle() {
        if (storeTitle == null)
            storeTitle = new UiSelector().resourceId("com.supervalu.android.cub:id/storeTitle").makeUiObject();
        return storeTitle;
    }

    public UiObject changeStore() {
        if (changeStore == null)
            changeStore = new UiSelector().resourceId("com.supervalu.android.cub:id/changeStore").text("Change >").makeUiObject();
        return changeStore;
    }

    public UiObject permission() {
        if (permission == null)
            permission = new UiSelector().resourceId("com.android.packageinstaller:id/permission_message").text(permissionMessage).makeUiObject();
        return permission;
    }

    public UiObject allow() {
        if (allow == null)
            allow = new UiSelector().resourceId("com.android.packageinstaller:id/permission_allow_button").text("Allow").makeUiObject();
        return allow;
    }

    public UiObject deny() {
        if (deny == null)
            deny = new UiSelector().resourceId("com.android.packageinstaller:id/permission_deny_button").text("Deny").makeUiObject();
        return deny;
    }

    public UiObject mapView() {
        if (mapView == null)
            mapView = new UiSelector().resourceId("com.supervalu.android.cub:id/store_map_view").makeUiObject();
        return mapView;
    }

}
