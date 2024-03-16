package com.pageObjects.pages.AndroidPages;

import org.openqa.selenium.By;

public class VirtualCardPage {

    private VirtualCardPage() {
    }

    //  Virtual card
    public static By objVirtualCardOnBoard = By.xpath("//*[contains(@text,'Virtual Card')]/parent::*/parent::*/parent::* | (//XCUIElementTypeOther[@name='Virtual Card -> **43'])[2]");

    //Virtual card Tile Graydout
    public static By objVirtualCardGraydOut = By.xpath("//*[contains(@text,'Virtual Card ->') and @focused='false'] | (//*[contains(@name,'Virtual Card ->') and @accessible='false'])[16]");

    //Virtual card option
    public static By objVirtualCardOption = By.xpath("//*[contains(@text,'Virtual Card ->')] | //*[@name='Virtual Card ->']");

    //masked Numbers
    public static By objMaskedNumbers = By.xpath("//*[contains(@text,'Virtual Card ->')]/following::android.widget.TextView[1] | //*[contains(@name,'**')]");

    //Cards header
    public static By objCardsHeader = By.xpath("//*[@resource-id='com.tonik.mobile:id/Main_title_txt'] | //*[@name='com.tonik.mobile:id/Main_title_txt']");

    //Virtual card Image
    public static By objVirtualCardImage = By.xpath("//*[contains(@text,'Cards')]/following::android.widget.ImageView[1] | (//*[contains(@name,'com.tonik.mobile:id/Card_Details_View')])[1]");


    //MAsked Eye Icon
    public static By objEyeIcon = By.xpath("//*[contains(@text,'**** 3593')]/preceding::android.view.ViewGroup[1] | //*[contains(@name,'com.tonik.mobile:id/CARD_EYE_CLICK')]");

    //UnMasked Eye Icon
    public static By objUnMaskedEyeIcon = By.xpath("//*[contains(@text,'Cards')]/following::android.view.ViewGroup[5] | //*[contains(@value,'VALID THRU')]/preceding::XCUIElementTypeOther[6]");

    //Lock Card
    public static By objLockCard = By.xpath("//*[contains(@text,'Lock card')] | (//*[@label=' Lock card'])[3]");

    //Lock card Toggle
    public static By objLockCardToggle = By.xpath("//*[contains(@text,'Lock card')]/following::android.view.ViewGroup[1] | //XCUIElementTypeOther[@name=\"com.tonik.mobile:id/Lock_Card_Toggle_Button\"]");


    //Security
    public static By objSecurity = By.xpath("//*[contains(@text,'Security')] | //*[contains(@name,'com.tonik.mobile:id/Security2')]");

    //Card Limits
    public static By objCardLimits = By.xpath("//*[contains(@text,' Card limits')] | //*[@name=\"com.tonik.mobile:id/Card limits3\"]\r\n"
            + "");

    //Unmasked masked 16 digit num
    public static By objUnmaskedNum = By.xpath("//*[contains(@text,'Cards')]/following::android.widget.TextView[1] | (//*[contains(@value,'VALID THRU')]/preceding::XCUIElementTypeStaticText)[2]\r\n"
            + "");

    //Valid through
    public static By objValidThru = By.xpath("//*[contains(@text,'Cards')]/following::android.widget.TextView[4] | //XCUIElementTypeStaticText[@name=\"com.tonik.mobile:id/Virtual_Card_Valid_Thru_Text\"]");

    //CVC CVV
    public static By objCvcCvv = By.xpath("//*[contains(@text,'Cards')]/following::android.widget.TextView[5]");

    //Lock card option

    public static By objLockCardOptions = By.xpath("//*[contains(@text,' Lock card')]//following::android.view.ViewGroup[1]");

    //Locked
    public static By objLocked = By.xpath("//*[contains(@text,'Locked')] | //*[contains(@value,'Locked')]");

    //Security Header
    public static By objSecurityHeader = By.xpath("//*[@resource-id='com.tonik.mobile:id/Main_title_txt'] | //XCUIElementTypeStaticText[@name=\"com.tonik.mobile:id/Main_title_txt\"]");

    //Security SubTitle
    public static By objSecuritySubTitle = By.xpath("//*[@resource-id='com.tonik.mobile:id/Sub_title_txt'] | //XCUIElementTypeStaticText[@name=\"com.tonik.mobile:id/Sub_title_txt\"]");

    //Online Payments
    public static By objOnlinePayments = By.xpath("//*[contains(@text,'Online payments')] | //XCUIElementTypeStaticText[@name=\"Online payments\"]");

    //Block online payments
    public static By objBlockOnlinePayments = By.xpath("//*[contains(@text,'Block online payments and transactions made using this card automatically.')] | //XCUIElementTypeStaticText[@name=\"com.tonik.mobile:id/List_Text_0\"]");

    //Online Payments Toggle Icon
    public static By objOnlinePaymentsToggle = By.xpath("//*[contains(@text,'Online payments')]/following::android.view.ViewGroup[1] | //XCUIElementTypeOther[@name=\"com.tonik.mobile:id/Online paymentsList_Click_\"]");

    //Online Payments Toggle Icon enabled
    public static By objOnlinePaymentsToggleEnabled = By.xpath("//*[contains(@text,'Online payments')]/following::android.view.ViewGroup[1] | //XCUIElementTypeOther[@name='com.tonik.mobile:id/Online paymentsList_Click_' and @enabled='true']");

    //VAlid Thru
    public static By objValidThruOption = By.xpath("//*[contains(@text,'VALID THRU')] | //XCUIElementTypeStaticText[@name=\"com.tonik.mobile:id/Cards_Valid_Thru_Text\"]");

    //CVV CVC
    public static By objCvvOption = By.xpath("//*[contains(@text,'CVC/CVV')] | //XCUIElementTypeStaticText[@name=\"com.tonik.mobile:id/Cards_CVV_Text\"]");

    // Customer Name On CArd
    public static By objCustomerNameOnCard = By.xpath("//*[contains(@text,'Cards')]/following::android.widget.TextView[6] | //XCUIElementTypeStaticText[@name=\"com.tonik.mobile:id/Card_Name_Text\"]");

    //Card Daily limits
    public static By objCardDailyLimitsHeader = By.xpath("//*[@resource-id='com.tonik.mobile:id/Main_title_txt'] | //XCUIElementTypeStaticText[@name=\"com.tonik.mobile:id/Main_title_txt\"]");

    //Online and Physical payments option
    public static By objOnlineAndPhysicalPaymentsOption = By.xpath("//*[contains(@text,' Online and physical payments')] | //XCUIElementTypeStaticText[@name=\"com.tonik.mobile:id/Online_Physical_Payment_Online and physical payments\"]");

    //Online and Physical payments default amount
    public static By objDefaultAmount = By.xpath("//*[contains(@text,' Online and physical payments')]/following::android.widget.TextView | (//*[contains(@value,'Online and physical payments')]/following::XCUIElementTypeStaticText)[1]");

    //Online and Physical payments Header
    public static By objOnlineAndPhysicalPaymentsHeader = By.xpath("//*[@resource-id='com.tonik.mobile:id/Main_title_txt'] | (//*[contains(@value,'Online and physical payments')])[2]");
    //Amount list
    public static By objAmountList = By.xpath("//*[contains(@text,'Online and physical payments')]/following::android.widget.TextView");
    //Amount list
    public static By objAmountList(int listElement){
        return By.xpath("(//*[contains(@text,'Online and physical payments')]/following::android.widget.TextView)["+listElement+"] | //XCUIElementTypeOther[@name=\"com.tonik.mobile:id/Online_Physical_Payment List_Click_["+listElement+"]");
    }
    //Maximum amount
    public static By objSKYCMaximumAmount = By.xpath("//*[contains(@text,'Online and physical payments')]/following::android.widget.TextView[7] | //XCUIElementTypeOther[@name='₱250,000']");

    //Maximum amount
    public static By objBKYCMaximumAmount = By.xpath("//*[contains(@text,'Online and physical payments')]/following::android.widget.TextView[4] | //XCUIElementTypeStaticText[@name=\"Your account limit is ₱50,000 \"]");


}
