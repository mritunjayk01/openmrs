package openmrs.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;

    @FindBy(xpath = "//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")
    private WebElement registerAPatient;
    
    @FindBy(xpath = "//li[@class='logout']/a")
    private WebElement logout;
    
    public HomePage(WebDriver driver){
 	  this.driver = driver;
 	   PageFactory.initElements(driver, this);
    }
    
    
    
    public void clickLogout(){
    	logout.click();
    }
    
    public WebElement getLogout(){
    	return logout;
    }

   public void clickRegisterAPatient(){
	   registerAPatient.click();
   }
   
  
   

}
