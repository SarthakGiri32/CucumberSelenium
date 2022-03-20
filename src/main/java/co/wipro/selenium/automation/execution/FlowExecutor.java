package co.wipro.selenium.automation.execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features/",
        glue = {"co.wipro.selenium.automation.step_definitions"},
        tags = "@prepaidNSO",
        plugin = { "pretty", "html:cucumber_reports/Prepaid_NSO_Run_Report" },
        publish = true
)

public class FlowExecutor extends AbstractTestNGCucumberTests {}
