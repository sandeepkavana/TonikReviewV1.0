package com.businessFunctions;

import com.driverInstance.CommandBase;
import com.driverInstance.DriverManager;
import com.helger.commons.callback.exception.IExceptionCallback;
import com.pageObjects.pages.AndroidPages.LoginPage;
import com.pageObjects.pages.AndroidPages.ProfilePage;
import com.propertyfilereader.PropertyFileReader;
import com.utility.Utilities;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.internal.annotations.IBeforeMethod;

import static com.utility.ExtentReporter.HeaderChildNode;
import static com.utility.Utilities.*;

public class LoginModule extends BaseClass {
    String testName = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getName();
    String udid=Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("deviceName");
    String portNo=Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("portno");

    public LoginModule() {
        super();
    }
//----------------------------Reusable methods--------------------------------

    /**
     * Method to verify welcome back Screen UI validation
     * @throws Exception
     */
    public void welcomeBackScreenUIValidation() throws Exception{
        HeaderChildNode("WelcomeBack Screen UI Validation");
       if(verifyElementPresent(LoginPage.objtonikLogo,"Tonik Logo")) {
           verifyElementPresent(LoginPage.objCustomerCareIcon, "Customer Care Icon");
           verifyElementPresent(LoginPage.objWelcomeBack, "Welcome Back");
           verifyElementPresent(LoginPage.objloginWithYourPAssword, "Login With your Password");
           verifyElementPresent(LoginPage.objpasswordFieldWithMaskedEyeIcon, "Password Field With Masked Icon");
           verifyElementPresent(LoginPage.objforgotPAssword, "forgot Password");
       }
    }
//----------------------------Test Methods----------------------------------------

    /**
     * Method to verify User can login when TSA is not Yet created
     * @throws Exception
     */
    public void verifyUserCanLoginWhenTSAisNotYetCreated_TBD_LG_001() throws Exception{
        HeaderChildNode("TBD_LG_001, Login - verify User can Login When TSA is Not Yet Created_TBD_LG_001");
        welcomeBackScreenUIValidation();
        click(LoginPage.objEditPassword, "Password field");
        type(LoginPage.objEditPassword,propertyFileReader("password","Login"), "Enter secret code");
        verifyElementPresentAndClick(LoginPage.objLoginBtn,getTextVal(LoginPage.objLoginBtn,"Button"));
        waitTime(5000);
        if(verifyElementPresent(ProfilePage.objProfileIcon,"Profile page Icon"));{
            logger.info("TBD_LG_001, Login - verifyUsercanLoginWhenTSAisNotYetCreated_TBD_LG_001 is passed");
            extentLoggerPass("TBD_LG_001", "TBD_LG_001, Login - verifyUsercanLoginWhenTSAisNotYetCreated_TBD_LG_001 is passed");
            System.out.println("-----------------------------------------------------------");
        }
    }

    /**
     * Method to verify User can Log in when TSA is created
     * @throws Exception
     */
    public void verifyUserCanLoginWhenTSAisCreated_TBD_LG_002() throws Exception{
        HeaderChildNode("TBD_LG_002, Login - Verify if user can Login when TSA is created");
        welcomeBackScreenUIValidation();
        tonikLogin(propertyFileReader("password","Login"));
        if(verifyElementDisplayed(LoginPage.objheadsUpLuvPopup)){
            click(LoginPage.objgotItButton,"Got It Button");
        }
        verifyElementPresentAndClick(ProfilePage.objProfileIcon,"Profile page Icon");
        verifyElementPresentAndClick(ProfilePage.objAccountInformation,"Account information");
        verifyElementPresentAndClick(LoginPage.objBackIcon,"Back Icon");
//        waitForElementToBePresent(LoginPage.objBackIcon, 20, "Profile Picture");
        Wait(4000);
        verifyElementPresentAndClick(LoginPage.objBackIcon,"Back Icon");
        verifyElementPresentAndClick(ProfilePage.objProfileIcon,"Profile page Icon");
        if(platform.equalsIgnoreCase("Android")) {
            verticalSwipeTillElementDispalyed(LoginPage.objlogOutButton);
        }else{
            scroll_To_Text(LoginPage.objlogOutButton,"name"," Log out");
        }
        verifyElementPresentAndClick(LoginPage.objlogOutButton,"Logout Button");
        if(platform.equalsIgnoreCase("Android")) {
            relaunchApp("android");
        }else{
            new CommandBase(testName, udid, portNo);
        }
        tonikLogin(propertyFileReader("password","Login"));
        if(verifyElementDisplayed(LoginPage.objheadsUpLuvPopup)){
            click(LoginPage.objgotItButton,"Got It Button");
        }
        if(verifyElementPresent(ProfilePage.objProfileIcon,"Profile page Icon"));{
            logger.info("TBD_LG_002, Login - verifyUsercanLoginWhenTSAisCreated is passed");
            extentLoggerPass("TBD_LG_002", "TBD_LG_002, Login - verifyUsercanLoginWhenTSAisCreated is passed");
            System.out.println("-----------------------------------------------------------");
        }
    }

    /**
     * Method to verify user can kill the App and Relaunch the app
     * @throws Exception
     */
    public void verifyIfUserCanKillTheAppAndRelaunchTheApp_TBD_LG_008() throws Exception{
        HeaderChildNode("TBD_LG_008, Login - verify if User Can Kill The App And Relaunch The App_TBD_LG_008");
        welcomeBackScreenUIValidation();
        tonikLogin(propertyFileReader("password","Login"));
        if(verifyElementDisplayed(LoginPage.objheadsUpLuvPopup)){
            click(LoginPage.objgotItButton,"Got It Button");
        }

        if(platform.equalsIgnoreCase("Android")) {
            closeAndroidTonikApp();
            relaunchApp("android");
        }else{
            scroll_To_Text(LoginPage.objlogOutButton,"name"," Log out");
        }
        tonikLogin(propertyFileReader("password","Login"));
        if(verifyElementDisplayed(LoginPage.objheadsUpLuvPopup)){
            click(LoginPage.objgotItButton,"Got It Button");
        }
        if(verifyElementPresent(ProfilePage.objProfileIcon,"Profile page Icon"));{
            logger.info("TBD_LG_008, Login - verify if User Can Kill The App And Relaunch The App_TBD_LG_008 is passed");
            extentLoggerPass("TBD_LG_008", "TBD_LG_008, Login - verify if User Can Kill The App And Relaunch The App_TBD_LG_008 is passed");
            System.out.println("-----------------------------------------------------------");
        }
    }

    /**
     * Method to verify user can log out from the profile screen and login again
     * @throws Exception
     */
    public void verifyIfUserCanLogoutFromProfileScreenAndLoginAgain_TBD_LG_009() throws Exception {
        HeaderChildNode("TBD_LG_002, Login - Verify if user can Login when TSA is created");
        welcomeBackScreenUIValidation();
        tonikLogin(propertyFileReader("password", "Login"));
        if (verifyElementDisplayed(LoginPage.objheadsUpLuvPopup)) {
            click(LoginPage.objgotItButton, "Got It Button");
        }
        verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile page Icon");
        if(platform.equalsIgnoreCase("Android")) {
            verticalSwipeTillElementDispalyed(LoginPage.objlogOutButton);
        }else{
            scroll_To_Text(LoginPage.objlogOutButton,"name"," Log out");
        }
        verifyElementPresentAndClick(LoginPage.objlogOutButton,"Logout Button");
        if(platform.equalsIgnoreCase("Android")) {
            relaunchApp("android");
        }else{
            new CommandBase(testName, udid, portNo);
        }
        tonikLogin(propertyFileReader("password","Login"));
        if(verifyElementDisplayed(LoginPage.objheadsUpLuvPopup)){
            click(LoginPage.objgotItButton,"Got It Button");
        }
        if(verifyElementPresent(ProfilePage.objProfileIcon,"Profile page Icon"));{
            logger.info("TBD_LG_009, Login - VerifyifusercanlogoutfromProfilescreenandloginagain_TBD_LG_009 is passed");
            extentLoggerPass("TBD_LG_009", "TBD_LG_009, Login - VerifyifusercanlogoutfromProfilescreenandloginagain_TBD_LG_009 is passed");
            System.out.println("-----------------------------------------------------------");
        }
    }

    /**
     * Method to verify user can attempt maximum invalid password in login
     * @throws Exception
     */
    public void verifyIfUserCanAttemptMaximumInvalidPasswordsInLogin_TBD_LG_006() throws Exception {
        HeaderChildNode("TBD_LG_006, Login - Verify if user can attempt maximum invalid passwords in Login_TBD_LG_006");
        welcomeBackScreenUIValidation();
        for(int i=0;i<=4;i++) {
            click(LoginPage.objEditPassword, "Password field");
            type(LoginPage.objEditPassword, propertyFileReader("Invalid", "Login"), "Enter secret code");
            verifyElementPresentAndClick(LoginPage.objLoginBtn, getTextVal(LoginPage.objLoginBtn, "Button"));
        }
        verifyElementPresent(LoginPage.objerrorContent,"");
        verifyElementPresent(LoginPage.objforgotPAssword,"Tonik Logo");
        verifyElementPresent(LoginPage.objcontactLink,"Tonik Logo");
    }
}
