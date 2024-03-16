package com.pageObjects.pages.AndroidPages;

import org.openqa.selenium.By;

public class TopUpPage{

    // Private constructor to prevent instantiation
    private TopUpPage() {
    }

//  Top up Icon
    public static By objTopUpIcon = By.xpath("//*[@text='Top up']/preceding-sibling::*");

//  Top up options
    public static  By objTopUpOptions = By.xpath("//android.widget.ScrollView/child::*/child::*/child::*/child::*/child::android.widget.TextView");

//  Name Header
    public static By objNameHeader = By.xpath("//*[@text='Name']");

//  Account holder name displayed
    public static By objAccountHolderNameDisplayed = By.xpath("//*[@text='Name']/following-sibling::android.widget.TextView");

//  Account holder name copy icon
    public static By objAccountHolderNameCopyIcon = By.xpath("(//*[@text='Name']/following-sibling::android.view.ViewGroup)[1]");

//  Bank Header
    public static By objBankHeader = By.xpath("//*[@text='Bank']");

//  Bank name displayed
    public static By objBankNameDisplayed = By.xpath("//*[@text='Bank']/following-sibling::android.widget.TextView");

//  Tonik Account number Header
    public static By objTonikAccountNumberHeader = By.xpath("//*[@text='Tonik Account No.']");

//  Tonik Account number displayed
    public static By objTonikAccountNumberDisplayed = By.xpath("//*[@text='Tonik Account No.']/following-sibling::android.widget.TextView");

//  Tonik Account number copy icon
    public static By objTonikAccountNumberCopyIcon = By.xpath("(//*[@text='Tonik Account No.']/following-sibling::android.view.ViewGroup)[1]");

//  Copy to clipboard message
    public static By objCopyToClipBoardMsg = By.xpath("//*[@text='Copied to your clipboard']");

//  Reminders
    public static By objReminders = By.xpath("//*[@text='Reminders']/parent::*/following-sibling::*/child::*/child::android.widget.TextView");

//  Reminder Header
    public static By objReminderHeader = By.xpath("//*[@text='Reminders']");

//  Topup Option
    public static By objTopUpOption(String option){
        return By.xpath("//*[@text='"+option+"']");
    }

//  Online topup options
    public static By objOnlineTopUpOptions = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup//android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");

//  GCash option
    public static By objGCashOnlineOption = By.xpath("//*[@text=' GCash']");

//  Available balance
    public static By objAvailableBalance = By.xpath("//*[contains(@text, 'Balance')]");

//  Max transaction
    public static By objMaxTransaction = By.xpath("//*[contains(@text, 'Up to')]");

//      Max transaction
    public static By objMaxTransactionErrorMsg = By.xpath("//*[contains(@text, 'Up to')]");

//  Transaction fee
    public static By objTransactionFee = By.xpath("//*[contains(@text, 'Transaction Fee')]");

//  Amount input field
    public static By objAmountInputField = By.xpath("//*[@text='₱']/following-sibling::android.widget.EditText");

//  Top up info
    public static By objTopUPInfo = By.xpath("//*[contains(@text, 'Transaction Fee')]/following-sibling::android.widget.TextView");

//  Next button
    public static By objNextButton = By.xpath("//*[@text='Next']");

//  Proceed to pay button
    public static By objProceedToPayButton = By.xpath("//*[@resource-id='proceed-button']");

//  Transaction status header
    public static By objTransactionStatusHeader = By.xpath("(//*[@text='View transaction details']/parent::*/preceding-sibling::android.widget.TextView)[1]");

//  Transaction Info
    public static By objTransactionInfo = By.xpath("(//*[@text='View transaction details']/parent::*/preceding-sibling::android.widget.TextView)[2]");

//  Button displayed
    public static By objButtonDisplayedInTransactionInfoPage = By.xpath("//*[@text='View transaction details']/parent::*/following-sibling::*/child::android.widget.TextView");

//  Transaction TXNId
    public static By objTopUpTXNId = By.xpath("//*[@text='Txn ID']/following-sibling::*");

//  Contact us icn in transaction details
    public static By objContactUsIconInTransactionDetails = By.xpath("//*[@resource-id='com.tonik.mobile:id/Header_right_click']/child::*");

//  Top up via Gcash page header
    public static By objTopUpViaGCash = By.xpath("//*[@text='Top up via GCash']");

//  Top-up GCash transaction
    public static By objGCashTransactionHistory = By.xpath("(//*[@text='Top-up'])[1]/preceding-sibling::android.widget.TextView");

}
