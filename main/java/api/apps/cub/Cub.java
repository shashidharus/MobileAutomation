package api.apps.cub;

import api.android.Android;
import api.apps.cub.Coupon.Coupon;
import api.apps.cub.Home.Home;
import api.apps.cub.Menu.Menu;
import api.apps.cub.MyCubRewards.MyCubRewards;
import api.apps.cub.ShoppingList.ShoppingList;
import api.apps.cub.WeeklyAd.WeeklyAd;
import api.interfaces.Application;

/**
 * Created by ssha05u on 10/19/2016.
 */
public class Cub implements Application{

    public Home home = new Home();
    public Menu menu = new Menu();
    public WeeklyAd weeklyAd = new WeeklyAd();
    public Coupon coupon = new Coupon();
    public ShoppingList shoppingList = new ShoppingList();

    public MyCubRewards myCubRewards = new MyCubRewards();

    @Override
    public void forceStop() {
        Android.adb.forceStopApp(packageID());
    }

    @Override
    public void clearData() {
        Android.adb.clearAppsData(packageID());
    }

    @Override
    public String packageID() {
        return "com.supervalu.android.cub";
    }

    @Override
    public Object open() {
        Android.adb.openAppsActivity(packageID(),activityID());
        return null;
    }

    @Override
    public String activityID() {
        return "com.supervalu.mobile.android.viewcontrollers.SplashScreenActivity";
    }
}
