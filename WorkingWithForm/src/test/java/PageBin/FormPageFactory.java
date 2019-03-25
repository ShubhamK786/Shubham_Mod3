package PageBin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormPageFactory {
	
	WebDriver driver;

	public FormPageFactory(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="txtUserName")
	@CacheLookup
	WebElement username;
	
	@FindBy(name="txtPwd")
	@CacheLookup
	WebElement password;
	
	@FindBy(id="txtConfPassword")
	@CacheLookup
	WebElement confirmpassword;
	
	@FindBy(id="txtFirstName")
	@CacheLookup
	WebElement firstname;
	
	@FindBy(id="txtLastName")
	@CacheLookup
	WebElement lastname;
	
	@FindBy(id="rbMale")
	@CacheLookup
	WebElement gender;
	
	@FindBy(id="DOB")
	@CacheLookup
	WebElement dob;
	
	@FindBy(name="Email")
	@CacheLookup
	WebElement email;
	
	@FindBy(id="txtAddress")
	@CacheLookup
	WebElement address;
	
	@FindBy(name="City")
	@CacheLookup
	WebElement city;
	
	@FindBy(id="txtPhone")
	@CacheLookup
	WebElement phone;
	
	@FindBy(xpath="html/body/form/table/tbody/tr[12]/td[2]/input[1]")
	@CacheLookup
	WebElement hobbies;

	@FindBy(name="submit")
	@CacheLookup
	WebElement submitbtn;
	
	public WebElement getUsername() {
		return username;
	}

	public void setUsername(String susername) {
		username.sendKeys(susername);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String spassword) {
		password.sendKeys(spassword);
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String sconfirmpassword) {
		confirmpassword.sendKeys(sconfirmpassword);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public void setFirstname(String sfirstname) {
		firstname.sendKeys(sfirstname); 
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(String slastname) {
		this.lastname.sendKeys(slastname);
	}

	public WebElement getGender() {
		return gender;
	}

	public void setGender() {
		gender.click();
	}

	public WebElement getDob() {
		return dob;
	}

	public void setDob(String sdob) {
		dob.sendKeys(sdob);
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String semail) {
		email.sendKeys(semail); 
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(String saddress) {
		address.sendKeys(saddress);
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(String scity) {
		Select drpcity = new Select(city);
		drpcity.selectByVisibleText(scity);
	}

	public WebElement getPhone() {
		return phone;
	}

	public void setPhone(String sphone) {
		phone.sendKeys(sphone);
	}

	public WebElement getHobbies() {
		return hobbies;
	}

	public void setHobbies() {
		hobbies.click();
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public void setSubmitbtn() {
		submitbtn.click();;
	}
}
