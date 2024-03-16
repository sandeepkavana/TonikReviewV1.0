package com.businessFunctions;

import com.pageObjects.pages.AndroidPages.ContactUsPage;
import com.pageObjects.pages.AndroidPages.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.driverInstance.CommandBase;
import com.driverInstance.DriverManager;
import com.propertyfilereader.PropertyFileReader;
import com.utility.ExtentReporter;
import com.utility.LoggingUtils;

import java.util.List;

import static com.utility.Utilities.*;

public class BaseClass {

	static String oSPlatformName = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getSuite().getName().replaceAll(" (0)", "").trim();
	public static LoggingUtils logger = new LoggingUtils();
	public static PropertyFileReader prop;
	public static String os = System.getProperty("os.name").toLowerCase();
	String osName=System.getProperty("os.name").toLowerCase();

	private int timeout;
	private int retryCount;

	//0-Param Constructor
	public BaseClass() {

	}

	//3-Param Constructor
	public BaseClass(String Application, String deviceName, String portno) throws InterruptedException {
		new CommandBase(Application, deviceName, portno);
//		propertyFileReader();
		init();
	}


	//Tear Down Application
	public void tearDown() {
		if(oSPlatformName.equals("Web")) {
			getWebDriver().close();
		}else {
			logger.info("Session ID: " + ((RemoteWebDriver) DriverManager.getAppiumDriver()).getSessionId());
			ExtentReporter.extentLogger("","Session ID: " + ((RemoteWebDriver) DriverManager.getAppiumDriver()).getSessionId());
			logger.info("Session is quit");
			ExtentReporter.extentLogger("", "Session is quit");
			setScreenshotSource();
			DriverManager.getAppiumDriver().quit();
		}
	}

	public void init(){
		PropertyFileReader handler;
		handler = new PropertyFileReader("properties/Execution.properties");
		setTimeout(Integer.parseInt(handler.getproperty("TIMEOUT")));
		setRetryCount(Integer.parseInt(handler.getproperty("RETRY_COUNT")));
		logger.info("Loaded the following properties" + " TimeOut :" + getTimeout() + " RetryCount :" + getRetryCount());
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public int getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(int retryCount) {
		this.retryCount = retryCount;
	}

	public void tonikLogin(String password) throws Exception {
		if(waitForElementToBePresent(LoginPage.objEditPassword, 60,"Password edit field")) {
			String camPermHeaderTxt = getText(LoginPage.objEditPassword);
			Assert.assertEquals(camPermHeaderTxt, "Password");
			click(LoginPage.objEditPassword, "Password field");
			type(LoginPage.objEditPassword  , password, "Enter secret code");
			verifyElementPresentAndClick(LoginPage.objLoginBtn,getTextVal(LoginPage.objLoginBtn,"Button"));
			waitTime(5000);
			verifyElementPresent(LoginPage.objProfileName,getTextVal(LoginPage.objProfileName," : Profile Name"));
			logger.info("Successfully logged into Tonik app");
			ExtentReporter.extentLoggerPass("", "Successfully logged into Tonik app");

		}
		else {
			logger.info("Login page not loaded");
			ExtentReporter.extentLoggerFail("Login page", "Login page is not loaded successfully");
		}
	}

	public void contactUsPageUI() throws Exception {
		verifyElementPresent(ContactUsPage.objPageHeader,getTextVal(ContactUsPage.objPageHeader," : Page Header"));
		if (verifyElementDisplayed(ContactUsPage.objGetInTouchInfo)) {
			List<WebElement> values = findElements(ContactUsPage.objGetInTouchInfo);
			for (int info = 0; info < values.size(); info++) {
				if(info%2==0) {
					String displayedItem = values.get(info).getText();
					logger.info("Info : '" + displayedItem + "' is displayed");
					ExtentReporter.extentLogger(" ", "Info : '" + displayedItem + "' is displayed");
				}
			}
		}
		verifyElementPresent(ContactUsPage.objChatWithUs,getTextVal(ContactUsPage.objChatWithUs,"Contact Option"));
		assertionValidation(getText(ContactUsPage.objChatWithUs),propertyFileReader("ChatWithUs","contactUs"),": Option");
		verifyElementPresent(ContactUsPage.objContactNumber,getTextVal(ContactUsPage.objContactNumber,"Contact Number"));
		assertionValidation(getText(ContactUsPage.objContactNumber),propertyFileReader("ContactNumber","contactUs"),": Option");
		verifyElementPresent(ContactUsPage.objFrequentlyAskedQuestion,getTextVal(ContactUsPage.objFrequentlyAskedQuestion,"option"));
		assertionValidation(getText(ContactUsPage.objFrequentlyAskedQuestion),propertyFileReader("FrequentlyAskedQuestion","contactUs"),": Option");
		verifyElementPresent(ContactUsPage.objBackBtn,getTextVal(ContactUsPage.objPageHeader," : Page Back button"));
	}



}
