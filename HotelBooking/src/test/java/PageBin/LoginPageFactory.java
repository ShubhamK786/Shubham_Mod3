package PageBin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	WebDriver driver;
	
	@FindBy(name="userName")
	@CacheLookup
	WebElement pfusername;
	
	@FindBy(name="userPwd")
	@CacheLookup
	WebElement pfpassword;
	
	@FindBy(xpath="//*[@id='mainCnt']/div[1]/div[1]/form/table/tbody/tr[4]/td[2]/input")
	@CacheLookup
	WebElement pfbutton;

	@FindBy(id="userErrMsg")
	@CacheLookup
	WebElement pferrorusernaame;
	
	@FindBy(id="pwdErrMsg")
	@CacheLookup
	WebElement pferrorpwd;

	public LoginPageFactory(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPfusername() {
		return pfusername;
	}

	public void setPfusername(String susername) {
		pfusername.sendKeys(susername);
	}

	public WebElement getPfpassword() {
		return pfpassword;
	}

	public void setPfpassword(String spassword) {
		pfpassword.sendKeys(spassword);
	}
	
	public WebElement getPfbutton() {
		return pfbutton;
	}

	public void setPfbutton() {
		pfbutton.click();
	}
	
	public String getPferrorusernaame() {
		return pferrorusernaame.getText();
	}

	public String getPferrorpwd() {
		return pferrorpwd.getText();
	}
}
