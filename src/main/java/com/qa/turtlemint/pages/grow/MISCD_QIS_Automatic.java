package com.qa.turtlemint.pages.grow;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
//import io.netty.handler.codec.http.multipart.FileUpload;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class MISCD_QIS_Automatic extends TestBase {

    public MISCD_QIS_Automatic(){
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
    @FindBy(xpath = "//p[text()='Upload Documents']")
    WebElement CVUpld;
    @FindBy(xpath = "//button[text()= 'Create Quote']")
    WebElement Create;

    @FindBy(xpath = "//input[@type='file']")
    WebElement FileUpload;

    By uploadFile = By.xpath("//input[@name='file']");
    @FindBy(xpath = "//img[@src='/ninja-v2/static/media/eye-with-circle2.cab61d28a80ca61fa4cfbab66b489752.svg']")
    WebElement eye;
    @FindBy(xpath = "(//span[@role='img'])[5]")//(//span[@role='img'])[6]
    WebElement close;
    @FindBy(xpath = "//button[text()='Add Tag']")
    WebElement tag;
    @FindBy(xpath = "//span[text()='RC Copy']")
    WebElement previouspolicy;
    @FindBy(xpath = "//button[text()='OK']")
    WebElement ok;
    @FindBy(xpath = "//span[text()='Okay']")
    WebElement okay;
    @FindBy(xpath = "//input[@id= 'vertical']")
    WebElement Verticle1;
    @FindBy(xpath = "//div[@title= 'MiscD']")
    WebElement vertSelectMiscD;
    @FindBy(xpath = "//span[text()= 'Select Sub Vertical']")
    WebElement Subctgr;
    @FindBy(xpath = "//div[text()= 'Trailers Agriculture Tractors upto 6HP']")
    WebElement aggri;
    @FindBy(xpath = "//span[text()= 'Continue']")
    WebElement Continue;
    @FindBy(xpath = "//input[@id=\"businessType\"]")
    WebElement businessType;
    @FindBy(xpath = "//div[text()=\"Renewal / Rollover\"]")
    WebElement rollover;

    @FindBy(xpath = "//input[@placeholder= 'Enter Lead Name']")
    WebElement lead;
    @FindBy(xpath = "//span[text()= 'Public']")
    WebElement RegistrationType;
    @FindBy(xpath = "//span[text()= 'Yes']")
    WebElement ClaimFiled;
    @FindBy(xpath = "//span[text()= 'Select Policy Type']")
    WebElement policyType;
    @FindBy(xpath = "//div[text()= 'Comprehensive']")
    WebElement type;
    @FindBy(xpath = "//input[@id=\"expiryDt\"]")
    WebElement expiry;
    @FindBy(xpath = "//td[contains(@class,'cell-today')]")
    WebElement today;
    @FindBy(xpath = "//input[@id=\"prevNcb\"]")
    WebElement prevNcb;
    @FindBy(xpath = "//div[@title=\"20%\"]")
    WebElement NCB;
    @FindBy(xpath = "//input[@id=\"prevInsurer\"]")
    WebElement prevInsurer;
    @FindBy(xpath = "//div[@title=\"Bajaj Allianz\"]")
    WebElement bajaj;

    @FindBy(xpath = "//span[text()= 'Yes']")
    WebElement Claim;
    @FindBy(xpath = "//input[@placeholder= 'Enter Preffered IDV']")
    WebElement IDV;
    @FindBy(xpath = "//label[@title=\"Trailer\"]//ancestor::div[contains(@class,'ant-col-12')]//span[text()='No']")
    WebElement Trailer;
    @FindBy(xpath = "//span[text()= 'Select Insurer']")
    WebElement PreferredInsurer;
    @FindBy(xpath = "//button[@role='switch']")
    WebElement AddonsSwitch;
    @FindBy(xpath = "//span[@role=\"img\"]//ancestor::div[contains(@class,'custom-form')]//span[contains(text(),'Select Add-ons')]")
    WebElement Addons;

    @FindBy(xpath = "//input[@id=\"secureTowing\"]")
    WebElement SecureTowing;
    @FindBy(xpath = "//input[@id=\"paOwnerDriver\"]")
    WebElement PAOwnerDriver;
    @FindBy(xpath = "//input[@id=\"zeroDep\"]")
    WebElement ZeroDep;
    @FindBy(xpath = "//button[text()= 'Save']")
    WebElement Save;
    @FindBy(xpath = "//input[@id=\"comments\"]")
    WebElement Comments;
    @FindBy(xpath = "//span[text()= 'Submit']")
    WebElement Submit;
    @FindBy(xpath = "//span[text()= 'Request to OPS']")
    WebElement RequestToOPS;

    public void uplod_MISCD() throws InterruptedException, IOException {
        LogUtils.info("########## CV Upload flow started ##########");
        Thread.sleep(3000);
        TestUtil.click(Quote, "Quote request clicked");
        TestUtil.click(AllQuote, "All quote clicked");
        TestUtil.click(GetQuote, "Get quote clicked");
        TestUtil.click(Dp, "Dp clicked");
        Actions act = new Actions(driver);
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
        FileUpload.sendKeys("/home/ubuntu/storage/MAHINDRATRACTOR.PDF");
        /// Added presence of elemnt here to upload a file so created new method in util and for presence of element it require BY element
        /// it doesnt work with web element so upload file is By element
//       TestUtil.ElementPresent(uploadFile, "/Users/surajgarud/Downloads/MAHINDRA TRACTOR.PDF", "File uploaded");
        TestUtil.click(eye, "View policy");
        Thread.sleep(3000);
        TestUtil.click(close, "Close clicked");
        Thread.sleep(3000);
        TestUtil.click(tag, "Add Tag clicked");
        TestUtil.click(previouspolicy, "RC tag clicked");
        TestUtil.click(ok, "ok clicked");

        act.moveToElement(Verticle1).click().perform();
        Thread.sleep(3000);
        TestUtil.JsClick(vertSelectMiscD, "MISCD selected");
        Thread.sleep(3000);
        act.moveToElement(Subctgr).click().perform();
        TestUtil.click(aggri, "Agriculture Tractors upto 6HP Vehicle selected");
        Thread.sleep(3000);
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Continue, "Continue clicked");
        Thread.sleep(3000);
        act.moveToElement(businessType).click().perform();
        TestUtil.click(rollover, "Rollover clicked");
        lead.isDisplayed();
        TestUtil.sendKeys(lead, "Suraj Automation", "Lead clicked");
        act.moveToElement(policyType).click().perform();
        TestUtil.click(type, "Comp type clicked");
        Thread.sleep(3000);
        act.moveToElement(expiry).click().perform();
        TestUtil.click(today, "Today clicked");
        Thread.sleep(2000);
        TestUtil.click(ClaimFiled, "Yes claim filed clicked");
        Thread.sleep(2000);
        act.moveToElement(prevInsurer).click().perform();
        TestUtil.click(bajaj, "Prevoius insurer as Bajaj Allianz clicked");
        TestUtil.sendKeys(IDV, "500000", "IDV entered");
        TestUtil.click(Trailer, "Trailer clicked No");
//        act.moveToElement(PreferredInsurer).click().perform();
//        Thread.sleep(3000);
//        TestUtil.getScreenShot();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
//        WebElement dropdown = wait.until(
//                ExpectedConditions.presenceOfElementLocated(
//                        By.xpath("(//div[contains(@class,'ant-select-dropdown')])[last()]")
//                )
//        );
//        WebElement option = dropdown.findElement(
//                By.xpath(".//div[@title='Future Generali']")
//        );
//
//        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", option);
//        act.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(2000);
//        TestUtil.click(AddonsSwitch, "Add ons switch clicked");
        wait.until(ExpectedConditions.visibilityOf(Addons));
        TestUtil.click(Addons, "Add ons clicked");
        Thread.sleep(3000);
        TestUtil.getScreenShot();
        act.moveToElement(SecureTowing).click().perform();
        act.moveToElement(ZeroDep).click().perform();
        TestUtil.click(Save, "Save clicked");
        Thread.sleep(3000);
        WebDriverWait waitr = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement dropdownn = waitr.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("(//div[contains(@class,'ant-select-dropdown')])[last()]")
                )
        );

        WebElement optionn = dropdownn.findElement(
                By.xpath(".//div[@title='Future Generali']")
        );

        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", optionn);
        TestUtil.sendKeys(Comments,"Automation Testing","Comment added");
        Thread.sleep(3000);
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Submit, "Submit clicked");
        By frame = By.id("qis-results-iframe");
        TestUtil.fluentWait(frame,"Waiting for frame to get load");
        TestUtil.FrameSwitch(frame, "Switching to Frame");
        try{
            Thread.sleep(3000);
            if(okay.isDisplayed()){
                TestUtil.click(okay, "Okay clicked");
            }
        }catch (NoSuchElementException e){
            LogUtils.info("Okay not visible");
        }
        RequestToOPS.isDisplayed();
        TestUtil.click(RequestToOPS, "Request to OPS clicked");
        TestUtil.getScreenShot();
    }
}
