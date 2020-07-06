package Page;

import Utils.StringConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class MainPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"culture-info\"]/button/div/span[1]")
    private WebElement languageButton;

    @FindBy(id = "fsc-origin-search")
    private WebElement originCity;

    @FindBy(id = "fsc-destination-search")
    private WebElement destinationCity;

    @FindBy(css = "#depart-fsc-datepicker-button > span")
    private WebElement specificDateStart;

    @FindBy(css = "#depart-fsc-datepicker-popover > div > div > div.BpkMobileScrollContainer_bpk-mobile-scroll-container__1h8jq.BpkHorizontalNav_bpk-horizontal-nav__3rqys.FlightDatepicker_fsc-datepicker__tab-bar__12_8g > div > nav > ul > li:nth-child(1) > button")
    private WebElement clickSpecificDateStart;

    @FindBy(css = "#return-fsc-datepicker-button > span")
    private WebElement specificDateEnd;

    @FindBy(css = "#return-fsc-datepicker-popover > div > div > div.BpkMobileScrollContainer_bpk-mobile-scroll-container__1h8jq.BpkHorizontalNav_bpk-horizontal-nav__3rqys.FlightDatepicker_fsc-datepicker__tab-bar__12_8g > div > nav > ul > li:nth-child(1) > button")
    private WebElement clickSpecificDateEnd;

    @FindBy(css = "#depart-fsc-datepicker-button > span")
    private WebElement startDate;

    @FindBy(css = "#depart-calendar__bpk_calendar_nav_select")
    private WebElement departCalendar;

    @FindBy(css = "#return-fsc-datepicker-button > span")
    private WebElement returnDate;

    @FindBy(css = "#return-calendar__bpk_calendar_nav_select")
    private WebElement returnCalendar;

    @FindBy(css = "#flights-search-controls-root > div > div > form > div:nth-child(3) > button")
    private WebElement searchButton;

    @FindBy(css = "#secondarySort")
    private WebElement sort;

    @FindBy(css = "#app-root > div > div.FlightsDayView_container__2bGun > div.FlightsDayView_results__1kZSn > div:nth-child(1) > div.Results_dayViewItems__3dVwy > div:nth-child(1) > div.FlightsTicket_container__3yvwg > a > div > div.BpkTicket_bpk-ticket__paper__2gPSe.BpkTicket_bpk-ticket__stub__UMQSf.Ticket_stub__3xY04.BpkTicket_bpk-ticket__stub--padded__3Sxur.BpkTicket_bpk-ticket__stub--horizontal__2mGXV.BpkTicket_bpk-ticket__paper--with-notches__19yQc > div > div > div > span")
    private WebElement price;

    @FindBy(css = "#app-root > div > div.FlightsDayView_container__2bGun > div.FlightsDayView_results__1kZSn > div:nth-child(1) > div.Results_dayViewItems__3dVwy > div:nth-child(1) > div.FlightsTicket_container__3yvwg > a > div > div.BpkTicket_bpk-ticket__paper__2gPSe.BpkTicket_bpk-ticket__main__J31fH.BpkTicket_bpk-ticket__main--padded__WIbjx.BpkTicket_bpk-ticket__main--horizontal__2MgwA.BpkTicket_bpk-ticket__paper--with-notches__19yQc > div > div > div.UpperTicketBody_legsContainer__kbEvl > div:nth-child(1) > div.LegInfo_legInfo__3kbZa > div.LegInfo_routePartialDepart__37kr9 > span.BpkText_bpk-text__2NHsO.BpkText_bpk-text--lg__3vAKN.LegInfo_routePartialTime__2HfzB > div > span")
    private WebElement departureHour;

    @FindBy(css = "#app-root > div > div.FlightsDayView_container__2bGun > div.FlightsDayView_results__1kZSn > div:nth-child(1) > div.Results_dayViewItems__3dVwy > div:nth-child(1) > div.FlightsTicket_container__3yvwg > a > div > div.BpkTicket_bpk-ticket__paper__2gPSe.BpkTicket_bpk-ticket__main__J31fH.BpkTicket_bpk-ticket__main--padded__WIbjx.BpkTicket_bpk-ticket__main--horizontal__2MgwA.BpkTicket_bpk-ticket__paper--with-notches__19yQc > div > div > div.UpperTicketBody_legsContainer__kbEvl > div:nth-child(1) > div.LegInfo_legInfo__3kbZa > div.LegInfo_routePartialArrive__ZsZxc > span.BpkText_bpk-text__2NHsO.BpkText_bpk-text--lg__3vAKN.LegInfo_routePartialTime__2HfzB > div > span")
    private WebElement arrivalHour;

    @FindBy(css = "#app-root > div > div.FlightsDayView_container__2bGun > div.FlightsDayView_results__1kZSn > div:nth-child(1) > div.Results_dayViewItems__3dVwy > div:nth-child(1) > div.FlightsTicket_container__3yvwg > a > div > div.BpkTicket_bpk-ticket__paper__2gPSe.BpkTicket_bpk-ticket__main__J31fH.BpkTicket_bpk-ticket__main--padded__WIbjx.BpkTicket_bpk-ticket__main--horizontal__2MgwA.BpkTicket_bpk-ticket__paper--with-notches__19yQc > div > div > div.UpperTicketBody_legsContainer__kbEvl > div:nth-child(2) > div.LegInfo_legInfo__3kbZa > div.LegInfo_routePartialDepart__37kr9 > span.BpkText_bpk-text__2NHsO.BpkText_bpk-text--lg__3vAKN.LegInfo_routePartialTime__2HfzB > div > span")
    private WebElement returnDepartHour;

    @FindBy(css = "#app-root > div > div.FlightsDayView_container__2bGun > div.FlightsDayView_results__1kZSn > div:nth-child(1) > div.Results_dayViewItems__3dVwy > div:nth-child(1) > div.FlightsTicket_container__3yvwg > a > div > div.BpkTicket_bpk-ticket__paper__2gPSe.BpkTicket_bpk-ticket__main__J31fH.BpkTicket_bpk-ticket__main--padded__WIbjx.BpkTicket_bpk-ticket__main--horizontal__2MgwA.BpkTicket_bpk-ticket__paper--with-notches__19yQc > div > div > div.UpperTicketBody_legsContainer__kbEvl > div:nth-child(2) > div.LegInfo_legInfo__3kbZa > div.LegInfo_routePartialArrive__ZsZxc > span.BpkText_bpk-text__2NHsO.BpkText_bpk-text--lg__3vAKN.LegInfo_routePartialTime__2HfzB > div > span")
    private WebElement returnArivHour;

    @FindBy(css = "#app-root > div > div.FlightsDayView_container__2bGun > div.FlightsDayView_results__1kZSn > div:nth-child(1) > div.ResultsSummary_container__u1KEN > div.ResultsSummary_innerContainer__EqwUq > div.ResultsSummary_summaryContainer__3_ZX_ > span")
    private WebElement loadingResults;

    @FindBy(xpath = "//*[@id=\"culture-selector-locale\"]")
    private WebElement selectLang;

    @FindBy(xpath = "//*[@id=\"culture-selector-save\"]")
    private WebElement saveButton;

    public WebElement getPrice() {
        return price;
    }

    public void setPrice(WebElement price) {
        this.price = price;
    }

    public WebElement getDepartureHour() {
        return departureHour;
    }

    public WebElement getReturnDepartHour() {
        return returnDepartHour;
    }


    public void setReturnDepartHour(WebElement returnDepartHour) {
        this.returnDepartHour = returnDepartHour;
    }

    public WebElement getReturnArivHour() {
        return returnArivHour;
    }

    public void setReturnArivHour(WebElement returnArivHour) {
        this.returnArivHour = returnArivHour;
    }

    public void setDepartureHour(WebElement departureHour) {
        this.departureHour = departureHour;
    }

    public WebElement getArrivalHour() {
        return arrivalHour;
    }

    public void setArrivalHour(WebElement arrivalHour) {
        this.arrivalHour = arrivalHour;
    }

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openWebsite() {
        driver.get(StringConstants.SKYS_WEBSITE);
    }

    public void selectLanguage() {
        languageButton.click();
        Select language = new Select(selectLang);
        language.selectByVisibleText(StringConstants.LANGUAGE);
        saveButton.click();
    }

    public void fromCity(String city) {
        Wait wait = new FluentWait(driver)
                .withTimeout(Duration.of(StringConstants.IMPLICIT_WAIT, ChronoUnit.SECONDS))
                /*.withTimeout(StringConstants.IMPLICIT_WAIT, TimeUnit.SECONDS)
                .pollingEvery(StringConstants.IMPLICIT_WAIT, TimeUnit.SECONDS)*/
                .ignoring(Exception.class);

        wait.until(ExpectedConditions.visibilityOf(originCity));
        wait.until(ExpectedConditions.elementToBeClickable(originCity));
        originCity.click();
        originCity.sendKeys(city);

    }

    public void toCity(String city) {

        destinationCity.sendKeys(city);
    }

    public void selectDepartureDate(String monthAndYear, String day) {
        specificDateStart.click();
        clickSpecificDateStart.click();
        Select drpDate = new Select(departCalendar);
        drpDate.selectByVisibleText(monthAndYear);
        List<WebElement> noRows = driver.findElements(By.xpath("//*[@id=\"depart-fsc-datepicker-popover\"]/div/div/div[2]/div/table/tbody/tr"));
        List<WebElement> noColl = driver.findElements(By.xpath("//*[@id=\"depart-fsc-datepicker-popover\"]/div/div/div[2]/div/table/tbody/tr[1]/td"));
        boolean pastFirstDay = false;
        for (int j = 1; j <= noRows.size(); j++) {
            for (int i = 1; i <= noColl.size(); i++) {
                if (driver.findElement(By.xpath("//*[@id=\"depart-fsc-datepicker-popover\"]/div/div/div[2]/div/table/tbody/tr[" + j + "]/td[" + i + "]/button/span")).getText().equals(StringConstants.FIRST_DAY)) {
                    pastFirstDay = true;
                }
                if (pastFirstDay) {
                    if (driver.findElement(By.xpath("//*[@id=\"depart-fsc-datepicker-popover\"]/div/div/div[2]/div/table/tbody/tr[" + j + "]/td[" + i + "]/button/span")).getText().equals(day)) {
                        driver.findElement(By.xpath("//*[@id=\"depart-fsc-datepicker-popover\"]/div/div/div[2]/div/table/tbody/tr[" + j + "]/td[" + i + "]/button")).click();
                        return;
                    }
                }
            }
        }
        throw new AssertionError();
    }

    public void selectReturnDate(String monthAndYear, String day) {
        specificDateEnd.click();
        clickSpecificDateEnd.click();
        Select returnDate = new Select(returnCalendar);
        returnDate.selectByVisibleText(monthAndYear);
        List<WebElement> noRows = driver.findElements(By.xpath("//*[@id=\"return-fsc-datepicker-popover\"]/div/div/div[2]/div/table/tbody/tr"));
        List<WebElement> noColl = driver.findElements(By.xpath("//*[@id=\"return-fsc-datepicker-popover\"]/div/div/div[2]/div/table/tbody/tr[1]/td"));
        boolean pastFirstDay = false;
        for (int j = 1; j <= noRows.size(); j++) {
            for (int i = 1; i <= noColl.size(); i++) {
                if (driver.findElement(By.xpath("//*[@id=\"return-fsc-datepicker-popover\"]/div/div/div[2]/div/table/tbody/tr[" + j + "]/td[" + i + "]/button/span")).getText().equals(StringConstants.FIRST_DAY)) {
                    pastFirstDay = true;
                }
                if (pastFirstDay) {
                    if (driver.findElement(By.xpath("//*[@id=\"return-fsc-datepicker-popover\"]/div/div/div[2]/div/table/tbody/tr[" + j + "]/td[" + i + "]/button/span")).getText().equals(day)) {
                        driver.findElement(By.xpath("//*[@id=\"return-fsc-datepicker-popover\"]/div/div/div[2]/div/table/tbody/tr[" + j + "]/td[" + i + "]/button")).click();
                        return;
                    }
                }
            }
        }
    }

    public void clickSearch() {
        searchButton.click();
    }

    public void sortResults(String sortTypeselect) {
        WebDriverWait wait = new WebDriverWait(driver, StringConstants.IMPLICIT_WAIT);
        wait.until(ExpectedConditions.visibilityOf(loadingResults));
        sort.click();
        Select sortType = new Select(sort);
        sortType.selectByVisibleText(sortTypeselect);
        loadingResults.click();
    }
}