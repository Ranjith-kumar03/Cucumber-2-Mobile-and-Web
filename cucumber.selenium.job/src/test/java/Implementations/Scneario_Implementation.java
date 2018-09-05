package Implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utility.Hook;

public class Scneario_Implementation {
	
	private WebDriver driver;
	private WebElement element;
	
	public Scneario_Implementation()
	{
		this.driver = Hook.GetDriver1();
		System.out.println("Iam inside website doing work ");
	}
	
	@Given("open Chrome browser")
	public void open_Chrome_browser() {
		
		driver.get("https://www.naukri.com/");
	    
	}

	@Then("Enter user name")
	public void enter_user_name() {
		element =driver.findElement(By.id("login_Layer"));
		element.click();
		element=driver.findElement(By.name("email"));
		element.sendKeys("xxxxxxxxxxxxx@gnmail.com");
	  
	}

	@Then("Enter password")
	public void enter_password() {
		element =driver.findElement(By.name("PASSWORD"));
		element.sendKeys("xxxxxxxxxx");
	   
	}

	@Then("clik on submit button")
	public void clik_on_submit_button() {
		element =driver.findElement(By.xpath("//button[@value='Login']"));
		element.click();
	  
	}

	@Then("Wait for some seconds")
	public void wait_for_some_seconds() throws InterruptedException {
		Thread.sleep(10000);
	   
	}

	@Then("quit the Browser")
	public void quit_the_Browser() {
		driver.quit();
	    
	}

	
	
}
