package core;

/**
 * Created by ssha05u on 10/11/2016.
 */
public class UiSelector {
    private String locator = "new UiSelector()";

    public UiSelector resourceId(String value){
        locator += ".resourceId(\""+value+"\")";
        return this;
    }
    public UiSelector className(String value){
        locator += ".className(\""+value+"\")";
        return this;
    }
    public UiSelector classNameMatches(String value){
        locator += ".classNameMatches(\""+value+"\")";
        return this;
    }
    public UiSelector text(String value){
        locator += ".text(\""+value+"\")";
        return this;
    }
    public UiSelector textContains(String value){
        locator += ".textContains(\""+value+"\")";
        return this;
    }
    public UiSelector index(int value){
        locator += ".index("+value+")";
        return this;
    }
    public UiSelector clickable(boolean value){
        locator += ".clickable("+value+")";
        return this;
    }
    public UiSelector checked(boolean value){
        locator += ".checked("+value+")";
        return this;
    }
    public UiSelector enabled(boolean value){
        locator += ".enabled("+value+")";
        return this;
    }
    public UiSelector description(String value){
        locator += ".description(\""+value+"\")";
        return this;
    }
    public UiSelector descriptionContains(String value){
        locator += ".descriptionContains(\""+value+"\")";
        return this;
    }
    public UiSelector descriptionMatches(String value){
        locator += ".descriptionMatches(\""+value+"\")";
        return this;
    }
    public UiSelector xPath(String value){
        locator = value;
        return this;
    }
    public UiObject makeUiObject(){
        return new UiObject(locator);
    }

}
