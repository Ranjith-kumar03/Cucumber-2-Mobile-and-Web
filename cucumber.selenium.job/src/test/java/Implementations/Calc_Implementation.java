package Implementations;





import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utility.Hook;

public class Calc_Implementation {
	
	private  AppiumDriver<MobileElement> driver;
	private  WebElement element;

	public Calc_Implementation()
	{
		this.driver = Hook.GetDriver2();
		System.out.println("Iam inside mobile doing work ");
	}
	@Then("find number two")
	public void find_number_two() {
		System.out.println("Iam out of mobile");
		element =driver.findElementById("com.asus.calculator:id/digit2");
		element.click();
	   
	}

	@Then("find plus sign")
	public void find_plus_sign() {
	   
		element=driver.findElementById("com.asus.calculator:id/plus");
		element.click();
	}

	@Then("find numberfour")
	public void find_numberfour() {
		element=driver.findElementById("com.asus.calculator:id/digit4");
		element.click();
	}

	@Then("click equal to")
	public void click_equal_to() {
		element=driver.findElementById("com.asus.calculator:id/equal");
		element.click();
	}

	@Then("find results in text bar")
	public void find_results_in_text_bar() {
		element=driver.findElementById("com.asus.calculator:id/resultEditTextID");
		System.out.println("the addition of 2 and 4 is--"+element);
	    
	}

}
