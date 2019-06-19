package openmrs.pageObjects;

import java.util.List;

import openmrs.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends openmrs.base.TestBase{

	//WebDriver driver;

	@FindBy(xpath = "//*[@name='username']")
	private WebElement userName;

	@FindBy(xpath = "//*[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//*[@id='loginButton']")
	private WebElement login;

	@FindBy(xpath= "//*[@id='sessionLocation']")
	private WebElement wardLocation;

	@FindBy(xpath = "//div//a[contains(@href,'home.page')]")
	private WebElement homePageLinkOnTopMenuBar;

	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setWardLocation(String dept){
		//new Select(wardLocation).selectByVisibleText(POClass.location);
		List<WebElement> options = wardLocation.findElements(By.tagName("li"));
		for(WebElement option:options){
			if(option.getText().equals(dept)){
				option.click();
				break;
			}
		}
	}


	public void setUserName(String name){

		userName.sendKeys(name);
	}
	public void setPassword(String pass){
		password.sendKeys(pass);
	}
	public void clickLogin(){
		login.click();
	}




}
