package openmrs.testSuite;


import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.junit.Cucumber;

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
