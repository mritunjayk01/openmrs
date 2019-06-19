package testSuite;


import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import cucumber.api.junit.Cucumber;
import openmrs.base.PropertiesClassInit;
import openmrs.pageObjects.LoginPage;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
public class AcceptanceTestSuite {

	private static  ExtentReports extentReport;
	private static  ExtentTest testLogger;
	private static  ExtentHtmlReporter htmlReporter;
	private static final Logger LOG = LoggerFactory.getLogger(AcceptanceTestSuite.class.getSimpleName());
	private Map<String, List<String>> mapToRun;


	public AcceptanceTestSuite(){
		try{
			Class.forName("openmrs.base.ORClass");
		}catch(ClassNotFoundException e){
			LOG.error("Error instantiating properties",e);
		}

	}
	
	 public Map<String, List<String>> getStoryScenariosMapToRun() {
		 
		return mapToRun;
		 
	 }


}
