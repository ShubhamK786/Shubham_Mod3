package WorkingWithForm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageBin.FormPageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver;	
	FormPageFactory obj;
	@Given("^Open the firefox and launch the application$")
	public void open_the_firefox_and_launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SKUMA643\\Desktop\\BDD\\chromedriver.exe");
		driver = new ChromeDriver();
		obj = new FormPageFactory(driver);
		driver.get("C:\\Users\\SKUMA643\\Downloads\\BDD\\WorkingWithForms.html");
	}

	@When("^Enter the username, password, confirm password, first name,last name, gender, dateOfBirth, email, address, city, phone, hobbies$")
	public void enter_the_username_password_confirm_password_first_name_last_name_gender_dateOfBirth_email_address_city_phone_hobbies() throws Throwable {
		obj.setUsername("PIR4T3");
		Thread.sleep(100);

		obj.setPassword("12345678");
		Thread.sleep(100);

		obj.setConfirmpassword("12345678");
		Thread.sleep(100);

		obj.setFirstname("Shubham");
		Thread.sleep(100);

		obj.setLastname("Kumar");
		Thread.sleep(100);

		obj.setGender();
		Thread.sleep(100);

		obj.setDob("11/07/1998");
		Thread.sleep(100);

		obj.setEmail("pirate@gmail.com");
		Thread.sleep(100);

		obj.setAddress("Devi Indrayni Society");
		Thread.sleep(100);

		obj.setCity("Pune");
		Thread.sleep(100);
		
		obj.setPhone("7599246005");
		Thread.sleep(100);
		
		obj.setHobbies();
		Thread.sleep(100);
	}

	@Then("^Submit the Data$")
	public void submit_the_Data() throws Throwable {
		obj.setSubmitbtn();
		Thread.sleep(100);
	}
}
