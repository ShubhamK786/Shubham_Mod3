package PageBin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelBookingPageFactory {
	WebDriver driver;

	// Identify Elements
	// By name
	@FindBy(name = "txtFN")
	@CacheLookup
	WebElement pffname;

	// By how class
	@FindBy(how = How.ID, using = "btnPayment")
	@CacheLookup
	WebElement pfbutton;

	// By xpath
	@FindBy(xpath = "//*[@id='txtLastName']")
	@CacheLookup
	WebElement pflname;

	//
	@FindBy(how = How.NAME, using = "Email")
	@CacheLookup
	WebElement pfemail;

	// By CSS
	@FindBy(css = "input[pattern='[789][0-9]{9}']")
	@CacheLookup
	WebElement pfmobile;

	//
	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	WebElement pfcity;

	//
	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement pfstate;

	//
	@FindBy(how = How.NAME, using = "persons")
	@CacheLookup
	WebElement pfpersons;

	// By xpath
	@FindBy(xpath = "//*[@id='rooms']")
	@CacheLookup
	WebElement pfrooms;

	//
	@FindBy(how = How.ID, using = "txtCardholderName")
	@CacheLookup
	WebElement pfcardholdere;

	//
	@FindBy(how = How.ID, using = "txtDebit")
	@CacheLookup
	WebElement pfdebit;

	//
	@FindBy(how = How.NAME, using = "cvv")
	@CacheLookup
	WebElement pfcvv;

	//
	@FindBy(how = How.ID, using = "txtMonth")
	@CacheLookup
	WebElement pfmonth;

	//
	@FindBy(how = How.ID, using = "txtYear")
	@CacheLookup
	WebElement pfyear;

	public HotelBookingPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPffname() {
		return pffname;
	}

	public void setPffname(String sfname) {
		pffname.sendKeys(sfname);
	}

	public WebElement getPfbutton() {
		return pfbutton;
	}

	public void setPfbutton() {
		pfbutton.click();
	}

	public WebElement getPflname() {
		return pflname;
	}

	public void setPflname(String slname) {
		pflname.sendKeys(slname);
	}

	public WebElement getPfemail() {
		return pfemail;
	}

	public void setPfemail(String semail) {
		pfemail.sendKeys(semail);
	}

	public WebElement getPfmobile() {
		return pfmobile;
	}

	public void setPfmobile(String smobile) {
		pfmobile.sendKeys(smobile); 
	}

	public WebElement getPfcity() {
		return pfcity;
	}

	public void setPfcity(String scity) {
		Select drpCity = new Select(pfcity);
		drpCity.selectByVisibleText(scity);
	}

	public WebElement getPfstate() {
		return pfstate;
	}

	public void setPfstate(String sstate) {
		Select drpState = new Select(pfstate);
		drpState.selectByVisibleText(sstate);
	}

	public WebElement getPfpersons() {
		return pfpersons;
	}

	public void setPfpersons(String persons) {
		Select drpPerson = new Select(pfpersons);
		drpPerson.selectByVisibleText(persons);
	}

	public WebElement getPfrooms() {
		return pfrooms;
	}

	public WebElement getPfcardholdere() {
		return pfcardholdere;
	}

	public void setPfcardholdere(String scardholdere) {
		pfcardholdere.sendKeys(scardholdere); 
	}

	public WebElement getPfdebit() {
		return pfdebit;
	}

	public void setPfdebit(String sdebit) {
		pfdebit.sendKeys(sdebit);
	}

	public WebElement getPfcvv() {
		return pfcvv;
	}

	public void setPfcvv(String scvv) {
		pfcvv.sendKeys(scvv);
	}

	public WebElement getPfmonth() {
		return pfmonth;
	}

	public void setPfmonth(String smonth) {
		pfmonth.sendKeys(smonth);
	}

	public WebElement getPfyear() {
		return pfyear;
	}

	public void setPfyear(String syear) {
		pfyear.sendKeys(syear);
	}
}
