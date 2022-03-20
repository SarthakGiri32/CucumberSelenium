package co.wipro.selenium.automation.execution;

import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class CucumberSeleniumExecution {
	
	public static void main(String[] args) {
		// Create object of TestNG Class
		TestNG runner=new TestNG();

		// Create a list of String 
		List<String> suitefiles= new ArrayList<>();

		// Add xml file which you have to execute
		suitefiles.add("src/test/resources/testng.xml");

		// now set xml file for execution
		runner.setTestSuites(suitefiles);

		// finally, execute the runner using run method
		runner.run();
	}

}
