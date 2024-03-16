package com.tonik.regression;

import com.businessFunctions.*;
import org.testng.annotations.*;
import com.driverInstance.AppiumServer;
import com.propertyfilereader.PropertyFileReader;
import com.utility.LoggingUtils;

import org.testng.asserts.SoftAssert;

import static com.utility.Utilities.*;

public class BaseTest{

	protected com.businessFunctions.BaseClass baseClass;
	protected SendMoneyModule sendMoneyModule;
	protected ContactUsModule contactUsModule;
	protected TopUpModule topUpModule;
	protected OnboardingModule onboardingModule;
	protected LoginModule loginModule;
	protected ProfileModule profileModule;
	protected VirtualCardModule virtualCardModule;
	protected StashModule stashModule;
	AppiumServer server = new AppiumServer();
	LoggingUtils logger = new LoggingUtils();
	public static PropertyFileReader prop;
	String osName=System.getProperty("os.name").toLowerCase();

	//Start Application
	@Parameters({ "deviceName", "portno" })
	@BeforeMethod
	public void beforeMethod(@Optional String deviceName, @Optional String portno) throws Exception {
		server.startServer();
		baseClass = new com.businessFunctions.BaseClass(getParameterFromXML("Platform"), deviceName, portno);
		sendMoneyModule = new SendMoneyModule();
		contactUsModule = new ContactUsModule();
		topUpModule = new TopUpModule();
		onboardingModule = new OnboardingModule();
		loginModule = new LoginModule();
		profileModule = new ProfileModule();
		virtualCardModule = new VirtualCardModule();
		stashModule = new StashModule();
		softAssert =new SoftAssert();
	}


	//Stop Application
	@AfterMethod
	public void afterTest() {
		baseClass.tearDown();
		
	}





}
