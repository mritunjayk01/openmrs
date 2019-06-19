package openmrs.stepDefinitions;

import openmrs.base.PropertiesClassInit;
import openmrs.base.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import openmrs.pageObjects.LoginPage;

public class LoginStep extends openmrs.base.TestBase{
	LoginPage loginPage;
	
	@Given("^home page is opened$")
	public void home_page_is_opened(String browser, String url){
		setUp(browser, url);		
	}
	
	@And("^And user enters username as Admin$")
	public void user_enters_username(String userText){
		loginPage.setUserName(userText);
	}



}
