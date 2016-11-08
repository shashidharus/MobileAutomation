package api.apps.cub.MyStore;

import api.apps.cub.CommonStoreUiObjects;
import core.UiObject;
import core.UiSelector;

/**
 * Created by ssha05u on 11/7/2016.
 */
public class MyStoreUiObjects extends CommonStoreUiObjects {
    private static UiObject
            listTab, mapTab,setMyStore,
            storeInfo, setStoreInfo, getDirections, storeMap, phoneNumbers, imgPhone, mainStore, phoneVlaue, hours, storeHours,
            storeHoursValue, departments, all, deli, floral, pharmacy, serviceDesk, banking, bakery, organic;


    public UiObject listTab() {
        if (listTab == null)
            listTab = new UiSelector().resourceId("com.supervalu.android.cub:id/salectedList").text("LIST").makeUiObject();
        return listTab;
    }

    public UiObject mapTab() {
        if (mapTab == null)
            mapTab = new UiSelector().resourceId("com.supervalu.android.cub:id/tabMap").text("Map").makeUiObject();
        return mapTab;
    }

    public UiObject storeInfo() {
        if (storeInfo == null)
            storeInfo = new UiSelector().resourceId("com.supervalu.android.cub:id/llStoreInfoAddress").makeUiObject();
        return storeInfo;
    }

    public UiObject setStoreInfo() {
        if (setStoreInfo == null)
            setStoreInfo = new UiSelector().resourceId("com.supervalu.android.cub:id/llStoreInfoSetStore").makeUiObject();
        return setStoreInfo;
    }

    public UiObject setMyStore() {
        if (setMyStore == null)
            setMyStore = new UiSelector().resourceId("com.supervalu.android.cub:id/chcktxtvwSetMyStore").makeUiObject();
        return setMyStore;
    }

    public UiObject getDirections() {
        if (getDirections == null)
            getDirections = new UiSelector().resourceId("com.supervalu.android.cub:id/btnGetDirections").text("GET DIRECTIONS").makeUiObject();
        return getDirections;
    }

    public UiObject storeMap() {
        if (storeMap == null)
            storeMap = new UiSelector().resourceId("com.supervalu.android.cub:id/btnGetMap").text("STORE MAP").makeUiObject();
        return storeMap;
    }

    public UiObject phoneNumbers() {
        if (phoneNumbers == null)
            phoneNumbers = new UiSelector().resourceId("com.supervalu.android.cub:id/txtPhoneNumber").text("PHONE NUMBERS").makeUiObject();
        return phoneNumbers;
    }

    public UiObject imgPhone() {
        if (imgPhone == null)
            imgPhone = new UiSelector().resourceId("com.supervalu.android.cub:id/imgMainPhoneValue").makeUiObject();
        return imgPhone;
    }

    public UiObject mainStore() {
        if (mainStore == null)
            mainStore = new UiSelector().resourceId("com.supervalu.android.cub:id/txtMainPhone").text("Main Store").makeUiObject();
        return mainStore;
    }

    public UiObject phoneVlaue() {
        if (phoneVlaue == null)
            phoneVlaue = new UiSelector().resourceId("com.supervalu.android.cub:id/txtMainPhoneValue").makeUiObject();
        return phoneVlaue;
    }

    public UiObject hours() {
        if (hours == null)
            hours = new UiSelector().resourceId("com.supervalu.android.cub:id/txtHours").text("HOURS").makeUiObject();
        return hours;
    }

    public UiObject storeHours() {
        if (storeHours == null)
            storeHours = new UiSelector().resourceId("com.supervalu.android.cub:id/txtStoreHours").text("Main Store").makeUiObject();
        return storeHours;
    }

    public UiObject storeHoursValue() {
        if (storeHoursValue == null)
            storeHoursValue = new UiSelector().resourceId("com.supervalu.android.cub:id/txtDepartments").makeUiObject();
        return storeHoursValue;
    }

    public UiObject departments() {
        if (departments == null)
            departments = new UiSelector().resourceId("com.supervalu.android.cub:id/txtDistance").text("DEPARTMENTS & SERVICES").makeUiObject();
        return departments;
    }

    public UiObject all() {
        if (all == null)
            all = new UiSelector().text("ALL").makeUiObject();
        return all;
    }
    public UiObject deli() {
        if (deli == null)
            deli = new UiSelector().text("Deli").makeUiObject();
        return deli;
    }
    public UiObject floral() {
        if (floral == null)
            floral = new UiSelector().text("Floral").makeUiObject();
        return floral;
    }
    public UiObject pharmacy() {
        if (pharmacy == null)
            pharmacy = new UiSelector().text("Pharmacy").makeUiObject();
        return pharmacy;
    }
    public UiObject serviceDesk() {
        if (serviceDesk == null)
            serviceDesk = new UiSelector().text("Service Desk").makeUiObject();
        return serviceDesk;
    }
    public UiObject banking() {
        if (banking == null)
            banking = new UiSelector().text("Banking").makeUiObject();
        return banking;
    }
    public UiObject bakery() {
        if (bakery == null)
            bakery = new UiSelector().text("Bakery").makeUiObject();
        return bakery;
    }
    public UiObject organic() {
        if (organic == null)
            organic = new UiSelector().text("Organic").makeUiObject();
        return organic;
    }
}
