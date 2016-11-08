package api.apps.cub.WeeklyAd;

import api.apps.cub.CommonStoreUiObjects;
import api.apps.cub.CommonUiObjects;
import core.UiObject;
import core.UiSelector;

/**
 * Created by ssha05u on 11/7/2016.
 */
public class WeeklyAdUiObjects extends CommonStoreUiObjects {

    private static UiObject
            couponPreview,
            weeklySavings, adAvailability;


    public UiObject couponPreview() {
        if (couponPreview == null)
            couponPreview = new UiSelector().resourceId("com.supervalu.android.cub:id/coupon_preview_image").makeUiObject();
        return couponPreview;
    }

    public UiObject weeklySavings() {
        if (weeklySavings == null)
            weeklySavings = new UiSelector().resourceId("com.supervalu.android.cub:id/weeks_ad_text").text("Weekly Savings").makeUiObject();
        return weeklySavings;
    }

    public UiObject adAvailability() {
        if (adAvailability == null)
            adAvailability = new UiSelector().resourceId("com.supervalu.android.cub:id/weeksAdAvailability").makeUiObject();
        return adAvailability;
    }

}
