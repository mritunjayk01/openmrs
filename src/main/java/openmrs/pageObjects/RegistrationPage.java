package openmrs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@name='givenName']")
	private WebElement givenName;
	
	@FindBy(xpath = "//*[@name='familyName']")
	private WebElement familyName;
	
	@FindBy(xpath="//*[@id='genderLabel']")
	WebElement gender;
	
	@FindBy(xpath = "//*[@value='M']")
	private WebElement male;
	
	@FindBy(xpath="//*[@id='birthdateLabel']")
	WebElement birthDate;
	
	@FindBy(xpath = "//*[@name='birthdateDay']")
	private WebElement birthdateDay;
	
	@FindBy(xpath = "//option[@value='2']")
	private WebElement birthdateMonth;
	
	@FindBy(xpath = "//*[@name='birthdateYear']")
	private WebElement birthdateYear;
	
	@FindBy(xpath = "//span[text()='Address']")
	private WebElement address;
		
	@FindBy(xpath = "//*[@id='address1']")
	private WebElement address1;
	
	@FindBy(xpath = "//*[@id='address2']")
	private WebElement address2;
	
	@FindBy(xpath = "//span[text()='Phone Number']")
	private WebElement phone;
	
	@FindBy(xpath = "//*[@name='phoneNumber']")
	private WebElement phoneNumber;
	
	@FindBy(xpath = "//span[@id='confirmation_label']")
	private WebElement confirm;
	
	@FindBy(xpath = "//*[@id='submit']")
	private WebElement submit;
	
	@FindBy(xpath = "//div[@class='toast-item-close']")
	private WebElement successMesg;
	
	public RegistrationPage(WebDriver driver){
		   this.driver = driver;
		   PageFactory.initElements(driver, this);
	   }
	
	public WebElement getSuccessMsg(){
		return successMesg;
	}
	
	public void setGivenName(String name){
		givenName.sendKeys(name);
	}
	
	public void setFamilyName(String surname){
		familyName.sendKeys(surname);
	}
	
	public void clickGender(){
		gender.click();
	}
	
	public void setGenderMale(){
	
		male.click();
	}
	
	public void clickBirthDate(){
		birthDate.click();
	}
	
	public void setBirthDay(String day){
		
		birthdateDay.sendKeys(day);
	}
	public void setBirthMonth(){
		birthdateMonth.click();
	}
	
	public void setBirthYear(String year){
		birthdateYear.sendKeys(year);
	}
	
	public void clickAddress(){
		address.click();
	}
	
	public void setAddress1(String add1){
		
		address1.sendKeys(add1);
	}
	
	public void setAddress2(String add2){
		address2.sendKeys(add2);
	}
	
	public void clickPhone(){
		phone.click();
	}
	
	public void setPhoneNumber(String phoneNo){
		
		phoneNumber.sendKeys(phoneNo);
	}
	
	public void clickConfirm(){
		confirm.click();
	}
	
	public void clickSubmit(){
		submit.click();
	}
	
	
	

}
