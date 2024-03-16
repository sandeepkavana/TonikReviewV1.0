package com.businessFunctions;

import com.driverInstance.DriverManager;
import com.pageObjects.pages.AndroidPages.LoginPage;
import com.pageObjects.pages.AndroidPages.ProfilePage;
import com.pageObjects.pages.AndroidPages.VirtualCardPage;
import com.utility.Utilities;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.utility.ExtentReporter.HeaderChildNode;
import static com.utility.Utilities.*;
import static com.utility.Utilities.verifyElementPresentAndClick;

public class VirtualCardModule extends BaseClass {

    public VirtualCardModule() {
        super();
    }


    //----------------ReUsable method-------------

    /**
     * Method to verify virtual card On OnBoarding Screen
     * @throws Exception
     */
    public void VirtualCard() throws Exception {
        if (verifyElementPresent(VirtualCardPage.objVirtualCardOnBoard, "Virtual Card Image On OnBoarding Screen")) {
            verifyElementPresent(VirtualCardPage.objVirtualCardOption, "Virtual Card Image On OnBoarding Screen");
            assertionValidation(getText(VirtualCardPage.objVirtualCardOption), propertyFileReader("VirtualCardOption", "VirtualCard"), ": Virtual Card option");
            verifyElementPresent(VirtualCardPage.objMaskedNumbers, getTextVal(VirtualCardPage.objMaskedNumbers, ":Two Masked Number"));
        }
    }

    /**
     * Method to verify Virtual card screen
     * @throws Exception
     */

    public void VirtualCardScreen() throws Exception {
        if (verifyElementPresentAndClick(VirtualCardPage.objVirtualCardOnBoard, "Virtual Card Image On OnBoarding Screen")) {
            verifyElementPresent(VirtualCardPage.objCardsHeader, "Virtual Cards Header ");
            assertionValidation(getText(VirtualCardPage.objCardsHeader), propertyFileReader("CardsHeader", "VirtualCard"), ": Virtual Card Header");
            verifyElementPresent(VirtualCardPage.objVirtualCardImage, "Virtual Card Image");
            verifyElementPresent(VirtualCardPage.objUnmaskedNum, getTextVal(VirtualCardPage.objUnmaskedNum, ": Masked Numbers ON card"));
            verifyElementPresent(VirtualCardPage.objEyeIcon, ": Eye Icon On left side Of the Corner");
            containsValidation(getText(VirtualCardPage.objLockCard), propertyFileReader("LockCard", "VirtualCard"), ": Lock Card");
            containsValidation(getText(VirtualCardPage.objSecurity), propertyFileReader("Security", "VirtualCard"), ": Security");
            containsValidation(getText(VirtualCardPage.objCardLimits), propertyFileReader("CardLimits", "VirtualCard"), ": Card Limits");
        }
    }

    /**
     * Method to verify Unmask the Values On virtual card Screen
     * @throws Exception
     */
    public void UnmaskTheValuesOnVirtualCardScreen() throws Exception {
        if (verifyElementPresentAndClick(VirtualCardPage.objEyeIcon, "Eye Icon On the Left side of Image")) {
            verifyElementPresent(VirtualCardPage.objUnmaskedNum, getTextVal(VirtualCardPage.objUnmaskedNum, ": UnMasked Numbers ON card"));
            containsValidation(getText(VirtualCardPage.objValidThruOption), propertyFileReader("ValidThru", "VirtualCard"), ":Valid Thru");
            containsValidation(getText(VirtualCardPage.objCvvOption), propertyFileReader("Cvv", "VirtualCard"), ":CVV");
            verifyElementPresent(VirtualCardPage.objCustomerNameOnCard, getTextVal(VirtualCardPage.objCustomerNameOnCard, ": Customer Name ON card"));
        }
    }

    /**
     * Method to verify card limits validation
     * @throws Exception
     */
    public void CardLimitsValidation() throws Exception {
        if (verifyElementPresentAndClick(VirtualCardPage.objCardLimits, "Card Limits")) {
            verifyElementPresent(VirtualCardPage.objCardDailyLimitsHeader, "Card Daily Limits Header");
            waitTime(5000);
            containsValidation(getText(VirtualCardPage.objCardDailyLimitsHeader), propertyFileReader("CardDailyLimits", "VirtualCard"), ":Security header");
            containsValidation(getText(VirtualCardPage.objOnlineAndPhysicalPaymentsOption), propertyFileReader("OnlineAndPhysicalPayments", "VirtualCard"), ":Security Page SubTitle");
        }
    }

    //----------------------Test Method----------------

    /**
     * Method to verify user can access virtual card tile without TSA
     * @throws Exception
     */
    public void VerifyTheUserCanAccessVirtualCardTileIfTSAIsNotCreated_TBD_VC_001() throws Exception {
        HeaderChildNode("TBD_VC_001, Virtual Card -VerifyTheUserCanAccessVirtualCardTileIfTSAisCreated_TBD_VC_001");
        tonikLogin(propertyFileReader("password", "Login"));
        VirtualCard();
        verifyElementPresentAndClick(VirtualCardPage.objVirtualCardOnBoard, "Virtual Card Image On OnBoarding Screen");
        verifyElementPresent(VirtualCardPage.objVirtualCardGraydOut, "Virtual Card Graydout On OnBoarding Screen");
        logger.info("TBD_VC_001, Virtual Card - VerifyTheUserCanAccessVirtualCardTileIfTSAisCreated_TBD_VC_001");
        extentLoggerPass("TBD_VC_001", "TBD_VC_002, Virtual Card -VerifyTheUserCanAccessVirtualCardTileIfTSAisCreated_TBD_VC_001 is passed");
    }

    /**
     * Method to verify User can access the virtual card if TSA is created
     * @throws Exception
     */
    public void VerifyTheUserCanAccessVirtualCardTileIfTSAisCreated_TBD_VC_002() throws Exception {
        HeaderChildNode("TBD_VC_002, Virtual Card -VerifyTheUserCanAccessVirtualCardTileIfTSAisCreated_TBD_VC_002");
        tonikLogin(propertyFileReader("password", "Login"));
        VirtualCard();
        if (verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile Icon")) {
            waitTime(5000);
            ProfileModule profileModule = new ProfileModule();
            profileModule.accountInformationUIValidation();
            verifyElementPresentAndClick(LoginPage.objBackIcon, "Back icon ");
            verifyElementPresentAndClick(LoginPage.objBackIcon, "Back icon ");
            VirtualCard();
            VirtualCardScreen();
            verifyElementPresentAndClick(LoginPage.objBackIcon, "Back icon ");
            if (verifyElementDisplayed(ProfilePage.objProfileIcon)) {
                logger.info("TBD_VC_002, Virtual Card - VerifyTheUserCanAccessVirtualCardTileIfTSAisCreated");
                extentLoggerPass("TBD_VC_002", "TBD_VC_002, Virtual Card -VerifyTheUserCanAccessVirtualCardTileIfTSAisCreated_TBD_VC_002 is passed");
            }

        }
    }

    /**
     * Method to verify user can hide and Un-hide the virtual card details
     * @throws Exception
     */
    public void VerifyIfUserCanHideUnHideTheDetailsOfTheVirtualCard_TBD_VC_003() throws Exception {
        HeaderChildNode("TBD_VC_003, Virtual Card -VerifyIfUserCanHideUnHideTheDetailsOfTheVirtualCard_TBD_VC_003");
        tonikLogin(propertyFileReader("password", "Login"));
        VirtualCard();
        VirtualCardScreen();
        UnmaskTheValuesOnVirtualCardScreen();
        verifyElementPresentAndClick(LoginPage.objBackIcon, "Back icon ");
        VirtualCardScreen();
        UnmaskTheValuesOnVirtualCardScreen();
        verifyElementPresentAndClick(VirtualCardPage.objUnMaskedEyeIcon, "Eye Icon On the Left side of Image");
        verifyElementPresent(VirtualCardPage.objUnmaskedNum, getTextVal(VirtualCardPage.objUnmaskedNum, ": Masked Numbers ON card"));
        verifyElementNotDisplayed(VirtualCardPage.objCvvOption, "CVV");
        verifyElementNotDisplayed(VirtualCardPage.objValidThruOption, "Valid Thru");
        verifyElementNotDisplayed(VirtualCardPage.objCustomerNameOnCard, "Customer name On Card");
        logger.info("TBD_VC_003, Virtual Card - VerifyIfUserCanHideUnHideTheDetailsOfTheVirtualCard_TBD_VC_003");
        extentLoggerPass("TBD_VC_003", "TBD_VC_003, Virtual Card -VerifyIfUserCanHideUnHideTheDetailsOfTheVirtualCard_TBD_VC_003 is passed");

    }

    /**
     * Method to verify user can lock and unlock the virtual card
     * @throws Exception
     */
    public void VerifyIfUserCanLockUnlockTheVirtualCard_TBD_VC_004() throws Exception {
        HeaderChildNode("TBD_VC_004, Virtual Card -VerifyIfUserCanLockUnlockTheVirtualCard_TBD_VC_004");
        tonikLogin(propertyFileReader("password", "Login"));
        VirtualCard();
        VirtualCardScreen();
        verifyElementPresentAndClick(VirtualCardPage.objLockCardToggle, "Lock Card Toggle Button");
        //For "Locked" Text on the virtual card screen, there is No attribute and value
//        verifyElementPresent(VirtualCardPage.objLockedText, "Locked text");
        verifyElementPresentAndClick(LoginPage.objBackIcon, "Back icon ");
        verifyElementPresent(VirtualCardPage.objVirtualCardOption, "Virtual Card Image On OnBoarding Screen");
        if (verifyElementPresent(VirtualCardPage.objLocked, "Locked Option On virtual card in OnBoarding Screen")) {
            logger.info("Virtual Card Is Locked");
            extentLoggerPass("Lock the card", "Virtual Card Is Locked");
        }
        containsValidation(getText(VirtualCardPage.objLocked), propertyFileReader("Locked", "VirtualCard"), ":Locked Text");
        click(VirtualCardPage.objVirtualCardOnBoard, "Virtual card in OnBoarding Screen");
        verifyElementPresentAndClick(VirtualCardPage.objLockCardToggle, "Lock Card");
        if (verifyElementPresent(VirtualCardPage.objEyeIcon, "Eye icon")) {
            logger.info("Virtual Card Is Unlocked");
            extentLoggerPass("Unlock the card", "Virtual Card Is Unlocked");
        }
        verifyElementPresentAndClick(LoginPage.objBackIcon, "Back icon ");
        VirtualCard();
        logger.info("TBD_VC_004, Virtual Card - VerifyIfUserCanLockUnlockTheVirtualCard_TBD_VC_004");
        extentLoggerPass("TBD_VC_004", "TBD_VC_004, Virtual Card -VerifyIfUserCanLockUnlockTheVirtualCard_TBD_VC_004 is passed");
    }

    /**
     * Method to verify user can block the virtual card from online payments
     * @throws Exception
     */
    public void VerifyIfUserCanBlockTheVirtualCardFromOnlinePayments_TBD_VC_005() throws Exception {
        HeaderChildNode("TBD_VC_005, Virtual Card -VerifyIfUserCanBlockTheVirtualCardFromOnlinePayments_TBD_VC_005");
        tonikLogin(propertyFileReader("password", "Login"));
        VirtualCard();
        VirtualCardScreen();
        if (verifyElementPresentAndClick(VirtualCardPage.objSecurity, "Security Option")) {
            verifyElementPresent(VirtualCardPage.objSecurityHeader, "Security Header");
            containsValidation(getText(VirtualCardPage.objSecurityHeader), propertyFileReader("Security", "VirtualCard"), ":Security header");
            containsValidation(getText(VirtualCardPage.objSecuritySubTitle), propertyFileReader("SecurityPageSubTitle", "VirtualCard"), ":Security Page SubTitle");
            containsValidation(getText(VirtualCardPage.objOnlinePayments), propertyFileReader("OnlinePayments", "VirtualCard"), ":Online Payments");
            containsValidation(getText(VirtualCardPage.objBlockOnlinePayments), propertyFileReader("BlockOnlinePayments", "VirtualCard"), ":Block Online Payments");
        }
        verifyElementPresentAndClick(VirtualCardPage.objOnlinePaymentsToggle, "Online Payments Toggle");
        verifyElementEnabled(VirtualCardPage.objOnlinePaymentsToggle, " : Online Button Toggle");
        assertionValidation(getAttributValue("enabled", VirtualCardPage.objOnlinePaymentsToggle), "true", ": Enable Attribute value");
        verifyElementPresentAndClick(VirtualCardPage.objOnlinePaymentsToggle, "Online Payments Toggle");
        assertionValidation(getAttributValue("checked", VirtualCardPage.objOnlinePaymentsToggle), "false", ": Checked Attribute value");
        verifyElementPresentAndClick(VirtualCardPage.objOnlinePaymentsToggle, "Online Payments Toggle");
        assertionValidation(getAttributValue("enabled", VirtualCardPage.objOnlinePaymentsToggle), "true", ": Enable Attribute value");
        verifyElementPresentAndClick(LoginPage.objBackIcon, "Back icon ");
        verifyElementPresentAndClick(VirtualCardPage.objSecurity, "Security Option");
        assertionValidation(getAttributValue("enabled", VirtualCardPage.objOnlinePaymentsToggle), "true", ": Enable Attribute value");
        logger.info("TBD_VC_005, Virtual Card - VerifyIfUserCanBlockTheVirtualCardFromOnlinePayments_TBD_VC_005");
        extentLoggerPass("TBD_VC_005", "TBD_VC_005, Virtual Card -VerifyIfUserCanBlockTheVirtualCardFromOnlinePayments_TBD_VC_005 is passed");
    }

    /**
     * Method to verify user can change the virtual card daily online and physical payments
     * @throws Exception
     */
    public void VerifyIfUserCanChangeTheVirtualCardsDailyOnlineAndPhysicalPaymentLimit_TBD_VC_006() throws Exception {
        HeaderChildNode("TBD_VC_005, Virtual Card -VerifyIfUserCanBlockTheVirtualCardFromOnlinePayments_TBD_VC_005");
        tonikLogin(propertyFileReader("password", "Login"));
        VirtualCard();
        VirtualCardScreen();
        CardLimitsValidation();
        verifyElementPresent(VirtualCardPage.objDefaultAmount, getTextVal(VirtualCardPage.objDefaultAmount, ":Default Amount"));
        verifyElementPresentAndClick(VirtualCardPage.objOnlineAndPhysicalPaymentsOption, "Online and physical Payments");
        verifyElementPresent(VirtualCardPage.objOnlineAndPhysicalPaymentsHeader, "Online and physical Payments Header");
        waitTime(5000);
        List<WebElement> values = findElements(VirtualCardPage.objAmountList);
        for (int list = 0; list < values.size(); list++) {
            String displayedItem = values.get(list).getText();
            logger.info("Amount list : " + displayedItem + " is displayed");
            extentLogger(" ", "Amount list : " + displayedItem + " is displayed");
        }
        for (int list = 1; list < values.size(); list++) {
            String sAmountList = getText(VirtualCardPage.objAmountList(list));
            click(VirtualCardPage.objAmountList(list), getTextVal(VirtualCardPage.objAmountList(list), ": Purpose"));
            waitForElementToBePresent(VirtualCardPage.objDefaultAmount, 3, "Default Amount");
            containsValidation(getText(VirtualCardPage.objDefaultAmount), sAmountList, ": Default");
            click(VirtualCardPage.objDefaultAmount, "Default Amount");
        }
        logger.info("TBD_VC_006, Virtual Card - VerifyIfUserCanChangeTheVirtualCardsDailyOnlineAndPhysicalPaymentLimit_TBD_VC_006");
        extentLoggerPass("TBD_VC_006", "TBD_VC_006, Virtual Card -VerifyIfUserCanChangeTheVirtualCardsDailyOnlineAndPhysicalPaymentLimit_TBD_VC_006 is passed");
    }

    /**
     * Method to verify user maximum cards limit until 250000 if user as SKYC
     * @throws Exception
     */
    public void VerifyIfUsersMaximumCardLimitIsUntil₱250_000IfUserIsSKYC_TBD_VC_011() throws Exception {
        HeaderChildNode("TBD_VC_011, Virtual Card -VerifyIfUsersMaximumCardLimitIsUntil₱250_000IfUserIsSKYC_TBD_VC_011");
        tonikLogin(propertyFileReader("password", "Login"));
        VirtualCard();
        VirtualCardScreen();
        CardLimitsValidation();
        verifyElementPresent(VirtualCardPage.objDefaultAmount, getTextVal(VirtualCardPage.objDefaultAmount, ":Default Amount"));
        verifyElementPresentAndClick(VirtualCardPage.objOnlineAndPhysicalPaymentsOption, "Online and physical Payments");
        verifyElementPresent(VirtualCardPage.objOnlineAndPhysicalPaymentsHeader, "Online and physical Payments Header");
        waitTime(5000);
        List<WebElement> values = findElements(VirtualCardPage.objAmountList);
        for (int list = 0; list < values.size(); list++) {
            String displayedItem = values.get(list).getText();
            logger.info("Amount list : " + displayedItem + " is displayed");
            extentLogger(" ", "Amount list : " + displayedItem + " is displayed");
        }
        click(VirtualCardPage.objSKYCMaximumAmount, getTextVal(VirtualCardPage.objSKYCMaximumAmount, ":Maximum Amount"));
        String MaximumAmount = getText(VirtualCardPage.objSKYCMaximumAmount);
        waitForElementToBePresent(VirtualCardPage.objDefaultAmount, 3, "Default amount");
        containsValidation(getText(VirtualCardPage.objDefaultAmount), MaximumAmount, ":Default amount");
        logger.info("TBD_VC_011, Virtual Card - VerifyIfUsersMaximumCardLimitIsUntil₱250_000IfUserIsSKYC_TBD_VC_011");
        extentLoggerPass("TBD_VC_011", "TBD_VC_011, Virtual Card -VerifyIfUsersMaximumCardLimitIsUntil₱250_000IfUserIsSKYC_TBD_VC_011 is passed");
    }

    /**
     * Method to verify user maximum card limit until 40000 if user as BKYC
     * @throws Exception
     */
    public void VerifyIfUsersMaximumCardLimitIsOnlyUntil₱40000IfUserIsBKYC_TBD_VC_010() throws Exception {
        HeaderChildNode("TBD_VC_010, Virtual Card -VerifyIfUsersMaximumCardLimitIsOnlyUntil₱40000IfUserIsBKYC_TBD_VC_010");
        tonikLogin(propertyFileReader("password", "Login"));
        VirtualCard();
        VirtualCardScreen();
        CardLimitsValidation();
        verifyElementPresent(VirtualCardPage.objDefaultAmount, getTextVal(VirtualCardPage.objDefaultAmount, ":Default Amount"));
        verifyElementPresentAndClick(VirtualCardPage.objOnlineAndPhysicalPaymentsOption, "Online and physical Payments");
        verifyElementPresent(VirtualCardPage.objOnlineAndPhysicalPaymentsHeader, "Online and physical Payments Header");
        waitTime(5000);
        List<WebElement> values = findElements(VirtualCardPage.objAmountList);
        for (int list = 0; list < values.size(); list++) {
            String displayedItem = values.get(list).getText();
            logger.info("Amount list : " + displayedItem + " is displayed");
            extentLogger(" ", "Amount list : " + displayedItem + " is displayed");
        }
        click(VirtualCardPage.objBKYCMaximumAmount, getTextVal(VirtualCardPage.objBKYCMaximumAmount, ":Maximum Amount"));
        String MaximumAmount = getText(VirtualCardPage.objBKYCMaximumAmount);
        waitForElementToBePresent(VirtualCardPage.objDefaultAmount, 3, "Default amount");
        containsValidation(getText(VirtualCardPage.objDefaultAmount), MaximumAmount, ":Default amount");
        logger.info("TBD_VC_010, Virtual Card - VerifyIfUsersMaximumCardLimitIsOnlyUntil₱40000IfUserIsBKYC_TBD_VC_010");
        extentLoggerPass("TBD_VC_010", "TBD_VC_010, Virtual Card -VerifyIfUsersMaximumCardLimitIsOnlyUntil₱40000IfUserIsBKYC_TBD_VC_010 is passed");
    }
}
































































