package com.pageObjects.pages.AndroidPages;

import org.openqa.selenium.By;

public class LoginPage {

    // Private constructor to prevent instantiation
    private LoginPage() {
    }

    //  Edit Input field
    public static By objEditPassword = By.xpath("//android.widget.EditText[@resource-id='com.tonik.mobile:id/pin'] | //*[@value='Password'] | //XCUIElementTypeSecureTextField");

    //  Login button
    public static By objLoginBtn = By.xpath("//android.widget.Button[@resource-id='com.tonik.mobile:id/loginbutton'] | //*[@name='Login']");

    //  Profile Name
    public static By objProfileName = By.xpath("//*[@resource-id='appbar-content-title-text'] | //*[@name='appbar-content-title-text']");

    //  Back button
//    public static By objBackIcon = By.id("com.tonik.mobile:id/Header_left_click");

    //  Back button
    public static By objBackIcon = By.xpath("//*[@resource-id='com.tonik.mobile:id/Header_left_click'] | //*[@name='com.tonik.mobile:id/Header_left_click']");

    //  Page Title
    public static By objPageTitle = By.xpath("//*[@resource-id='com.tonik.mobile:id/Main_title_txt']");

    //  Page Subtitle
    public static By objPageSubTitle = By.xpath("//*[@resource-id='com.tonik.mobile:id/Sub_title_txt']");

    //  AvailableBalance
    public static By objAvailableBalance = By.xpath("(//*[@text='Your tonik account']/following-sibling::android.widget.TextView)[1]");

    //  History Icon
    public static By objHistoryIcon = By.xpath("//*[@text='History']/preceding-sibling::*");

    //  Cross button
    public static By objCrossButton = By.xpath("//*[@content-desc='Header_right_click']/child::*");

    //  View transaction link
    public static By objViewTransactionLink = By.xpath("//*[@text='View transaction details']");

    //  Back to dashboard
    public static By objBackToDashboard = By.xpath("//*[@text='Back to Dashboard']");

    //  Transaction details amount
    public static By objTransactionAmount = By.xpath("//*[@text='Amount']/following-sibling::*");

    //  Transaction details from
    public static By objTransactionFrom = By.xpath("//*[@text='From']/following-sibling::*");

    //  Transaction details to
    public static By objTransactionTo = By.xpath("//*[@text='To']/following-sibling::*");

    //  Transaction details date and time
    public static By objTransactionDateAndTime = By.xpath("//*[@text='When']/following-sibling::*");

    //  Transaction details Reference Number
    public static By objTransactionReferenceNumber = By.xpath("//*[@text='Reference No.']/following-sibling::*");

    //  Web page header
    public static By objWebPageHeader = By.xpath("//*[@resource-id='com.sec.android.app.sbrowser:id/location_bar_edit_text']");

    //      Next Button
    public static By objNextBtn = By.xpath("//*[@text='Next']");

    //  Next button parent com.tonik.mobile:id/contact_button
    public static By objNextButton = By.xpath("//*[@text='Next']/parent::*");
    //-----------------Sandeep---------------------------
    //Tonik logo
    public static By objtonikLogo = By.xpath("//*[@resource-id='com.tonik.mobile:id/back_button'] | //*[@name='DASPasswordAuthenticatorView']/XCUIElementTypeOther/XCUIElementTypeImage");

    //  Question mark (contact us) icon
    public static By objCustomerCareIcon = By.xpath("//*[@resource-id='com.tonik.mobile:id/contact_button'] | //XCUIElementTypeNavigationBar[@name='DASPasswordAuthenticatorView']/child::XCUIElementTypeButton");

    //welcome back
    public static By objWelcomeBack = By.xpath("//*[@resource-id='com.tonik.mobile:id/title'] | //*[@name='Welcome back, MARIA LOURDES J']");

    //Login with your password
    public static By objloginWithYourPAssword = By.xpath("//*[@resource-id='com.tonik.mobile:id/info'] | //*[@name='Login with your password.']");

    //Forgot password
    public static By objforgotPAssword = By.xpath("//*[@resource-id='com.tonik.mobile:id/forgotpwdbutton'] | //XCUIElementTypeStaticText[@name='Forgot password']");

    //password field with masked icon
    public static By objpasswordFieldWithMaskedEyeIcon = By.xpath("//*[@resource-id='com.tonik.mobile:id/pin'] | //*[@value='Password']/child::XCUIElementTypeButton");

    //Heads up luv pop up
    public static By objheadsUpLuvPopup = By.xpath("//*[@text='Heads up, luv!'] | //*[@text='Heads up, luv!']");

    //Got It Button
    public static By objgotItButton = By.xpath("//*[@text='Got it'] | //*[@text='Got it']");

    //Log out button
    public static By objlogOutButton = By.xpath("//*[@text=' Log out'] | (//*[@name=' Log out'])[3]");

    //Error content popup
    public static By objerrorContent = By.xpath("//*[@text='You Account Was Temporarily blocked'] | //*[@name='Your account was temporarily locked for security reasons. Reset your password to unlock it']");

    //Contact link
    public static By objcontactLink = By.xpath("//*[@text='Contact Link'] | //*[@name='Contact Tonik']");

}
