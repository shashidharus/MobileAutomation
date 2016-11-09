package api.apps.cub.Menu;

import core.UiObject;
import core.UiSelector;

/**
 * Created by ssha05u on 10/25/2016.
 */
public class MenuUiObjects {

    private static UiObject
            menuList,
            cub,
            weeklyAd,
            coupons,
            myCubRewards,
            shopppingList,
            productLocator,
            prescriptionRefill,
            storeLocator,
            myStore,
            myAccount,
            faqs,
            contactUs,
            rewardsProgramDetails,
            privacyPolicy,
            termsOfUse;


    public UiObject menuList(){
        if(menuList == null)
            menuList = new UiSelector().resourceId("com.supervalu.android.cub:id/nav_listview_logged_out").makeUiObject();
        return menuList;
    }
    public UiObject cub(){
        if(cub == null)
            cub = new UiSelector().resourceId("com.supervalu.android.cub:id/landing_page_toggle").makeUiObject();
        return cub;
    }
    public UiObject weeklyAd(){
        if(weeklyAd == null)
            weeklyAd = new UiSelector().resourceId("com.supervalu.android.cub:id/nav_list_item_text").text("Weekly Ad").makeUiObject();
        return weeklyAd;
    }
    public UiObject coupons(){
        if(coupons == null)
            coupons = new UiSelector().text("Coupons").makeUiObject();
        return coupons;
    }
    public UiObject myCubRewards(){
        if(myCubRewards == null)
            myCubRewards = new UiSelector().text("My Cub Rewards").makeUiObject();
        return myCubRewards;
    }
    public UiObject shoppingList(){
        if(shopppingList == null)
            shopppingList = new UiSelector().text("Shopping List").makeUiObject();
        return shopppingList;
    }
    public UiObject productLocator(){
        if(productLocator == null)
            productLocator = new UiSelector().text("Product Locator").makeUiObject();
        return productLocator;
    }
    public UiObject prescriptionRefill(){
        if(prescriptionRefill == null)
            prescriptionRefill = new UiSelector().text("Prescription Refill").makeUiObject();
        return prescriptionRefill;
    }
    public UiObject storeLocator(){
        if(storeLocator == null)
            storeLocator = new UiSelector().text("Store Locator").makeUiObject();
        return storeLocator;
    }
    public UiObject myStore(){
        if(myStore == null)
            myStore = new UiSelector().text("My Store").makeUiObject();
        return myStore;
    }
    public UiObject myAccount(){
        if(myAccount == null)
            myAccount = new UiSelector().text("My Account").makeUiObject();
        return myAccount;
    }
    public UiObject faqs(){
        if(faqs == null)
            faqs = new UiSelector().text("FAQ'S").makeUiObject();
        return faqs;
    }
    public UiObject contactUs(){
        if(contactUs == null)
            contactUs = new UiSelector().text("Contact Us").makeUiObject();
        return contactUs;
    }
    public UiObject rewardsProgramDetails(){
        if(rewardsProgramDetails == null)
            rewardsProgramDetails = new UiSelector().text("Rewards Program Details").makeUiObject();
        return rewardsProgramDetails;
    }
    public UiObject privacyPolicy(){
        if(privacyPolicy == null)
            privacyPolicy = new UiSelector().text("Privacy Policy").makeUiObject();
        return privacyPolicy;
    }
    public UiObject termsOfUse(){
        if(termsOfUse == null)
            termsOfUse = new UiSelector().text("Terms of Use").makeUiObject();
        return termsOfUse;
    }

}
