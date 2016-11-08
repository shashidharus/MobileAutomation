package api.apps.cub.WeeklyAd;

import api.android.Android;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by ssha05u on 11/7/2016.
 */
public class WeeklyAd implements Activity{

    public WeeklyAdUiObjects uiObject = new WeeklyAdUiObjects();

    public void tapMenu(){
        try{
            MyLogger.log.info("Tapping on 3 line menu button");
            uiObject.menu().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on menu item. Element absent or disabled");
        }
    }
    public void tapSearch(){
        try{
            MyLogger.log.info("Tapping on Search");
            uiObject.search().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on my store item. Element absent or disabled");
        }
    }
    public void tapTStoreLayout(){
        try{
            MyLogger.log.info("Tapping on a Store");
            uiObject.storeLayout().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap on This Week's Ad. Element absent or disabled");
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

    @Override
    public Object waitToLoad() {
        try{
            MyLogger.log.info("Waiting for Weekly Ad activity");
            uiObject.shoppingList().waitToAppear(10);
            return Android.app.cub.weeklyAd;
        }catch (NoSuchElementException e){
            throw new AssertionError("Weekly ad not available at the moment");
        }
    }
}
