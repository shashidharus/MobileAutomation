package api.apps.cub;

import api.android.Android;
import api.interfaces.Application;

/**
 * Created by ssha05u on 10/19/2016.
 */
public class Cub implements Application{
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
