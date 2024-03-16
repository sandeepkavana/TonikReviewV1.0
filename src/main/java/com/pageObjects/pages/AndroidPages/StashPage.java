package com.pageObjects.pages.AndroidPages;

import org.openqa.selenium.By;

public class StashPage {



    private StashPage() {
    }

   //Stash Tile
    public static By objStashCard = By.xpath("//*[contains(@text,'Your other accounts')]/following::android.view.ViewGroup[1]");
    //Stashes
    public static By objStashes= By.xpath("//*[contains(@text,'Stashes')]");
    //Put your cash in a Stash
    public static By objPutYourCashInAStash= By.xpath("//*[contains(@text,'Put your cash in a Stash!')]");

    //Save and Grow your Money
    public static By objSaveAndGrowYourMoney= By.xpath("//*[contains(@text,'Save and grow your money with people you trust. Earn up to 4.5% per year.')]");

    //Stash welcome Screens
    public static By objIndividualStashWelcomeScreen = By.xpath("//*[contains(@text,'Individual Stash')]");
    public static By objIndividualStashDescription = By.id("com.tonik.mobile:id/Text_Description0");
    public static By objAlrightButton = By.xpath("//*[contains(@text,'Alright')]");
    public static By objDeserveThis = By.id("com.tonik.mobile:id/Text_Title1");
    public static By objDeserveThisDescription = By.id("com.tonik.mobile:id/Text_Description1");
    public static By objAmazingButton = By.xpath("//*[contains(@text,'Amazing!')]");
    public static By objRebound = By.id("com.tonik.mobile:id/Text_Title2");
    public static By objReboundDescription = By.id("com.tonik.mobile:id/Text_Description2");
    public static By objReallyButton = By.xpath("//*[contains(@text,'Really?')]");
    public static By objGoals = By.id("com.tonik.mobile:id/Text_Title3");
    public static By objGoalsDescription = By.id("com.tonik.mobile:id/Text_Description3");
    public static By objCoolButton = By.xpath("//*[contains(@text,'Cool!')]");
    public static By objWerkit = By.id("com.tonik.mobile:id/Text_Title4");
    public static By objWerkitDescription = By.id("com.tonik.mobile:id/Text_Description4");
    public static By objLetsStartButton = By.xpath("//*[contains(@text,'Let’s start stashing!')]");

    //Stash sales screen header
    public static By objStashHeader= By.xpath("//*[@resource-id='com.tonik.mobile:id/Main_title_txt']");

    //Start a new stash
    public static By objStartANewStash= By.xpath("//*[contains(@text,'Start a New Stash')]");

    //Start a new stash
    public static By obj5Of5AvailableStashes= By.xpath("//*[contains(@text,'available stashes')]");

    //Open a new Stash
    public static By objOpenANewStash= By.id("com.tonik.mobile:id/Stash_Title");

    //Luv Stash //Id is not working for this
    public static By objLuvStash= By.id("Luv Stash");

    //Emergency Stash
    public static By objEmergencyStash= By.id("Emergency Stash");

   //Vacation Stash
   public static By objVacationStash= By.id("Vacation Stash");

   //Tuition Stash
   public static By objTuitionStash= By.id("Tuition Stash");

  //Emergency Stash
  public static By objGameConsole= By.id("Game Console");

    //Learn more in our FAQ
    public static By objLearnMoreInOurFAQ = By.id("com.tonik.mobile:id/Stash_FAQ");

    //Select stash Type
    public static By objSelectStashTypePopup = By.id("com.tonik.mobile:id/Select_Stash_Type_Text");

    //This cant be change later
    public static By objThisCantBeChangeLater = By.id("com.tonik.mobile:id/Change_Later_Text");

    //Group Stash on pop up
    public static By objGroupStashOnPopup = By.id("com.tonik.mobile:id/Group_Stash_Text");

    //Solo Stash on popup
    public static By objSoloStashOnPopup = By.id("com.tonik.mobile:id/Solo_Stash_Text");

    //Team work make this stash work
    public static By objTeamworkMakesThisStashWorkOnPopup = By.id("com.tonik.mobile:id/Solo_Stash_Text");

    //Keep it personal and save in this stash
    public static By objKeepItPersonalAndSaveInThisOnPopup = By.id("com.tonik.mobile:id/Solo_Stash_Text");

    //Set up your stash
    public static By objSetUpYourStash= By.id("com.tonik.mobile:id/Main_title_txt");

    //Stash for

    //Target Amount
    public static By objTargetAmount= By.xpath("//*[contains(@text,'Target amount')]");

    //Camera Icon
    public static By objCameraIcon= By.id("com.tonik.mobile:id/Camera_View");
    public static By objModifyStashCameraIconOnProfile= By.id("com.tonik.mobile:id/Stash_Camera_Img");


    //Please enter A valid Stash name
    public static By objPleaseEnterAValidStashName= By.xpath("//*[contains(@text,'Please enter a valid stash name')]");

    //Minimum Amount Canbe
    public static By objMinimumAmountCanBe= By.xpath("//*[contains(@text,'Min amount can be 1000 Peso.')]");

    //Set Initial Saving
    public static By objSetInitialSaving= By.id("com.tonik.mobile:id/Main_title_txt");

    //Set Initial Saving
    public static By objSkipForNow= By.id("com.tonik.mobile:id/Stash_Init_Saving_Skip_Text");

    //Balance on initial saving
    public static By objBalanceOn= By.id("com.tonik.mobile:id/STASH_BALANCE_TEXT");

    //Php Text Review Stash Details
    public static By objPhpText= By.id("com.tonik.mobile:id/Text_PHP");

    //Review Stash Details
    public static By objReviewStashDetails= By.id("com.tonik.mobile:id/Main_title_txt");

    public static By objStashNameOnTheImage= By.xpath("(//*[contains(@text,'Review Stash Details')]/following::android.widget.TextView)[1]");

    //Initial saving Header
    public static By objTargetAmountHeader= By.id("com.tonik.mobile:id/Stash_Init_Saving_Text");

    //Initial saving Header
    public static By objInitialSavingHeader= By.id("com.tonik.mobile:id/Stash_Init_Saving_Text");

    //Transfer from Header
    public static By objTransferFromHeader= By.id("com.tonik.mobile:id/Stash_Transfer_From_Text");

    // Interest rate Header
    public static By objInterestRateHeader = By.xpath("//*[contains(@text,'Interest rate')]");

    //StashPDICText
    public static By objStashPDICText= By.id("com.tonik.mobile:id/Stash_PDIC_Text");

    //Terms and Condition
    public static By objTermsAndCondition= By.xpath("//*[contains(@text,'terms and conditions')]");

    //Terms and Condition Check Box
    public static By objTermsAndConditionCheck= By.id("com.tonik.mobile:id/Stash_TNC_Click");

    //Create Stash Button disabled
    public static By objCreateStashButtonDisabled= By.xpath("//*[contains(@text,'Create Stash') and @enabled='false']");

    //Terms and Condition Screen
    public static By objTermsAndConditionScreen= By.xpath("(//*[contains(@text,'Terms and Conditions')])[1]");

    //Create Stash Button Enabled SoloStashCreatedLuv
    public static By objCreateStashButtonEnabled= By.xpath("//*[contains(@text,'Create Stash') and @enabled='true']");

    //Solo Stash Created Luv
    public static By objSoloStashCreatedLuv= By.id("com.tonik.mobile:id/Stash_Success_Title");

    //StashSuccessDescription
    public static By objStashSuccessDescription= By.id("com.tonik.mobile:id/Stash_Success_Title");

    //Done Button
//    public static By objDoneButton= By.id("com.tonik.mobile:id/Stash_Done_Text");
    public static By objDoneButton= By.xpath("//*[contains(@text,'Done')]");


    //Stash Name On The Image
    public static By objStashNameOnTheImageOnStashScreen(String Name){
        return By.id("com.tonik.mobile:id/Stash_Name_Text"+Name);
    }

//

//    public static By objStashNameOnTheImageOnStashScreen= By.id("com.tonik.mobile:id/Main_title_txt");

    //Achieved On The Image
    public static By objAchievedOnTheImage= By.id("com.tonik.mobile:id/Stash_Current_Amount_Text");
    public static By objAchievedOnTheImage(String Archieve){
        return By.id("com.tonik.mobile:id/Stash_Current_Amount_Text"+Archieve);
    }

    //Add To Stash
    public static By objAddToStash= By.id("com.tonik.mobile:id/Add_To_Stash_Txt");
    public static By objAddToStash(String Stash){
        return By.id("com.tonik.mobile:id/Add_To_Stash_Text"+Stash);
    }

    //Manage AddToStash
    public static By objManage= By.id("com.tonik.mobile:id/Manage_Stash_Txt");

    public static By objManage(String manage){
        return By.id("com.tonik.mobile:id/Manage_Stash_Text"+manage);
    }

    //Add To Stash Header
    public static By objAddToStashHeader= By.id("com.tonik.mobile:id/Main_title_txt");

    //Stash Balance
    public static By objStashBalance= By.id("com.tonik.mobile:id/Stash_Balance");

    //Stash Php Text
    public static By objStashPhpText= By.id("com.tonik.mobile:id/Stash_PHP_Text");

    //Next Button
    public static By objNextButton= By.xpath("//*[contains(@text,'Next')]");

    public static By objSetUpYourStashNextButton= By.id("com.tonik.mobile:id/Stash_Next_Button");
//    public static By objSetUpYourStashNextButton= By.id("com.tonik.mobile:id/Stash_Next_Button");


    //Manage Stash
    public static By objManageStash= By.id("com.tonik.mobile:id/Main_title_txt");

    //Stash Details
    public static By objStashDetails= By.xpath("//*[contains(@text,' Stash details')]");

    // Modify
    public static By objModify= By.xpath("//*[contains(@text,' Modify')]");

    // Withdraw to your TONIK Account
    public static By objWithdrawToYourTonikAccount= By.xpath("//*[contains(@text,' Withdraw to your TONIK Account')]");

    // Close
    public static By objClose= By.xpath("//*[contains(@text,' Close')]");

    // Total Stash Balance header
    public static By objTotalStashBalanceHeader= By.xpath("//*[contains(@text,'Total Stash balance')]");

    // Total Stash Balance
    public static By objTotalStashBalanceOnDashBoard= By.xpath("(//*[contains(@text,'Total Stash balance')]/following::android.widget.TextView)[1]");

    // Looks Lonely here
    public static By objLooksLonelyHere= By.xpath("//*[contains(@text,'Looks lonely here, why not create a Group Stash.')]");

    public static By objRearCamera= By.xpath("//*[@content-desc='Rear Camera']");
    public static By objFrontCamera= By.xpath("//*[@content-desc='Front Camera']");

    public static By objTargetAmountOnReviewStash= By.id("com.tonik.mobile:id/Stash_Traget_Amount_Value");
    public static By objInitialSavingOnReviewStash= By.id("com.tonik.mobile:id/Stash_Init_Saving_Value");
    public static By objTransferFromOnReviewStash= By.id("com.tonik.mobile:id/Stash_Tonik_Account_Text");
    public static By objInterestRateOnReviewStash= By.id("com.tonik.mobile:id/Stash_Floating_Interest_Value");
    public static By objHistoryIcon= By.xpath("//*[contains(@text,'History')]//preceding::android.view.ViewGroup[2]");
    public static By objYouHaveNoTransactionYet= By.xpath("//*[contains(@text,'You have no transactions yet.')]");
    public static By objTermsAndConditionBackIcon= By.xpath("(//*[contains(@text,'Terms and Conditions')]/preceding::android.view.ViewGroup)[2]");
    public static By objInitialSavingAmountInputTextField= By.id("com.tonik.mobile:id/Stash_Init_Saving_Amount_Input");
    public static By objMinimumAmountCanBe1Peso= By.xpath("//*[contains(@text,'Min amount can be 1 Peso.')]");
    public static By objDoItLater= By.xpath("//*[contains(@text,\"I'll do it later, pinky swear\")]");
    public static By objCommunicationIsKeyPopup= By.xpath("//*[contains(@text,'Communication is key.')]");
    public static By objNoEnoughBalanceInTonikAccount= By.xpath("//*[contains(@text,'No enough balance in TONIK account')]");
    public static By objConfirmTransferToStash= By.id("com.tonik.mobile:id/Main_title_txt");
    public static By objAmount= By.id("com.tonik.mobile:id/Stash_Amount_Value");
    public static By objFromAccount= By.id("com.tonik.mobile:id/Stash_Tonik_Account");
    public static By objToAccount= By.id("com.tonik.mobile:id/Stash_To_Value");
    public static By objStashOwner= By.id("com.tonik.mobile:id/Stash_Owner_Name");
    public static By objConfirmButtonOnConfirmTransferToStash= By.id("com.tonik.mobile:id/Stash_Confirm_Text");
    public static By objMoneyStashed= By.id("com.tonik.mobile:id/Money_Stash_Success_Title");
    public static By objYouAdded= By.id("com.tonik.mobile:id/Money_Stash_Success_Description");
    public static By objViewDetailsOfHowWeMovedIt= By.id("com.tonik.mobile:id/View_Stash_Details_Txt");
    public static By objWhen= By.id("com.tonik.mobile:id/Stash_Txn_Date");
    public static By objRefNumber= By.id("com.tonik.mobile:id/Stash_Reference_Value");
   // selected solo Stash Screen
    public static By objNameOfTheSoloStash= By.id("com.tonik.mobile:id/Main_title_txt");
    public static By objInterestRateValue= By.id("com.tonik.mobile:id/Stash_Interest_Value");
    public static By objMyselfTransactionAmount= By.id("com.tonik.mobile:id/TXN_Amount_Txt0");
//    public static By objMyself= By.id("com.tonik.mobile:id/Myself");
      public static By objMyself= By.xpath("//*[contains(@text,'Myself')][1]");
    public static By objCredit= By.id("com.tonik.mobile:id/TXN_Description_TXT");
    public static By objAchievedAmountOnSoloStash= By.id("com.tonik.mobile:id/Stash_Goal_Achieved_Amount");
    public static By objCredit(String Name){
        return By.id("com.tonik.mobile:id/TXN_Description_TXT"+Name);
    }
    public static By objTonikAmountOnDashboard= By.xpath("(//*[contains(@text,'Your tonik account')]/following::android.widget.TextView)[1]");
    public static By objNameOfTheStashOnHistory= By.xpath("(//*[contains(@text,'Account History')]/following::android.widget.TextView)[6]");
    public static By objTransactionValueOnHistory= By.xpath("(//*[contains(@text,'Account History')]/following::android.widget.TextView)[8]");

    public static By objAddToStashEditText= By.id("com.tonik.mobile:id/Stash_Amount_Input");
    public static By objTransactionDetails= By.id("com.tonik.mobile:id/Main_title_txt");
    public static By objFromTransactionDetails= By.id("com.tonik.mobile:id/Stash_From_Value");
    public static By objQuestionMarkIconOnTransactionDetails = By.id("com.tonik.mobile:id/Header_right_click");
    //Need some funds
    public static By objNeedSomeFundsLuvPopUp= By.id("com.tonik.mobile:id/Popup_title_text");
    public static By objOkayLetsGoButton= By.xpath("//*[contains(@text,\"Okay, let’s go\")]");

    public static By objDisabledAmount= By.xpath("//*[contains(@text,'Your tonik account') and @focused='false']/following::android.widget.TextView[1]");
    public static By objEnabledAmount= By.xpath("//*[contains(@text,'Your tonik account') and @enabled='true']/following::android.widget.TextView[1]");

    public static By objWithdrawFromYourStashHeader= By.id("com.tonik.mobile:id/Main_title_txt");
    public static By objAreYouSureYouWantToCloseTheStashPopup= By.id("com.tonik.mobile:id/Popup_sub_header_txt");
//History Transaction Details
public static By amountDetails = By.xpath("//*[@text='Amount']/following-sibling::*");
    public static By fromAccount = By.xpath("//*[@text='From']/following-sibling::*");
    public static By toAccount = By.xpath("//*[@text='To']/following-sibling::*");
    public static By whenDetails = By.xpath("//*[@text='When']/following-sibling::*");
    public static By RefNoDetails = By.xpath("//*[@text='Reference No.']/following-sibling::*");
//Stash details Screen
public static By objStashDetailsHeader= By.id("com.tonik.mobile:id/Main_title_txt");
    public static By objStashIDOption= By.id("com.tonik.mobile:id/Stash_ID_Text");
    public static By objStartingDateOption= By.id("com.tonik.mobile:id/Stash_Start_Date_Text");
    public static By ObjTargetAmountOption= By.id("com.tonik.mobile:id/Stash_Amount_Txt");
    public static By objStashID = By.id("com.tonik.mobile:id/Stash_ID_Value");
    public static By objStartingDate = By.id("com.tonik.mobile:id/Stash_Start_Date");
    public static By objTargetAmountValue = By.id("com.tonik.mobile:id/Stash_Amount_Txt_Value");
    public static By objNoEnoughBalanceInStashAccount = By.id("com.tonik.mobile:id/Stash_Target_Amount_Error");


    //Modify Stash
public static By objModifyStashHeader= By.id("com.tonik.mobile:id/Main_title_txt");
    public static By objStashFor= By.xpath("//*[contains(@text,'Stash for')]");
    public static By objTargetAmountEditText= By.id("com.tonik.mobile:id/Stash_Traget_Amount_Input");
    public static By objStashForEditText= By.id("com.tonik.mobile:id/Stash_Name_Input");

    public static By objImageView = By.id("android.widget.ImageView");
    public static By objNameInputTxt = By.id("com.tonik.mobile:id/Stash_Name_Input_Txt");
    public static By objTargetAmountField = By.id("com.tonik.mobile:id/Stash_Target_Amount_Input");
//You update Your Stash Screen
    public static By objYouUpdatesYourStash = By.id("com.tonik.mobile:id/Close_Stash_Success_Title");
    public static By objYouUpdatesYourStashDescription = By.id("com.tonik.mobile:id/Close_Stash_Success_Description");
    public static By objSaveButton = By.xpath("//*[contains(@text,'Save')]");
    public static By ObjTargetAmountOnTheImage = By.id("com.tonik.mobile:id/Stash_Current_Amount_Text0");
    public static By objWithdrawFromStashTitle = By.xpath("//*[@text='Withdraw from your Stash']");
    public static By objBalanceTxt = By.xpath("//*[contains(@text,'Balance')]");
    public static By objWithdrawButton = By.id("com.tonik.mobile:id/Stash_Withdraw_Button");
    public static By objStashTargetAmountInputField = By.id("com.tonik.mobile:id/Stash_Traget_Amount_Input");
//Review Withdrawal
    public static By objReviewWithDrawalHeader = By.id("com.tonik.mobile:id/Main_title_txt");
    public static By objReviewWithDrawalAmount = By.id("com.tonik.mobile:id/Stash_Traget_Amount_Text");
    public static By objReviewWithDrawalFrom = By.id("com.tonik.mobile:id/Stash_From_Value");
    public static By objReviewWithDrawalTo = By.id("com.tonik.mobile:id/Stash_To_Tonik_Account");
//Sweet screen
public static By objSweet = By.id("com.tonik.mobile:id/Money_Stash_Success_Title");
    public static By objSweetDescription = By.id("com.tonik.mobile:id/Money_Stash_Success_Description");
    public static By objSweetViewDetails = By.id("com.tonik.mobile:id/View_Stash_Details_Txt");
    public static By objOhYeahButton = By.id("com.tonik.mobile:id/Stash_Done_Btn");
//History
    public static By objMoneyUnStashed = By.xpath("//*[contains(@text,'Money un-stashed')]");
    public static By objConfirmButton = By.xpath("//*[contains(@text,'Confirm')]");
    public static By objCloserAmountTransaction = By.xpath("//*[contains(@text,'Closure Amount')]");


    //Close popup
    public static By objStayButton = By.id("com.tonik.mobile:id/Popup_positive_btn_click");
    public static By objYesCloseTheStash = By.id("com.tonik.mobile:id/Popup_negative_btn_txt");
//Stash Broke Screen
    public static By objYouBrokeTheStash = By.id("com.tonik.mobile:id/Close_Stash_Success_Title");
    public static By objYouBrokeTheStashDescription = By.id("com.tonik.mobile:id/Close_Stash_Success_Description");




































}
