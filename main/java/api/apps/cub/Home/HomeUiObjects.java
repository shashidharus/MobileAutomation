package api.apps.cub.Home;

import core.UiObject;
import core.UiSelector;

/**
 * Created by ssha05u on 10/20/2016.
 */
public class HomeUiObjects {

    private static UiObject
            myStore,
            cubRewards,
            thisWeeksAd,addItem,
            featuredCoupons,
            carousel, findItem,menu,barcodeScan,shoppingList;

    public UiObject myStore(){
        if(myStore == null)
            myStore = new UiSelector().resourceId("com.supervalu.android.cub:id/frag_tab").makeUiObject();
        return myStore;
    }
    public UiObject cubRewards(){
        if(cubRewards == null)
            cubRewards = new UiSelector().resourceId("com.supervalu.android.cub:id/rewards_tab_layout").makeUiObject();
        return cubRewards;
    }
    public UiObject thisWeeksAd(){
        if(thisWeeksAd == null)
            thisWeeksAd = new UiSelector().resourceId("com.supervalu.android.cub:id/weeklyad_img").makeUiObject();
        return thisWeeksAd;
    }
    public UiObject featuredCoupons(){
        if(featuredCoupons == null)
            featuredCoupons = new UiSelector().resourceId("com.supervalu.android.cub:id/couponImg1").makeUiObject();
        return featuredCoupons;
    }
    public UiObject carousel(){
        if(carousel == null)
            carousel = new UiSelector().resourceId("com.supervalu.android.cub:id/carousel_image_display").makeUiObject();
        return carousel;
    }
    public UiObject findItem(){
        if(findItem == null)
            findItem = new UiSelector().resourceId("com.supervalu.android.cub:id/editSearchItemNotLoggedIn").makeUiObject();
        return findItem;
    }


    public UiObject addItem(){
        if(addItem == null)
            addItem = new UiSelector().resourceId("com.supervalu.android.cub:id/editAddItemNotLoggedIn").makeUiObject();
        return addItem;
    }

    public UiObject menu(){
        if(menu == null)
            menu = new UiSelector().resourceId("com.supervalu.android.cub:id/imgBanner_list").makeUiObject();
        return menu;
    }
    public UiObject barcodeScan(){
        if(barcodeScan == null)
            barcodeScan = new UiSelector().resourceId("com.supervalu.android.cub:id/imgScannerNotLoggedIn").makeUiObject();
        return barcodeScan;
    }
    public UiObject shoppingList(){
        if(shoppingList == null)
            shoppingList = new UiSelector().resourceId("com.supervalu.android.cub:id/icnlistoptions").makeUiObject();
        return shoppingList;
    }
}
