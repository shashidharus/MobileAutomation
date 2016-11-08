package api.apps.cub;

import core.UiObject;
import core.UiSelector;

/**
 * Created by ssha05u on 11/7/2016.
 */
public abstract class CommonUiObjects {

    private static UiObject
            search,
            shoppingList,menu;

    public UiObject menu(){
        if(menu == null)
            menu = new UiSelector().resourceId("com.supervalu.android.cub:id/imgBanner_list").makeUiObject();
        return menu;
    }

    public UiObject search(){
        if(search == null)
            search = new UiSelector().resourceId("com.supervalu.android.cub:id/imgvwSearch").makeUiObject();
        return search;
    }
    public UiObject shoppingList(){
        if(shoppingList == null)
            shoppingList = new UiSelector().resourceId("com.supervalu.android.cub:id/icnlistoptions").makeUiObject();
        return shoppingList;
    }
}
