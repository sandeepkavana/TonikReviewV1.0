package com.pageObjects.pages.AndroidPages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class ContactUsPage {

    // Private constructor to prevent instantiation
    private ContactUsPage() {
    }

//  Question mark (contact us) icon
    public static By objQuestionMarkIcon = By.xpath("(//*[@resource-id='appbar-header']/child::android.view.ViewGroup)[3]");

//  Get in touch header
    public  static By objPageHeader = By.xpath("//*[@resource-id='com.tonik.mobile:id/Main_title_txt']");

//  Get in touch info
    public static By objGetInTouchInfo = By.xpath("//*[@class='android.widget.ScrollView']/child::*/child::android.widget.TextView");

//  Chat with option
    public static By objChatWithUs = By.xpath("(//*[@class='android.widget.ScrollView']/child::*/child::android.view.ViewGroup/child::android.widget.TextView)[1]");

//  Number to contact
    public static By objContactNumber =  By.xpath("(//*[@class='android.widget.ScrollView']/child::*/child::android.view.ViewGroup/child::android.widget.TextView)[2]");

//  Frequently asked questions
    public static By objFrequentlyAskedQuestion = By.xpath("(//*[@class='android.widget.ScrollView']/child::*/child::android.view.ViewGroup/child::android.widget.TextView)[3]");

//  Back button
    public static By objBackBtn = By.xpath("//android.view.ViewGroup[@content-desc='Header_left_click']/android.view.ViewGroup");

//  Chat Input Field
    public static By objChatInputField = By.xpath("//*[@resource-id='query']");

//  Send Button
    public static By objSendButton = By.xpath("//*[@resource-id='flight']");

//  User Msg
    public static By objUserMessages = By.xpath("//*[@resource-id='userMsg']");

//  User Latest message
    public static  By objUserLatestMessage(int index){
        return By.xpath("(//*[@resource-id='userMsg'])["+index+"]");
    }

//  Bot Msg Replay
    public static By objBotReplayMessages = By.xpath("//*[@resource-id='botMessage']");

//  User Latest message
    public static  By objBotLatestReplayMessage(int index){
        return By.xpath("(//*[@resource-id='botMessage'])["+index+"]/child::*/child::*/child::android.widget.TextView");
    }

//  Tonik Icon
    public static By objChatBoxTonikIcon = By.xpath("//*[@text='header-icon']");

//  ChatBox Back button
    public static By objChatBoxBackButton = By.xpath("//*[@text='minimize']");

//  Number displayed in dialPad
    public static By objDialPadNumber = By.xpath("//*[@class='android.widget.EditText']");

//  Tonik Web page
    public static By objTonikWebPageTitle = By.xpath("//*[@resource-id='com.sec.android.app.sbrowser:id/location_bar_edit_text']");

//  Customer care mail id
    public static By objCustomerCareMailId = By.xpath("//*[contains(@text, 'customercare@tonikbank.com')]");

//  Mail Page to field
    public static By objToFieldInMailPage = By.xpath("//*[@resource-id='com.google.android.gm:id/peoplekit_chip']");

//  Contact us button
    public static By objContactUsButton = By.xpath("//*[@resource-id='com.tonik.mobile:id/contact_button']");


}
