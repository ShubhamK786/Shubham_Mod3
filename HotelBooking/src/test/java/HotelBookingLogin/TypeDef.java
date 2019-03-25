package HotelBookingLogin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageBin.LoginPageFactory;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TypeDef {
	LoginPageFactory objlpf;
	WebDriver driver;
	
	@Given("^User is on hotel booking login page$")
	public void user_is_on_hotel_booking_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SKUMA643\\Desktop\\BDD\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objlpf = new LoginPageFactory(driver);
		driver.get("file:///C:/Users/SKUMA643/Downloads/BDD/login.html");
	}

	@Then("^Check the title of the page$")
	public void check_the_title_of_the_page() throws Throwable {
		String title = driver.getTitle();
		if(title.contentEquals("Hotel Booking Login")) {
			System.out.println("****Title Matched****");
		} else {
			System.out.println("****Title Not Mached****");
		}
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	}

	@When("^User enters all valid data$")
	public void user_enters_all_valid_data() throws Throwable {
		objlpf.setPfusername("capgemini");
	    Thread.sleep(500);
	    objlpf.setPfpassword("capg1234");
	    Thread.sleep(500);
	    driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	    objlpf.setPfbutton();
	}

	@Then("^Navigate to welcome page$")
	public void navigate_to_welcome_page() throws Throwable {
		driver.navigate().to("file:///C:/Users/SKUMA643/Downloads/BDD/hotelbooking.html");
		Thread.sleep(500);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.close();
	}

	@When("^User enters invalid data$")
	public void user_enters_invalid_data(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		for(int i=0;i< data.size();i++) {
			driver.findElement(By.name("userName")).clear();
			driver.findElement(By.name("userPwd")).clear();
			objlpf.setPfusername(data.get(i).get(0));
			Thread.sleep(500);
			objlpf.setPfpassword(data.get(i).get(1));
			Thread.sleep(500);
		}
		objlpf.setPfbutton();
	}

	@Then("^display alert msg$")
	public void display_alert_msg() throws Throwable {
		Alert alert = driver.switchTo().alert();
		String alertMsg = alert.getText();
		Thread.sleep(500);
		System.out.println("****"+alertMsg+"****");
		alert.accept();
		driver.close();
	}

	@When("^user leaves username blank$")
	public void user_leaves_username_blank() throws Throwable {
		objlpf.setPfusername("");
	    Thread.sleep(500);
	    objlpf.setPfbutton();
	}
	
	@Then("^display username error msg$")
	public void display_username_error_msg() throws Throwable{
		objlpf.getPferrorusernaame();
		Thread.sleep(500);
	}

	@When("^clicks the button$")
	public void clicks_the_button() throws Throwable {
		objlpf.setPfbutton();
	}

	@When("^user leaves password blank and clicks the button$")
	public void user_leaves_password_blank_and_clicks_the_button() throws Throwable {
		objlpf.setPfusername("capgemini");
	    Thread.sleep(500);
	    objlpf.setPfusername("");
	    Thread.sleep(500);
	    objlpf.setPfbutton();
	}
	
	@Then("^display password error msg$")
	public void display_password_error_msg() throws Throwable{
		objlpf.getPferrorpwd();
		Thread.sleep(500);
	}
}
