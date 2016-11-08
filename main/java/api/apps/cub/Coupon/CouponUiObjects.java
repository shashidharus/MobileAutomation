package api.apps.cub.Coupon;

import api.apps.cub.CommonUiObjects;
import core.UiObject;
import core.UiSelector;

/**
 * Created by ssha05u on 11/7/2016.
 */
public class CouponUiObjects extends CommonUiObjects{

    private static UiObject headerLabel,signIn,barcode,filter,couponList,searchCoupon;

    public UiObject headerLabel() {
        if (headerLabel == null)
            headerLabel = new UiSelector().resourceId("com.supervalu.android.cub:id/header_lable").makeUiObject();
        return headerLabel;
    }
    public UiObject signIn() {
        if (signIn == null)
            signIn = new UiSelector().resourceId("com.supervalu.android.cub:id/sign_in_btn").makeUiObject();
        return signIn;
    }
    public UiObject barcode() {
        if (barcode == null)
            barcode = new UiSelector().resourceId("com.supervalu.android.cub:id/img_scn").makeUiObject();
        return barcode;
    }
    public UiObject filter() {
        if (filter == null)
            filter = new UiSelector().resourceId("com.supervalu.android.cub:id/image_filter").makeUiObject();
        return filter;
    }
    public UiObject couponList() {
        if (couponList == null)
            couponList = new UiSelector().resourceId("com.supervalu.android.cub:id/listviewViewCoupans").makeUiObject();
        return couponList;
    }
    public UiObject searchCoupon() {
        if (searchCoupon == null)
            searchCoupon = new UiSelector().resourceId("com.supervalu.android.cub:id/search_coupons").makeUiObject();
        return searchCoupon;
    }
}
