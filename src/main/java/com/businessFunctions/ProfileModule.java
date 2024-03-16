package com.businessFunctions;

import com.driverInstance.CommandBase;
import com.driverInstance.DriverManager;
import com.pageObjects.pages.AndroidPages.ContactUsPage;
import com.pageObjects.pages.AndroidPages.LoginPage;
import com.pageObjects.pages.AndroidPages.OnBoardingPage;
import com.pageObjects.pages.AndroidPages.ProfilePage;
import com.utility.ExtentReporter;
import com.utility.Utilities;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import java.util.List;

import static com.utility.ExtentReporter.HeaderChildNode;
import static com.utility.Utilities.*;
import static com.utility.Utilities.verifyElementPresentAndClick;

public class ProfileModule extends BaseClass {
    public ProfileModule() {
        super();
    }

    String testName = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getName();
    String udid=Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("deviceName");
    String portNo=Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("portno");

//----------------------------Reusable methods--------------------------------


    /**
     * Reusable method to account information UI validations
     * @throws Exception
     */
    public void accountInformationUIValidation() throws Exception {
        HeaderChildNode("Account Information Details Screen UI Validation");
        if (verifyElementPresentAndClick(ProfilePage.objAccountInformation, "Account Information")) {
            if(verifyElementDisplayed(ProfilePage.objWeAreAlmostReady)){
                logger.info("We are Almost Ready Screen is Displayed");
                extentLoggerPass("Screen","We are Almost Ready Screen is Displayed");
            }
            verifyElementPresent(ProfilePage.objAccountDetails, "Header: Account Details");
            verifyElementPresent(ProfilePage.objBankNameOption, "Bank Name Option");
            verifyElementPresent(ProfilePage.objBankName, "Bank Name");
            verifyElementPresent(ProfilePage.objAccountNumberOption, "Account Number Option");
            verifyElementPresent(ProfilePage.objAccountNumber, "Account Number ");
            verifyElementPresent(ProfilePage.objAccountHolderOption, "Account Holder Option");
            verifyElementPresent(ProfilePage.objAccountHolder, "Account Number Name");

        }
    }

    /**
     * Reusable method to PersonalDetailsScreenUIValidation
     * @throws Exception
     */
    public void PersonalDetailsScreenUIValidation() throws Exception {
        HeaderChildNode(" Personal Details screen UI Validation");
        if (verifyElementPresentAndClick(ProfilePage.objPersonalDetails, "Personal Details")) {
            verifyElementPresent(ProfilePage.objPersonalDetailsHeader, "Header: Personal Details");
            containsValidation(getText(ProfilePage.objPersonalDetailsHeader), propertyFileReader("PersonalDetails", "Profile"), ": Header :Personal Details");
            containsValidation(getText(ProfilePage.objFirstNameOption), propertyFileReader("FirstName", "Profile"), ": First Name");
            verifyElementPresent(ProfilePage.objFirstName, getTextVal(ProfilePage.objFirstName, ": Header :First Name"));
            containsValidation(getText(ProfilePage.objMiddleNameOption), propertyFileReader("MiddleName", "Profile"), ":Middle Name");
            verifyElementPresent(ProfilePage.objMiddleName, getTextVal(ProfilePage.objMiddleName, ": Header :Middle Name"));
            containsValidation(getText(ProfilePage.objLastNameOption), propertyFileReader("LastName", "Profile"), ":Last Name");
            verifyElementPresent(ProfilePage.objLastName, getTextVal(ProfilePage.objLastName, ": Header :Last Name"));
            containsValidation(getText(ProfilePage.objGenderOption), propertyFileReader("Gender", "Profile"), ":Gender");
            verifyElementPresent(ProfilePage.objGender, getTextVal(ProfilePage.objGender, ": Header :Gender"));
            containsValidation(getText(ProfilePage.objDateOfBirthOption), propertyFileReader("DateOfBirth", "Profile"), ":Date Of Birth");
            verifyElementPresent(ProfilePage.objGender, getTextVal(ProfilePage.objGender, ":Gender"));
            verifyElementPresent(ProfilePage.objPlaceOfBirthOption, "Place Of Birth Option");
            containsValidation(getText(ProfilePage.objPlaceOfBirthOption), propertyFileReader("PlaceOfBirth", "Profile"), ":Place Of Birth");
            verifyElementPresent(ProfilePage.objPlaceOfBirth, getTextVal(ProfilePage.objPlaceOfBirth, ": Place of Birth"));
            containsValidation(getText(ProfilePage.objNationalityOption), propertyFileReader("Nationality", "Profile"), ":Nationality");
            verifyElementPresent(ProfilePage.objNationality, getTextVal(ProfilePage.objNationality, ":Nationality"));
            containsValidation(getText(ProfilePage.objRegisterIDOption), propertyFileReader("RegisterId", "Profile"), ":Register ID");
            verifyElementPresent(ProfilePage.objRegisterID, getTextVal(ProfilePage.objRegisterID, ":Register ID"));
            verifyElementPresent(ProfilePage.objIDNumberOption, "ID Number Option");
            containsValidation(getText(ProfilePage.objIDNumberOption), propertyFileReader("IDNumber", "Profile"), ":ID Number");
            verifyElementPresent(ProfilePage.objRegisterID, "ID Number");
            verifyElementPresent(ProfilePage.objRegisterID, getTextVal(ProfilePage.objRegisterID, ":Register ID"));
            if(platform.equalsIgnoreCase("Android")) {
                verticalSwipeTillElementDispalyed(ProfilePage.objIDExpiryDateOption);
            }else{
                scroll_To_Text(ProfilePage.objIDExpiryDateOption,"name"," Log out");
            }
            containsValidation(getText(ProfilePage.objIDExpiryDateOption), propertyFileReader("IDExpiryDate", "Profile"), ":ID Expiry date");
            verifyElementPresent(ProfilePage.objIDExpiryDate, getTextVal(ProfilePage.objIDExpiryDate, ":ID Expiry Date"));

        }
    }

    /**
     * Reusable method to Contact information screen UI validation
     * @throws Exception
     */
    public void contactInformationScreenUIValidation() throws Exception {
        HeaderChildNode(" contact Information Screen UI Validation");
        if (verifyElementPresentAndClick(ProfilePage.objContactInformation, "Contact Information")) {
            waitTime(5000);
            verifyElementPresent(ProfilePage.objContactInfoHeader, getTextVal(ProfilePage.objContactInfoHeader, ": Header : Contact Info"));
            assertionValidation(getText(ProfilePage.objContactInfoHeader), propertyFileReader("HeaderOfContactInfo", "Profile"), ": Header : Contact Info");
            verifyElementPresent(ProfilePage.objMailingAddress, getTextVal(ProfilePage.objMailingAddress, ": Mailing Address"));
            assertionValidation(getText(ProfilePage.objMailingAddress), propertyFileReader("MailingAddress", "Profile"), ": Mailing Address");
            verifyElementPresent(ProfilePage.objProvideYourCommunicationAddress, getTextVal(ProfilePage.objProvideYourCommunicationAddress, ": Mailing Address"));
            assertionValidation(getText(ProfilePage.objProvideYourCommunicationAddress), propertyFileReader("ProvideYourCommunicationAddress", "Profile"), ":Provide your communication address for all the communications");
            verifyElementPresent(ProfilePage.objMobileNumber, ": Mobile Number");
            verifyElementPresent(ProfilePage.objEmailAddress, ": Email Address");
            verifyElementPresent(ProfilePage.objVerifyNow, getTextVal(ProfilePage.objVerifyNow, ":Verify Now"));
            assertionValidation(getText(ProfilePage.objVerifyNow), propertyFileReader("VerifyNow", "Profile"), ":Verify Now");
        }


    }

    /**
     * Reusable method to Mailing address Screen UI validation
     * @throws Exception
     */

    public void mailingAddressScreenUIValidation() throws Exception {
        HeaderChildNode("Mailing Address Screen UI Validation");
        if (verifyElementPresentAndClick(ProfilePage.objMailingAddress, "Mailing Address")) {
            waitTime(5000);

            verifyElementPresent(ProfilePage.objMailingAddressHeader, getTextVal(ProfilePage.objMailingAddressHeader, ": Header : Mailing Address"));
            assertionValidation(getText(ProfilePage.objMailingAddressHeader), propertyFileReader("MailingAddress", "Profile"), ": Header : Mailing Address");
            verifyElementPresent(ProfilePage.objOfficialPrintedDocument, getTextVal(ProfilePage.objOfficialPrintedDocument, ": Official Printed Document"));
            assertionValidation(getText(ProfilePage.objOfficialPrintedDocument), propertyFileReader("OfficialPrintedDocument", "Profile"), ": Official printed Document");
            verifyElementPresent(ProfilePage.objCountryOfResidency, getTextVal(ProfilePage.objCountryOfResidency, ":Country Of resource code"));
            assertionValidation(getText(ProfilePage.objCountryOfResidency), propertyFileReader("CountryOfResidency", "Profile"), ":Country of Residency");
            verifyElementPresent(ProfilePage.objMailingAddressHeader, ": zip code field");
            verifyElementPresent(ProfilePage.objHowToFindYourZipCode, ": Hoe to find your Zip Code");
            verifyElementPresent(ProfilePage.objProvince, ": province");
            verifyElementPresent(ProfilePage.objCityMuncipality, ":City/Muncipality");
            if(platform.equalsIgnoreCase("Android")) {
                verticalSwipeTillElementDispalyed(ProfilePage.objHouseUnitFloor);
            }else{
                scroll_To_Text(ProfilePage.objHouseUnitFloor,"name"," Log out");
            }
            verifyElementPresent(ProfilePage.objBarangayTextField, "Barangay");
            verifyElementPresent(ProfilePage.objHouseUnitFloor, "House Unit floor");
            if(platform.equalsIgnoreCase("Android")) {
                verticalSwipeTillElementDispalyed(ProfilePage.objCountryOfResidency);
            }else{
                scroll_To_Text(ProfilePage.objCountryOfResidency,"name"," Log out");
            }

        }

    }

    /**
     * Reusable method to Additional information Screen UI validation
     * @throws Exception
     */
    public void additionalInformationScreenUIValidation() throws Exception {
        HeaderChildNode("Additional information Screen UI Validation");
        if (verifyElementPresentAndClick(ProfilePage.objAdditionalInformation, "Additional information")) {
            waitTime(5000);
            waitUntilElementVisible_NoCustomMessage(ProfilePage.objAdditionalInformationPageHeader);
            verifyElementPresent(LoginPage.objBackIcon, "Back icon on addition information page");
            verifyElementPresent(ProfilePage.objAdditionalInformationPageHeader, "Additional information Page Header");
            containsValidation(getText(ProfilePage.objAdditionalInformationPageHeader), propertyFileReader("AdditionalInformationPageHeader", "Profile"), ": Header : Additional information");
            verifyElementPresent(ProfilePage.objAdditionalInformationsubTitle, "Additional information Page Subtitle");
            assertionValidation(getText(ProfilePage.objAdditionalInformationsubTitle), propertyFileReader("AdditionalInformationSubTitle", "Profile"), ":Additional information subtitle");
            verifyElementPresent(ProfilePage.objCurrentEmploymentStatus, "Current Employment Status");
            verifyElementPresent(ProfilePage.objNameOfTheCompany, "Name of the Company");
            verifyElementPresent(ProfilePage.objMonthlyIncome, "Monthly income edit text field");
            verifyElementPresent(ProfilePage.objPurposeOfOpeningAnAccount, "Purpose of opening an account edit text field");
            verifyElementPresent(ProfilePage.objUpdateButton, "Update button");
        }
    }

    /**
     * Reusable method to App information screen UI validation
     * @throws Exception
     */
    public void AppInformationScreenUIValidation() throws Exception {
        HeaderChildNode("App information Screen UI Validation");
        if (verifyElementPresentAndClick(ProfilePage.objAppInformation, "Additional information")) {
            waitTime(5000);
            verifyElementPresent(ProfilePage.objAppInformationHeaderPage, "App information page header");
            assertionValidation(getText(ProfilePage.objAppInformationHeaderPage), propertyFileReader("AppInformationPageHeader", "Profile"), ":App information Page Header");
            assertionValidation(getText(ProfilePage.objAppVersionOption), propertyFileReader("AppVersionOption", "Profile"), ":App Version");
            assertionValidation(getText(ProfilePage.objDeviceNameOption), propertyFileReader("DeviceNameOption", "Profile"), ":App Version");
            assertionValidation(getText(ProfilePage.objDeviceVersionOption), propertyFileReader("DeviceVersionOption", "Profile"), ":App Version");
            assertionValidation(getText(ProfilePage.objDeviceModelOption), propertyFileReader("DeviceModelOption", "Profile"), ":App Version");
            assertionValidation(getText(ProfilePage.objOsVersionOption), propertyFileReader("OsVersionOption", "Profile"), ":App Version");
        }
    }

    //-----------------------------Test Methods---------------------------------------

    /**
     * Method To verify if account holder can access the Profile menu when TSA is not yet created
     * @throws Exception
     */
    public void verifyIfAccountHolderCanAccessTheProfileMenuWhenTSANotYetCreated_TBD_PRO_001() throws Exception {
        HeaderChildNode("TBD_PRO_001, Login - Verify if account holder can access the Profile menu when TSA is not yet created");
        tonikLogin(propertyFileReader("password", "Login"));

        if (verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile Icon")) {
            waitTime(5000);
            verifyElementPresent(ProfilePage.objProfileHeader, " : profile header");
            assertionValidation(getText(ProfilePage.objProfileHeader), propertyFileReader("ProfileHeader", "Profile"), ":Profile Header");
            verifyElementPresent(ProfilePage.objAccountInformation, " : profile header");
            containsValidation(getText(ProfilePage.objAccountInformation), propertyFileReader("Accountinformation", "Profile"), ":Account Information");
            verifyElementDisabled(ProfilePage.objPersonalDetailsDisabled, " : personal Details");
            verifyElementDisabled(ProfilePage.objContactInformationDisabled, " : Contact Information");
            verifyElementDisabled(ProfilePage.objAdditionalInformationDisabled, " : Additional information");
            verifyElementDisabled(ProfilePage.objRequestBankCertificateDisabled, " : Request Bank certificate");
            verifyElementEnabled(ProfilePage.objLogInOption, " : Login Option");
            verifyElementDisabled(ProfilePage.objAppInformationDisabled, " :App information");
            if(platform.equalsIgnoreCase("Android")) {
                verticalSwipeTillElementDispalyed(LoginPage.objlogOutButton);
            }else{
                scroll_To_Text(LoginPage.objlogOutButton,"name"," Log out");
            }
            verifyElementEnabled(ProfilePage.objResetApp, " : Reset App");
            verifyElementEnabled(ProfilePage.objLogOut, " : Logout Button");
            verifyElementPresentAndClick(LoginPage.objBackIcon, "Back icon");
            if (verifyElementDisplayed(ProfilePage.objProfileIcon)) {
                logger.info("TBD_PRO_001, Profile - Verify if account holder can access the Profile menu when TSA is not yet created");
                extentLoggerPass("TBD_PRO_001", "TBD_PRO_001, Profile - Verify if account holder can access the Profile menu when TSA is not yet created");
                System.out.println("-----------------------------------------------------------");
            }

        }
    }


    public void VerifyIfUserCanCreateTSAFromProfile_TBD_PRO_002() throws Exception {
        HeaderChildNode("TBD_PRO_002, Login - Verify If User Can Create TSA From Profile");
        tonikLogin(propertyFileReader("password", "Login"));

        if (verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile Icon")) {
            waitTime(5000);
            verifyElementPresent(ProfilePage.objProfileHeader, " : profile header");
            assertionValidation(getText(ProfilePage.objProfileHeader), propertyFileReader("ProfileHeader", "Profile"), ":Profile Header");
            verifyElementPresent(ProfilePage.objAccountInformation, " : profile header");
            containsValidation(getText(ProfilePage.objAccountInformation), propertyFileReader("Accountinformation", "Profile"), ":Account Information");
            verifyElementDisabled(ProfilePage.objPersonalDetailsDisabled, " : personal Details");
            verifyElementDisabled(ProfilePage.objContactInformationDisabled, " : Contact Information");
            verifyElementDisabled(ProfilePage.objAdditionalInformationDisabled, " : Additional information");
            verifyElementDisabled(ProfilePage.objRequestBankCertificateDisabled, " : Request Bank certificate");
            verifyElementEnabled(ProfilePage.objLogInOption, " : Login Option");
            verifyElementDisabled(ProfilePage.objAppInformationDisabled, " :App information");
            if(platform.equalsIgnoreCase("Android")) {
                verticalSwipeTillElementDispalyed(LoginPage.objlogOutButton);
            }else{
                scroll_To_Text(LoginPage.objlogOutButton,"name"," Log out");
            }
            verifyElementEnabled(ProfilePage.objResetApp, " : Reset App");
            verifyElementEnabled(ProfilePage.objLogOut, " : Logout Button");
            if(platform.equalsIgnoreCase("Android")) {
                Swipe("DOWN", 2);
            }else{
                scroll_To_Text(ProfilePage.objAccountInformation,"name"," Log out");
            }
            accountInformationUIValidation();
            verifyElementPresentAndClick(LoginPage.objBackIcon,"Back Icon");
            verifyElementEnabled(ProfilePage.objContactInformation, " : Contact Information");
            verifyElementEnabled(ProfilePage.objAdditionalInformation, " : Additional information");
            verifyElementEnabled(ProfilePage.objRequestBankCertificate, " : Request Bank certificate");
            verifyElementEnabled(ProfilePage.objLogInOption, " : Login Option");
            verifyElementEnabled(ProfilePage.objAppInformation, " :App information");
            if(platform.equalsIgnoreCase("Android")) {
                verticalSwipeTillElementDispalyed(LoginPage.objlogOutButton);
            }else{
                scroll_To_Text(LoginPage.objlogOutButton,"name"," Log out");
            }
            verifyElementEnabled(ProfilePage.objResetApp, " : Reset App");
            if (verifyElementEnabled(ProfilePage.objLogOut, " : Logout Button")) {
                logger.info("TBD_PRO_002, Profile - Verify If User Can Create TSA From Profile");
                extentLoggerPass("TBD_PRO_002", "TBD_PRO_002, Profile - Verify If User Can Create TSA From Profile");
                System.out.println("-----------------------------------------------------------");
            }


        }
    }

    /**
     * Method to verify If User Can Update Profile Picture
     *
     * @throws Exception
     */
    public void verifyIfUserCanUpdateProfilePicture_TBD_PRO_003() throws Exception {
        HeaderChildNode("TBD_PRO_003, Login - verify User can update profile picture");
        tonikLogin(propertyFileReader("password", "Login"));

        if (verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile Icon")) {
            waitTime(5000);
            verifyElementPresentAndClick(ProfilePage.objProfilePicture, "Profile Picture");
            verifyElementPresent(ProfilePage.objPickFromYourGallery, "Pick from Your Gallery");
            verifyElementPresentAndClick(ProfilePage.objTakeAPhoto, "Take a Photo");
            verifyElementPresentAndClick(ProfilePage.objSwitchCameraButton, "Switch camera Button");
            verifyElementPresentAndClick(ProfilePage.objCameraCloseButton, "Camera Close Button");
            waitTime(5000);
            verifyElementPresentAndClick(ProfilePage.objProfilePicture, "Profile Picture");
            waitTime(5000);
            verifyElementPresentAndClick(ProfilePage.objTakeAPhoto, "Take a Photo");
            verifyElementPresentAndClick(ProfilePage.objSwitchCameraButton, "Switch camera Button");
            waitTime(3000);
            verifyElementPresentAndClick(ProfilePage.objShutterButton, "Shutter Button");
            verifyElementPresentAndClick(ProfilePage.objDoneButton, "Done Button");
            //There is no attributes to pick the pHoto from Gallery
            logger.info("TBD_PRO_003, Profile - verify User can update profile picture");
            extentLoggerPass("TBD_PRO_003", "TBD_PRO_003, Profile - verify User can update profile picture");
        }
    }


    public  void verifyUserCanUpdateProfileName_TDB_PRO_004() throws Exception{
        ExtentReporter.HeaderChildNode("verify user can update the profile name");
        tonikLogin(propertyFileReader("password", "Login"));
        verifyElementPresentAndClick(ProfilePage.objProfileIcon,"Profile icon");
        waitTime(5000);
        verifyElementPresent(ProfilePage.objProfileHeader," : profile header");
        assertionValidation(getText(ProfilePage.objProfileHeader), propertyFileReader("ProfileHeader", "Profile"), ":Profile Header");
        String currentProfileName = getText(ProfilePage.objProfileName);
        verifyElementPresentAndClick(ProfilePage.objProfileName,"Profile name");
        verifyElementPresent(ProfilePage.objHowShouldWeCallYouScreen," : How should we call you screen");
        assertionValidation(getText(ProfilePage.objHowShouldWeCallYouScreen), propertyFileReader("HowShouldWeCallYou", "Profile"), ":How should we call you");
        verifyElementPresentAndClick(ProfilePage.objNicknameTextField,"Nickname text field");
        clearField(ProfilePage.objNicknameTextField,"NickName Text field");
        Utilities.type(ProfilePage.objNicknameTextField,"Lion123","text_field");
        hideKeyboard();
        verifyElementPresentAndClick(ProfilePage.objConfirmNickNameButton,"Confirm Nickname Button");
        verifyElementPresent(ProfilePage.objInlineErrorMessage,"Inline error message");
        if(platform.equalsIgnoreCase("Android")) {
            clearField(ProfilePage.objNicknameTextField, "NickName Text field");
        }else{
            verifyElementPresentAndClick(ProfilePage.objnicknameTextFieldOne,"Nickname text field");
            clearField(ProfilePage.objnicknameTextFieldOne,"NickName Text field");
        }
        Utilities.type(ProfilePage.objNicknameTextField,"Lion@123","text_field");
        hideKeyboard();
        verifyElementPresentAndClick(ProfilePage.objConfirmNickNameButton,"Confirm Nickname Button");
        verifyElementPresent(ProfilePage.objInlineErrorMessage,"Inline error message");
        clearField(ProfilePage.objNicknameTextField,"NickName Text field");
        Utilities.type(ProfilePage.objNicknameTextField,generateRandomString(4),"text_field");
        verifyElementPresentAndClick(ProfilePage.objConfirmNickNameButton,"Confirm Nickname Button");
        String UpdatedProfileName = getText(ProfilePage.objProfileName);
        if(UpdatedProfileName != currentProfileName){
            logger.info("TBD_PRO_004, Profile - verify user can update the profile name is passed");
            extentLoggerPass("TBD_PRO_005", "TBD_PRO_005, Profile - verify user can update the profile name is passed");
            System.out.println("-----------------------------------------------------------");
        }

    }


    /**
     * Method to Verify if user can copy the account details
     * @throws Exception
     */
    public void VerifyIfUserCanCopyTheAccountDetails_TBD_PRO_005() throws Exception {
        HeaderChildNode("TBD_PRO_005, Login - Verify if user can copy the Account details");
        tonikLogin(propertyFileReader("password", "Login"));

        if (verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile Icon")) {
            waitTime(5000);
            accountInformationUIValidation();
            verifyElementPresentAndClick(ProfilePage.objBankNameCopyIcon, "Bank Name Copy Icon");
            verifyElementPresent(ProfilePage.objCopiedToYourClipBoard, "Copied To your Clip Board toast Message");
            verifyElementPresentAndClick(ProfilePage.objAccountNumberCopyIcon, "Account Number Copy Icon");
            verifyElementPresent(ProfilePage.objCopiedToYourClipBoard, "Copied To your Clip Board toast Message");
            verifyElementPresentAndClick(ProfilePage.objAccountHolderCopyIcon, "Account Number Copy Icon");
            verifyElementPresent(ProfilePage.objCopiedToYourClipBoard, "Copied To your Clip Board toast Message");
            verifyElementPresentAndClick(ProfilePage.objBackIcon, "Back Icon In account Information Page");
            if (verifyElementPresent(ProfilePage.objProfilePicture, "Profile Picture")) {
                logger.info("TBD_PRO_005, Profile - VerifyifusercancopytheAccountdetails_TBD_PRO_005 is passed");
                extentLoggerPass("TBD_PRO_005", "TBD_PRO_005, Profile - VerifyifusercancopytheAccountdetails_TBD_PRO_005 is passed");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }

    /**
     * Method to varify if user can view the personal details
     * @throws Exception
     */
    public void VerifyIfUserCanViewThePersonalDetails_TBD_PRO_006() throws Exception {
        HeaderChildNode("TBD_PRO_006, Login - Verify if user can view the Personal Details");
        tonikLogin(propertyFileReader("password", "Login"));

        if (verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile Icon")) {
            waitTime(5000);
            PersonalDetailsScreenUIValidation();
            verifyElementPresentAndClick(ProfilePage.objContactTonicCustomerCare, "Contact Tonik Customare Care Hyper Link");
            verifyElementPresent(ContactUsPage.objPageHeader, "Get In Touch Screen");
            verifyElementPresentAndClick(ProfilePage.objBackIcon, "Back Icon");
            verifyElementPresent(ProfilePage.objPersonalDetailsHeader, "Header: Personal Details");
            verifyElementPresentAndClick(ProfilePage.objBackIcon, "Back Icon");
            if (verifyElementPresent(ProfilePage.objProfileHeader, "Header: Profile")) {
                logger.info("TBD_PRO_006, Profile - Verify if user can view the Personal Details is passed");
                extentLoggerPass("TBD_PRO_006", "TBD_PRO_006, Profile - Verify if user can view the Personal Details_TBD_PRO_006 is passed");
                System.out.println("-----------------------------------------------------------");
            }


        }
    }

    /**
     * Method to verify if user can view the contact information
     * @throws Exception
     */
    public void VerifyIfUserCanViewTheContactInformation_TBD_PRO_007() throws Exception {
        HeaderChildNode("TBD_PRO_007, Profile -Verify if user can view the contact information");
        tonikLogin(propertyFileReader("password", "Login"));

        if (verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile Icon")) {
            waitTime(5000);
            contactInformationScreenUIValidation();
            verifyElementPresentAndClick(ProfilePage.objBackIcon, "Back Icon In Contact Information Page");
            if (verifyElementPresent(ProfilePage.objProfileHeader, "Header: Profile")) {
                logger.info("TBD_PRO_007, Profile - Verify if user can view the contact information is passed");
                extentLoggerPass("TBD_PRO_007", "TBD_PRO_007, Profile - Verify if user can view the contact information_TBD_PRO_007 is passed");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }

    /**
     * Method to verify if user can update the mailing address
     * @throws Exception
     */
    public void VerifyIfUserCanUpdateTheMailingAddress_TBD_PRO_008() throws Exception {
        HeaderChildNode("TBD_PRO_008, Profile -Verify if user can update the Mailing Address");
        tonikLogin(propertyFileReader("password", "Login"));

        if (verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile Icon")) {
            waitTime(5000);
            contactInformationScreenUIValidation();
            mailingAddressScreenUIValidation();
            if(platform.equalsIgnoreCase("Android")) {
                Swipe("DOWN", 2);
            }else{
                scroll_To_Text(ProfilePage.objAccountInformation,"name"," Log out");
            }
            verifyElementPresentAndClick(ProfilePage.objZipCodeTextBox, "zipcode text box");
            type(ProfilePage.objZipCodeTextBox, propertyFileReader("Invalidzipcode", "Profile"), "invalid zip code");
            verifyElementPresentAndClick(ProfilePage.objApplyZipCode, "Apply Zip code");
            assertionValidation(getText(ProfilePage.objEnterValidZipCode), propertyFileReader("InlineErrorMessage", "Profile"), ":Please Enter a valid Zipcode");
            verifyElementPresentAndClick(ProfilePage.objZipCodeTextBox, "zipcode text box");
            type(ProfilePage.objZipCodeTextBox, propertyFileReader("ValidZipcode", "Profile"), "Valid zip code");
            verifyElementPresentAndClick(ProfilePage.objApplyZipCode, "Apply Zip code");
            verifyElementPresent(ProfilePage.objProvince, ": province");
            verifyElementPresent(ProfilePage.objCityMuncipality, ":City/Muncipality");
            if(platform.equalsIgnoreCase("Android")) {
                verticalSwipeTillElementDispalyed(ProfilePage.objHouseUnitFloor);
            }else{
                scroll_To_Text(ProfilePage.objHouseUnitFloor,"name"," Log out");
            }
            verifyElementPresentAndClick(ProfilePage.objBarangayTextField, "Barangay Text field");
            verifyElementPresent(ProfilePage.objFindYourBarangay, ":Header : find Your Barangay");
            List<WebElement> barangay = DriverManager.getAppiumDriver().findElementsByXPath("//*[contains(@text,'Type here to search')]/following::android.widget.TextView");
            for (int count = 0; count < barangay.size(); count++) {
                String barangayName = barangay.get(count).getText();
                logger.info("The barangay name is :" + barangayName);

            }
            verifyElementPresent(ProfilePage.objBarangaySearchField, ":Header : find Your Barangay Search field");
            type(ProfilePage.objBarangaySearchField, propertyFileReader("PostProperNorthside", "Profile"), "POST PROPER NORTHSIDE");
            verifyElementPresentAndClick(ProfilePage.objSearchedBarangay, ":Searched Barangay");
            verifyElementPresentAndClick(ProfilePage.objHouseUnitFloor, ":HouseUnit floor");
            type(ProfilePage.objHouseUnitFloor, propertyFileReader("Houseunitfloor", "Profile"), "House unit floor");
            verifyElementPresentAndClick(ProfilePage.objConfirmButton, ":Confirm Butrton");
            if (verifyElementDisplayed(ProfilePage.objNewMailingAddress)) {
                logger.info("TBD_PRO_008, Profile - Verify if user can update the Mailing Address");
                extentLoggerPass("TBD_PRO_008", "TBD_PRO_008, Profile -Verify if user can update the Mailing Address is passed");
                System.out.println("-----------------------------------------------------------");
            }


        }


    }

    /**
     * Method to verify if user can update the mobile number
     * @throws Exception
     */
    public void VerifyIfUserCanUpdateTheMobileNumber_TBD_PRO_009() throws Exception {
        HeaderChildNode("TBD_PRO_009, Profile -Verify if user can update the Mobile Number");
        tonikLogin(propertyFileReader("password", "Login"));

        if (verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile Icon")) {
            waitTime(8000);
            waitForElementToBePresent(ProfilePage.objContactInformation, 20, "Profile Picture");
            if (verifyElementPresentAndClick(ProfilePage.objContactInformation, "Contact Information")) {
                verifyElementPresent(ProfilePage.objContactInfoHeader, getTextVal(ProfilePage.objContactInfoHeader, ": Header : Contact Info"));
                assertionValidation(getText(ProfilePage.objContactInfoHeader), propertyFileReader("HeaderOfContactInfo", "Profile"), ": Header : Contact Info");
                verifyElementPresent(ProfilePage.objMailingAddress, getTextVal(ProfilePage.objMailingAddress, ": Mailing Address"));
                assertionValidation(getText(ProfilePage.objMailingAddress), propertyFileReader("MailingAddress", "Profile"), ": Mailing Address");
            }
            verifyElementPresentAndClick(ProfilePage.objMobileNumberHeader, "Mobile Number Header");
            verifyElementPresent(ProfilePage.objYouNeedToContactTonikCustomer, "You Need To contact Tonik Customer care");
            assertionValidation(getText(ProfilePage.objYouNeedToContactTonikCustomer), propertyFileReader("YouNeedToContactTonikCustomerCare", "Profile"), ":You Need To Contact Tonik Customer Care");
            verifyElementPresent(ProfilePage.objContactTonikButton, "Contact Tonik Button");
            verifyElementPresent(ProfilePage.objGoBackButtonOnPopup, "Go Back Button");
            click(ProfilePage.objContactTonikButton, "Contact Tonik Button");
            verifyElementPresent(ContactUsPage.objPageHeader, "Get In Touch");
            verifyElementPresentAndClick(LoginPage.objBackIcon, "Back Button");
            if (verifyElementDisplayed(ProfilePage.objContactInfoHeader)) {
                logger.info("TBD_PRO_009, Profile - Verify if user can update the Mobile Number");
                extentLoggerPass("TBD_PRO_009", "TBD_PRO_009, Profile -Verify if user can update the Mobile Number is passed");
                System.out.println("-----------------------------------------------------------");
            }

        }


    }

    /**
     * Method to verify if user can update the mailing address
     * @throws Exception
     */
    public void VerifyIfUserCanUpdateTheEmailAddress_TBD_PRO_010() throws Exception {
        HeaderChildNode("TBD_PRO_010, Profile -Verify if user can update the Email address");
        tonikLogin(propertyFileReader("password", "Login"));

        if (verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile Icon")) {
            waitTime(5000);
            if (verifyElementPresentAndClick(ProfilePage.objContactInformation, "Contact Information")) {
                verifyElementPresent(ProfilePage.objContactInfoHeader, getTextVal(ProfilePage.objContactInfoHeader, ": Header : Contact Info"));
                assertionValidation(getText(ProfilePage.objContactInfoHeader), propertyFileReader("HeaderOfContactInfo", "Profile"), ": Header : Contact Info");
                verifyElementPresent(ProfilePage.objUpdatedCommunicationAddress, ":Updated Communication Address");

            }
            verifyElementPresentAndClick(ProfilePage.objVerifyNow, getTextVal(ProfilePage.objVerifyNow, ":Verify Now"));
            assertionValidation(getText(ProfilePage.objVerifyNow), propertyFileReader("VerifyNow", "Profile"), ":Verify Now");
            verifyElementPresent(ProfilePage.objVerifyNowEmailPopup, ":Verify Now Email popup");
            verifyElementPresent(ProfilePage.objVerifyNowButtonOnPopup, ":Verify Now Button on Email popup");
            verifyElementPresentAndClick(ProfilePage.objUpdateYourEmailButtonOnEmailPopup, ":Update your Button on Email popup");
            verifyElementPresent(ProfilePage.objPickANewEmail, ":Pick A New Email Header");
            assertionValidation(getText(ProfilePage.objPickANewEmail), propertyFileReader("PickANewEmail", "Profile"), ":Pick A New Email");
            verifyElementPresentAndClick(ProfilePage.objEmailAddressEditTextField,"Email Address Edit Text Field");
            clearField(ProfilePage.objEmailAddressEditTextField,"Email Address Edit Text Field");
            type(ProfilePage.objEmailAddressEditTextField,propertyFileReader("InvalidEmail","Profile"),"Enter Invalid Email Address");
            verifyElementPresentAndClick(LoginPage.objNextBtn, getTextVal(OnBoardingPage.objNextBtn, ": Button"));
            verifyElementPresent(ProfilePage.objErrorMessageInEmailAddressField,"Inline Error Message In Email Address Field");
            click(ProfilePage.objEmailAddressEditTextField,"Email Address Edit Text Field");
            clearField(ProfilePage.objEmailAddressEditTextField,"Email Address Edit Text Field");
            type(ProfilePage.objEmailAddressEditTextField,generateRandomEmail(),"Email Address Edit Text Field");
            hideKeyboard();
            verifyElementPresentAndClick(LoginPage.objNextBtn, getTextVal(OnBoardingPage.objNextBtn, ": Button"));
            verifyElementPresent(ProfilePage.objVerifyYourEmail, ":Verify Your Email Header");
            assertionValidation(getText(ProfilePage.objVerifyYourEmail), propertyFileReader("VerifyYourEmail", "Profile"), ":Verify Your Email");

        }


    }

    /**
     * Method to Verify if user can view the additional information
     * @throws Exception
     */
    public void VerifyIfUserCanViewAdditionalInformation_TBD_PRO_011() throws Exception {
        HeaderChildNode("TBD_PRO_011, Profile -Verify if user can view Additional Information");
        tonikLogin(propertyFileReader("password", "Login"));

        if (verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile Icon")) {
            waitTime(5000);
            additionalInformationScreenUIValidation();
            verifyElementPresentAndClick(LoginPage.objBackIcon, "BAck icon");
            if (verifyElementDisplayed(ProfilePage.objProfileHeader)) {
                logger.info("TBD_PRO_011, Profile - Verify if user can view Additional Information");
                extentLoggerPass("TBD_PRO_009", "TBD_PRO_009, Profile -Verify if user can view Additional Information is passed");
                System.out.println("-----------------------------------------------------------");
            }

        }
    }

    /**
     * Method to verify if user can edit current employment status
     * @throws Exception
     */
    public void VerifyIfUserCanEditCurrentEmploymentStatus_TBD_PRO_012() throws Exception {
        HeaderChildNode("TBD_PRO_012, Profile -Verify if user can edit Current employment status and purpose of opening account");
        tonikLogin(propertyFileReader("password", "Login"));

        if (verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile Icon")) {
            waitTime(5000);
            additionalInformationScreenUIValidation();
            verifyElementPresentAndClick(ProfilePage.objCurrentEmploymentStatusLockIcon, "current employment lock icon");
            verifyElementPresent(ProfilePage.objLockIconPopup, "Popup");
            verifyElementPresentAndClick(ProfilePage.objOkayButtonOnLockIconPopup, "Okay button on popup");
            verifyElementPresentAndClick(ProfilePage.objCurrentEmploymentStatusLockIcon, "current employment lock icon");
            verifyElementPresent(ProfilePage.objLockIconPopup, "Popup");
            verifyElementPresentAndClick(ProfilePage.objContactTonikCustomerCareButtonOnLockIconPopup, "Contact tonik customer care button");
            verifyElementPresentAndClick(LoginPage.objBackIcon, "Back icon on addition information page");
            verifyElementPresentAndClick(ProfilePage.objPurposeOfOpeningAnAccountLockIcon, "Purpose of opening an account lock icon");
            verifyElementPresent(ProfilePage.objLockIconPopup, "Popup");
            verifyElementPresentAndClick(ProfilePage.objOkayButtonOnLockIconPopup, "Okay button on popup");
            verifyElementPresentAndClick(ProfilePage.objCurrentEmploymentStatusLockIcon, "current employment lock icon");
            verifyElementPresent(ProfilePage.objLockIconPopup, "Popup");
            verifyElementPresentAndClick(ProfilePage.objContactTonikCustomerCareButtonOnLockIconPopup, "Contact tonik customer care button");
            if (verifyElementDisplayed(ContactUsPage.objPageHeader)) {
                logger.info("TBD_PRO_012, Profile - Verify if user can edit Current employment status");
                extentLoggerPass("TBD_PRO_012", "TBD_PRO_0012, Profile -Verify if user can edit Current employment status is passed");
                System.out.println("-----------------------------------------------------------");
            }

        }
    }

    /**
     * Method to verify if user can edit purpose of opening account
     * @throws Exception
     */

    public void VerifyIfUserCanEditPurposeOfOpeningAccountTBD_PRO_15() throws Exception {
        HeaderChildNode("TBD_PRO_012 and TBD_PRO_015 , Profile -Verify if user can edit Current employment status and purpose of opening account");
        tonikLogin(propertyFileReader("password", "Login"));

        if (verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile Icon")) {
            waitTime(5000);
            additionalInformationScreenUIValidation();
            verifyElementPresentAndClick(ProfilePage.objPurposeOfOpeningAnAccountLockIcon, "Purpose of opening an account lock icon");
            verifyElementPresent(ProfilePage.objLockIconPopup, "Popup");
            verifyElementPresentAndClick(ProfilePage.objOkayButtonOnLockIconPopup, "Okay button on popup");
            verifyElementPresentAndClick(ProfilePage.objCurrentEmploymentStatusLockIcon, "current employment lock icon");
            verifyElementPresent(ProfilePage.objLockIconPopup, "Popup");
            verifyElementPresentAndClick(ProfilePage.objContactTonikCustomerCareButtonOnLockIconPopup, "Contact tonik customer care button");
            if (verifyElementDisplayed(ContactUsPage.objPageHeader)) {
                logger.info("TBD_PRO_015, Profile - Verify if user can edit purpose of opening account");
                extentLoggerPass("TBD_PRO_015", "TBD_PRO_015, Profile -Verify if user can edit purpose of opening account is passed");
                System.out.println("-----------------------------------------------------------");
            }

        }
    }

    /**
     * Method to verify if user can edit the name of the company
     * @throws Exception
     */
    public void VerifyIfUserCanEditTheNameOfTheCompanyTBD_PRO_13() throws Exception {
        HeaderChildNode("TBD_PRO_013, Profile -Verify if user can edit the Name of the company and monthly income and Update the Additional Information");
        tonikLogin(propertyFileReader("password", "Login"));
        if (verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile Icon")) {
            waitTime(8000);
            additionalInformationScreenUIValidation();
            verifyElementPresentAndClick(ProfilePage.objNameOfTheCompany, "Name of the company edit text box");
            type(ProfilePage.objNameOfTheCompany, propertyFileReader("NameOfTheCompany", "Profile"), "Name Of the Company");
            hideKeyboard();
            logger.info("TBD_PRO_013, Profile - Verify if user can edit the Name of the company");
            extentLoggerPass("TBD_PRO_0013", "TBD_PRO_0013, Profile -Verify if user can edit the Name of the company is passed");
            System.out.println("-----------------------------------------------------------");
        }
    }

    /**
     * Method to verify if user can edit the monthly income
     * @throws Exception
     */
    public void VerifyIfUserCanEdiTheMonthlyIncomeTBD_PRO_14() throws Exception {
        HeaderChildNode("TBD_PRO_014, Profile -Verify if user can edit the monthly income");
        tonikLogin(propertyFileReader("password", "Login"));

        if (verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile Icon")) {
            waitTime(8000);
            additionalInformationScreenUIValidation();
            verifyElementPresentAndClick(ProfilePage.objMonthlyIncome, "Monthly income");
            type(ProfilePage.objMonthlyIncome, propertyFileReader("LessMonthlyIncome", "Profile"), "Monthly Income Lessthan 100");
            verifyElementPresent(ProfilePage.objGraydoutUpdateButton, "Graydout Update Button");
            hideKeyboard();
            verifyElementPresentAndClick(ProfilePage.objNameOfTheCompany, "Click on the Screen");
            hideKeyboard();
            verifyElementPresent(ProfilePage.objInlineErrorMessageForMonthlyIncome, "Inline Error Message for less thsn monthly income");
            containsValidation(getText(ProfilePage.objInlineErrorMessageForMonthlyIncome), propertyFileReader("MonthlyIncomeInlineErrorMessage", "Profile"), ":Monthly income inline error message");
            type(ProfilePage.objMonthlyIncome, propertyFileReader("MoreMonthlyIncome", "Profile"), "Monthly Income Morethan");
            verifyElementPresent(ProfilePage.objGraydoutUpdateButton, "Graydout Update Button");
            if (verifyElementPresent(ProfilePage.objInlineErrorMessageForMonthlyIncome, "Inline Error Message for less thsn monthly income")) {
                logger.info("TBD_PRO_014, Profile - Verify if user can edit the monthly income");
                extentLoggerPass("TBD_PRO_0014", "TBD_PRO_0014, Profile -Verify if user can edit the Monthly income is passed");
                System.out.println("-----------------------------------------------------------");

            }

        }
    }

    /**
     * Method to verify user can update the additional information
     * @throws Exception
     */
    public void VerifyIfUserCanUpdateTheAdditionalInfoTBD_PRO_16() throws Exception {
        HeaderChildNode("TBD_PRO_016, Profile -Verify if user can Update the Additional Information");
        tonikLogin(propertyFileReader("password", "Login"));

        if (verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile Icon")) {
            waitTime(5000);//app loader is Displayed
            additionalInformationScreenUIValidation();
            String CurrentCompanyName = getText(ProfilePage.objNameOfTheCompany);
            verifyElementPresentAndClick(ProfilePage.objNameOfTheCompany, "Comapny Name Text Field");
            clearField(ProfilePage.objNameOfTheCompany, "Company name ");
            type(ProfilePage.objNameOfTheCompany, propertyFileReader("UpdatedCompanyName", "Profile"), "updated Company name ");
            hideKeyboard();
            String CurrentMonthlyIncome = getText(ProfilePage.objMonthlyIncome);
            verifyElementPresentAndClick(ProfilePage.objMonthlyIncome, "Monthly income edit Text Field");
            clearField(ProfilePage.objMonthlyIncome, "Monthly incomeText field");
            type(ProfilePage.objMonthlyIncome, propertyFileReader("UpdatedMonthlyIncome", "Profile"), "updated Monthly income");
            hideKeyboard();
            verifyElementPresentAndClick(ProfilePage.objUpdateButton, "Update Button");
            verifyElementPresentAndClick(ProfilePage.objAdditionalInformation, "additional Information");
            String UpdatedCompanyName = getText(ProfilePage.objNameOfTheCompany);
            if (CurrentCompanyName != UpdatedCompanyName) {
                logger.info("User can able to Edit the Company Name Field");
                extentLoggerPass("TBD_PRO_0016", "TBD_PRO_0016, Profile -User can able to Edit the Company Name Field");
            }
            String UpdatedMonthlyIncome = getText(ProfilePage.objMonthlyIncome);
            if (CurrentMonthlyIncome != UpdatedMonthlyIncome) {
                logger.info("User can able to Edit the Monthly Income Field");
                extentLoggerPass("TBD_PRO_0016", "TBD_PRO_0016, Profile -User can able to Edit the Monthly Income Field");
            }


        }
    }

    /**
     * Method to verify user can view the "List of login" option
     * @throws Exception
     */
    public void VerifyIfUserCanViewTheListOfLoginOptions_TBD_PRO_18() throws Exception {
        HeaderChildNode("TBD_PRO_018, Profile -Verify if user can view the list of Log-in options");
        tonikLogin(propertyFileReader("password", "Login"));

        if (verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile Icon")) {
            waitTime(5000);
            verifyElementPresentAndClick(ProfilePage.objLogInOption, "Log-In Options");
            verifyElementPresent(ProfilePage.objLogInOptionPageHeader, "Log-In Options page Header");
            verifyElementPresent(ProfilePage.objResetPasswordOnLoginOptionPage, "Reset Password");
            containsValidation(getText(ProfilePage.objLogInOptionPageHeader), propertyFileReader("LoginOptionsPageHeader", "Profile"), ":Login Options page header");
            containsValidation(getText(ProfilePage.objResetPasswordOnLoginOptionPage), propertyFileReader("ResetPassword", "Profile"), "Reset Password");
            containsValidation(getText(ProfilePage.objDefaultLoginOption), propertyFileReader("DefaultLoginOption", "Profile"), "Default login option");
            verifyElementPresentAndClick(LoginPage.objBackIcon, "Back icon on Login option page");
        }
        if (verifyElementDisplayed(ProfilePage.objProfileHeader)) {
            logger.info("TBD_PRO_018, Profile - Verify if user can view the list of Log-in options");
            extentLoggerPass("TBD_PRO_018", "TBD_PRO_0018, Profile -Verify if user can view the list of Log-in options is passed");
            System.out.println("-----------------------------------------------------------");
        }
    }

    /**
     * Method to verify if user can view and update the app information
     * @throws Exception
     */
    public void VerifyIfUserCanViewAndCopyTheAppInformation_TBD_PRO_22() throws Exception {
        HeaderChildNode("TBD_PRO_022, Profile -Verify if user can view and Copy the app information");
        tonikLogin(propertyFileReader("password", "Login"));

        if (verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile Icon")) {
            waitTime(5000);
            AppInformationScreenUIValidation();
            verifyElementPresentAndClick(ProfilePage.objCopiedToYourClipBoard, "Copy To Clip Board");
            verifyElementPresentAndClick(LoginPage.objBackIcon, "Copy To Clip Board");
            if (verifyElementDisplayed(ProfilePage.objProfileIcon)) {

                logger.info("TBD_PRO_022, Profile - Verify if user can view and Copy the app information");
                extentLoggerPass("TBD_PRO_022", "TBD_PRO_0022, Profile -Verify if user can view and Copy the app information is passed");
                System.out.println("-----------------------------------------------------------");
            }

        }
    }

    /**
     * Method to verify user can Log out of Tonik app
     * @throws Exception
     */
    public void verifyUserCanLogoutOfTonikApp_TBD_LG_0024() throws Exception {
        HeaderChildNode("TBD_LG_024, Profile - Verify if user can Logout of Tonik App");
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
        verifyElementPresentAndClick(LoginPage.objlogOutButton, "Logout Button");
        if(platform.equalsIgnoreCase("Android")) {
            relaunchApp("android");
        }else{
            new CommandBase(testName, udid, portNo);
        }
        tonikLogin(propertyFileReader("password", "Login"));
        if (verifyElementDisplayed(LoginPage.objheadsUpLuvPopup)) {
            click(LoginPage.objgotItButton, "Got It Button");
        }
        if (verifyElementPresent(ProfilePage.objProfileIcon, "Profile page Icon")) ;
        {
            logger.info("TBD_LG_024, Profile- Verify if user can Logout of Tonik App is passed");
            extentLoggerPass("TBD_LG_024", "TBD_LG_002, Profile - Verify if user can Logout of Tonik App is passed");
            System.out.println("-----------------------------------------------------------");
        }
    }

    /**
     * Method to Verify the profile screen if user is onboarded as BKYC
     * @throws Exception
     */
    public void VerifyTheProfileScreenIfUserIsOnboardedAsBKYC_TBD_PRO_025() throws Exception {
        HeaderChildNode("TBD_PRO_025, Profile - Verify the Profile screen if user is onboarded as BKYC");
        tonikLogin(propertyFileReader("password", "Profile"));

        if (verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile Icon")) {
            waitTime(5000);
            verifyElementPresent(ProfilePage.objProfileHeader, " : profile header");
            assertionValidation(getText(ProfilePage.objProfileHeader), propertyFileReader("ProfileHeader", "Profile"), ":Profile Header");
            verifyElementPresent(ProfilePage.objYourAccountLimitIs, " : Your Account Limit Is");
            assertionValidation(getText(ProfilePage.objYourAccountLimitIs), propertyFileReader("YourAccountLimitIs", "Profile"), ":Your Account Limit Is");
            assertionValidation(getText(ProfilePage.objGetHigherLimitIs), propertyFileReader("GetHigherLimits", "Profile"), ":Get Higher Limits");
            assertionValidation(getText(ProfilePage.objAccountInformation), propertyFileReader("Accountinformation", "Profile"), ":Account Information");
            verifyElementEnabled(ProfilePage.objPersonalDetails, " : personal Details");
            verifyElementEnabled(ProfilePage.objContactInformation, " : Contact Information");
            verifyElementEnabled(ProfilePage.objAdditionalInformation, " : Additional information");
            verifyElementEnabled(ProfilePage.objRequestBankCertificate, " : Request Bank certificate");
            scrollToBottomOfPage();
            verifyElementEnabled(ProfilePage.objLogInOption, " : Login Option");
            verifyElementEnabled(ProfilePage.objAppInformationDisabled, " :App information");
            verifyElementEnabled(ProfilePage.objResetApp, " : Reset App");
            verifyElementEnabled(ProfilePage.objLogOut, " : Logout Button");
            verifyElementPresentAndClick(LoginPage.objBackIcon, "Back icon");
            if (verifyElementDisplayed(ProfilePage.objProfileIcon)) {
                logger.info("TBD_PRO_025, Profile - Verify if account holder can access the Profile menu when TSA is not yet created");
                extentLoggerPass("TBD_PRO_025", "TBD_PRO_001, Profile - Verify if account holder can access the Profile menu when TSA is not yet created");
                System.out.println("-----------------------------------------------------------");
            }

        }
    }


    /**
     * Method to verify if user can reset the app
     * @throws Exception
     */
    public void verifyIfUserCanResetTheApp_TBD_LG_023() throws Exception {
        HeaderChildNode("TBD_LG_024, Profile - Verify if user can Reset the App");
        OnboardingModule onboardingModule = new OnboardingModule();
        tonikLogin(propertyFileReader("password", "Login"));
        if (verifyElementDisplayed(LoginPage.objheadsUpLuvPopup)) {
            click(LoginPage.objgotItButton, "Got It Button");
        }
        verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile page Icon");
        scrollToBottomOfPage();
        String BeforeRestAppVersion = getText(ProfilePage.objAppVersion);
        verifyElementPresentAndClick(ProfilePage.objResetApp, "Reset App");
        if (verifyElementPresent(ProfilePage.objResetAppPopUp, "Reset App Popup")) {
            verifyElementPresent(ProfilePage.objResetAppButton, "Reset App Button on Popup");
            verifyElementPresent(ProfilePage.objTAkeMeBack, "Take Button on Popup");
        }
        scrollToBottomOfPage();
        verifyElementPresentAndClick(ProfilePage.objResetApp, "Reset App");
        verifyElementPresent(ProfilePage.objResetAppPopUp, "Reset App Popup");
        verifyElementPresentAndClick(ProfilePage.objResetAppButton, "Reset App Button on Popup");
        if(platform.equalsIgnoreCase("Android")) {
            relaunchApp("android");
        }else{
            new CommandBase(testName, udid, portNo);
        }
        onboardingModule.navigateToCreatePage();
        verifyElementPresentAndClick(OnBoardingPage.objLoginHereLink, ": Login Here Link");
        assertionValidation(getText(ProfilePage.objEnterYourRegisterMobileNumber), propertyFileReader("EnterYourRegisterMobileNumber", "Profile"), ":Enter Your register Mobile number");
        assertionValidation(getText(ProfilePage.objTakeAFaceIdentityScan), propertyFileReader("TakeAFaceIdentityScan", "Profile"), ":Take a Face Identity scan");
        assertionValidation(getText(ProfilePage.objResetYourPassword), propertyFileReader("RestYourPassword", "Profile"), ":Reset Your Password");
        verifyElementPresentAndClick(ProfilePage.objContinueButton, ":Continue Button");
        verifyElementPresentAndClick(OnBoardingPage.objMobileNumberInputField, ":Mobile number input field");
        type(OnBoardingPage.objMobileNumberInputField, propertyFileReader("RegisterMobileNumber", "Profile"), "Mobile number input field");
        verifyElementPresentAndClick(LoginPage.objNextBtn, getTextVal(OnBoardingPage.objNextBtn, ": Button"));
        enterOTP();
        if (verifyElementPresent(ProfilePage.objCreateNewPassword, ":Create new Password")) {
            assertionValidation(getText(ProfilePage.objCreateNewPassword), propertyFileReader("CreateNewPassword", "Profile"), ":Create New Password");
            EnterNewPassword();
        }
        verifyElementPresent(ProfilePage.objYouNowHaveANewPassword, ":You Have a new Password");
        assertionValidation(getText(ProfilePage.objYouNowHaveANewPassword), propertyFileReader("YouNowHaveANewPassword", "Profile"), ":You Now Have a New Password");
        verifyElementPresentAndClick(ProfilePage.objLoginWithNewPassword, ":Login With New Password");
        tonikLogin(propertyFileReader("password", "Login"));
        verifyElementPresentAndClick(ProfilePage.objProfileIcon, "Profile page Icon");
        scrollToBottomOfPage();
        String AfterRestAppVersion = getText(ProfilePage.objAppVersion);
        if (BeforeRestAppVersion == AfterRestAppVersion) {
            logger.info("TBD_LG_023, Profile- Verify if user can reset the App is passed");
            extentLoggerPass("TBD_LG_023", "TBD_LG_002, Profile - Verify if user can reset the App is passed");
            System.out.println("-----------------------------------------------------------");
        }

    }








}