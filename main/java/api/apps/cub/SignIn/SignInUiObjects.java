package api.apps.cub.SignIn;

import core.UiObject;
import core.UiSelector;

/**
 * Created by ssha05u on 11/7/2016.
 */
public class SignInUiObjects {

    private static UiObject signInWith, fbButton, orText, cancelActivity, username, password, passwordRemind,
            needAccount, signUp, signInButton, termsNotice, terms, privacy;

    public UiObject signInWith() {
        if (signInWith == null)
            signInWith = new UiSelector().text("Sign in with").makeUiObject();
        return signInWith;
    }

    public UiObject fbButton() {
        if (fbButton == null)
            fbButton = new UiSelector().resourceId("com.supervalu.android.cub:id/fb_btn").makeUiObject();
        return fbButton;
    }

    public UiObject orText() {
        if (orText == null)
            orText = new UiSelector().resourceId("com.supervalu.android.cub:id/or_text").makeUiObject();
        return orText;
    }

    public UiObject cancelActivity() {
        if (cancelActivity == null)
            cancelActivity = new UiSelector().resourceId("com.supervalu.android.cub:id/cancel_activity_btn").makeUiObject();
        return cancelActivity;
    }

    public UiObject username() {
        if (username == null)
            username = new UiSelector().resourceId("com.supervalu.android.cub:id/signin_username_email").makeUiObject();
        return username;
    }

    public UiObject password() {
        if (password == null)
            password = new UiSelector().resourceId("com.supervalu.android.cub:id/sign_in_password_edit").makeUiObject();
        return password;
    }

    public UiObject passwordRemind() {
        if (passwordRemind == null)
            passwordRemind = new UiSelector().resourceId("com.supervalu.android.cub:id/pass_remind_icn").makeUiObject();
        return passwordRemind;
    }

    public UiObject needAccount() {
        if (needAccount == null)
            needAccount = new UiSelector().resourceId("com.supervalu.android.cub:id/need_an_account").makeUiObject();
        return needAccount;
    }

    public UiObject signUp() {
        if (signUp == null)
            signUp = new UiSelector().resourceId("com.supervalu.android.cub:id/sign_up_text").makeUiObject();
        return signUp;
    }

    public UiObject signInButton() {
        if (signInButton == null)
            signInButton = new UiSelector().resourceId("com.supervalu.android.cub:id/sign_in_btn").makeUiObject();
        return signInButton;
    }

    public UiObject termsNotice() {
        if (termsNotice == null)
            termsNotice = new UiSelector().resourceId("com.supervalu.android.cub:id/terms_policy_signin").makeUiObject();
        return termsNotice;
    }

    public UiObject terms() {
        if (terms == null)
            terms = new UiSelector().resourceId("com.supervalu.android.cub:id/terms_link").makeUiObject();
        return terms;
    }

    public UiObject privacy() {
        if (privacy == null)
            privacy = new UiSelector().resourceId("com.supervalu.android.cub:id/privacy_policy_signin").makeUiObject();
        return privacy;
    }
}
