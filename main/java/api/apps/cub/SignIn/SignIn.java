package api.apps.cub.SignIn;

import core.MyLogger;
import core.UiObject;
import core.UiSelector;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by ssha05u on 11/7/2016.
 */
public class SignIn {

    public SignInUiObjects uiObject = new SignInUiObjects();

    public void tapFbButton() {
        try {
            MyLogger.log.info("Tapping on FB button");
            uiObject.fbButton().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on FB button. Element absent or disabled");
        }
    }

    public void tapUsername() {
        try {
            MyLogger.log.info("Tapping on Username Field");
            uiObject.username().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Username Field. Element absent or disabled");
        }
    }

    public void tapPassword() {
        try {
            MyLogger.log.info("Tapping on Password Field");
            uiObject.password().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Password Field. Element absent or disabled");
        }
    }

    public void tapRemindPassword() {
        try {
            MyLogger.log.info("Tapping on Remind Password icon");
            uiObject.passwordRemind().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Password icon. Element absent or disabled");
        }
    }

    public void tapSignUp() {
        try {
            MyLogger.log.info("Tapping on Sign Up Link");
            uiObject.signUp().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Sign Up Link. Element absent or disabled");
        }
    }

    public void tapSignIn() {
        try {
            MyLogger.log.info("Tapping on Sign In button");
            uiObject.signInButton().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Sign In button. Element absent or disabled");
        }
    }

    public void tapTerms() {
        try {
            MyLogger.log.info("Tapping on Terms Link");
            uiObject.terms().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Terms Link. Element absent or disabled");
        }
    }

    public void tapPrivacy() {
        try {
            MyLogger.log.info("Tapping on Privacy Link");
            uiObject.privacy().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Privacy Link. Element absent or disabled");
        }
    }
}
