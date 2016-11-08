package api.apps.cub.PrescriptionRefill;

import api.apps.cub.CommonUiObjects;
import core.UiObject;
import core.UiSelector;

/**
 * Created by ssha05u on 11/7/2016.
 */
public class PrescriptionRefillUiObjects extends CommonUiObjects{

    private static UiObject refillHeader,editPhone,pharmacyHelp,editPharmacy,scanPharmacy,helpPrescription,editPrescription,scanPrescription,helpImage,continueRefill;
    //,,,,
    //,,,,,
    //

    public UiObject refillHeader() {
        if (refillHeader == null)
            refillHeader = new UiSelector().resourceId("com.supervalu.android.cub:id/txtvwRefillPrescHomeHeader").makeUiObject();
        return refillHeader;
    }

    public UiObject editPhone() {
        if (editPhone == null)
            editPhone = new UiSelector().resourceId("com.supervalu.android.cub:id/llEdtPhone").makeUiObject();
        return editPhone;
    }

    public UiObject pharmacyHelp() {
        if (pharmacyHelp == null)
            pharmacyHelp = new UiSelector().resourceId("com.supervalu.android.cub:id/imgHelpPharmacy").makeUiObject();
        return pharmacyHelp;
    }

    public UiObject editPharmacy() {
        if (editPharmacy == null)
            editPharmacy = new UiSelector().resourceId("com.supervalu.android.cub:id/llEdtPharmacy").makeUiObject();
        return editPharmacy;
    }

    public UiObject scanPharmacy() {
        if (scanPharmacy == null)
            scanPharmacy = new UiSelector().resourceId("com.supervalu.android.cub:id/imgvwScanPharma").makeUiObject();
        return scanPharmacy;
    }
    public UiObject helpPrescription() {
        if (helpPrescription == null)
            helpPrescription = new UiSelector().resourceId("com.supervalu.android.cub:id/imgHelpPresc").makeUiObject();
        return helpPrescription;
    }
    public UiObject editPrescription() {
        if (editPrescription == null)
            editPrescription = new UiSelector().resourceId("com.supervalu.android.cub:id/llEdtPresc").makeUiObject();
        return editPrescription;
    }
    public UiObject scanPrescription() {
        if (scanPrescription == null)
            scanPrescription = new UiSelector().resourceId("com.supervalu.android.cub:id/imgvwScanPres").makeUiObject();
        return scanPrescription;
    }
    public UiObject helpImage() {
        if (helpImage == null)
            helpImage = new UiSelector().resourceId("com.supervalu.android.cub:id/imgScan").makeUiObject();
        return helpImage;
    }
    public UiObject continueRefill() {
        if (continueRefill == null)
            continueRefill = new UiSelector().resourceId("com.supervalu.android.cub:id/btnContinueRefill").makeUiObject();
        return continueRefill;
    }
}
