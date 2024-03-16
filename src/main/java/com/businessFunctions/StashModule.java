package com.businessFunctions;

import com.pageObjects.pages.AndroidPages.*;
import com.propertyfilereader.PropertyFileReader;

import static com.utility.Utilities.*;

public class StashModule extends BaseClass {

    public StashModule() {
        super();
    }

    //---------------------------Reusable methods----------------------

    /**
     * Method to verify stash welcome screens
     * @throws Exception
     */
    public void stashWelcomeScreens() throws Exception {
        //Need To Add property files here foa all validations subtitles
        if (waitForElementToBePresent(StashPage.objIndividualStashWelcomeScreen, 60, "Individual Stash Welcome Screen ")) {
            valueValidation(getTextVal(StashPage.objIndividualStashDescription, "individual Stash Description"), "StashHeader", "Stash", "contains");
            click(StashPage.objAlrightButton, getTextVal(StashPage.objAlrightButton, ":Right Button"));
            verifyElementPresent(StashPage.objDeserveThis, "Deserve This");
            valueValidation(getTextVal(StashPage.objDeserveThisDescription, "Deserve This Description"), "StashHeader", "Stash", "contains");
            click(StashPage.objAmazingButton, getTextVal(StashPage.objAmazingButton, ":Amazing Button"));
            verifyElementPresent(StashPage.objRebound, "Rebound");
            valueValidation(getTextVal(StashPage.objReboundDescription, "Rebound Description"), "StashHeader", "Stash", "contains");
            click(StashPage.objReallyButton, getTextVal(StashPage.objReallyButton, ":Really Button"));
            verifyElementPresent(StashPage.objGoals, "Goals");
            valueValidation(getTextVal(StashPage.objGoalsDescription, "Goals Description"), "StashHeader", "Stash", "contains");
            click(StashPage.objCoolButton, getTextVal(StashPage.objCoolButton, ":Cool Button"));
            verifyElementPresent(StashPage.objWerkit, "Werkit");
            valueValidation(getTextVal(StashPage.objWerkitDescription, "Rebound Description"), "StashHeader", "Stash", "contains");
            click(StashPage.objLetsStartButton, getTextVal(StashPage.objLetsStartButton, ":Really Button"));
        }

    }

    /**
     * Method to verify Stash Screen Ui validations
     * @throws Exception
     */
    public void stashScreen() throws Exception {
        if (verifyElementDisplayed(StashPage.objTotalStashBalanceHeader)) {
            click(StashPage.objTotalStashBalanceHeader, "Stash card");
        } else {
            click(StashPage.objStashCard, "Stash card");
        }
        verifyElementPresent(StashPage.objStashHeader, "Stash Header");
        containsValidation(getText(StashPage.objStashHeader), propertyFileReader("StashHeader", "Stash"), ": Header :Stash");
        containsValidation(getText(StashPage.objStartANewStash), propertyFileReader("StartANewStash", "Stash"), ": StartANewStash");
        containsValidation(getText(StashPage.obj5Of5AvailableStashes), propertyFileReader("5Of5AvailableStashes", "Stash"), ": 5Of5AvailableStashes");
    }

    /**
     * Method verify new stash screen validations
     * @throws Exception
     */
    public void newStashScreen() throws Exception {
        if (verifyElementPresentAndClick(StashPage.objStartANewStash, "Start a New Stash")) {
            verifyElementPresent(StashPage.objStashHeader, "Stash Header");
            containsValidation(getText(StashPage.objStashHeader), propertyFileReader("StashHeader", "Stash"), ": Stash");
            verifyElementPresent(StashPage.objLearnMoreInOurFAQ, "Learn More In Our FAQ");
            containsValidation(getText(StashPage.objOpenANewStash), propertyFileReader("OpenANewStash", "Stash"), ": open a New Stash");
            containsValidation(getText(StashPage.objLuvStash), propertyFileReader("LuvStash", "Stash"), ":Luv Stash");
            containsValidation(getText(StashPage.objEmergencyStash), propertyFileReader("EmergencyStash", "Stash"), ":Emergency Stash");
            containsValidation(getText(StashPage.objVacationStash), propertyFileReader("VacationStash", "Stash"), ":Vacation Stash");
            if (platform.equalsIgnoreCase("Android")) {
                verticalSwipeTillElementDispalyed(StashPage.objTuitionStash);
            } else {
                scroll_To_Text(StashPage.objTuitionStash, "name", "TuitionStash");
            }
            containsValidation(getText(StashPage.objTuitionStash), propertyFileReader("TuitionStash", "Stash"), ":Tuition Stash");
            containsValidation(getText(StashPage.objGameConsole), propertyFileReader("GameConsole", "Stash"), ":Game Console");
        }

    }

    /**
     * Method to verify open a new stash screen UI validations
     * @throws Exception
     */
    public void openANewStashScreen() throws Exception {
        if (verifyElementPresentAndClick(StashPage.objOpenANewStash, "Open a New Stash")) {
            verifyElementPresent(StashPage.objSelectStashTypePopup, "Select Stash type Popup");
            containsValidation(getText(StashPage.objSelectStashTypePopup), propertyFileReader("SelectStashTypePopup", "Stash"), ":Stash Type popup");
            containsValidation(getText(StashPage.objThisCantBeChangeLater), propertyFileReader("ThisCantBeChangeLater", "Stash"), ":This can't be changed later");
            containsValidation(getText(StashPage.objGroupStashOnPopup), propertyFileReader("GroupStash", "Stash"), ":Group Stash");
            containsValidation(getText(StashPage.objTeamworkMakesThisStashWorkOnPopup), propertyFileReader("TeamWorkMakesThisStashWork", "Stash"), ":TeamWorkMakesThisStashWork");
            containsValidation(getText(StashPage.objSoloStashOnPopup), propertyFileReader("SoloStash", "Stash"), ":SoloStash");
            containsValidation(getText(StashPage.objKeepItPersonalAndSaveInThisOnPopup), propertyFileReader("KeepItPersonalAndSaveInThis", "Stash"), ":KeepItPersonalAndSaveInThis");
        }

    }
    /**
     * Method to verify Setup your Stash screen UI validations
     * @throws Exception
     */
    public void setUpYourStashScreen() throws Exception {
        if (verifyElementPresentAndClick(StashPage.objSoloStashOnPopup, "Select Solo Stash on pop up")) {
            verifyElementPresent(StashPage.objSetUpYourStash, "Set up your Stash");
            containsValidation(getText(StashPage.objSetUpYourStash), propertyFileReader("SetUpYourStashScreen", "Stash"), ":SetUpYourStashScreen");
            containsValidation(getText(StashPage.objStashFor), propertyFileReader("StashFor", "Stash"), ":StashFor");
            containsValidation(getText(StashPage.objTargetAmount), propertyFileReader("TargetAmount", "Stash"), ":TargetAmount");
            verifyElementPresent(StashPage.objNextButton, "Next button");
        }
    }

    /**
     * Method to verify set initial saving screen UI validations
     * @throws Exception
     */
    public void setInitialSavingScreen() throws Exception {
        if (verifyElementPresent(StashPage.objSetInitialSaving, "Select Solo Stash on pop up")) {
            valueValidation(getTextVal(StashPage.objSetInitialSaving, "SetInitialSaving"), "SetInitialSaving", "SetInitialSaving", "contains");
            verifyElementPresent(StashPage.objBalanceOn, getTextVal(StashPage.objBalanceOn, ":Balance"));
            verifyElementPresent(StashPage.objPhpText, "Php text");
            valueValidation(getTextVal(StashPage.objSkipForNow, "SkipForNow"), "SkipForNow", "SkipForNow", "contains");
        }
    }

    /**
     * Method to verify review stash details screen
     * @throws Exception
     */
    public void reviewStashDetailsScreen() throws Exception {
        if (verifyElementPresent(StashPage.objReviewStashDetails, "Review Stash details")) {
            valueValidation(getTextVal(StashPage.objReviewStashDetails, "ReviewStashDetails"), "ReviewStashDetails", "ReviewStashDetails", "contains");
            verifyElementPresent(StashPage.objStashNameOnTheImage, "Stash Name On the Image");
            valueValidation(getTextVal(StashPage.objTargetAmountHeader, "TargetAmount"), "TargetAmount", "TargetAmount", "contains");
            verifyElementPresent(StashPage.objTargetAmountOnReviewStash, getTextVal(StashPage.objTargetAmountOnReviewStash, ":Target Amount on review Stash"));
            valueValidation(getTextVal(StashPage.objInitialSavingHeader, "InitialSaving"), "InitialSaving", "InitialSaving", "contains");
            verifyElementPresent(StashPage.objInitialSavingOnReviewStash, getTextVal(StashPage.objInitialSavingOnReviewStash, ":Initial Saving on review Stash"));
            valueValidation(getTextVal(StashPage.objTransferFromHeader, "TransferFrom"), "TransferFrom", "TransferFrom", "contains");
            verifyElementPresent(StashPage.objTransferFromOnReviewStash, getTextVal(StashPage.objTransferFromOnReviewStash, ":Transfer From on review Stash"));
            valueValidation(getTextVal(StashPage.objInterestRateHeader, "InterestRate"), "InterestRate", "InterestRate", "contains");
            verifyElementPresent(StashPage.objInterestRateOnReviewStash, getTextVal(StashPage.objInterestRateOnReviewStash, ":Interest Rate on review Stash"));
            valueValidation(getTextVal(StashPage.objStashPDICText, "StashPDICText"), "StashPDICText", "StashPDICText", "contains");
            verifyElementPresent(StashPage.objTermsAndCondition, "Terms and Condition");
            verifyElementPresent(StashPage.objTermsAndConditionCheck, "Terms and Condition Check Box");
            if (platform.equalsIgnoreCase("Android")) {
                verticalSwipeTillElementDispalyed(StashPage.objCreateStashButtonDisabled);
            } else {
                scroll_To_Text(StashPage.objCreateStashButtonDisabled, "name", "Create Stash");
            }
            verifyElementPresent(StashPage.objCreateStashButtonDisabled, "Create Stash");
        }
    }

    /**
     * Method to verify Newly created solo stash
     * @param Stash
     * @throws Exception
     */
    public void newlyCreatedSoloStash(String Stash) throws Exception {
        if (verifyElementPresent(StashPage.objStashNameOnTheImageOnStashScreen(Stash), "Stash Name on the image")) {
            verifyElementPresent(StashPage.objStashNameOnTheImageOnStashScreen(Stash), getTextVal(StashPage.objStashNameOnTheImageOnStashScreen(Stash), ":Stash Name"));
            verifyElementPresent(StashPage.objAchievedOnTheImage(Stash), getTextVal(StashPage.objAchievedOnTheImage(Stash), ":Achieved "));
            verifyElementPresent(StashPage.objAddToStash(Stash), "Add to stash");
            verifyElementPresent(StashPage.objManage(Stash), "Manage");
        }
    }

    /**
     * Method to verify add to stash screen UI validation
     * @param stash
     * @throws Exception
     */
    public void addToStashScreen(String stash) throws Exception {
        if (verifyElementPresent(StashPage.objAddToStash, "Add stash on the image")) {
            click(StashPage.objAddToStash, "Add stash on the image");
        } else {
            click(StashPage.objAddToStash(stash), "Add stash on the image");
        }
        valueValidation(getTextVal(StashPage.objAddToStashHeader, "AddToStashHeader"), "AddToStashHeader", "AddToStashHeader", "contains");
        verifyElementPresent(StashPage.objStashBalance, getTextVal(StashPage.objStashBalance, ":Stash Balance"));
        verifyElementPresent(StashPage.objStashPhpText, "Stash Php text");
        verifyElementPresent(StashPage.objNextButton, "Next Button");
    }

    /**
     * Method to verify manage Stash screen UI validation
     * @param stash
     * @throws Exception
     */
    public void manageStashScreen(String stash) throws Exception {
        if (verifyElementPresent(StashPage.objManage, "Manage on the image")) {
            click(StashPage.objManage, "Manage on the image");
        } else {
            click(StashPage.objManage(stash), "Manage on the image");
        }
        valueValidation(getTextVal(StashPage.objManageStash, "ManageStash"), "ManageStash", "ManageStash", "contains");
        verifyElementPresent(StashPage.objStashDetails, "Stash details");
        valueValidation(getTextVal(StashPage.objStashDetails, "StashDetails"), "StashDetails", "StashDetails", "contains");
        verifyElementPresent(StashPage.objModify, "Modify");
        valueValidation(getTextVal(StashPage.objModify, "Modify"), "Modify", "Modify", "contains");
        verifyElementPresent(StashPage.objWithdrawToYourTonikAccount, "WithDraw To Your Tonik Account");
        valueValidation(getTextVal(StashPage.objWithdrawToYourTonikAccount, "WithdrawToYourTonikAccount"), "WithdrawToYourTonikAccount", "WithdrawToYourTonikAccount", "contains");
        verifyElementPresent(StashPage.objClose, "Close");
        valueValidation(getTextVal(StashPage.objClose, "Close"), "Close", "Close", "contains");
    }

    /**
     * Method to verify stash tile content UI validation
     * @throws Exception
     */
    public void stashTileContent() throws Exception {
        verifyElementPresent(StashPage.objTotalStashBalanceHeader, "Total Stash balance On header");
        verifyElementPresent(StashPage.objTotalStashBalanceOnDashBoard, getTextVal(StashPage.objTotalStashBalanceOnDashBoard, ":Stash Balance"));
        verifyElementPresent(StashPage.objLooksLonelyHere, "Looks Lonely here");
    }

    /**
     * Method to verify Confirm Transfer to stash screen validation
     * @throws Exception
     */
    public void confirmTransferToStashScreen() throws Exception {
        verifyElementPresent(StashPage.objConfirmTransferToStash, "Confirm Transfer To Stash");
        valueValidation(getTextVal(StashPage.objConfirmTransferToStash, "ConfirmTransferToStash"), "ConfirmTransferToStash", "ConfirmTransferToStash", "contains");
        verifyElementPresent(StashPage.objAmount, getTextVal(StashPage.objAmount, ":Amount to transfer"));
        verifyElementPresent(StashPage.objFromAccount, getTextVal(StashPage.objFromAccount, ":From Account"));
        verifyElementPresent(StashPage.objToAccount, getTextVal(StashPage.objToAccount, ":To Account"));
        verifyElementPresent(StashPage.objStashOwner, getTextVal(StashPage.objStashOwner, ":Stash Owner "));
    }

    /**
     * Method to verify transaction details screen validations
     * @throws Exception
     */
    public void transactionDetailsScreen() throws Exception {
        verifyElementPresent(StashPage.objTransactionDetails, "Transaction Details");
        valueValidation(getTextVal(StashPage.objTransactionDetails, "TransactionDetails"), "TransactionDetails", "TransactionDetails", "contains");
        verifyElementPresent(StashPage.objAmount, getTextVal(StashPage.objAmount, ":Amount to transfer"));
        verifyElementPresent(StashPage.objFromTransactionDetails, getTextVal(StashPage.objFromTransactionDetails, ":From Account"));
        verifyElementPresent(StashPage.objToAccount, getTextVal(StashPage.objToAccount, ":To Account"));
//        verifyElementPresent(StashPage.objStashOwner, getTextVal(StashPage.objStashOwner, ":Stash Owner "));
        if (verifyElementDisplayed(StashPage.objWhen)) {
            verifyElementPresent(StashPage.objWhen, getTextVal(StashPage.objWhen, ":When"));
        }
        if (verifyElementDisplayed(StashPage.objRefNumber)) {
            verifyElementPresent(StashPage.objRefNumber, getTextVal(StashPage.objRefNumber, ":Ref Number"));
        }
    }

    /**
     * Method to verify Selected solo Stash screen UI validations
     * @param stash
     * @throws Exception
     */
    public void selectedSoloStashScreen(String stash) throws Exception {
        verifyElementPresent(StashPage.objNameOfTheSoloStash, "Name Of The Solo Stash");
        verifyElementPresent(StashPage.objAchievedAmountOnSoloStash, getTextVal(StashPage.objAchievedAmountOnSoloStash, ":Achieved Amount On Solo Stash"));
        verifyElementPresent(StashPage.objInterestRateValue, getTextVal(StashPage.objInterestRateValue, "Interest Value"));
        verifyElementPresent(StashPage.objAddToStash, "Add To stash");
        verifyElementPresent(StashPage.objManage, "Add To stash");
        valueValidation(getTextVal(StashPage.objMyself, "MySelf"), "MySelf", "MySelf", "contains");
        valueValidation(getTextVal(StashPage.objCredit(stash), "Credit"), "Credit", "Credit", "contains");
        verifyElementPresent(StashPage.objMyselfTransactionAmount, getTextVal(StashPage.objMyselfTransactionAmount, "Myself Transaction Amount"));
    }

    /**
     * Method to verfy Add to stash validations
     * @throws Exception
     */
    public void addToStashValidations() throws Exception {
        verifyElementPresentAndClick(StashPage.objAddToStashEditText, "Add to stash Edit text field");
        type(StashPage.objAddToStashEditText, propertyFileReader("lessThanPeso", "Stash"), "LessThan Amount Input Text Field");
        hideKeyboard();
        verifyElementPresentAndClick(StashPage.objNextButton, "Next button");
        verifyElementPresent(StashPage.objMinimumAmountCanBe, "Minimum Amount Can be 1 Peso");
        click(StashPage.objAddToStashEditText, "Initial Saving Amount Input Text Field");
        clearField(StashPage.objAddToStashEditText, "Target Amount Edit text field");
        type(StashPage.objAddToStashEditText, propertyFileReader("MoreThanPeso", "Stash"), "More than Tonik balance");
        hideKeyboard();
        verifyElementPresentAndClick(StashPage.objNextButton, "Next button");
        verifyElementPresent(StashPage.objNoEnoughBalanceInTonikAccount, "No Enough Balance In Tonik Account");
        click(StashPage.objAddToStashEditText, "Initial Saving Amount Input Text Field");
        clearField(StashPage.objAddToStashEditText, "Target Amount Edit text field");
        type(StashPage.objAddToStashEditText, propertyFileReader("ValidPeso", "Stash"), "Valid Peso");
        hideKeyboard();
        verifyElementPresentAndClick(StashPage.objNextButton, "Next button");
    }

    /**
     * Method to verify Money Stashed screen UI validations
     * @throws Exception
     */
    public void moneyStashedScreenValidation() throws Exception {
        waitForElementToBePresent(StashPage.objYouAdded, 10, "Money Stashed");
        valueValidation(getTextVal(StashPage.objMoneyStashed, "MoneyStashed"), "MoneyStashed", "MoneyStashed", "contains");
        verifyElementPresent(StashPage.objYouAdded, "You Added");
        verifyElementPresent(StashPage.objViewDetailsOfHowWeMovedIt, "View Details How We Moved It");
    }

    /**
     * Method to verify History transaction details screen validations
     * @throws Exception
     */
    public void historyTransactionDetailsScreen() throws Exception{
        verifyElementPresent(StashPage.objTransactionDetails, "Transaction Details");
        valueValidation(getTextVal(StashPage.objTransactionDetails, "TransactionDetails"), "TransactionDetails", "TransactionDetails", "contains");
        verifyElementPresent(StashPage.amountDetails, getTextVal(StashPage.amountDetails, ":Amount to transfer"));
        verifyElementPresent(StashPage.fromAccount, getTextVal(StashPage.fromAccount, ":From Account"));
        verifyElementPresent(StashPage.toAccount, getTextVal(StashPage.toAccount, ":To Account"));
        if(verifyElementDisplayed(StashPage.whenDetails)){
            verifyElementPresent(StashPage.whenDetails, getTextVal(StashPage.whenDetails, ":When"));
        }
        if(verifyElementDisplayed(StashPage.RefNoDetails)){
            verifyElementPresent(StashPage.RefNoDetails, getTextVal(StashPage.RefNoDetails, ":Ref Number"));
        }
    }

    /**
     * Method to verify Stash Details screen UI validations
     * @throws Exception
     */
    public void stashDetailsScreen() throws Exception {
        verifyElementPresent(StashPage.objStashDetailsHeader, "Stash details");
        valueValidation(getTextVal(StashPage.objStashDetailsHeader, "StashDetails"), "StashDetails", "StashDetails", "contains");
        valueValidation(getTextVal(StashPage.objStashIDOption, "StashID"), "StashID", "StashID", "contains");
        verifyElementPresent(StashPage.objStashID, getTextVal(StashPage.objStashID, ":Stash ID"));
        valueValidation(getTextVal(StashPage.objStartingDateOption, "StartingDate"), "StartingDate", "StartingDate", "contains");
        verifyElementPresent(StashPage.objStartingDate, getTextVal(StashPage.objStartingDate, ":Starting date"));
        valueValidation(getTextVal(StashPage.ObjTargetAmountOption, "TargetAmount"), "TargetAmount", "TargetAmount", "contains");
        verifyElementPresent(StashPage.objTargetAmountValue, getTextVal(StashPage.objTargetAmountValue, ":Target amount value"));
    }

    /**
     * Method to verify Upload a profile picture from camera and gallery
     * @throws Exception
     */
    public void uploadProfilePicture() throws Exception{
        verifyElementPresentAndClick(ProfilePage.objProfilePicture, "Profile Picture");
        verifyElementPresent(ProfilePage.objPickFromYourGallery, "Pick from Your Gallery");
        verifyElementPresentAndClick(ProfilePage.objTakeAPhoto, "Take a Photo");
        verifyElementPresentAndClick(ProfilePage.objSwitchCameraButton, "Switch camera Button");
        verifyElementPresentAndClick(ProfilePage.objCameraCloseButton, "Camera Close Button");
        waitForElementToBePresent(ProfilePage.objProfilePicture, 5, "Profile Picture");
        waitTime(5000);
        verifyElementPresentAndClick(ProfilePage.objProfilePicture, "Profile Picture");
        if (verifyElementDisplayed(ProfilePage.objTakeAPhoto)) {
            click(ProfilePage.objTakeAPhoto, "Take a Photo");
        } else {
            verifyElementPresentAndClick(ProfilePage.objProfilePicture, "Profile Picture");
            verifyElementPresentAndClick(ProfilePage.objTakeAPhoto, "Take a Photo");
        }
        if (verifyElementDisplayed(StashPage.objFrontCamera)) {
            click(ProfilePage.objShutterButton, "Shutter Button");
        } else {
            verifyElementPresentAndClick(ProfilePage.objSwitchCameraButton, "Switch camera Button");
            waitTime(3000);
            verifyElementPresentAndClick(ProfilePage.objShutterButton, "Shutter Button");
        }
        verifyElementPresentAndClick(ProfilePage.objDoneButton, "Done Button");
        if(verifyElementPresent(StashPage.objCameraIcon, "Camera icon on bottom of the Picture")){
            click(StashPage.objModifyStashCameraIconOnProfile, "Camera icon on bottom of the Picture");
        }else{
            click(ProfilePage.objProfilePicture, "Profile Picture");
        }
        verifyElementPresentAndClick(ProfilePage.objPickFromYourGallery, "Pick from Your Gallery");
        click(ProfilePage.objGallery,"Gallery");
        click(ProfilePage.objAutomationFolder,"Automation Folder");
        click(ProfilePage.objSelectPhotoInFolder,"Select Photo");
    }

    /**
     * Method to verify Modify stash screen validations
     * @throws Exception
     */
    public void modifyStashScreen() throws Exception {
        verifyElementPresent(StashPage.objModifyStashHeader, "Modify Stash");
        verifyElementPresent(StashPage.objImageView, "Image");
        verifyElementPresent(StashPage.objNameInputTxt, "name field");
        verifyElementPresent(StashPage.objTargetAmountField, "Traget Amount field");
        verifyElementPresent(StashPage.objSetUpYourStashNextButton, "Save button");
    }

    /**
     * Method to verify You updates your stash screen
     * @throws Exception
     */
    public void youUpdatesYourStashScreen() throws Exception{
        verifyElementPresent(StashPage.objYouUpdatesYourStash, "You updates Your Stash");
        valueValidation(getTextVal(StashPage.objYouUpdatesYourStashDescription, "YouUpdatedYourStashDescription"), "YouUpdatedYourStashDescription", "YouUpdatedYourStashDescription", "contains");
        verifyElementPresentAndClick(StashPage.objDoneButton, "Done Button");
    }

    /**
     * Method to verify With draw from your stash screen
     * @throws Exception
     */
    public void withdrawFromYourStashScreen() throws Exception {
        verifyElementPresent(StashPage.objWithdrawFromStashTitle, "Withdraw from your Stash");
        verifyElementPresent(StashPage.objBalanceTxt, "Balance: amount");
        verifyElementPresent(StashPage.objTargetAmountField, "Traget Amount field");
        verifyElementPresent(StashPage.objWithdrawButton, "Withdraw Button");
    }

    /**
     * Method to verify review with withdrawl
     * @throws Exception
     */
    public void reviewWithDrawal() throws Exception{
       if(verifyElementPresent(StashPage.objReviewWithDrawalHeader, "Review Withdrawl")){
           valueValidation(getTextVal(StashPage.objReviewWithDrawalHeader, "ReviewWithDrawl"), "ReviewWithDrawl", "ReviewWithDrawl", "contains");
           verifyElementPresent(StashPage.objReviewWithDrawalAmount, "Amount");
           verifyElementPresent(StashPage.objReviewWithDrawalFrom, "From ");
           verifyElementPresent(StashPage.objReviewWithDrawalTo, "To");
           verifyElementPresent(StashPage.objConfirmButton, "Confirm button");
       }
    }

    /**
     * Method to verify sweet screen UI validations
     * @throws Exception
     */
    public void sweetScreen() throws Exception{
        if(verifyElementPresent(StashPage.objSweet, "Review Withdrawl")){
            valueValidation(getTextVal(StashPage.objSweet, "sweet"), "sweet", "sweet", "contains");
            verifyElementPresent(StashPage.objSweetDescription, "Sweet description");
            verifyElementPresent(StashPage.objSweetViewDetails, "Sweet view Details ");
            verifyElementPresent(StashPage.objOhYeahButton, "Oh Yeah button");
        }
    }

    /**
     * Method to verify close popup validation
     * @throws Exception
     */
    public void closePopup() throws Exception{
        verifyElementPresent(StashPage.objAreYouSureYouWantToCloseTheStashPopup,"Are you sure close popup");
        verifyElementPresent(StashPage.objStayButton,"Stay Button On popup");
        verifyElementPresent(StashPage.objYesCloseTheStash,"Yes Close The Stash On popup");
    }

    /**
     * Method to verify Broke the stash screen validations
     * @throws Exception
     */
    public void brokeTheStashScreen() throws Exception{
        if(verifyElementPresent(StashPage.objYouBrokeTheStash, "broke the Stash")) {
            valueValidation(getTextVal(StashPage.objYouBrokeTheStash, "YouBrokeTheStash"), "YouBrokeTheStash", "YouBrokeTheStash", "contains");
            valueValidation(getTextVal(StashPage.objYouBrokeTheStashDescription, "You Broke The Stash Description"), "YouBrokeTheStashDescription", "YouBrokeTheStashDescription", "contains");
            verifyElementPresent(StashPage.objDoneButton, " Done Button On popup");
        }
    }
//-----------------------Test Methods--------------------

    /**
     * Method to verify user can access the stash module when TSA is not created
     * @throws Exception
     */
    public void verifyIfUserCanAccessTheStashModuleWhenTSAIsNotYetCreated_TBD_PST_001() throws Exception {
        HeaderChildNode("TBD_PRO_001, Stash -verifyIfUserCanAccessTheStashModuleWhenTSAIsNotYetCreated_TBD_PST_001");
        tonikLogin(propertyFileReader("password", "Login"));
        if (platform.equalsIgnoreCase("Android")) {
            verticalSwipeTillElementDispalyed(StashPage.objStashes);
        } else {
           //IOS
        }
        if (verifyElementPresent(StashPage.objPutYourCashInAStash, "Put Your Cash In Stash")) {
            valueValidation(getTextVal(StashPage.objPutYourCashInAStash, "PutYourCashInaStash"), "PutYourCashInaStash", "PutYourCashInaStash", "contains");
            valueValidation(getTextVal(StashPage.objStashes, "StashesOption"), "StashesOption", "StashesOption", "contains");
            valueValidation(getTextVal(StashPage.objSaveAndGrowYourMoney, "SaveAndGrowYourMoney"), "SaveAndGrowYourMoney", "SaveAndGrowYourMoney", "contains");
        }
        stashWelcomeScreens();
        click(StashPage.objStashes, "StashesOption");
        stashScreen();
        newStashScreen();
        setUpYourStashScreen();
        verifyElementPresentAndClick(StashPage.objStashForEditText, "Stash for Edit text field");
        type(StashPage.objStashForEditText, propertyFileReader("validInput", "Stash"), "text_field");
        click(ProfilePage.objProfilePicture, "Profile Picture");
        verifyElementPresentAndClick(StashPage.objTargetAmountEditText, "Target Amount Edit text field");
        type(StashPage.objTargetAmountEditText, propertyFileReader("LessThanTarget", "Stash"), "LessThan Target Amount ");
        verifyElementPresentAndClick(StashPage.objSetUpYourStashNextButton, "Next button");
        reviewStashDetailsScreen();
        verifyElementPresentAndClick(StashPage.objTermsAndConditionCheck, "Terms and condition Check box");
        verifyElementPresentAndClick(StashPage.objCreateStashButtonEnabled, "Create Stash");
        verifyElementPresent(StashPage.objSoloStashCreatedLuv, "Solo Stash created Luv");
        verifyElementPresentAndClick(StashPage.objTargetAmountHeader, "TargetAmount");
        Swipe("DOWN", 2);
        click(LoginPage.objBackIcon, "Back Button");
        waitForElementToBePresent(StashPage.objSetUpYourStash, 10, "Set up your stash header");
        click(LoginPage.objBackIcon, "Back Button");
        waitForElementToBePresent(StashPage.objStashHeader, 10, " stash header");
        click(LoginPage.objBackIcon, "Back Button");
        waitForElementToBePresent(ProfilePage.objProfileIcon, 10, "Profile Icon");
        if (verifyElementDisplayed(StashPage.objDisabledAmount)) {
            logger.info("TBD_PRO_001, Stash - TSA not Yet Created");
            extentLoggerPass("TBD_PRO_001", "TBD_PRO_001, Stash -TSA not Yet Created is passed");
        }
    }

    /**
     * Method to verify user can create TSA from stash
     * @throws Exception
     */
    public void verifyIfUserCanCreateTheTSAFromStash_TBD_PST_002() throws Exception {
        HeaderChildNode("TBD_PRO_002, Stash -verifyIfUserCanCreateTheTSAFromStash_TBD_PST_002");
        tonikLogin(propertyFileReader("password", "Login"));
        if (platform.equalsIgnoreCase("Android")) {
            verticalSwipeTillElementDispalyed(StashPage.objStashes);
        } else {
            //IOS
        }
        if (verifyElementPresent(StashPage.objPutYourCashInAStash, "Put Your Cash In Stash")) {
            valueValidation(getTextVal(StashPage.objPutYourCashInAStash, "PutYourCashInaStash"), "PutYourCashInaStash", "PutYourCashInaStash", "contains");
            valueValidation(getTextVal(StashPage.objStashes, "StashesOption"), "StashesOption", "StashesOption", "contains");
            valueValidation(getTextVal(StashPage.objSaveAndGrowYourMoney, "SaveAndGrowYourMoney"), "SaveAndGrowYourMoney", "SaveAndGrowYourMoney", "contains");
        }
        stashWelcomeScreens();
        click(StashPage.objStashes, "StashesOption");
        stashScreen();
        newStashScreen();
        setUpYourStashScreen();
        verifyElementPresentAndClick(StashPage.objStashForEditText, "Stash for Edit text field");
        type(StashPage.objStashForEditText, propertyFileReader("validInput", "Stash"), "text_field");
        click(ProfilePage.objProfilePicture, "Profile Picture");
        verifyElementPresentAndClick(StashPage.objTargetAmountEditText, "Target Amount Edit text field");
        type(StashPage.objTargetAmountEditText, propertyFileReader("LessThanTarget", "Stash"), "LessThan Target Amount ");
        verifyElementPresentAndClick(StashPage.objSetUpYourStashNextButton, "Next button");
        reviewStashDetailsScreen();
        verifyElementPresentAndClick(StashPage.objTermsAndConditionCheck, "Terms and condition Check box");
        verifyElementPresentAndClick(StashPage.objCreateStashButtonEnabled, "Create Stash");
        if (verifyElementPresent(StashPage.objSoloStashCreatedLuv, "Solo Stash created Luv")) {
            click(StashPage.objOkayLetsGoButton, "Okay Lets go Button");
        }
        if (verifyElementDisplayed(ProfilePage.objWeAreAlmostReady)) {
            logger.info("We are Almost Ready Screen is Displayed");
            extentLoggerPass("Screen", "We are Almost Ready Screen is Displayed");
        }
        //may be back icon steps are required
        click(LoginPage.objBackIcon, "Back Button");
        waitForElementToBePresent(ProfilePage.objProfileIcon, 10, "Profile Icon");
        if (verifyElementDisplayed(StashPage.objEnabledAmount)) {
            logger.info("TBD_PRO_002, Stash - TSA is Created");
            extentLoggerPass("TBD_PRO_002", "TBD_PRO_002, Stash -TSA is Created is passed");
        }
    }

    /**
     * Method to verify user can create solo stash
     * @throws Exception
     */
    public void verifyIfUserCanCreateSoloStash_TBD_PST_003() throws Exception {
        HeaderChildNode("TBD_PRO_003, Stash -verifyIfUserCanCreateSoloStash_TBD_PST_003");
        tonikLogin(propertyFileReader("password", "Login"));
        if (platform.equalsIgnoreCase("Android")) {
            verticalSwipeTillElementDispalyed(StashPage.objStashes);
        } else {
            scroll_To_Text(LoginPage.objlogOutButton, "name", " Log out");
        }
        stashScreen();
        newStashScreen();
        openANewStashScreen();
        setUpYourStashScreen();
        uploadProfilePicture();;
        verifyElementPresentAndClick(StashPage.objStashForEditText, "Stash for Edit text field");
        type(StashPage.objStashForEditText, propertyFileReader("lessThan", "Stash"), "text_field");
        click(ProfilePage.objProfilePicture, "Profile Picture");
        verifyElementPresent(StashPage.objPleaseEnterAValidStashName, "Please Enter a valid stash name inline Error Message");
        click(StashPage.objStashForEditText, "Stash for Edit text field");
        clearField(StashPage.objStashForEditText, "Stash for Edit text field");
        type(StashPage.objStashForEditText, propertyFileReader("validInput", "Stash"), "text_field");
        click(ProfilePage.objProfilePicture, "Profile Picture");
        verifyElementPresentAndClick(StashPage.objTargetAmountEditText, "Target Amount Edit text field");
        type(StashPage.objTargetAmountEditText, propertyFileReader("LessThanTarget", "Stash"), "LessThan Target Amount ");
        verifyElementPresentAndClick(StashPage.objSetUpYourStashNextButton, "Next button");
        verifyElementPresent(StashPage.objMinimumAmountCanBe, "Minimum Amount can be 1000 Peso Error Message");
        clearField(StashPage.objTargetAmountEditText, "Target Amount Edit text field");
        type(StashPage.objTargetAmountEditText, propertyFileReader("MoreThanTarget", "Stash"), "MoreThan Target Amount");
        verifyElementPresentAndClick(StashPage.objSetUpYourStashNextButton, "Next button");
        setInitialSavingScreen();
        click(StashPage.objSkipForNow, "Skip For Now");
        reviewStashDetailsScreen();
        verifyElementPresentAndClick(StashPage.objTermsAndCondition, "Terms and Condition");
        verifyElementPresent(StashPage.objTermsAndConditionScreen, "Terms and Condition Screen");
        verifyElementPresentAndClick(StashPage.objTermsAndConditionBackIcon, "Back Button");
        verifyElementPresentAndClick(StashPage.objTermsAndConditionCheck, "Terms and condition Check box");
        verifyElementPresentAndClick(StashPage.objCreateStashButtonEnabled, "Create Stash");
        verifyElementPresent(StashPage.objSoloStashCreatedLuv, "Solo Stash created Luv");
        valueValidation(getTextVal(StashPage.objSoloStashCreatedLuv, "SoloStashCreatedLuv"), "SoloStashCreatedLuv", "SoloStashCreatedLuv", "contains");
        valueValidation(getTextVal(StashPage.objStashSuccessDescription, "StashSuccessDescription"), "StashSuccessDescription", "StashSuccessDescription", "contains");
        verifyElementPresentAndClick(StashPage.objDoneButton, "Done Button");
        newlyCreatedSoloStash("0");
        addToStashScreen("0");
        verifyElementPresentAndClick(LoginPage.objBackIcon, "Back Button");
        manageStashScreen("0");
        verifyElementPresentAndClick(LoginPage.objBackIcon, "Back Button");
        verifyElementPresent(StashPage.obj5Of5AvailableStashes, getTextVal(StashPage.obj5Of5AvailableStashes, ":Available Stash"));
        verifyElementPresentAndClick(LoginPage.objBackIcon, "Back Button");
        if (platform.equalsIgnoreCase("Android")) {
            verticalSwipeTillElementDispalyed(StashPage.objTotalStashBalanceHeader);
        } else {
            scroll_To_Text(StashPage.objTotalStashBalanceHeader, "name", "Total stash Balance header");
        }
        stashTileContent();
        if (platform.equalsIgnoreCase("Android")) {
            Swipe("DOWN", 2);
        } else {
            scroll_To_Text(StashPage.objTotalStashBalanceHeader, "name", "Total stash Balance header");
        }
        verifyElementPresentAndClick(StashPage.objHistoryIcon, "HistoryIcon");
        if (verifyElementDisplayed(StashPage.objYouHaveNoTransactionYet)) {
            logger.info("TBD_PRO_003, Stash - verifyIfUserCanCreateSoloStash_TBD_PST_003");
            extentLoggerPass("TBD_PRO_003", "TBD_PRO_003, Stash -verifyIfUserCanCreateSoloStash_TBD_PST_003 is passed");
            System.out.println("-----------------------------------------------------------");
        }
    }

    /**
     * Method to verify user can set initial saving while creating the stash
     * @throws Exception
     */
    public void verifyIfUserCanSetInitialSavingWhileCreatingTheStash_TBD_ST_004() throws Exception {
        HeaderChildNode("TBD_ST_004, Stash -verifyIfUserCanSetInitialSavingWhileCreatingTheStash_TBD_ST_004");
        tonikLogin(propertyFileReader("password", "Login"));
        Swipe("UP", 1);
        stashScreen();
        newStashScreen();
        openANewStashScreen();
        setUpYourStashScreen();
        verifyElementPresentAndClick(StashPage.objStashForEditText, "Stash for Edit text field");
        type(StashPage.objStashForEditText, propertyFileReader("validInput", "Stash"), "text_field");
        click(ProfilePage.objProfilePicture, "Profile Picture");
        verifyElementPresentAndClick(StashPage.objTargetAmountEditText, "Target Amount Edit text field");
        type(StashPage.objTargetAmountEditText, propertyFileReader("MoreThanTarget", "Stash"), "MoreThan Target Amount");
        verifyElementPresentAndClick(StashPage.objSetUpYourStashNextButton, "Next button");
        setInitialSavingScreen();
        verifyElementPresentAndClick(StashPage.objInitialSavingAmountInputTextField, "Initial Saving Amount Input Text Field");
        type(StashPage.objInitialSavingAmountInputTextField, propertyFileReader("lessThanPeso", "Stash"), "Initial Saving Amount Input Text Field");
        verifyElementPresentAndClick(StashPage.objNextButton, "Next button");
        verifyElementPresent(StashPage.objMinimumAmountCanBe, "Minimum Amount Can be 1 Peso");
        click(StashPage.objInitialSavingAmountInputTextField, "Initial Saving Amount Input Text Field");
        clearField(StashPage.objInitialSavingAmountInputTextField, "Target Amount Edit text field");
        type(StashPage.objInitialSavingAmountInputTextField, propertyFileReader("ValidPeso", "Stash"), "Valid Peso");
        verifyElementPresentAndClick(StashPage.objNextButton, "Next button");
        reviewStashDetailsScreen();
        verifyElementPresentAndClick(StashPage.objTermsAndCondition, "Terms and Condition");
        verifyElementPresent(StashPage.objTermsAndConditionScreen, "Terms and Condition Screen");
        verifyElementPresentAndClick(StashPage.objTermsAndConditionBackIcon, "Back Button");
        verifyElementPresentAndClick(StashPage.objTermsAndConditionCheck, "Terms and condition Check box");
        verifyElementPresentAndClick(StashPage.objCreateStashButtonEnabled, "Create Stash");
        if (verifyElementDisplayed(StashPage.objTermsAndConditionScreen)) {
            click(StashPage.objDoItLater, "Do It Later");
        }
        verifyElementPresent(StashPage.objSoloStashCreatedLuv, "Solo Stash created Luv");
        verifyElementPresentAndClick(StashPage.objDoneButton, "Done Button");
        waitForElementToBePresent(StashPage.objStashNameOnTheImageOnStashScreen("1"), 20,"Stash Name on the image"))
        newlyCreatedSoloStash("1");
        addToStashScreen("1");
        verifyElementPresentAndClick(LoginPage.objBackIcon, "Back Button");
        manageStashScreen("1");
        verifyElementPresentAndClick(LoginPage.objBackIcon, "Back Button");
        verifyElementPresent(StashPage.obj5Of5AvailableStashes, getTextVal(StashPage.obj5Of5AvailableStashes, ":Available Stash"));
        verifyElementPresentAndClick(LoginPage.objBackIcon, "Back Button");
        Swipe("UP", 2);
        stashTileContent();
        Swipe("DOWN", 2);
        verifyElementPresentAndClick(StashPage.objHistoryIcon, "HistoryIcon");
        if (verifyElementDisplayed(StashPage.objYouHaveNoTransactionYet)) {
            logger.info("TBD_PRO_004, Stash - verifyIfUserCanCreateSoloStash_TBD_PST_003");
            extentLoggerPass("TBD_PRO_004", "TBD_PRO_004, Stash -verifyIfUserCanSetInitialSavingWhileCreatingTheStash_TBD_PST_004 is passed");
        }

    }

    public void verifyIfUserCanAddFundsToSoloStashFromTheListDetailsScreen_TBD_ST_005() throws Exception {
        HeaderChildNode("TBD_ST_005, Stash -verifyifUserCanAddFundsToSoloStashFromTheListDetailsScreen_TBD_ST_005");
        tonikLogin(propertyFileReader("password", "Login"));
        String CurrentAmount = getText(StashPage.objTonikAmountOnDashboard);
        Swipe("UP", 1);
        stashScreen();
        addToStashScreen("1");
        addToStashValidations();
        confirmTransferToStashScreen();
        verifyElementPresentAndClick(StashPage.objConfirmButtonOnConfirmTransferToStash, "Confirm button");
        moneyStashedScreenValidation();
        verifyElementPresentAndClick(StashPage.objViewDetailsOfHowWeMovedIt, "View Details How We Moved It");
        transactionDetailsScreen();
        verifyElementPresentAndClick(StashPage.objQuestionMarkIconOnTransactionDetails, "contact customer Icon ");
        verifyElementPresent(ContactUsPage.objPageHeader, "Get In Touch Screen");
        verifyElementPresentAndClick(ProfilePage.objBackIcon, "Back Icon");
        waitForElementToBePresent(StashPage.objQuestionMarkIconOnTransactionDetails, 10, "contact customer Icon");
        verifyElementPresentAndClick(ProfilePage.objBackIcon, "Back Icon");
        verifyElementPresentAndClick(StashPage.objDoneButton, "Done Button");
        newlyCreatedSoloStash("0");
        verifyElementPresentAndClick(StashPage.objStashNameOnTheImageOnStashScreen("0"), "Stash Name on the image");
        selectedSoloStashScreen("0");
        click(ProfilePage.objBackIcon, "Back Icon");
        waitTime(5000);
        click(ProfilePage.objBackIcon, "Back Icon");
        String UpdatedAmount = getText(StashPage.objTonikAmountOnDashboard);
        if (CurrentAmount != UpdatedAmount) {
            logger.info("TSA Balance Reduced based on the amount stashed");
            extentLoggerPass("Stashed Amount", "TSA Balance Reduced based on the amount stashed");
        }
        Swipe("UP", 1);
        stashTileContent();
        Swipe("DOWN", 1);
        verifyElementPresentAndClick(StashPage.objHistoryIcon, "HistoryIcon");
        verifyElementPresent(StashPage.objNameOfTheStashOnHistory, getTextVal(StashPage.objNameOfTheStashOnHistory, ":Name Of The Stash On History"));
        verifyElementPresent(StashPage.objTransactionValueOnHistory, getTextVal(StashPage.objTransactionValueOnHistory, ":Transaction Value On History"));
        click(ProfilePage.objBackIcon, "Back Icon");
        verifyElementPresentAndClick(StashPage.objTransactionValueOnHistory, "Transaction History");
        transactionDetailsScreen();
    }

    /**
     * Method to verify user can manage the solo stash from the list details screen
     * @throws Exception
     */
    public void verifyIfUserCanManageTheSoloStashFromTheListDetailsScreen_TDB_ST_006() throws Exception {
        HeaderChildNode("TBD_ST_006, Stash -verifyIfUserCanManageTheSoloStashFromTheListDetailsScreen_TDB_ST_006");
        tonikLogin(propertyFileReader("password", "Login"));
        String CurrentAmount = getText(StashPage.objTonikAmountOnDashboard);
        Swipe("UP", 1);
        stashScreen();
        manageStashScreen("0");
        click(LoginPage.objBackIcon, "Back Button");
        verifyElementPresentAndClick(StashPage.objManage("0"), "Manage on the image");
        verifyElementPresentAndClick(StashPage.objStashDetails, "Stash details");
        verifyElementPresent(StashPage.objStashDetailsHeader, "Stash details");
        click(LoginPage.objBackIcon, "Back Button");
        waitForElementToBePresent(StashPage.objModify, 20, "Modify");
        verifyElementPresentAndClick(StashPage.objModify, "Modify");
        verifyElementPresent(StashPage.objModifyStashHeader, "Modify Stash");
        click(LoginPage.objBackIcon, "Back Button");
        waitForElementToBePresent(StashPage.objWithdrawToYourTonikAccount, 20, "WithdrawToYourTonikAccount");
        verifyElementPresentAndClick(StashPage.objWithdrawToYourTonikAccount, "WithdrawToYourTonikAccount");
        verifyElementPresent(StashPage.objWithdrawFromYourStashHeader, "WithdrawFromYourStash");
        click(LoginPage.objBackIcon, "Back Button");
        waitForElementToBePresent(StashPage.objClose, 20, "Close");
        if (verifyElementPresentAndClick(StashPage.objClose, "Close")) {
            verifyElementPresent(StashPage.objAreYouSureYouWantToCloseTheStashPopup, "Are you sure you want to close the pop up");
            logger.info("TDB_ST_006, Stash - verifyIfUserCanManageTheSoloStashFromTheListDetailsScreen_TDB_ST_006");
            extentLoggerPass("TDB_ST_006", "TDB_ST_006, Stash -verifyIfUserCanManageTheSoloStashFromTheListDetailsScreen_TDB_ST_006 is passed");
        }
    }

    /**
     * Method to verify user can add funds to solo stash from summary details screen
     * @throws Exception
     */
    public void verifyIfUserCanAddFundsToSoloStashFromTheSummaryDetailsScreen_TDB_ST_007() throws Exception {
        HeaderChildNode("TDB_ST_007, Stash -verifyIfUserCanAddFundsToSoloStashFromTheSummaryDetailsScreen_TDB_ST_007");
        tonikLogin(propertyFileReader("password", "Login"));
        String CurrentAmount = getText(StashPage.objTonikAmountOnDashboard);
        Swipe("UP", 1);
        stashScreen();
        verifyElementPresentAndClick(StashPage.objStashNameOnTheImageOnStashScreen("0"), "Stash Name on the image");
        selectedSoloStashScreen("0");
        click(LoginPage.objBackIcon, "Back Button");
        addToStashScreen("0");
        click(LoginPage.objBackIcon, "Back Button");
        verifyElementPresentAndClick(StashPage.objAddToStash("0"), "Add stash on the image");
        addToStashValidations();
        confirmTransferToStashScreen();
        click(LoginPage.objBackIcon, "Back Button");
        click(StashPage.objNextButton, "Next Button");
        click(StashPage.objConfirmButtonOnConfirmTransferToStash, "Confirm Button");
        moneyStashedScreenValidation();
        verifyElementPresentAndClick(StashPage.objViewDetailsOfHowWeMovedIt, "View Details How We Moved It");
        transactionDetailsScreen();
        verifyElementPresentAndClick(StashPage.objQuestionMarkIconOnTransactionDetails, "contact customer Icon ");
        verifyElementPresent(ContactUsPage.objPageHeader, "Get In Touch Screen");
        verifyElementPresentAndClick(ProfilePage.objBackIcon, "Back Icon");
        waitForElementToBePresent(StashPage.objQuestionMarkIconOnTransactionDetails, 10, "contact customer Icon");
        verifyElementPresentAndClick(ProfilePage.objBackIcon, "Back Icon");
        verifyElementPresentAndClick(StashPage.objDoneButton, "Done Button");
        newlyCreatedSoloStash("0");
        verifyElementPresentAndClick(StashPage.objStashNameOnTheImageOnStashScreen("0"), "Stash Name on the image");
        selectedSoloStashScreen("0");
        click(ProfilePage.objBackIcon, "Back Icon");
        waitTime(5000);
        click(ProfilePage.objBackIcon, "Back Icon");
        String UpdatedAmount = getText(StashPage.objTonikAmountOnDashboard);
        if (CurrentAmount != UpdatedAmount) {
            logger.info("TSA Balance Reduced based on the amount stashed");
            extentLoggerPass("Stashed Amount", "TSA Balance Reduced based on the amount stashed");
        }
        Swipe("UP", 1);
        stashTileContent();
        Swipe("DOWN", 1);
        verifyElementPresentAndClick(StashPage.objHistoryIcon, "HistoryIcon");
        verifyElementPresent(StashPage.objNameOfTheStashOnHistory, getTextVal(StashPage.objNameOfTheStashOnHistory, ":Name Of The Stash On History"));
        verifyElementPresent(StashPage.objTransactionValueOnHistory, getTextVal(StashPage.objTransactionValueOnHistory, ":Transaction Value On History"));
        verifyElementPresentAndClick(StashPage.objTransactionValueOnHistory, "Transaction History");
        transactionDetailsScreen();
        logger.info("TDB_ST_007, Stash - verifyIfUserCanAddFundsToSoloStashFromTheSummaryDetailsScreen_TDB_ST_007");
        extentLoggerPass("TDB_ST_007", "TBD_PRO_007, Stash -verifyIfUserCanAddFundsToSoloStashFromTheSummaryDetailsScreen_TDB_ST_007 is passed");
    }

    /**
     * Method to verify TSA balance is debited twice if confirm click twice while adding the fund
     * @throws Exception
     */
    // Below method is not yet completed
    public void verifyIfTSABalanceIsDebitedTwiceIfConfirmButtonIsClickedTwiceWhileAddingFundInSoloStash_TDB_ST_008() throws Exception {
        HeaderChildNode("TDB_ST_008, Stash -verifyIfTSABalanceIsDebitedTwiceIfConfirmButtonIsClickedTwiceWhileAddingFundInSoloStash_TDB_ST_008");
        tonikLogin(propertyFileReader("password", "Login"));
        String CurrentAmount = getText(StashPage.objTonikAmountOnDashboard);
        Swipe("UP", 1);
        stashScreen();
        verifyElementPresentAndClick(StashPage.objStashNameOnTheImageOnStashScreen("0"), "Stash Name on the image");
        verifyElementPresentAndClick(StashPage.objAddToStash("0"), "Add to stash");
        verifyElementPresentAndClick(StashPage.objAddToStashEditText, "Add to stash Edit text field");
        type(StashPage.objAddToStashEditText, propertyFileReader("ValidPeso", "Stash"), "valid Amount Input Text Field");
        hideKeyboard();
        verifyElementPresentAndClick(StashPage.objNextButton, "Next button");
        confirmTransferToStashScreen();
        click(StashPage.objConfirmButtonOnConfirmTransferToStash, "Confirm Button");
        click(StashPage.objConfirmButtonOnConfirmTransferToStash, "Confirm Button");
    }

    /**
     * Method to verify user can add money above the target amount
     * @throws Exception
     */
    public void verifyIfUserCanAddMoneyAboveTheTargetAmount_TDB_ST_009() throws Exception {
        HeaderChildNode("TDB_ST_009, Stash -verifyIfUserCanAddMoneyAboveTheTargetAmount_TDB_ST_009");
        tonikLogin(propertyFileReader("password", "Login"));
        String CurrentAmount = getText(StashPage.objTonikAmountOnDashboard);
        Swipe("UP", 1);
        stashScreen();
        verifyElementPresentAndClick(StashPage.objStashNameOnTheImageOnStashScreen("0"), "Stash Name on the image");
        selectedSoloStashScreen("0");
        addToStashScreen("0");
        verifyElementPresentAndClick(StashPage.objAddToStashEditText, "Add to stash Edit text field");
        type(StashPage.objAddToStashEditText, propertyFileReader("ValidPeso", "Stash"), "valid Amount Input Text Field");
        hideKeyboard();
        verifyElementPresentAndClick(StashPage.objNextButton, "Next button");
        confirmTransferToStashScreen();
        click(StashPage.objConfirmButtonOnConfirmTransferToStash, "Confirm Button");
        moneyStashedScreenValidation();
        verifyElementPresentAndClick(StashPage.objDoneButton, "Done Button");
        newlyCreatedSoloStash("0");
        click(ProfilePage.objBackIcon, "Back Icon");
        String UpdatedAmount = getText(StashPage.objTonikAmountOnDashboard);
        if (CurrentAmount != UpdatedAmount) {
            logger.info("TSA Balance Reduced based on the amount stashed");
            extentLoggerPass("Stashed Amount", "TSA Balance Reduced based on the amount stashed");
        }
        Swipe("UP", 1);
        stashTileContent();
        Swipe("DOWN", 1);
        verifyElementPresentAndClick(StashPage.objHistoryIcon, "HistoryIcon");
        verifyElementPresent(StashPage.objNameOfTheStashOnHistory, getTextVal(StashPage.objNameOfTheStashOnHistory, ":Name Of The Stash On History"));
        verifyElementPresent(StashPage.objTransactionValueOnHistory, getTextVal(StashPage.objTransactionValueOnHistory, ":Transaction Value On History"));
        verifyElementPresentAndClick(StashPage.objTransactionValueOnHistory, "Transaction History");
        historyTransactionDetailsScreen();
        logger.info("TDB_ST_009, Stash - verifyIfUserCanAddMoneyAboveTheTargetAmount_TDB_ST_009");
        extentLoggerPass("TBD_ST_009", "TDB_ST_009, Stash -verifyIfUserCanAddMoneyAboveTheTargetAmount_TDB_ST_009 is passed");
    }

    /**
     * Method to verify user can manage the solo stash from the summary details screen
     * @throws Exception
     */
    public void verifyIfUserCanManageTheSoloStashFromTheSummaryDetailsScreen_TDB_ST_010() throws Exception {
        HeaderChildNode("TDB_ST_010, Stash -verifyIfUserCanManageTheSoloStashFromTheSummaryDetailsScreen_TDB_ST_010");
        tonikLogin(propertyFileReader("password", "Login"));
        String CurrentAmount = getText(StashPage.objTonikAmountOnDashboard);
        Swipe("UP", 1);
        stashScreen();
        verifyElementPresentAndClick(StashPage.objStashNameOnTheImageOnStashScreen("0"), "Stash Name on the image");
        selectedSoloStashScreen("0");
        click(LoginPage.objBackIcon, "Back Button");
        verifyElementPresentAndClick(StashPage.objManage("0"), "Manage on the image");
        verifyElementPresentAndClick(StashPage.objStashDetails, "Stash details");
        verifyElementPresent(StashPage.objStashDetailsHeader, "Stash details");
        click(LoginPage.objBackIcon, "Back Button");
        waitForElementToBePresent(StashPage.objModify, 20, "Modify");
        verifyElementPresentAndClick(StashPage.objModify, "Modify");
        verifyElementPresent(StashPage.objModifyStashHeader, "Modify Stash");
        click(LoginPage.objBackIcon, "Back Button");
        waitForElementToBePresent(StashPage.objWithdrawToYourTonikAccount, 20, "WithdrawToYourTonikAccount");
        verifyElementPresentAndClick(StashPage.objWithdrawToYourTonikAccount, "WithdrawToYourTonikAccount");
        verifyElementPresent(StashPage.objWithdrawFromYourStashHeader, "WithdrawFromYourStash");
        click(LoginPage.objBackIcon, "Back Button");
        waitForElementToBePresent(StashPage.objClose, 20, "Close");
        if (verifyElementPresentAndClick(StashPage.objClose, "Close")) {
            verifyElementPresent(StashPage.objAreYouSureYouWantToCloseTheStashPopup, "Are you sure you want to close the pop up");
            logger.info("TDB_ST_010, Stash - verifyIfUserCanManageTheSoloStashFromTheSummaryDetailsScreen_TDB_ST_010");
            extentLoggerPass("TBD_ST_010", "TDB_ST_010, Stash -verifyIfUserCanManageTheSoloStashFromTheSummaryDetailsScreen_TDB_ST_010 is passed");
        }
    }

    /**
     * Method to verify user can view the solo stash details
     * @throws Exception
     */
    public void verifyIfUserCanViewTheSoloStashDetails_TDB_ST_011() throws Exception {
        HeaderChildNode("TDB_ST_011, Stash -verifyIfUserCanViewTheSoloStashDetails_TDB_ST_011");
        tonikLogin(propertyFileReader("password", "Login"));
        String CurrentAmount = getText(StashPage.objTonikAmountOnDashboard);
        Swipe("UP", 1);
        stashScreen();
        verifyElementPresentAndClick(StashPage.objStashNameOnTheImageOnStashScreen("0"), "Stash Name on the image");
        manageStashScreen("0");
        verifyElementPresentAndClick(StashPage.objStashDetails, "Stash details");
        stashDetailsScreen();
        verifyElementPresentAndClick(LoginPage.objBackIcon, "Back Button");
        if(verifyElementDisplayed(StashPage.objStashHeader)){
            logger.info("TDB_ST_011, Stash - verifyIfUserCanViewTheSoloStashDetails_TDB_ST_011");
            extentLoggerPass("TDB_ST_011", "TDB_ST_011, Stash -verifyIfUserCanViewTheSoloStashDetails_TBD_ST_011 is passed");
        }
    }

    /**
     * Method to verify user can change the name and modify the picture
     * @throws Exception
     */
    public void verifyIfUserCanChangeTheNameModifyThePictureOfTheSoloStash_TDB_ST_012() throws Exception {
        HeaderChildNode("TDB_ST_012, Stash -verifyIfUserCanChangeTheNameModifyThePictureOfTheSoloStash_TDB_ST_012");
        tonikLogin(propertyFileReader("password", "Login"));
        Swipe("UP", 1);
        stashScreen();
        String currentStashName = getText(StashPage.objStashNameOnTheImageOnStashScreen("0"));
        verifyElementPresentAndClick(StashPage.objStashNameOnTheImageOnStashScreen("0"), "Stash Name on the image");
        manageStashScreen("0");
        click(LoginPage.objBackIcon, "Back Button");
        click(StashPage.objManage, "Manage on the image");
        click(StashPage.objModify, "Modify");
        modifyStashScreen();
        uploadProfilePicture();
        verifyElementPresentAndClick(StashPage.objNameInputTxt, "Stash for Edit text field");
        clearField(StashPage.objNameInputTxt, "Stash for Edit text field");
        type(StashPage.objNameInputTxt, propertyFileReader("lessThan", "Stash"), "text_field");
        click(ProfilePage.objProfilePicture, "Profile Picture");
        verifyElementPresent(StashPage.objPleaseEnterAValidStashName, "Please Enter a valid stash name inline Error Message");
        verifyElementPresentAndClick(StashPage.objNameInputTxt, "Stash for Edit text field");
        clearField(StashPage.objNameInputTxt, "Stash for Edit text field");
        type(StashPage.objNameInputTxt, propertyFileReader("SpecialChar", "Stash"), "Special char");
        click(ProfilePage.objProfilePicture, "Profile Picture");
        verifyElementPresent(StashPage.objPleaseEnterAValidStashName, "Please Enter a valid stash name inline Error Message");
        click(StashPage.objNameInputTxt, "Stash for Edit text field");
        clearField(StashPage.objNameInputTxt, "Stash for Edit text field");
        type(StashPage.objNameInputTxt, propertyFileReader("validInput", "Stash"), "text_field");
        click(ProfilePage.objProfilePicture, "Profile Picture");
        click(StashPage.objSaveButton, "Save Button");
        youUpdatesYourStashScreen();
        String updatedStashName = getText(StashPage.objStashNameOnTheImageOnStashScreen("0"));
        if(currentStashName != updatedStashName ){
            logger.info("TDB_ST_012, Stash - verifyIfUserCanChangeTheNameModifyThePictureOfTheSoloStash_TDB_ST_012");
            extentLoggerPass("TDB_ST_012", "TDB_ST_012, Stash -verifyIfUserCanChangeTheNameModifyThePictureOfTheSoloStash_TDB_ST_012 is passed");
        }
    }

    /**
     * Method to verify the characters limits for solo stash name
     * @throws Exception
     */
    public void verifyTheCharactersLimitForSoloStashName_TDB_ST_013() throws Exception {
        HeaderChildNode("TDB_ST_013, Stash -verifyTheCharactersLimitForSoloStashName_TDB_ST_013");
        tonikLogin(propertyFileReader("password", "Login"));
        Swipe("UP", 1);
        stashScreen();
        String currentStashName = getText(StashPage.objStashNameOnTheImageOnStashScreen("0"));
        verifyElementPresentAndClick(StashPage.objStashNameOnTheImageOnStashScreen("0"), "Stash Name on the image");
        manageStashScreen("0");
        click(LoginPage.objBackIcon, "Back Button");
        click(StashPage.objManage, "Manage on the image");
        click(StashPage.objModify, "Modify");
        modifyStashScreen();
        uploadProfilePicture();
        verifyElementPresentAndClick(StashPage.objNameInputTxt, "Stash for Edit text field");
        type(StashPage.objNameInputTxt, propertyFileReader("lessThan", "Stash"), "text_field");
        click(ProfilePage.objProfilePicture, "Profile Picture");
        verifyElementPresent(StashPage.objPleaseEnterAValidStashName, "Please Enter a valid stash name inline Error Message");
        verifyElementPresentAndClick(StashPage.objNameInputTxt, "Stash for Edit text field");
        clearField(StashPage.objNameInputTxt, "Stash for Edit text field");
        type(StashPage.objNameInputTxt, propertyFileReader("SpecialChar", "Stash"), "Special char");
        click(ProfilePage.objProfilePicture, "Profile Picture");
        verifyElementPresent(StashPage.objPleaseEnterAValidStashName, "Please Enter a valid stash name inline Error Message");
        click(StashPage.objNameInputTxt, "Stash for Edit text field");
        clearField(StashPage.objNameInputTxt, "Stash for Edit text field");
        type(StashPage.objNameInputTxt, propertyFileReader("MoreThan", "Stash"), "MoreThan");
        click(ProfilePage.objProfilePicture, "Profile Picture");
        String updatedName= getText(StashPage.objNameInputTxt);
        if(updatedName != propertyFileReader("MoreThan", "Stash")){
            logger.info("Accepted only 35 character");
            extentLoggerPass("Minimum Char", "Accepted only 35 character");
        }
        click(StashPage.objNameInputTxt, "Stash for Edit text field");
        clearField(StashPage.objNameInputTxt, "Stash for Edit text field");
        type(StashPage.objNameInputTxt, propertyFileReader("validInput", "Stash"), "text_field");
        click(ProfilePage.objProfilePicture, "Profile Picture");
        click(StashPage.objSaveButton, "Save Button");
        youUpdatesYourStashScreen();
        String updatedStashName = getText(StashPage.objStashNameOnTheImageOnStashScreen("0"));
        if(currentStashName != updatedStashName ){
            logger.info("TDB_ST_013, Stash - verifyTheCharactersLimitForSoloStashName_TDB_ST_013");
            extentLoggerPass("TDB_ST_013", "TBD_PRO_012, Stash -verifyTheCharactersLimitForSoloStashName_TDB_ST_013 is passed");
        }
    }

    public void verifyIfUserCanModifyTheTargetAmountOfTheSoloStash_TDB_ST_014() throws Exception {
        HeaderChildNode("TDB_ST_014, Stash -verifyIfUserCanModifyTheTargetAmountOfTheSoloStash_TDB_ST_014");
        tonikLogin(propertyFileReader("password", "Login"));
        Swipe("UP", 1);
        stashScreen();
        String currentTarget = getText(StashPage.ObjTargetAmountOnTheImage);
//        trim(currentTarget);
        verifyElementPresentAndClick(StashPage.objStashNameOnTheImageOnStashScreen("0"), "Stash Name on the image");
        manageStashScreen("0");
        click(StashPage.objModify, "Modify");
        modifyStashScreen();
        verifyElementPresentAndClick(StashPage.objTargetAmountField, "Target Amount Edit text field");
        clearField(StashPage.objTargetAmountField, "Stash for Edit text field");
        type(StashPage.objTargetAmountField, propertyFileReader("MoreThanTargetForModify", "Stash"), "More Than Target For Modify Target Amount ");
        verifyElementPresentAndClick(StashPage.objSaveButton, "Save button");
        youUpdatesYourStashScreen();
        String updatedTarget = getText(StashPage.ObjTargetAmountOnTheImage);
//        trim(updatedTarget);
       if (currentTarget != updatedTarget) {
            logger.info("TDB_ST_014, Stash - verifyIfUserCanModifyTheTargetAmountOfTheSoloStash_TDB_ST_014");
            extentLoggerPass("TDB_ST_014", "TDB_ST_014, Stash -verifyIfUserCanModifyTheTargetAmountOfTheSoloStash_TDB_ST_014 is passed");
        }
    }

    public void verifyIfUserCanModifyTheTargetAmountInSoloStashValidation_TDB_ST_015() throws Exception {
        HeaderChildNode("TDB_ST_015, Stash -verifyIfUserCanModifyTheTargetAmountInSoloStashValidation_TDB_ST_015");
        tonikLogin(propertyFileReader("password", "Login"));
        if (platform.equalsIgnoreCase("Android")) {
            Swipe("UP", 1);
        } else {
            //For IOS
        }
        stashScreen();
        verifyElementPresentAndClick(StashPage.objStashNameOnTheImageOnStashScreen("0"), "Stash Name on the image");
        manageStashScreen("0");
        click(StashPage.objModify, "Modify");
        modifyStashScreen();
        verifyElementPresentAndClick(StashPage.objTargetAmountField, "Target Amount Edit text field");
        type(StashPage.objTargetAmountField, propertyFileReader("LessThanTarget", "Stash"), "LessThan Target Amount ");
        verifyElementPresentAndClick(StashPage.objSetUpYourStashNextButton, "Next button");
        if (verifyElementPresent(StashPage.objMinimumAmountCanBe, "Minimum Amount can be 1000 Peso Error Message")) {
            logger.info("TBD_PRO_015, Stash - verifyIfUserCanModifyTheTargetAmountInSoloStashValidation_TBD_PST_015");
            extentLoggerPass("TBD_PRO_015", "TBD_PRO_015, Stash -verifyIfUserCanModifyTheTargetAmountInSoloStashValidation_TBD_PST_015 is passed");
        }

    }


    public void verifyIfUserCanWithdrawTheAmountFromSoloStash_TBD_PST_016() throws Exception {
        HeaderChildNode("TBD_PRO_016, Stash -verifyIfUserCanWithdrawTheAmountFromSoloStash_TBD_PST_016");
        tonikLogin(propertyFileReader("password", "Login"));
        String CurrentAmount = getText(StashPage.objTonikAmountOnDashboard);
        if (platform.equalsIgnoreCase("Android")) {
            Swipe("UP", 1);
        } else {
            //For IOS
        }
        stashScreen();
        verifyElementPresentAndClick(StashPage.objStashNameOnTheImageOnStashScreen("0"), "Stash Name on the image");
        manageStashScreen("0");
        click(StashPage.objWithdrawToYourTonikAccount, "With draw To Your Tonik Account");
        withdrawFromYourStashScreen();
        click(LoginPage.objBackIcon, "Back Button");
        waitForElementToBePresent(StashPage.objWithdrawToYourTonikAccount, 20, "With draw To Your Tonik Account");
        click(StashPage.objWithdrawToYourTonikAccount, "With draw To Your Tonik Account");
        verifyElementPresentAndClick(StashPage.objStashTargetAmountInputField, "Stash target Amount field");
        type(StashPage.objStashTargetAmountInputField, propertyFileReader("LessThanStashBalance", "Stash"), "LessThan Stash Balance ");
        hideKeyboard();
        verifyElementPresentAndClick(StashPage.objWithdrawButton, "With draw Button");
        reviewWithDrawal();
        verifyElementPresentAndClick(StashPage.objConfirmButton, "Confirm button");
        sweetScreen();
        click(StashPage.objSweetViewDetails, "Sweet view Details ");
        transactionDetailsScreen();
        verifyElementPresentAndClick(StashPage.objQuestionMarkIconOnTransactionDetails, "contact customer Icon ");
        verifyElementPresent(ContactUsPage.objPageHeader, "Get In Touch Screen");
        verifyElementPresentAndClick(ProfilePage.objBackIcon, "Back Icon");
        waitForElementToBePresent(StashPage.objTransactionDetails, 10, "Sweet screen");
        verifyElementPresentAndClick(ProfilePage.objBackIcon, "Back Icon");
        waitForElementToBePresent(StashPage.objSweet, 10, "Sweet screen");
        click(StashPage.objOhYeahButton, "Yeah Button");
        waitForElementToBePresent(StashPage.objStashHeader,20,"Stash Header");
        newlyCreatedSoloStash("0");
        verifyElementPresentAndClick(StashPage.objStashNameOnTheImageOnStashScreen("0"), "Stash Name on the image");
        selectedSoloStashScreen("0");
        click(ProfilePage.objBackIcon, "Back Icon");
        waitTime(5000);
        click(ProfilePage.objBackIcon, "Back Icon");
        String UpdatedAmount = getText(StashPage.objTonikAmountOnDashboard);
        if (CurrentAmount != UpdatedAmount) {
            logger.info("TSA Balance Reduced based on the amount stashed");
            extentLoggerPass("Stashed Amount", "TSA Balance Reduced based on the amount stashed");
        }
        if (platform.equalsIgnoreCase("Android")) {
            Swipe("UP", 1);
        } else {
            //IOS
        }
        stashTileContent();
        if (platform.equalsIgnoreCase("Android")) {
            Swipe("DOWN", 1);
        }
        verifyElementPresentAndClick(StashPage.objHistoryIcon, "HistoryIcon");
        verifyElementPresentAndClick(StashPage.objMoneyUnStashed, "money UnStashed");
        historyTransactionDetailsScreen();
        logger.info("TBD_ST_016, Stash - verifyIfUserCanWithdrawTheAmountFromSoloStash_TBD_PST_016");
        extentLoggerPass("TBD_ST_016", "TBD_ST_016, Stash -verifyIfUserCanWithdrawTheAmountFromSoloStash_TBD_PST_016 is passed");
    }


    public void verifyIfTSABalanceIsCreditedTwiceIfConfirmButtonClickedTwice_TBD_PST_017() throws Exception {
        HeaderChildNode("TBD_ST_017, Stash -verifyIfTSABalanceIsCreditedTwiceIfConfirmButtonClickedTwice_TBD_PST_017");
        tonikLogin(propertyFileReader("password", "Login"));
        String CurrentAmount = getText(StashPage.objTonikAmountOnDashboard);
        if (platform.equalsIgnoreCase("Android")) {
            Swipe("UP", 1);
        } else {
            //For IOS
        }
        stashScreen();
        verifyElementPresentAndClick(StashPage.objStashNameOnTheImageOnStashScreen("0"), "Stash Name on the image");
        manageStashScreen("0");
        click(StashPage.objWithdrawToYourTonikAccount, "With draw To Your Tonik Account");
        withdrawFromYourStashScreen();
        verifyElementPresentAndClick(StashPage.objStashTargetAmountInputField, "Stash target Amount field");
        type(StashPage.objStashTargetAmountInputField, propertyFileReader("LessThanStashBalance", "Stash"), "LessThan Stash Balance ");
        hideKeyboard();
        verifyElementPresentAndClick(StashPage.objWithdrawButton, "With draw Button");
        reviewWithDrawal();
        verifyElementPresentAndClick(StashPage.objConfirmButton, "Confirm button");
        verifyElementPresentAndClick(StashPage.objConfirmButton, "Confirm button");
        click(StashPage.objOhYeahButton, "Yeah Button");
        waitForElementToBePresent(StashPage.objStashHeader, 20, "Stash header");
        click(LoginPage.objBackIcon, "Back Button");
        String UpdatedAmount = getText(StashPage.objTonikAmountOnDashboard);
        if (CurrentAmount != UpdatedAmount) {
            logger.info("TSA Balance Reduced based on the amount stashed");
            extentLoggerPass("Stashed Amount", "TSA Balance Reduced based on the amount stashed");
        }
        verifyElementPresentAndClick(StashPage.objHistoryIcon, "HistoryIcon");
        verifyElementPresentAndClick(StashPage.objMoneyUnStashed, "money UnStashed");
        historyTransactionDetailsScreen();
        logger.info("TBD_ST_017, Stash - verifyIfTSABalanceIsCreditedTwiceIfConfirmButtonClickedTwice_TBD_PST_017");
        extentLoggerPass("TBD_ST_017", "TBD_ST_017, Stash -verifyIfTSABalanceIsCreditedTwiceIfConfirmButtonClickedTwice_TBD_PST_017 is passed");
    }

    public void verifyIfUserCanWithdrawAmountFromSoloStashInsufficientBalance_TBD_PST_018() throws Exception {
        HeaderChildNode("TBD_ST_018, Stash -verifyIfUserCanWithdrawAmountFromSoloStashInsufficientBalance_TBD_PST_018");
        tonikLogin(propertyFileReader("password", "Login"));
        if (platform.equalsIgnoreCase("Android")) {
            Swipe("UP", 1);
        } else {
            //For IOS
        }
        stashScreen();
        verifyElementPresentAndClick(StashPage.objStashNameOnTheImageOnStashScreen("0"), "Stash Name on the image");
        manageStashScreen("0");
        click(StashPage.objWithdrawToYourTonikAccount, "With draw To Your Tonik Account");
        withdrawFromYourStashScreen();
        verifyElementPresentAndClick(StashPage.objStashTargetAmountInputField, "Stash target Amount field");
        type(StashPage.objStashTargetAmountInputField, propertyFileReader("MoreThanStashBalance", "Stash"), "More Than Stash Balance ");
        hideKeyboard();
        verifyElementPresentAndClick(StashPage.objWithdrawButton, "With draw Button");
      if(verifyElementPresent(StashPage.objNoEnoughBalanceInStashAccount,"No Enough Balance In Stash Account")){
          logger.info("TBD_ST_018, Stash - verifyIfUserCanWithdrawAmountFromSoloStashInsufficientBalance_TBD_PST_018");
          extentLoggerPass("TBD_ST_018", "TBD_ST_018, Stash -verifyIfUserCanWithdrawAmountFromSoloStashInsufficientBalance_TBD_PST_018 is passed");
      }

}
    public void verifyIfUserCanCloseTheSoloStash_TBD_PST_019() throws Exception {
        HeaderChildNode("TBD_ST_019, Stash -verifyIfUserCanCloseTheSoloStash_TBD_PST_019");
        tonikLogin(propertyFileReader("password", "Login"));
        String CurrentAmount = getText(StashPage.objTonikAmountOnDashboard);
        if (platform.equalsIgnoreCase("Android")) {
            Swipe("UP", 1);
        } else {
            //For IOS
        }
        stashScreen();
        String currentAvailable = getText(StashPage.obj5Of5AvailableStashes);
        verifyElementPresentAndClick(StashPage.objStashNameOnTheImageOnStashScreen("1"), "Stash Name on the image");
        manageStashScreen("1");
        verifyElementPresentAndClick(StashPage.objClose, "Close");
        closePopup();
        click(StashPage.objStayButton, "Stay Button");
        waitForElementToBePresent(StashPage.objClose,20, "Close");
        click(StashPage.objClose, "Close");
        waitForElementToBePresent(StashPage.objYesCloseTheStash,20, "Yes Close The Stash");
        click(StashPage.objYesCloseTheStash, "Yes Close The Stash");
        brokeTheStashScreen();
        click(StashPage.objDoneButton, "Done button");
        waitForElementToBePresent(StashPage.objStashHeader,20, "Stash Header");
        String updatedAvailable = getText(StashPage.obj5Of5AvailableStashes);
        if(currentAvailable != updatedAvailable ){
            logger.info("Available Stash increased by one");
            extentLoggerPass("Available Stash", "Available Stash Increased by one");
        }
        click(LoginPage.objBackIcon, "Back Button");
        String UpdatedAmount = getText(StashPage.objTonikAmountOnDashboard);
        if (CurrentAmount != UpdatedAmount) {
            logger.info("TSA Balance changed based on the close Stash amount ");
            extentLoggerPass("Stashed Amount", "TSA Balance changed based on the close Stash amount");
        }
        verifyElementPresentAndClick(StashPage.objHistoryIcon, "HistoryIcon");
        verifyElementPresentAndClick(StashPage.objCloserAmountTransaction, "Closer Amount");
        historyTransactionDetailsScreen();
        logger.info("TBD_ST_019, Stash - verifyIfUserCanCloseTheSoloStash_TBD_PST_019");
        extentLoggerPass("TBD_ST_019", "TBD_ST_019, Stash -verifyIfUserCanCloseTheSoloStash_TBD_PST_019 is passed");
    }


















































        public void trim(String currentAmount) throws Exception{
      //  String line = "Achieved ₱ 11,200 of ₱ 1,006";
        String line = currentAmount;
        int indexOfTarget = line.lastIndexOf("₱");
       String currentTargetAmount = line.substring(indexOfTarget + 1).trim();
        System.out.println("Target amount: ₱ " + currentTargetAmount);
    }


}
