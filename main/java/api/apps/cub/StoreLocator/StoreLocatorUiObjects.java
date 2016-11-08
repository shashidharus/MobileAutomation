package api.apps.cub.StoreLocator;

import api.apps.cub.CommonStoreUiObjects;
import core.UiObject;
import core.UiSelector;

/**
 * Created by ssha05u on 11/7/2016.
 */
public class StoreLocatorUiObjects extends CommonStoreUiObjects {

    private static UiObject
            search, listTab, mapTab, permission, allow, deny,
            locationIcon;
    private String permissionMessage = "Allow Cub Foods to access this device's location?";

    public UiObject permission() {
        if (permission == null)
            permission = new UiSelector().resourceId("com.android.packageinstaller:id/permission_message").text(permissionMessage).makeUiObject();
        return permission;
    }

    public UiObject search() {
        if (search == null)
            search = new UiSelector().resourceId("com.supervalu.android.cub:id/edtAdress").makeUiObject();
        return search;
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

    public UiObject mapTab() {
        if (mapTab == null)
            mapTab = new UiSelector().resourceId("com.supervalu.android.cub:id/tabMap").text("MAP").makeUiObject();
        return mapTab;
    }

    public UiObject listTab() {
        if (listTab == null)
            listTab = new UiSelector().resourceId("com.supervalu.android.cub:id/salectedList").text("LIST").makeUiObject();
        return listTab;
    }

    public UiObject locationIcon() {
        if (locationIcon == null)
            locationIcon = new UiSelector().resourceId("com.supervalu.android.cub:id/icnLocation").makeUiObject();
        return locationIcon;
    }
}
