package stepDefs;

import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "C:\\Users\\zahid\\workspaces\\May2025\\com.agileCucumber\\src\\test\\resources\\FeatureFiles",
		glue ={"stepDefs","hooks"},
//		tags = "@smoke",
		plugin = {"pretty","html:target/cucumberReport.html","json:target/report.json"}
		
		
		
		
		
		
		)



public class RegTestRunner extends AbstractTestNGCucumberTests {

}
