package HotelBookingSystem;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageBin.HotelBookingPageFactory;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TypeDef {
	
	WebDriver driver;
	HotelBookingPageFactory objhbpg;
	
	@Given("^User is on hotel booking page$")
	public void user_is_on_hotel_booking_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SKUMA643\\Desktop\\BDD\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objhbpg = new HotelBookingPageFactory(driver);
		driver.get("file:///C:/Users/SKUMA643/Downloads/BDD/hotelbooking.html");
	}

	@Then("^Check the title of the page$")
	public void check_the_title_of_the_page() throws Throwable {
		String title = driver.getTitle();
		if(title.contentEquals("Hotel Booking")) {
			System.out.println("****Title Matched****");
		} else {
			System.out.println("****Title Not Mached****");
		}
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
//		driver.close();
	}

	@When("^User enters all valid data$")
	public void user_enters_all_valid_data() throws Throwable {
		 objhbpg.setPffname("Shubham");
		    Thread.sleep(200);
		    objhbpg.setPflname("Kumar");
		    Thread.sleep(200);
		    objhbpg.setPfemail("skg11786@gmail.com");
		    Thread.sleep(200);
		    objhbpg.setPfmobile("7599246005");
		    Thread.sleep(200);
		    objhbpg.setPfcity("Pune");
		    Thread.sleep(200);
		    objhbpg.setPfstate("Maharashtra");
		    Thread.sleep(200);
		    objhbpg.setPfpersons("5");
		    Thread.sleep(200);
		    objhbpg.setPfcardholdere("Shubham Kumar");
		    Thread.sleep(200);
		    objhbpg.setPfdebit("7584965478541235");
		    Thread.sleep(200);
		    objhbpg.setPfcvv("568");
		    Thread.sleep(200);
		    objhbpg.setPfmonth("5");
		    Thread.sleep(200);
		    objhbpg.setPfyear("2025");
		    driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		    objhbpg.setPfbutton();
	}

	@Then("^Navigate to welcome page$")
	public void navigate_to_welcome_page() throws Throwable {
		driver.navigate().to("file:///C:/Users/SKUMA643/Downloads/BDD/success.html");
		Thread.sleep(200);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.close();
	}

	@When("^user leaves first name blank$")
	public void user_leaves_first_name_blank() throws Throwable {
	    objhbpg.setPffname("");
	    Thread.sleep(200);
	}

	@When("^clicks the button$")
	public void clicks_the_button() throws Throwable {
		objhbpg.setPfbutton();
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

	@When("^user leaves last name blank and clicks the button$")
	public void user_leaves_last_name_blank_and_clicks_the_button() throws Throwable {
	    objhbpg.setPffname("Shubham");
	    Thread.sleep(200);
	    objhbpg.setPflname("");
	    Thread.sleep(200);
	    objhbpg.setPfbutton();
//	    driver.close();
	}

	@When("^user enters invalid email and clicks the button$")
	public void user_enters_invalid_email_and_clicks_the_button() throws Throwable {
		objhbpg.setPffname("Shubham");
	    Thread.sleep(200);
	    objhbpg.setPflname("Kumar");
	    Thread.sleep(200);
	    objhbpg.setPfemail("skmail.com");
	    Thread.sleep(200);
	    objhbpg.setPfbutton();
//	    driver.close();
	}

	@When("^user leaves email blank and clicks the button$")
	public void user_leaves_email_blank_and_clicks_the_button() throws Throwable {
		objhbpg.setPffname("Shubham");
	    Thread.sleep(200);
	    objhbpg.setPflname("Kumar");
	    Thread.sleep(200);
	    objhbpg.setPfemail("");
	    Thread.sleep(200);
	    objhbpg.setPfbutton();
//	    driver.close();
	}

	@When("^user leaves mobile no blank and clicks the button$")
	public void user_leaves_mobile_no_blank_and_clicks_the_button() throws Throwable {
		objhbpg.setPffname("Shubham");
	    Thread.sleep(200);
	    objhbpg.setPflname("Kumar");
	    Thread.sleep(200);
	    objhbpg.setPfemail("skg11786@gmail.com");
	    Thread.sleep(200);
	    objhbpg.setPfmobile("");
	    Thread.sleep(200);
	    objhbpg.setPfbutton();
//	    driver.close();
	}

	@When("^user enters invalid mobile and clicks the button$")
	public void user_enters_invalid_mobile_and_clicks_the_button(DataTable arg1) throws Throwable {
		objhbpg.setPffname("Shubham");
	    Thread.sleep(200);
	    objhbpg.setPflname("Kumar");
	    Thread.sleep(200);
	    objhbpg.setPfemail("skg11786@gmail.com");
	    Thread.sleep(200);
	    List<String> mobList = arg1.asList(String.class);
//	    objhbpg.setPfmobile(mobList);
//	    Thread.sleep(200);y
	    objhbpg.setPfbutton();
//	    driver.close();
	}

	@When("^user does not select city and clicks the button$")
	public void user_does_not_select_city_and_clicks_the_button() throws Throwable {
		objhbpg.setPffname("Shubham");
	    Thread.sleep(200);
	    objhbpg.setPflname("Kumar");
	    Thread.sleep(200);
	    objhbpg.setPfemail("skg11786@gmail.com");
	    Thread.sleep(200);
	    objhbpg.setPfmobile("7599246005");
	    Thread.sleep(200);
	    objhbpg.setPfcity("Select City");
	    Thread.sleep(200);
	    objhbpg.setPfbutton();	 
//	    driver.close();
	}

	@When("^user does not select state and clicks the button$")
	public void user_does_not_select_state_and_clicks_the_button() throws Throwable {
		objhbpg.setPffname("Shubham");
	    Thread.sleep(200);
	    objhbpg.setPflname("Kumar");
	    Thread.sleep(200);
	    objhbpg.setPfemail("skg11786@gmail.com");
	    Thread.sleep(200);
	    objhbpg.setPfmobile("7599246005");
	    Thread.sleep(200);
	    objhbpg.setPfcity("Pune");
	    Thread.sleep(200);
	    objhbpg.setPfstate("Select State");
	    Thread.sleep(200);
	    objhbpg.setPfbutton();	
//	    driver.close();
	}

	@When("^user enters \"([^\"]*)\"$")
	public void user_enters(String arg1) throws Throwable {
		objhbpg.setPffname("Shubham");
	    Thread.sleep(200);
	    objhbpg.setPflname("Kumar");
	    Thread.sleep(200);
	    objhbpg.setPfemail("skg11786@gmail.com");
	    Thread.sleep(200);
	    objhbpg.setPfmobile("7599246005");
	    Thread.sleep(200);
	    objhbpg.setPfcity("Pune");
	    Thread.sleep(200);
	    objhbpg.setPfstate("Maharashtra");
	    Thread.sleep(200);
	    objhbpg.setPfpersons(arg1);
	    Thread.sleep(200);
	    objhbpg.setPfbutton();	
//	    driver.close();
	}

	@Then("^allocate rooms such that (\\d+) room for minimum (\\d+) guests$")
	public void allocate_rooms_such_that_room_for_minimum_guests(int arg1, int arg2) throws Throwable {
	    if(arg2 <= 3) {
	    	System.out.println("****1 Room****");
	    	assertEquals(1, arg1);
	    }
	    else  if(arg2 <= 6) {
	    	System.out.println("****2 Room****");
	    	assertEquals(2, arg1);
	    }
	    else if(arg2 <= 9) {
	    	System.out.println("****3 Room****");
	    	assertEquals(3, arg1);
	    }
	}

	@When("^user leaves CardHolderName blank and clicks the button$")
	public void user_leaves_CardHolderName_blank_and_clicks_the_button() throws Throwable {
		objhbpg.setPffname("Shubham");
	    Thread.sleep(200);
	    objhbpg.setPflname("Kumar");
	    Thread.sleep(200);
	    objhbpg.setPfemail("skg11786@gmail.com");
	    Thread.sleep(200);
	    objhbpg.setPfmobile("7599246005");
	    Thread.sleep(200);
	    objhbpg.setPfcity("Pune");
	    Thread.sleep(200);
	    objhbpg.setPfstate("Maharashtra");
	    Thread.sleep(200);
	    objhbpg.setPfpersons("5");
	    Thread.sleep(200);
	    objhbpg.setPfcardholdere("");
	    Thread.sleep(200);
	    objhbpg.setPfbutton();	
//	    driver.close();
	}

	@When("^user leaves DebitCardNo blank and clicks the button$")
	public void user_leaves_DebitCardNo_blank_and_clicks_the_button() throws Throwable {
		objhbpg.setPffname("Shubham");
	    Thread.sleep(200);
	    objhbpg.setPflname("Kumar");
	    Thread.sleep(200);
	    objhbpg.setPfemail("skg11786@gmail.com");
	    Thread.sleep(200);
	    objhbpg.setPfmobile("7599246005");
	    Thread.sleep(200);
	    objhbpg.setPfcity("Pune");
	    Thread.sleep(200);
	    objhbpg.setPfstate("Maharashtra");
	    Thread.sleep(200);
	    objhbpg.setPfpersons("5");
	    Thread.sleep(200);
	    objhbpg.setPfcardholdere("Shubham Kumar");
	    Thread.sleep(200);
	    objhbpg.setPfdebit("");
	    Thread.sleep(200);
	    objhbpg.setPfbutton();
//	    driver.close();
	}

	@When("^user leaves CVV blank and clicks the button$")
	public void user_leaves_CVV_blank_and_clicks_the_button() throws Throwable {
		objhbpg.setPffname("Shubham");
	    Thread.sleep(200);
	    objhbpg.setPflname("Kumar");
	    Thread.sleep(200);
	    objhbpg.setPfemail("skg11786@gmail.com");
	    Thread.sleep(200);
	    objhbpg.setPfmobile("7599246005");
	    Thread.sleep(200);
	    objhbpg.setPfcity("Pune");
	    Thread.sleep(200);
	    objhbpg.setPfstate("Maharashtra");
	    Thread.sleep(200);
	    objhbpg.setPfpersons("5");
	    Thread.sleep(200);
	    objhbpg.setPfcardholdere("Shubham Kumar");
	    Thread.sleep(200);
	    objhbpg.setPfdebit("7584865942155326");
	    Thread.sleep(200);
	    objhbpg.setPfcvv("");
	    Thread.sleep(200);
	    objhbpg.setPfbutton();
//	    driver.close();
	}

	@When("^user leaves expireMonth blank and clicks the button$")
	public void user_leaves_expireMonth_blank_and_clicks_the_button() throws Throwable {
		objhbpg.setPffname("Shubham");
	    Thread.sleep(200);
	    objhbpg.setPflname("Kumar");
	    Thread.sleep(200);
	    objhbpg.setPfemail("skg11786@gmail.com");
	    Thread.sleep(200);
	    objhbpg.setPfmobile("7599246005");
	    Thread.sleep(200);
	    objhbpg.setPfcity("Pune");
	    Thread.sleep(200);
	    objhbpg.setPfstate("Maharashtra");
	    Thread.sleep(200);
	    objhbpg.setPfpersons("5");
	    Thread.sleep(200);
	    objhbpg.setPfcardholdere("Shubham Kumar");
	    Thread.sleep(200);
	    objhbpg.setPfdebit("7584865942155326");
	    Thread.sleep(200);
	    objhbpg.setPfcvv("741");
	    Thread.sleep(200);
	    objhbpg.setPfmonth("");
	    Thread.sleep(200);
	    objhbpg.setPfbutton();
//	    driver.close();
	}

	@When("^user leaves expireYear blank and clicks the button$")
	public void user_leaves_expireYear_blank_and_clicks_the_button() throws Throwable {
		objhbpg.setPffname("Shubham");
	    Thread.sleep(200);
	    objhbpg.setPflname("Kumar");
	    Thread.sleep(200);
	    objhbpg.setPfemail("skg11786@gmail.com");
	    Thread.sleep(200);
	    objhbpg.setPfmobile("7599246005");
	    Thread.sleep(200);
	    objhbpg.setPfcity("Pune");
	    Thread.sleep(200);
	    objhbpg.setPfstate("Maharashtra");
	    Thread.sleep(200);
	    objhbpg.setPfpersons("5");
	    Thread.sleep(200);
	    objhbpg.setPfcardholdere("Shubham Kumar");
	    Thread.sleep(200);
	    objhbpg.setPfdebit("7584865942155326");
	    Thread.sleep(200);
	    objhbpg.setPfcvv("741");
	    Thread.sleep(200);
	    objhbpg.setPfmonth("6");
	    Thread.sleep(200);
	    objhbpg.setPfyear("");
	    Thread.sleep(200);
	    objhbpg.setPfbutton();
//	    driver.close();
	}
}
