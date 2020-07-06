package StepDefinition;

import Page.MainPage;
import Utils.Driver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Steps {

    private MainPage mainPage;
    private static ExtentReports report;
    private static ExtentTest test;
    private static Driver driver;

    @Before
    public static void instantiateReport() {
        report = new ExtentReports("TestReport.html", false);
    }

    @Given("^Open the Skyscanner website$")
    public void open_the_Skyscanner_webpage() throws Exception {
        driver = new Driver();
        driver.setUpDriver();
        mainPage = new MainPage(driver.getDriver());
        mainPage.openWebsite();
        test = report.startTest("Searching the best flight offer");
        test.log(LogStatus.PASS, "Skyscanner website has been opened.");
        mainPage.selectLanguage();
    }

    @When("^Entering departure city \"([^\"]*)\"$")
    public void entering_departure_city(String arg1) throws Exception {
        mainPage.fromCity(arg1);
        test.log(LogStatus.PASS, "The departure city has been entered.");
    }

    @And("^Entering the destination city \"([^\"]*)\"$")
    public void entering_the_destination_city(String arg1) throws Exception {
        mainPage.toCity(arg1);
        test.log(LogStatus.PASS, "The destination city has been entered.");

    }

    @And("^Setting departure date \"([^\"]*)\" \"([^\"]*)\"$")
    public void setting_departure_date(String arg2, String arg3) {
        mainPage.selectDepartureDate(arg2, arg3);
        test.log(LogStatus.PASS, "The departure date has been selected.");
    }

    @And("^Setting return date \"([^\"]*)\" \"([^\"]*)\"$")
    public void setting_return_date(String arg4, String arg5) {
        mainPage.selectReturnDate(arg4, arg5);
        test.log(LogStatus.PASS, "The return date has been selected.");
        mainPage.clickSearch();
        test.log(LogStatus.INFO, "The searching for the best offer has been started");
    }

    @Then("^Return the \"([^\"]*)\" offer$")
    public void return_the_offer(String text) throws Exception {
        test = report.startTest("Sorting the results by specific criteria");
        mainPage.sortResults(text);
        test.log(LogStatus.PASS, "The results has been sorted");
        test.log(LogStatus.INFO, "The " + text + " round-trip ticket costs: " + mainPage.getPrice().getText());
        test.log(LogStatus.INFO, "Departure hour is: " + mainPage.getDepartureHour().getText() + " and arrival hour is: " + mainPage.getArrivalHour().getText() + " (all hours are local)");
        test.log(LogStatus.INFO, "At return, departure hour is: " + mainPage.getReturnDepartHour().getText() + " and arrival hour is: " + mainPage.getReturnArivHour().getText() + "(all hours are local)");
        driver.closeDriver();
    }

    @After
    public static void closeReport() {

        report.endTest(test);
        report.flush();
    }
}
