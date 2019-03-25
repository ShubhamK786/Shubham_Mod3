package WorkingWithForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver;	
	@Given("^Open the firefox and launch the application$")
	public void open_the_firefox_and_launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SKUMA643\\Desktop\\BDD\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("C:\\Users\\SKUMA643\\Downloads\\BDD\\WorkingWithForms.html");
	}

	@When("^Enter the username, password, confirm password, first name,last name, gender, dateOfBirth, email, address, city, phone, hobbies$")
	public void enter_the_username_password_confirm_password_first_name_last_name_gender_dateOfBirth_email_address_city_phone_hobbies() throws Throwable {
		
		driver.findElement(By.id("txtUserName")).sendKeys("PIR4T3");
		Thread.sleep(100);

		driver.findElement(By.name("txtPwd")).sendKeys("pirate123");
		Thread.sleep(100);

		driver.findElement(By.className("Format")).sendKeys("pirate123");
		Thread.sleep(100);

		driver.findElement(By.cssSelector("input.Format1")).sendKeys("Shubham");
		Thread.sleep(100);

		driver.findElement(By.id("txtLastName")).sendKeys("Kumar");
		Thread.sleep(100);

		driver.findElement(By.name("gender")).click();
		Thread.sleep(100);

		driver.findElement(By.id("DOB")).sendKeys("11/07/1998");
		Thread.sleep(100);

		driver.findElement(By.id("txtEmail")).sendKeys("shubham.n.kumar@capgemini.com");
		Thread.sleep(100);

		driver.findElement(By.id("txtAddress")).sendKeys("Devi Indrayni Society");
		Thread.sleep(100);

		Select drpCity = new Select(driver.findElement(By.name("City")));
		drpCity.selectByVisibleText("Pune");

		driver.findElement(By.id("txtPhone")).sendKeys("7599246005");
		Thread.sleep(100);
		
		driver.findElement(By.cssSelector("input[value='Reading']")).click();
		driver.findElement(By.cssSelector("input[value='Movies']")).click();
		Thread.sleep(100);
	}

	@Then("^Submit the Data$")
	public void submit_the_Data() throws Throwable {
		driver.findElement(By.name("submit")).click();
		Thread.sleep(100);
	}
}
