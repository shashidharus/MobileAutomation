package api.interfaces;

/**
 * Created by ssha05u on 10/20/2016.
 */
public interface Application {

    void forceStop();
    void clearData();
    String packageID();
    Object open();
    String activityID();
}
