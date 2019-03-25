package FeatureReset;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	WebDriver driver;
	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SKUMA643\\Desktop\\BDD\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("C:\\Users\\SKUMA643\\Downloads\\BDD\\login.html");
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable {
		driver.findElement(By.id("txtUserName")).sendKeys("PIR4T3");
		Thread.sleep(1000);
		
		driver.findElement(By.name("txtPwd")).sendKeys("pirate123");
		Thread.sleep(1000);
	}

	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
	}
	
	
	
	
}
