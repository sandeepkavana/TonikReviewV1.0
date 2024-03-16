package com.pageObjects.pages.AndroidPages;

import org.openqa.selenium.By;

public class SendMoneyPage {

    // Private constructor to prevent instantiation
    private SendMoneyPage() {
    }

//  Send Icon
    public static By objSendIcon = By.xpath("//*[@text='Send']/preceding-sibling::*");

//  page Header
    public  static  By objPageHeader = By.xpath("//*[@resource-id='com.tonik.mobile:id/Main_title_txt']");

//  To another bank option
    public static By objToAnotherBankOption = By.xpath("//*[@text='To another bank']");

//  To another bank options
    public static  By objToAnotherBankOptions = By.xpath("//*[@text='To another bank']/following-sibling::android.widget.TextView");

//  To another Tonik customer option
    public static By objToAnotherTonikCustomerOption = By.xpath("//*[@text='To another Tonik customer']");

//  To another Tonik customer options
    public static  By objProcessingFee = By.xpath("//*[@text='To another Tonik customer']/following-sibling::android.widget.TextView");

//  Send Money options back button
    public static By objBackBtn = By.xpath("//android.view.ViewGroup[@content-desc='Header_left_click']/android.view.ViewGroup");

//  Send Money options dropdown Button
    public static By objSendMoneyToBankOptionsDropdown = By.xpath("((//android.view.ViewGroup[@content-desc='Main_title_view']/parent::*/following-sibling::android.view.ViewGroup)[1]/child::android.view.ViewGroup/child::android.view.ViewGroup)[2]");

//  Send Money via dropdown header
    public static By objSendMoneyViaDropdown = By.xpath("//*[@text='Send money via?']");

//  Pesonet send money to bank option
    public static By objPesonetOption = By.xpath("//*[@text='PESONet']");

//  Pesonet transaction limit
    public static By objPesonetTransactionLimit = By.xpath("//*[@text='PESONet']/following-sibling::android.widget.TextView");

//  InstaPay send money to bank option
    public static By objInstaPayOption = By.xpath("//*[@text='InstaPay']");

//  InstaPay transaction limit
    public static By objInstaPayTransactionLimit = By.xpath("//*[@text='InstaPay']/following-sibling::android.widget.TextView");

//  Current Balance
    public static By objCurrentBalance = By.xpath("//*[contains(@text,'Current')]");

//  Transaction fee
    public static By objTransactionFee = By.xpath("//*[contains(@text,'Transaction')]");

//  Next Button
    public static By objNextBtn = By.xpath("//*[@text='Next']/parent::*");

//  Input Amount field
    public static By objAmountInputField = By.xpath("//*[@text='₱']/following-sibling::android.widget.EditText");

//  Purpose dropdown field
    public static By objPurposeDropdown = By.xpath("((//*[@text='Select a PURPOSE for the transaction']/preceding-sibling::android.view.ViewGroup)[4]/child::*)[2]");

//  Select purpose
    public static By objSelectPurpose(String sPurpose){
        return By.xpath("//*[contains(@text,'"+sPurpose+"')]/following-sibling::android.view.ViewGroup");
    }

//  Purposes
    public static By objPurposes = By.xpath("//*[@class='android.widget.ScrollView']/child::*/child::*/child::*/child::android.widget.TextView");

//  Purpose
    public static By objPurpose(int purpose){
        return By.xpath("(//*[@class='android.widget.ScrollView']/child::*/child::*/child::*/child::android.widget.TextView)["+purpose+"]");
    }

//  Max Amount error message
    public static By objMaxTransactionErrorMsg = By.xpath("(//*[@text='₱']/following-sibling::android.widget.TextView)[1]");

//  Recipient input field
    public static By objRecipientInputField = By.xpath("//*[@class='android.widget.EditText']");

//  Use the tonik account number instead
    public static By objUseTonikAccountLink = By.xpath("//*[@text='Use the Tonik account number instead']");

//  Contacts Icon
    public static By objContactsIcon = By.xpath("//*[@class='android.widget.EditText']/following-sibling::android.view.ViewGroup");

//  Recipient mobile number
    public static By objRecipientMobileNumber = By.xpath("(//*[@resource-id='com.tonik.mobile:id/Main_title_txt']/parent::*/parent::*/following-sibling::android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView)[1]");

//  Confirm send money amount
    public static By objAmountToSend = By.xpath("//*[@text='Amount']/following-sibling::*");

//  Confirm send money fee
    public static By objFeeToSend = By.xpath("//*[@text='Fee']/following-sibling::*");

//  Confirm send money total
    public static By objTotalAmount = By.xpath("//*[@text='Total']/following-sibling::*");

//  Confirm send money from
    public static By objSendingFrom = By.xpath("//*[@text='From']/following-sibling::*");

//  Confirm send money To
    public static By objSendingTo = By.xpath("//*[@text='To']/following-sibling::*");

//  Confirm send money
    public static By objConfirmSendMoneyInfo = By.xpath("//*[contains(@text,'Please')]");

//  Save recipient switch slider
    public static By objSaveRecipientSwitchSlider = By.xpath("//*[@text='Save recipient']/following-sibling::*/android.view.ViewGroup");

//  Add a message
    public static By objAddAMessage = By.xpath("//*[@class='android.widget.EditText']");

//  Confirm button
    public static By objConfirmButton = By.xpath("//*[@text='Confirm']");

//  Enter OTP
    public static By objEnterOTP = By.xpath("//*[@text='Enter OTP']");

//  Enter OTP Info
    public static By objEnterOTPInfo = By.xpath("//*[@text='Enter OTP']/following-sibling::*");

//  Enter OTP Input field
    public static By objEnterOTPInputField = By.xpath("(//*[@class='android.widget.ImageView']/preceding-sibling::*)[2]");

//  Resend OTP Link
    public static By objResendOTPLink = By.xpath("//*[@text='Resend OTP']");

//  Score Status
    public static By objScoreStatus = By.xpath("//*[@text='Scooore!']");

//  Transaction Info
    public static By objTransactionInfo = By.xpath("(//*[@text='Scooore!']/following-sibling::*)[1]");




}
