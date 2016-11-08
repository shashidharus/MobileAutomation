package api.apps.cub.Menu;

import api.android.Android;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by ssha05u on 10/25/2016.
 */
public class Menu implements Activity{
    
    public MenuUiObjects uiObject = new MenuUiObjects();

    public void tapCub(){
        try{
            MyLogger.log.info("Tapping on Cub sign");
            uiObject.cub().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on Cub sign. Element absent or disabled");
        }
    }
    public void tapWeeklyAd(){
        try{
            MyLogger.log.info("Tapping on weekly Ad");
            uiObject.weeklyAd().tap(); 
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on weekly Ad. Element absent or disabled");
        }
    }
    public void tapCoupons(){
        try{
            MyLogger.log.info("Tapping on Ccoupons");
            uiObject.coupons().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on Coupon. Element absent or disabled");
        }
    }
    public void tapMyCubRewards(){
        try{
            MyLogger.log.info("Tapping on My Cub Rewards");
            uiObject.myCubRewards().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on My Cub Rewards. Element absent or disabled");
        }
    }
    public void tapShoppingList(){
        try{
            MyLogger.log.info("Tapping on Shopping List");
            uiObject.shoppingList().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on Shopping List. Element absent or disabled");
        }
    }
    public void tapProductLocator(){
        try{
            MyLogger.log.info("Tapping on Product Locator");
            uiObject.productLocator().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on Product Locator. Element absent or disabled");
        }
    }
    public void tapPrescriptionRefill(){
        try{
            MyLogger.log.info("Tapping on Prescription Refill");
            uiObject.cub().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on Prescription Refill. Element absent or disabled");
        }
    }
    public void tapMyStore(){
        try{
            MyLogger.log.info("Tapping on My Store");
            uiObject.myStore().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on My Store. Element absent or disabled");
        }
    }
    public void tapStoreLocator(){
        try{
            MyLogger.log.info("Tapping on Store Locator");
            uiObject.storeLocator().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on Store Locator. Element absent or disabled");
        }
    }
    public void tapMyAccount(){
        try{
            MyLogger.log.info("Tapping on My Account");
            uiObject.myAccount().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on My Account. Element absent or disabled");
        }
    }
    public void tapFaqs(){
        try{
            MyLogger.log.info("Tapping on FAQs");
            uiObject.faqs().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on FAQs. Element absent or disabled");
        }
    }
    public void tapContactUs(){
        try{
            MyLogger.log.info("Tapping on Contact Us");
            uiObject.contactUs().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on Contact Us. Element absent or disabled");
        }
    }
    public void tapRewardsProgramDetails(){
        try{
            MyLogger.log.info("Tapping on Rewards Program Details");
            uiObject.rewardsProgramDetails().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on Rewards Program Details. Element absent or disabled");
        }
    }
    public void tapPrivacyPolicy(){
        try{
            MyLogger.log.info("Tapping on Cub sign");
            uiObject.privacyPolicy().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on Cub sign. Element absent or disabled");
        }
    }
    public void tapTermsOfUse(){
        try{
            MyLogger.log.info("Tapping on Terms Of Use");
            uiObject.termsOfUse().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on Terms Of Use. Element absent or disabled");
        }
    }

    @Override
    public Menu waitToLoad() {
        try{
            MyLogger.log.info("Waiting for menu activity");
            uiObject.cub().waitToAppear(10);
            return Android.app.cub.menu;
        }catch (NoSuchElementException e){
            throw new AssertionError("");
        }
    }
}
