package com.driverInstance;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.Reporter;
import org.testng.SkipException;
import com.deviceDetails.DeviceDetails;
import com.google.common.collect.ImmutableMap;
import com.propertyfilereader.PropertyFileReader;
import com.utility.Utilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverInstance extends Drivertools {

	public static String osName=System.getProperty("os.name").toLowerCase();
	public String devicesName;
	public static ThreadLocal<RemoteWebDriver> tlWebDriver = new ThreadLocal<>();
	public DriverInstance() {
	}

	@SuppressWarnings("static-access")
	public DriverInstance(String Application, String deviceName, String portno) {
		super(Application, deviceName, portno);
		try {
			this.devicesName=deviceName;
			switch (getPlatform()) {
			case "Android":
				DriverManager.setAppiumDriver((AppiumDriver<WebElement>) new AndroidDriver<WebElement>(
						new URL(getremoteUrl()), this.generateAndroidCapabilities(Application, deviceName, portno)));
//				Instant endTime = Instant.now();
////				timeElapsed = Duration.between(startTime, endTime);
//				logger.info("Time taken to launch the App (millisec)" + timeElapsed.toMillis());

				break;
				
			case "BrowserStack":
				DriverManager.setAppiumDriver((AppiumDriver<WebElement>) new AndroidDriver<WebElement>(new URL(getBSremoteUrl()),this.generateCapabilitiesbrowserStack(Application)));
			break;
			
			
			case "IOSBrowserStack":
				DriverManager.setAppiumDriver((AppiumDriver<IOSElement>) new IOSDriver<IOSElement>(new URL(getBSremoteUrl()),this.generateCapabilitiesIOSbrowserStack(Application)));
			break;

			case "MPWAiOSSafari":
				DriverManager.setAppiumDriver((AppiumDriver<WebElement>) new IOSDriver<WebElement>(new URL(getremoteUrl()),
								this.generateiOSCapabilities(Application, deviceName, portno)));
				DriverManager.getAppiumDriver().get(getURL());
				break;

			case "Web":
				LaunchBrowser(getBrowserType());
				break;
				
			case "iOS":
				DriverManager.setAppiumDriver((AppiumDriver<IOSElement>) new IOSDriver<IOSElement>(new URL(getremoteUrl()), this.generateiOSCapabilities(Application, deviceName,portno)));
				break;
				
			case "MPWA":
				DriverManager.setAppiumDriver((AppiumDriver<WebElement>) new AndroidDriver<WebElement>(new URL(getremoteUrl()),this.generateAndroidCapabilities(Application, deviceName, portno)));
				DriverManager.getAppiumDriver().get(getURL());
				break;

			default:
				throw new SkipException("Incorrect Platform...");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new SkipException("Device not connected OR Appium Studio service is down...");
		}
		Utilities.initDriver();
	}

	/**
	 * @param application
	 * @return Android capabilities
	 * @throws Exception
	 */
	protected DesiredCapabilities generateAndroidCapabilities(String application, String deviceName, String portno) {

		capabilities.setCapability(MobileCapabilityType.UDID, deviceName);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, DeviceDetails.platformVersion());
//    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
//    capabilities.setCapability("unlockType", "pin");
//    capabilities.setCapability("unlockKey", "1234");
//    capabilities.setCapability("appium:noReset", "true");
//    capabilities.setCapability("appium:fullReset", "false");
		capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 300 * 60);
		if (getPlatform().equals("MPWA")) {
			capabilities.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("androidKeepAppDataDir", true);
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//			capabilities.setCapability("chromedriverExecutableDir", "D:\\TMO_Master\\Drivers\\chrome-win32");
			return capabilities;
		}
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, getAppPackage());
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, getappActivity());
//		if (Utilities.relaunch) {
//		removePermisson(getAppPackage());
//		}
//		startTime = Instant.now();
		return capabilities;
	}

	/**
	 * @param application
	 * @return iOS capabilities
	 * @throws Exception
	 */
	protected DesiredCapabilities generateiOSCapabilities(String application,String udid,String portno) {
	DesiredCapabilities iOScapabilities = new DesiredCapabilities();
		
		if(getPlatform().equals("MPWA") || getPlatform().equals("MPWAiOSSafari")){

			iOScapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
			iOScapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iOS");
//			iOScapabilities.setCapability(MobileCapabilityType.FULL_RESET, true);
//			iOScapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
			iOScapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
//			iOScapabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.apple.mobilesafari");
			iOScapabilities.setCapability("udid", udid);
			iOScapabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
		}else{
			iOScapabilities.setCapability("deviceName", "iOS");
			iOScapabilities.setCapability("udid", udid);
			iOScapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
			iOScapabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "");
		}

		iOScapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 300);
		return iOScapabilities;
	}

	/**
	 * Function to Launch Web Browsers
	 * 
	 * @param browserName
	 * @throws MalformedURLException
	 */
	public synchronized void LaunchBrowserGrid(String browserName) throws MalformedURLException {
		setHandler(new PropertyFileReader("properties/AppPackageActivity.properties"));
		if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().browserVersion("0.27.0").setup();
			tlWebDriver.set(new FirefoxDriver());
		} else if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("enable-automation");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-infobars");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--disable-browser-side-navigation");
			options.addArguments("--disable-gpu");
			options.addArguments("--disable-notifications");
			options.addArguments("--disable-notifications");
			try {
				DriverManager.setDriver(new RemoteWebDriver(new URL("http://192.168.0.191:4444/"), options));
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		} else if (browserName.equalsIgnoreCase("IE")) {
			tlWebDriver.set(new InternetExplorerDriver());
		} else if (browserName.equalsIgnoreCase("MSEdge")) {
			tlWebDriver.set(new EdgeDriver());
		}
		DriverManager.getDriver().get(getURL());
	}

	/**
	 * Function to Launch Web Browsers
	 * 	
	 * @param browserName
	 */
	public void LaunchBrowser(String browserName) {
		setHandler(new PropertyFileReader("properties/AppPackageActivity.properties"));
		if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().browserVersion("0.33.0").setup();
			tlWebDriver.set(new FirefoxDriver());
		} else if (browserName.equalsIgnoreCase("Chrome")) {
//			WebDriverManager.chromedriver().browserVersion(getDriverVersion()).setup();
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
//			options.addArguments("start-maximized");
			options.addArguments("--window-size=1440,900");		
			options.addArguments("enable-automation");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-infobars");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--disable-browser-side-navigation");
			options.addArguments("--disable-gpu");
			options.addArguments("--incognito");
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			tlWebDriver.get();
			tlWebDriver.set(new ChromeDriver(options));
		}else if (browserName.equalsIgnoreCase("ChromeNormal")) {
//			WebDriverManager.chromedriver().browserVersion(getDriverVersion()).setup();
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			tlWebDriver.set(new ChromeDriver(options));
		} 
		else if (browserName.equalsIgnoreCase("IE")) {
			tlWebDriver.set(new InternetExplorerDriver());
		}
		else if (browserName.equalsIgnoreCase("MSEdge")) {
			tlWebDriver.set(new EdgeDriver());
		}
		else if (browserName.equalsIgnoreCase("Safari")) {
			WebDriverManager.safaridriver().setup();
			tlWebDriver.set(new SafariDriver());
			tlWebDriver.get().manage().window().maximize();
		}
		tlWebDriver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		tlWebDriver.get().get(getURL());
		tlWebDriver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public DesiredCapabilities generateCapabilitiesbrowserStack(String application) {
		System.out.println("Capability-BrowserStack");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("deviceName"));
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 300);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		capabilities.setCapability("browserstack.user", getBSuserID());
		capabilities.setCapability("browserstack.key", getBSuserKey());
		capabilities.setCapability(MobileCapabilityType.APP, getBSappID());
		return capabilities;
	} 
	
	public DesiredCapabilities generateCapabilitiesIOSbrowserStack(String application) {
		System.out.println("Capability-iOSBrowserStack");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("deviceName"));
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 300);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
		capabilities.setCapability(MobileCapabilityType.UDID, "00008110-000A54142122401E");
		capabilities.setCapability("browserstack.user", getBSuserID());
		capabilities.setCapability("browserstack.key", getBSuserKey());
		capabilities.setCapability(MobileCapabilityType.APP, getBSappID());
		return capabilities;
	}


	/**
	 * To Remove the permission of an application
	 * 
	 * @param packagename
	 */
	public static void removePermisson(String packagename) {
		logger.info("****Clearing the App Data****");
		String cmd2 = "adb -s " + getDeviceList() + " shell pm clear " + packagename;
		try {
			if(osName.contains("mac")) {
				Runtime.getRuntime().exec(new String[] {"bash","-l","-c",cmd2});
			}else {
			Runtime.getRuntime().exec(cmd2);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public DesiredCapabilities pwaLauch() throws MalformedURLException{
		String RemoteUrl;
		if(osName.contains("mac")) {
			PropertyFileReader config=new PropertyFileReader(".//properties//Execution.properties");
			 RemoteUrl="http://" + config.getproperty("HOST_IP") + ":" + config.getproperty("HOST_PORT") + "/wd/hub";
		}else {
		PropertyFileReader config=new PropertyFileReader(".\\properties\\Execution.properties");
		 RemoteUrl="http://" + config.getproperty("HOST_IP") + ":" + config.getproperty("HOST_PORT") + "/wd/hub";
		}
		
		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().browserVersion(getDriverVersion()).setup();
		
		capabilities.setCapability("appium-version", "1.22.3");
		capabilities.setCapability(MobileCapabilityType.UDID, devicesName);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, DeviceDetails.platformVersion());
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		capabilities.setCapability("autoGrantPermissions", true);
		capabilities.setCapability("unlockType", "pin");
		capabilities.setCapability("unlockKey", "1234");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 300*60);
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, getAppPackage());
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, getappActivity());
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-infobars");
		options.addArguments("androidPackage", "com.android.chrome");
		options.addArguments("--disable-popup-blocking");
		//options.setExperimentalOption("w3c", true);
		capabilities.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
		capabilities.setCapability(MobileCapabilityType.SUPPORTS_APPLICATION_CACHE, true);
		capabilities.setCapability(MobileCapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, false);
		capabilities.setCapability("newCommandTimeout", 300*60);
		DriverManager.setAppiumDriver(((AppiumDriver<WebElement>) new AndroidDriver<WebElement>(new URL(RemoteUrl), capabilities)));
		return capabilities;


	}
}