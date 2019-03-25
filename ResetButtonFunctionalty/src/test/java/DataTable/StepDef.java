package DataTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver;
	@Given("^Open the firefox and launch the application$")
	public void open_the_firefox_and_launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SKUMA643\\Desktop\\BDD\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("C:\\Users\\SKUMA643\\Downloads\\BDD\\login.html");
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password(DataTable arg1) throws Throwable {
	    List<List<String>> data = arg1.raw();
	    for(int i=0; i<data.size(); i++) {
	    	driver.findElement(By.name("txtUserName")).clear();
	    	driver.findElement(By.name("txtPwd")).clear();
	    	driver.findElement(By.name("txtUserName")).sendKeys(data.get(i).get(0));
	    	driver.findElement(By.name("txtPwd")).sendKeys(data.get(i).get(1));
	    	Thread.sleep(1000);
	    }
	}

	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
	}
}
