package api.apps.cub.PrescriptionRefill;

import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by ssha05u on 11/7/2016.
 */
public class PrescriptionRefill {

    public PrescriptionRefillUiObjects uiObject = new PrescriptionRefillUiObjects();

    public void tapMenu() {
        try {
            MyLogger.log.info("Tapping on 3 line menu button");
            uiObject.menu().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on menu item. Element absent or disabled");
        }
    }

    public void tapShoppingList() {
        try {
            MyLogger.log.info("Tapping on Shopping List");
            uiObject.shoppingList().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Shopping List. Element absent or disabled");
        }
    }

    public void tapEditPhone() {
        try {
            MyLogger.log.info("Tapping on Edit Phone Text Field");
            uiObject.editPhone().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Edit Phone Text Field. Element absent or disabled");
        }
    }
    public void tapPharmacyHelp() {
        try {
            MyLogger.log.info("Tapping on Pharmacy Help");
            uiObject.pharmacyHelp().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Pharmacy Help. Element absent or disabled");
        }
    }
    public void tapEditPharmacy() {
        try {
            MyLogger.log.info("Tapping on Edit Pharmacy");
            uiObject.editPharmacy().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Edit Pharmacy. Element absent or disabled");
        }
    }
    public void tapScanPharmacy() {
        try {
            MyLogger.log.info("Tapping on Scan Pharmacy");
            uiObject.scanPharmacy().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Scan Pharmacy. Element absent or disabled");
        }
    }
    public void tapHelpPrescription() {
        try {
            MyLogger.log.info("Tapping on Help Prescription");
            uiObject.helpPrescription().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Help Prescription. Element absent or disabled");
        }
    }
    public void tapEditPrescription() {
        try {
            MyLogger.log.info("Tapping on Edit Prescription");
            uiObject.editPrescription().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Edit Prescription. Element absent or disabled");
        }
    }
    public void tapScanPrescription() {
        try {
            MyLogger.log.info("Tapping on Scan Prescription");
            uiObject.scanPrescription().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Scan Prescription. Element absent or disabled");
        }
    }
    public void tapContinueRefill() {
        try {
            MyLogger.log.info("Tapping on Continue Button");
            uiObject.continueRefill().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap on Continue button. Element absent or disabled");
        }
    }
}
