package com.qa.turtlemint.pages.grow;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class PCV_QIS_Automatic extends TestBase {
    public PCV_QIS_Automatic() {
        PageFactory.initElements(driver, this);
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
    @FindBy(xpath = "//p[text()='Upload Documents']")
    WebElement CVUpld;
    @FindBy(xpath = "//button[text()= 'Create Quote']")
    WebElement Create;
    @FindBy(xpath = "//input[@type='file']")
    WebElement FileUpload;
    @FindBy(xpath = "//input[@type='file']")

    By uploadFile = By.xpath("//input[@name='file']");
    @FindBy(xpath = "//img[@src='/ninja-v2/static/media/eye-with-circle2.cab61d28a80ca61fa4cfbab66b489752.svg']")
    WebElement eye;
    @FindBy(xpath = "(//span[@role='img'])[5]")//(//span[@role='img'])[6]
    WebElement close;
    @FindBy(xpath = "//button[text()='Add Tag']")
    WebElement tag;
    @FindBy(xpath = "//span[text()='Previous Policy']")
    WebElement previouspolicy;
    @FindBy(xpath = "//button[text()='OK']")
    WebElement ok;
    @FindBy(xpath = "//span[text()='Okay']")
    WebElement okay;
    @FindBy(xpath = "//input[@id= 'vertical']")
    WebElement Verticle1;
    @FindBy(xpath = "//div[@title= 'GCV']")
    WebElement vertSelect;
    @FindBy(xpath = "//div[@title= 'PCV']")
    WebElement vertSelectPCV;
    @FindBy(xpath = "//div[@title= 'MiscD']")
    WebElement vertSelectMiscD;
    @FindBy(xpath = "//span[text()= 'Select Sub Vertical']")
    WebElement Subctgr;
    @FindBy(xpath = "//div[text()= '4 Wheeler Goods Carrying Vehicle']")
    WebElement SchoolBus;
    @FindBy(xpath = "//div[text()= 'Taxi']")
    WebElement Taxi;

    @FindBy(xpath = "//span[text()= 'Continue']")
    WebElement Continue;

    @FindBy(xpath = "//input[@placeholder= 'Enter Lead Name']")
    WebElement lead;
    @FindBy(xpath = "//span[text()= 'Public']")
    WebElement RegistrationType;
    @FindBy(xpath = "//span[text()= 'Select Policy Type']")
    WebElement policyType;
    @FindBy(xpath = "//div[text()= 'Comprehensive']")
    WebElement type;
    @FindBy(xpath = "//span[text()= 'Yes']")
    WebElement ClaimFiled;
    @FindBy(xpath = "//input[@placeholder= 'Enter Preffered IDV']")
    WebElement IDV;
    @FindBy(xpath = "//span[text()= 'Select Insurer']")
    WebElement PreferredInsurer;
    @FindBy(xpath = "//div[text()= 'Future Generali']")
    WebElement SelectInsurer;
    @FindBy(xpath = "//span[@role=\"img\"]//ancestor::div[contains(@class,'custom-form')]//span[contains(text(),'Add-Ons Selected')]")
    WebElement AddOns;
    @FindBy(xpath = "//button[@role='switch']")
    WebElement AddonsSwitch;
    @FindBy(xpath = "//span[text()= 'Submit']")
    WebElement Submit;
    @FindBy(xpath = "//button[text()= 'Save']")
    WebElement Save;
    @FindBy(xpath = "//span[text()= 'Okay']")
    WebElement Okay;
    @FindBy(xpath = "//a[text()= 'Check Activity Points']")
    WebElement CheckActivityPoints;
    @FindBy(xpath = "//input[@id=\"rc_select_0\"]")
    WebElement Egertata;
    @FindBy(xpath = "//div[@title=\"BAJAJ AUTO RE MEGA\"]")
    WebElement BAJAJ;
    @FindBy(xpath = "//span[text()='Vehicle Body Type']/ancestor::div[contains(@class,'module__floatingLabelField')]//input")
    WebElement VehicleBodyType;
    @FindBy(xpath = "//div[@title=\"Autorickshaw\"]")
    WebElement Autorickshaw;

    @FindBy(xpath = "//div[text()=\"Activity Points Sheet\"]")
    WebElement ActivityPointsSheet;
    @FindBy(xpath = "//div[text()='Activity Points Sheet']//ancestor::div[contains(@role,'dialog')]//span[@role='img']")
    WebElement ActivityPointsSheetImg;
    @FindBy(xpath = "//div[text()=\"Request from Ops\"]")
    WebElement RequestFromOps;


    public void upload_PCV() throws InterruptedException, IOException {
        LogUtils.info("########## CV Upload flow started ##########");
        Actions act = new Actions(driver);
        Thread.sleep(3000);
        TestUtil.click(Quote, "Quote request clicked");
        TestUtil.click(AllQuote, "All quote clicked");
        TestUtil.click(GetQuote, "Get quote clicked");
        TestUtil.click(Dp, "Dp clicked");
        if(TestBase.env.equals("sanity")){
            TestUtil.sendKeys(Dp, "test shubham", "Dp name entered");
            act.sendKeys(Keys.BACK_SPACE).build().perform();
            TestUtil.click(DpSan, "Test user cliked");
        } else if (TestBase.env.equals("prod")) {
            TestUtil.sendKeys(Dp, "mr automation", "Dp name entered");
            act.sendKeys(Keys.BACK_SPACE).build().perform();
            TestUtil.click(Sneha, "Test user cliked");
        }
        Thread.sleep(3000);
        act.moveToElement(Verticle).click().build().perform();
        TestUtil.click(CV, "CV clicked");
        TestUtil.JsClick(CVUpld, "Cv Upload clicked");
        Thread.sleep(3000);
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Create, "Create quote clicked");
        Thread.sleep(2000);
        FileUpload.sendKeys("/home/ubuntu/storage/PCVAutomaticRequest.pdf");
        /// Added presence of elemnt here to upload a file so created new method in util and for presence of element it require BY element
        /// it doesnt work with web element so upload file is By element
//      TestUtil.ElementPresent(uploadFile, "/Users/surajgarud/Downloads/PCV Automatic Request.pdf", "File uploaded");
        TestUtil.click(eye, "View policy");
        Thread.sleep(3000);
        TestUtil.click(close, "Close clicked");
        Thread.sleep(3000);
        TestUtil.click(tag, "Add Tag clicked");
        TestUtil.click(previouspolicy, "Prevoius policy tag clicked");
        TestUtil.click(ok, "ok clicked");
        act.moveToElement(Verticle1).click().perform();
        Thread.sleep(3000);
        TestUtil.JsClick(vertSelectPCV, "PCV selected");
        Thread.sleep(3000);
        act.moveToElement(Subctgr).click().perform();
        TestUtil.click(Taxi, "Taxi Vehicle selected");
        Thread.sleep(3000);
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Continue, "Continue clicked");
        Thread.sleep(3000);
        lead.isDisplayed();
        TestUtil.sendKeys(lead, "Suraj Automation", "Lead clicked");
        TestUtil.click(RegistrationType, "Public type clicked");
        act.moveToElement(policyType).click().perform();
        TestUtil.click(type, "Comp type clicked");
        Thread.sleep(3000);
        TestUtil.click(ClaimFiled, "Yes claim filed clicked");
//        act.moveToElement(PreferredInsurer).click().perform();
//        TestUtil.click(SelectInsurer, "FGGI insurer clicked");
//        act.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(3000);
        TestUtil.click(AddonsSwitch, "Add ons switch clicked");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(1));
        wait.until(ExpectedConditions.visibilityOf(AddOns));
        TestUtil.click(AddOns, "Addons clicked");
        Thread.sleep(3000);
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Save, "Save clicked");
        TestUtil.click(Submit, "Submit clicked");
        Thread.sleep(50000);
        TestUtil.getFullPageScreenShot();
        Thread.sleep(3000);
        By frame = By.id("qis-results-iframe");
        TestUtil.fluentWait(frame, "Waiting for frame to get load");
        TestUtil.FrameSwitch(frame, "Switching to Frame");
        By detailBy = By.xpath("//a[text()='Details']");
        By okayBy = By.xpath("//span[normalize-space()='Okay']");


        LogUtils.info("⏳ Waiting for Details CTA (result page readiness)");
// 1️⃣ Result page readiness
        wait.until(ExpectedConditions.elementToBeClickable(detailBy));
        LogUtils.info("✅ Details CTA is clickable");
// 2️⃣ Optional OK popup handling
        LogUtils.info("⏳ Checking for optional OK popup");
        try {
            WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement ok = shortWait.until(
                    ExpectedConditions.elementToBeClickable(okayBy)
            );
            LogUtils.info("⚠️ OK popup appeared, clicking");
            TestUtil.JsClick(ok, "Ok clicked");
        } catch (TimeoutException e) {
            LogUtils.info("ℹ️ OK popup did not appear");
        }
// 3️⃣ Final stabilization
        LogUtils.info("⏳ Ensuring OK popup is not present anymore");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(okayBy));
        LogUtils.info("✅ Result page stabilized, proceeding further");

        CV_Standalone_Comp auto = new CV_Standalone_Comp();
        auto.ValidateAddons();
        Thread.sleep(2000);
        TestUtil.click(CheckActivityPoints, "Check Activity Points");
        Thread.sleep(3000);
        TestUtil.sendKeys(Egertata, "BAJAJ AUTO RE MEGA", "BAJAJ AUTO RE entered");
        act.sendKeys(Keys.BACK_SPACE).build().perform();
        Thread.sleep(2000);
        act.moveToElement(BAJAJ).click().perform();
        Thread.sleep(4000);
        act.moveToElement(VehicleBodyType).click().perform();
        Thread.sleep(2000);
        TestUtil.click(Autorickshaw, "Autorickshaw");
        TestUtil.click(Continue, "Continue clicked");
        Thread.sleep(2000);
        try {
            Thread.sleep(2000);
            if (okay.isDisplayed()) {
                Thread.sleep(2000);
                TestUtil.JsClick(okay, "okay clicked");
            }
        } catch (NoSuchElementException e) {
            LogUtils.info("Okay button not displayed");
        }
        Thread.sleep(3000);
        ActivityPointsSheet.isDisplayed();
        Thread.sleep(2000);
        TestUtil.getFullPageScreenShot();
        try {
            Thread.sleep(2000);
            if (okay.isDisplayed()) {
                Thread.sleep(2000);
                TestUtil.JsClick(okay, "okay clicked");
            }
        } catch (NoSuchElementException e) {
            LogUtils.info("Okay button not displayed");
        }
        TestUtil.JsClick(ActivityPointsSheetImg, "Activity point cross clicked");
        Thread.sleep(2000);
        try {
            if (okay.isDisplayed()) {
                TestUtil.click(okay, "okay clicked");
            }
        } catch (NoSuchElementException e) {
            LogUtils.info("Okay button not displayed");
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", RequestFromOps);
        TestUtil.JsClick(RequestFromOps, "Request From Ops");
        TestUtil.getScreenShot();
    }
}
