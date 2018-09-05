package utility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Hook {

	private static WebDriver driver1;
	private static AppiumDriver<MobileElement> driver2;
	
	@Before("@web")
	public void PC_Application()
	{
		System.out.println("Iam in website");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranji\\OneDrive\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
		driver1 =new ChromeDriver();
		driver1.manage().window().maximize();
	}
	
	@Before("@appium")
	public void Mobile_Application() throws MalformedURLException
	{
		System.out.println("Iam in mobile");
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability("deviceName", "Ranjith");
		cap.setCapability("udid", "H1AXHM03E676X4Z");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.1.1");
		
		//App Information
		
		cap.setCapability("appPackage", "com.asus.calculator");
		
		cap.setCapability("appActivity", "com.asus.calculator.Calculator");
		
		//cap.setCapability("appActivity", "com.accuweather.core.CardViewPager");
		//cap.setCapability("appActivity", "com.amazon.mShop.android.home.PublicUrlActivity");
		//cap.setCapability("appActivity", "com.amazon.mShop.youraccount.YourAccountActivity");
		driver2 = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		
	}
	
	@After("@web")
	public void TearDown1() {
		System.out.println("Iam in website teardown");
		driver1.quit();
		
	}
	
	@After("@appium")
	public void TearDown2() {
		System.out.println("Iam in mobile teardown");
		driver2.quit();
	}
	
	
	@Before("@web")
	public static WebDriver GetDriver1()
	{
		System.out.println("Iam flying to website ");
		return driver1;
	}
	@Before("@appium")
	public static AppiumDriver<MobileElement> GetDriver2()
	{
		System.out.println("Iam flying to mobile ");
		return driver2;
	}
}
