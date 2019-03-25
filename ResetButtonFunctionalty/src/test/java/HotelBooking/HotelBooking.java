package HotelBooking;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelBooking {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SKUMA643\\Desktop\\BDD\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/SKUMA643/Downloads/BDD/hotelbooking.html");
		
//		Blank First Name
		driver.findElement(By.id("txtFirstName")).sendKeys("");
		driver.findElement(By.id("btnPayment")).click();		
		Thread.sleep(1000);
		alertMsg();
		
//		Blank Last Name
		driver.findElement(By.id("txtFirstName")).sendKeys("Shubham");
		driver.findElement(By.id("txtLastName")).sendKeys("");
		driver.findElement(By.id("btnPayment")).click();
		Thread.sleep(1000);
		alertMsg();

//		Blank Email
		driver.findElement(By.id("txtLastName")).sendKeys("Kumar");
		driver.findElement(By.id("txtEmail")).sendKeys("");
		driver.findElement(By.id("btnPayment")).click();
		Thread.sleep(1000);
		alertMsg();
		
//		Blank Mobile No
		driver.findElement(By.id("txtEmail")).sendKeys("skg11786@gmail.com");
		driver.findElement(By.id("txtPhone")).sendKeys("");
		driver.findElement(By.id("btnPayment")).click();
		Thread.sleep(1000);
		alertMsg();
		
//		Invalid Mobile No
		driver.findElement(By.id("txtPhone")).sendKeys("99246005");
		driver.findElement(By.id("btnPayment")).click();
		Thread.sleep(1000);
		alertMsg();
		
//		Valid Mobile No and Blank City
		driver.findElement(By.id("txtPhone")).clear();
		driver.findElement(By.id("txtPhone")).sendKeys("7599246005");
		driver.findElement(By.id("btnPayment")).click();
		Thread.sleep(1000);
		alertMsg();
		
//		Blank State
		Select city = new Select(driver.findElement(By.name("city")));
		city.selectByVisibleText("Pune");
		driver.findElement(By.id("btnPayment")).click();
		Thread.sleep(1000);
		alertMsg();
		
//		Blank No of Person
		Select state = new Select(driver.findElement(By.name("state")));
		state.selectByVisibleText("Maharashtra");
		driver.findElement(By.id("btnPayment")).click();
		Thread.sleep(1000);
		alertMsg();
		
//		Blank Card Holder Name 
		Select persons = new Select(driver.findElement(By.name("persons")));
		persons	.selectByVisibleText("3");
		driver.findElement(By.id("btnPayment")).click();
		Thread.sleep(1000);
		alertMsg();
		
//		Blank Debit Card No
		driver.findElement(By.id("txtCardholderName")).sendKeys("Shubham Kumar");
		driver.findElement(By.id("btnPayment")).click();
		Thread.sleep(1000);
		alertMsg();
		
//		Blank CVV
		driver.findElement(By.id("txtDebit")).sendKeys("1234564748598745");
		driver.findElement(By.id("btnPayment")).click();
		Thread.sleep(1000);
		alertMsg();
		
//		Blank Month
		driver.findElement(By.id("txtCvv")).sendKeys("123");
		driver.findElement(By.id("btnPayment")).click();
		Thread.sleep(1000);
		alertMsg();
		
//		Blank Year
		driver.findElement(By.id("txtMonth")).sendKeys("12");
		driver.findElement(By.id("btnPayment")).click();
		Thread.sleep(1000);
		alertMsg();
		
//		 All Done
		driver.findElement(By.id("txtYear")).sendKeys("2021");
		driver.findElement(By.id("btnPayment")).click();
		Thread.sleep(1000);
		alertMsg();
		
		driver.quit();
	}
	
	static void alertMsg() {
		Alert alert = driver.switchTo().alert();
		System.out.println("The alert message is: "+alert.getText());
		alert.accept();
	}
}
