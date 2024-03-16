package com.pageObjects.pages.AndroidPages;

import org.openqa.selenium.By;

public class OnBoardingPage {

    // Private constructor to prevent instantiation
    private OnBoardingPage() {
    }

//  Welcome Screen 1  message
    public static By objWelcomeScreen1 = By.xpath("//*[@text='Welcome to Tonik, the first neobank in the Philippines.']");

//  Welcome Screen 1 Button
    public static By objWelcomeScreen1Btn = By.xpath("//*[@text='Welcome to Tonik, the first neobank in the Philippines.']/parent::*/following-sibling::android.view.ViewGroup/child::*/child::*");

//  Welcome Screen 2  message
    public static By objWelcomeScreen2 = By.xpath("//*[@text='A neobank is 100% digital - that means FAST. Do stuff like   opening an account and getting a loan in just minutes. ']");

//  Welcome Screen 2 Button
    public static By objWelcomeScreen2Btn = By.xpath("//*[@text='A neobank is 100% digital - that means FAST. Do stuff like   opening an account and getting a loan in just minutes. ']/parent::*/following-sibling::android.view.ViewGroup/child::*/child::*");

//  Welcome Screen 3  message
    public static By objWelcomeScreen3 = By.xpath("//*[@text='Loans have never been easier. No credit history and collaterals? No problem! Get a fuss-free loan QUICK with  minimal docs needed.']");

//  Welcome Screen 3 Button
    public static By objWelcomeScreen3Btn = By.xpath("//*[@text='Loans have never been easier. No credit history and collaterals? No problem! Get a fuss-free loan QUICK with  minimal docs needed.']/parent::*/following-sibling::android.view.ViewGroup/child::*/child::*");

//  Welcome Screen 4  message
    public static By objWelcomeScreen4 = By.xpath("//*[@text='You’ll also get a virtual debit card instantly. Ready to use for online shopping and payments.']");

//  Welcome Screen 4 Button
    public static By objWelcomeScreen4Btn = By.xpath("//*[@text='You’ll also get a virtual debit card instantly. Ready to use for online shopping and payments.']/parent::*/following-sibling::android.view.ViewGroup/child::*/child::*");

//  Welcome Screen 5 message
    public static By objWelcomeScreen5 = By.xpath("//*[@text='Smart. Digital. Simple. \n" +
            "Your neobanking romance.']");

//  Welcome Screen 5 Button
    public static By objWelcomeScreen5Btn = By.xpath("//*[@text='Smart. Digital. Simple. \n" +
            "Your neobanking romance.']/parent::*/following-sibling::android.view.ViewGroup/child::*/child::*");

//  Mobile number input field
    public static By objMobileNumberInputField = By.xpath("//android.widget.EditText");

//  Tick Symbol
    public static By objTickSymbol = By.xpath("//android.widget.EditText/following-sibling::android.view.ViewGroup");

//  Already have an account
    public static By objAlreadyHaveAccount = By.xpath("//*[@text='Already have an account?']");

//  Login here link
    public static By objLoginHereLink = By.xpath("//*[@text='Log in here']");

//  Next Button
    public static By objNextBtn = By.xpath("//*[@text='Next']");

//  Terms and conditions info
    public static By objTermsAndConditionInfo = By.xpath("//*[contains(@text,'complete terms and conditions')]");

//  Who can open a Tonik account rule
    public static By objHouseRule1 = By.xpath("//*[@text='Who can open a Tonik account.']");

//  What you can do with your Tonik accounts
    public static By objHouseRule2 = By.xpath("//*[@text='What you can do with your Tonik accounts.']");

//  Dos and don'ts of using Tonik's services
    public static By objHouseRule3 = By.xpath("//*[@text=\"Dos and don'ts of using Tonik's services.\"]");

//  Why it's necessary to verify your identity by providing documents or performing certain actions
    public static By objHouseRule4 = By.xpath("//*[@text=\"Why it's necessary to verify your identity by providing documents or performing certain actions.\"]");

//  How we keep your Tonik app, accounts and cards safe
    public static By objHouseRule5 = By.xpath("//*[@text=\"How we keep your Tonik app, accounts and cards safe.\"]");

//  Explaining our fees, limits, and interest
    public static By objHouseRule6 = By.xpath("//*[@text=\"Explaining our fees, limits, and interest.\"]");

//  How we will reach out to you
    public static By objHouseRule7 = By.xpath("//*[@text=\"How we will reach out to you.\"]");

//  Terms and condition
    public static By objReadTermsAndConditionLink = By.xpath("//*[@text=\"Read full General Terms & Conditions\"]");

//  Terms and condition info
    public static By objTermsAndConditionCheckBoxInfo = By.xpath("//*[@text='I confirm that I have read, understood, and agreed to the full General Terms & Conditions.']");

//  Terms and condition info Radio button
    public static By objTermsAndConditionInfoCheckBox = By.xpath("//*[@text='I confirm that I have read, understood, and agreed to the full General Terms & Conditions.']/preceding-sibling::*");

//  Agree and Continue
    public static By objAgreeAndContinueBtn = By.xpath("//*[@text='Agree and Continue']");

//  Privacy matters info
    public static By objPrivacyMattersInfo = By.xpath("//*[@text='In the Data Privacy Statement, you will find our complete statement regarding your privacy including the provisions on the following items:']");

//  Privacy policy 1
    public static By objPrivacyPolicy1 = By.xpath("//*[@text='How we obtain your data.']");

//  Privacy policy 2
    public static By objPrivacyPolicy2 = By.xpath("//*[@text='What data we get from you.']");

//  Privacy policy 3
    public static By objPrivacyPolicy3 = By.xpath("//*[@text='Why we need your data.']");

//  Privacy policy 4
    public static By objPrivacyPolicy4 = By.xpath("//*[@text='What we do with your data.']");

//  Privacy policy 5
    public static By objPrivacyPolicy5 = By.xpath("//*[@text='Who we share your data with and why.']");

//  Privacy policy 6
    public static By objPrivacyPolicy6 = By.xpath("//*[@text='Your rights and how we respect them.']");

//  Privacy policy 7
    public static By objPrivacyPolicy7 = By.xpath("//*[@text='How we keep your data safe.']");

//  Tonik App access device apps
    public static By objTonikAppAccessOtherDeviceAppsMsg = By.xpath("//*[@text='The Tonik App requires your permission to access your  camera, audio, gallery, contacts, installed apps, and location  to function as intended. We do not store any of your contacts’ details in the Tonik cloud.']");

//  Data privacy statement link
    public static By objDataPrivacyStatementLink = By.xpath("//*[@text='Read full Data Privacy Statement']");

//  Data Privacy statement info
    public static By objDataPrivacyStatementInfo = By.xpath("//*[contains(@text,'I have read the Data Privacy statement')]");

//  Data Privacy statement Radio button
    public static By objDataPrivacyStatementRadioBtn = By.xpath("//*[contains(@text,'I have read the Data Privacy statement')]/preceding-sibling::*");

//  YES, I am a Filipino / Filipina.
    public static By objYesIamFilipinoOption = By.xpath("//*[@text='YES, I am a Filipino / Filipina.']");

//  No, I am not. I have a different nationality
    public static By objNoIamNotFilipinoOption = By.xpath("//*[@text='No, I am not. I have a different nationality.']");

//  Let’s get to know each other better
    public static By objLetsGetToKnowBetter = By.xpath("//*[@text='Let’s get to know each other better...']");

//  Take a Face Identity Scan
    public static By objTakeAFaceIdentityScan = By.xpath("//*[@text='Take a Face Identity Scan']");

//  Scan one Valid ID you own
    public static By objScanValidId = By.xpath("//*[@text='Scan one Valid ID you own.']");

//  Get your digital signature
    public static By objGetYourDigitalSignature = By.xpath("//*[@text='Get your digital signature.']");

//  Initiate Face Identity Scan
    public static By objInitiateFaceIdentityScan = By.xpath("//*[@text='Initiate Face Identity Scan']");

//  OTP Input field
    public static By objOTPInputField = By.xpath("//android.widget.TextView[@text='⋆']");
//
////
//    public static By obj = By.xpath("//*[@text='']");
//
////
//    public static By obj = By.xpath("//*[@text='']");
//
////
//    public static By obj = By.xpath("//*[@text='']");
//
////
//    public static By obj = By.xpath("//*[@text='']");
//
////
//    public static By obj = By.xpath("//*[@text='']");
//
////
//    public static By obj = By.xpath("//*[@text='']");
//
////
//    public static By obj = By.xpath("//*[@text='']");
//
////
//    public static By obj = By.xpath("//*[@text='']");
//
////
//    public static By obj = By.xpath("//*[@text='']");
//
////
//    public static By obj = By.xpath("//*[@text='']");
//
////
//    public static By obj = By.xpath("//*[@text='']");


}
