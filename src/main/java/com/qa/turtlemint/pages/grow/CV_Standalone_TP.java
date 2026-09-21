package com.qa.turtlemint.pages.grow;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CV_Standalone_TP extends TestBase {
    public CV_Standalone_TP() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[normalize-space(text())='Quote Request']")
    WebElement Quote;

    @FindBy(xpath = "//div[text()='All Quotes']")
    WebElement AllQuote;
    @FindBy(xpath = "//div[text()='Get a Quote']")
    WebElement GetQuote;
    @FindBy(xpath = "//input[@id='dpLoginId']")
    WebElement Dp;
    @FindBy(xpath = "//span[text()='(1593963) test shubham']")
    WebElement DpSan;
    @FindBy(xpath = "//div[text()='(402392) mr automation']")
    WebElement Sneha;

    @FindBy(xpath = "//span[text()= 'Select Vertical']")
    WebElement Verticle;
    @FindBy(xpath = "//div[@title=\"CV\"]")
    WebElement CV;
    @FindBy(xpath = "//p[text()='CV Quote Calculator']")
    WebElement CVCal;
    @FindBy(xpath = "//button[text()= 'Create Quote']")
    WebElement Create;

    @FindBy(xpath = "//div[@class='Flexbox-module__gap-column-16--xaRYv']//following ::input[@placeholder='Eg. MH01AB1234']")
    WebElement RTOLocation;
    @FindBy(xpath = "//p[text()='I have a registration number']")
    WebElement Registration;
    @FindBy(xpath = "//span[text()='GCV']")
    WebElement VehicleClass;

    @FindBy(xpath = "//span[text()='Public']")
    WebElement RegistrationType;
    @FindBy(xpath = "//span[text()= 'Continue']")
    WebElement Continue;
    @FindBy(xpath = "//span[text()= 'Third Party']")
    WebElement PolicyType;
    @FindBy(xpath = "//input[@type= 'search']")
    WebElement make;
    @FindBy(xpath = "//div[text()= 'Ashok Leyland']//following::div[@class='rc-virtual-list-holder-inner']")
    WebElement Tata;
    @FindBy(xpath = "//span[text()='Select fuel']")
    WebElement Fuel;
    @FindBy(xpath = "//div[@title= 'Diesel']")
    WebElement Petrol;
    @FindBy(xpath = "//span[text()= 'Select a value']")
    WebElement SubCategory;
    @FindBy(xpath = "//div[text()= '4 Wheeler Goods Carrying Vehicle']")
    WebElement ThreeWheel;
    @FindBy(xpath = "//input[@label= 'Gross vehicle weight']")
    WebElement Weight;
    @FindBy(xpath = "//input[@placeholder= 'Enter lead name']")
    WebElement Lead;
    @FindBy(xpath = "//span[text()= 'Confirm details']")
    WebElement Confirm;

    @FindBy(xpath = "//span[text()='Share']")
    WebElement Share;
    @FindBy(xpath = "//span[@aria-label=\"close\"]")
    WebElement Cross;
    @FindBy(xpath = "//span[text()='Close']")
    WebElement Close;
    @FindBy(xpath = "//input[@inputmode=\"numeric\"]")
    By DoB = By.xpath("//md-icon[@aria-label=\"md-calendar\"]");
    By yearselect = By.xpath("//select[@class=\"sc-kIPQKe bjoHsz\"]");
    By monthselect = By.xpath("//select[@class=\"sc-kIPQKe bjoHsz\"][2]");


    public void TP_standalone() throws Exception {
        TestUtil.click(Quote, "Quote request clicked");
        Actions actions = new Actions(driver);
        TestUtil.click(AllQuote, "All quote clicked");
        Thread.sleep(3000);
        TestUtil.click(GetQuote, "Get quote clicked");
        Thread.sleep(8000);
        TestUtil.click(Dp, "Dp name entered");
        if(TestBase.env.equals("sanity")){
            TestUtil.sendKeys(Dp, "test shubham", "Dp name entered");
            actions.sendKeys(Keys.BACK_SPACE).build().perform();
            TestUtil.click(DpSan, "Test user cliked");
        } else if (TestBase.env.equals("prod")) {
            TestUtil.sendKeys(Dp, "mr automation", "Dp name entered");
            actions.sendKeys(Keys.BACK_SPACE).build().perform();
            TestUtil.click(Sneha, "Test user cliked");
        }
        Thread.sleep(3000);
        actions.moveToElement(Verticle).click().build().perform();
        TestUtil.click(CV, "CV clicked");
        Thread.sleep(2000);
        TestUtil.click(CVCal, "CV calulatore method selected");
        Thread.sleep(2000);
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Create, "Create quote clicked");
        Thread.sleep(3000);
        WebElement fr = driver.findElement(By.xpath("//iframe[@title=\"Get a Quote\"]"));
        driver.switchTo().frame(fr);
        Thread.sleep(3000);
        TestUtil.JsClick(Registration, "Registration clicked");
        TestUtil.sendKeys(RTOLocation, "MH12sk1234", "RTO Number entered");
        TestUtil util = new TestUtil();
        util.DatePicker("2024", "Oct", "10");
        Thread.sleep(2000);
        TestUtil.click(VehicleClass, "Vehicle class GCV clicked");
        TestUtil.click(RegistrationType, "Registration type public clicked");
        Thread.sleep(3000);
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Continue, "Continue clicked");
        Thread.sleep(2000);
        TestUtil.click(PolicyType, "Policy type TP clicked");
        Thread.sleep(3000);
        TestUtil.sendKeys(make, "Ashok", "Ashok make entered");
        Thread.sleep(2000);
        actions.moveToElement(Tata).click().perform();
        Thread.sleep(2000);
        actions.moveToElement(Fuel).click().perform();
        Thread.sleep(2000);
        TestUtil.click(Petrol, "Petrol fuel clicked");
        Thread.sleep(3000);
        actions.moveToElement(SubCategory).click().perform();
        TestUtil.click(ThreeWheel, "4 wheel clicked");
        Thread.sleep(2000);
        TestUtil.sendKeys(Weight, "2400", "Weight entered");
        TestUtil.sendKeys(Lead, "Suraj Automation", "Lead name entered");
        Thread.sleep(3000);
        TestUtil.click(Continue, "Continue clicked");
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Confirm);
        Confirm.isDisplayed();
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Confirm, "Confirm details clicked");
        Thread.sleep(3000);
        TestUtil.getFullPageScreenShot();
        By frame = By.id("qis-results-iframe");
        TestUtil.fluentWait(frame,"Waiting for frame to get load");
        TestUtil.FrameSwitch(frame, "Switching to Frame");
        Thread.sleep(3000);
        TestUtil.getScreenShot();


    }
}
