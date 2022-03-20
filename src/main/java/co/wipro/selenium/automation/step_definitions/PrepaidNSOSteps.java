package co.wipro.selenium.automation.step_definitions;

import co.wipro.selenium.automation.resources.LocalAutoFunctions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;
import org.testng.Reporter;

import java.io.IOException;
import java.util.Date;

public class PrepaidNSOSteps extends LocalAutoFunctions {

    @Before
    public void beforeScenario() throws IOException, ParseException {
        setVariables();
        String currentDate = new Date().toString();
        Reporter.log("Flow Start Date and Time: " + currentDate, true);
    }

    @Given("user logs into Verizon Website")
    public void userLogsIntoVerizonWebsite(){
        loadUrl(VERIZON_WEBSITE, CHROME_DRIVER);
    }

    @When("user clicks on the Shop menu")
    public void userClicksOnTheShopMenu() throws InterruptedException {
        clickElementJSExecutor("id", VERIZON_SHOP, WAIT_TIME, false, "VERIZON_SHOP");
    }

    @And("clicks on the Prepaid menu")
    public void clicksOnThePrepaidMenu() throws InterruptedException {
        clickElementJSExecutor("id", VERIZON_PREPAID_MENU, WAIT_TIME, false, "VERIZON_PREPAID_MENU");
    }

    @And("clicks on the Prepaid overview option")
    public void clicksOnThePrepaidOverviewOption() throws InterruptedException {
        clickElementJSExecutor("linkText", VERIZON_PREPAID_OVERVIEW, WAIT_TIME, true, "VERIZON_PREPAID_OVERVIEW");
    }

    @And("clicks on the Bring Your Own Device option")
    public void clicksOnTheBringYourOwnDeviceOption() throws InterruptedException {
        clickElementWhenVisible("linkText", VERIZON_BYOD, WAIT_TIME, true, "VERIZON_BYOD");
    }

    @And("clicks on the Join Verizon option")
    public void clicksOnTheJoinVerizonOption() throws InterruptedException {
        clickElementWhenVisible("linkText", VERIZON_JOIN, WAIT_TIME, true, "VERIZON_JOIN");
    }

    @And("clicks on the Smartphone device type")
    public void clicksOnTheSmartphoneDeviceType() throws InterruptedException {
        clickElementJSExecutor("xpath", VERIZON_SMARTPHONE_DEVICE, WAIT_TIME, false, "VERIZON_SMARTPHONE_DEVICE");
    }

    @And("clicks on Continue in the Device Type selection page")
    public void clicksOnContinueInTheDeviceTypeSelectionPage() throws InterruptedException {
        clickElementJSExecutor("xpath", VERIZON_CONTINUE_BUTTON, WAIT_TIME, false, "VERIZON_CONTINUE_BUTTON");
    }

    @And("clicks on I don't know option in the Device Details page")
    public void clicksOnIDonTKnowOptionInTheDeviceDetailsPage() throws InterruptedException {
        clickElementJSExecutor("linkText", VERIZON_I_DONT_KNOW, WAIT_TIME, false, "VERIZON_I_DONT_KNOW");
    }

    @And("enters {string} IMEI number in the Device IMEI page")
    public void entersIMEINumberInTheDeviceIMEIPage(String imeiNumber) throws InterruptedException {
        sendingKey("id", VERIZON_IMEI_NUMBER_FIELD, imeiNumber, WAIT_TIME, false, "VERIZON_IMEI_NUMBER_FIELD");
    }

    @And("clicks on the Check my device option")
    public void clicksOnTheCheckMyDeviceOption() throws InterruptedException {
        clickElementJSExecutor("xpath", VERIZON_CHECK_MY_DEVICE, WAIT_TIME, true, "VERIZON_CHECK_MY_DEVICE");
    }

    @And("clicks on the Add SIM to cart option")
    public void clicksOnTheAddSIMToCartOption() throws InterruptedException {
        clickElementWhenVisible("xpath", VERIZON_ADD_SIM, WAIT_TIME, false, "VERIZON_ADD_SIM");
    }

    @And("enters {string} ZIP Code in the Confirm Location pop-up")
    public void entersZIPCodeInTheConfirmLocationPopUp(String zipCode) throws InterruptedException {
        sendingKey("name", VERIZON_ZIP_CODE_FIELD, zipCode, WAIT_TIME, false, "VERIZON_ZIP_CODE_FIELD");
    }

    @And("clicks on the Remember Location checkbox")
    public void clicksOnTheRememberLocationCheckbox() throws InterruptedException {
        clickElementJSExecutor("xpath", VERIZON_REMEMBER_MY_LOCATION, WAIT_TIME, true, "VERIZON_REMEMBER_MY_LOCATION");
    }

    @And("clicks on the Confirm location button")
    public void clicksOnTheConfirmLocationButton() throws InterruptedException {
        clickElementJSExecutor("xpath", VERIZON_CONFIRM_LOCATION, WAIT_TIME, true, "VERIZON_CONFIRM_LOCATION");
    }

    @And("selects the Five GB prepaid plan")
    public void selectsTheFiveGBPrepaidPlan() throws InterruptedException {
        clickElementWhenVisible("cssSelector", VERIZON_LINE_PLAN, WAIT_TIME, false, "VERIZON_LINE_PLAN");
    }

    @And("clicks on Continue in the Plan Selection page")
    public void clicksOnContinueInThePlanSelectionPage() throws InterruptedException {
        clickElementWhenVisible("id", VERIZON_SELECT_PLAN, WAIT_TIME, true, "VERIZON_SELECT_PLAN");
    }

    @Then("clicks on Not now in the International plans page")
    public void clicksOnNotNowInTheInternationalPlansPage() throws InterruptedException {
        clickElementWhenVisible("xpath", VERIZON_DECLINE_INTERNATIONAL_PLAN, WAIT_TIME, false, "VERIZON_DECLINE_INTERNATIONAL_PLAN");
    }

    @After
    public void afterScenario() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
