package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithForms {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SKUMA643\\Desktop\\BDD\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/SKUMA643/Downloads/BDD/WorkingWithForms.html");

		try {
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

			// driver.findElement(By.cssSelector("input[value='Male']")).click();
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
			// drpCity.selectByIndex(1);

			// driver.findElement(By.xpath(".//*[@id='txtPhone']")).sendKeys("7599246005");
			driver.findElement(By.id("txtPhone")).sendKeys("7599246005");
			Thread.sleep(100);

			/* List<WebElement> element = driver.findElements(By.name("chkHobbies"));
			for (WebElement val : element) {
					val.click();										
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}*/
			
			driver.findElement(By.cssSelector("input[value='Reading']")).click();
			driver.findElement(By.cssSelector("input[value='Movies']")).click();
			Thread.sleep(100);
			
			driver.findElement(By.name("submit")).click();
			Thread.sleep(100);

//			driver.findElement(By.name("reset")).click();
//			Thread.sleep(100);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
