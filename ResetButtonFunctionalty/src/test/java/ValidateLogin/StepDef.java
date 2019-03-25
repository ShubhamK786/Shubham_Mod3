package ValidateLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	WebDriver driver;	
	@Given("^Open the firefox and launch the application$")
	public void open_the_firefox_and_launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SKUMA643\\Desktop\\BDD\\chromedriver.exe");
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("C:\\Users\\SKUMA643\\Downloads\\BDD\\login.html");
		
//		Implicit wait
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.get("https://demo.opencart.com/");
	}

	@When("^Enter the Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void enter_the_Username_and_Password(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("txtUserName")).sendKeys(arg1);
		Thread.sleep(100);
		
		driver.findElement(By.name("txtPwd")).sendKeys(arg2);
		Thread.sleep(100);
	}

	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
		driver.findElement(By.name("reset")).click();
		Thread.sleep(100);
	}
	
    @After()
    public void closeBrowser() {
      driver.quit();
    }
}
