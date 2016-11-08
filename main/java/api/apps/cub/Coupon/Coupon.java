package api.apps.cub.Coupon;

import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by ssha05u on 11/7/2016.
 */
public class Coupon {

    public CouponUiObjects uiObject = new CouponUiObjects();

    public void tapSignIn(){
        try{
            MyLogger.log.info("Tapping on Sign In button");
            uiObject.signIn().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on Sign In button. Element absent or disabled");
        }
    }

    public void tapMenu(){
        try{
            MyLogger.log.info("Tapping on 3 line menu button");
            uiObject.menu().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on menu item. Element absent or disabled");
        }
    }

    public void tapBarcodeScan(){
        try{
            MyLogger.log.info("Tapping on Barcode Scan");
            uiObject.barcode().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on Barcode Scan. Element absent or disabled");
        }
    }

    public void tapFilter(){
        try{
            MyLogger.log.info("Tapping on Filter");
            uiObject.filter().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on Filter. Element absent or disabled");
        }
    }

    public void tapSearchCoupon(){
        try{
            MyLogger.log.info("Tapping on Search Coupon");
            uiObject.searchCoupon().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on Search Coupon. Element absent or disabled");
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
}
