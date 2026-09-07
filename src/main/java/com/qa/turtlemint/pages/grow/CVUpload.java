package com.qa.turtlemint.pages.grow;


import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.IOException;
import java.time.Duration;

public class CVUpload extends TestBase {
    public CVUpload() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space(text())='Quote Request']")
    WebElement Quote;

    @FindBy(xpath = "//div[text()='All Quotes']")
    WebElement AllQuote;
    @FindBy(xpath = "//div[text()='Get a Quote']")
    WebElement GetQuote;
    @FindBy(xpath = "//input[@placeholder='Select Digital Partner']")
    WebElement Dp;
    @FindBy(xpath = "//span[text()='(402392) mr automation']")
    WebElement Sneha;

    @FindBy(xpath = "//md-select[@id= 'vertical']")
    WebElement Verticle;
    @FindBy(xpath = "//div[text()='CV']")
    WebElement CV;
    @FindBy(xpath = "//p[text()=' Upload Documents']")
    WebElement CVUpld;
    @FindBy(xpath = "//button[text()= 'Create Quote']")
    WebElement Create;
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
    @FindBy(xpath = "//input[@id= 'vertical']")
    WebElement Verticle1;
    @FindBy(xpath = "//div[@title= 'GCV']")
    WebElement vertSelect;
    @FindBy(xpath = "//span[text()= 'Select Sub Vertical']")
    WebElement Subctgr;
    @FindBy(xpath = "//div[text()= '4 Wheeler Goods Carrying Vehicle']")
    WebElement SchoolBus;
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
    @FindBy(xpath = "//span[text()= 'Submit']")
    WebElement Submit;
    @FindBy(xpath = "//span[text()= 'Okay']")
    WebElement Okay;


    public void upload() throws InterruptedException, IOException {
        LogUtils.info("########## CV Upload flow started ##########");
        Thread.sleep(3000);
        TestUtil.click(Quote, "Quote request clicked");
        TestUtil.click(AllQuote, "All quote clicked");
        TestUtil.click(GetQuote, "Get quote clicked");
        TestUtil.click(Dp, "Dp clicked");
        TestUtil.sendKeys(Dp, "mr automation","Dp name entered");
        TestUtil.click(Sneha, "Test user cliked");
        TestUtil.click(Verticle, "verticle cliked");
        TestUtil.click(CV, "CV clicked");
        TestUtil.JsClick(CVUpld, "Cv Upload clicked");
        Thread.sleep(3000);
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Create, "Create quote clicked");
        Thread.sleep(2000);
        /// Added presence of elemnt here to upload a file so created new method in util and for presence of element it require BY element
        /// it doesnt work with web element so upload file is By element
        TestUtil.ElementPresent(uploadFile, "/Users/surajgarud/Downloads/GCV Automated.pdf", "File uploaded");
        TestUtil.click(eye, "View policy");
        Thread.sleep(3000);
        TestUtil.click(close, "Close clicked");
        Thread.sleep(3000);
        TestUtil.click(tag, "Add Tag clicked");
        TestUtil.click(previouspolicy, "Prevoius policy tag clicked");
        TestUtil.click(ok, "ok clicked");
        Actions act = new Actions(driver);
        act.moveToElement(Verticle1).click().perform();
        Thread.sleep(3000);
        TestUtil.JsClick(vertSelect, "GCV selected");
        Thread.sleep(3000);
        act.moveToElement(Subctgr).click().perform();
        TestUtil.click(SchoolBus, "4 Wheeler Goods Carrying Vehicle selected");
        Thread.sleep(3000);
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Continue, "Continue clicked");
        Thread.sleep(3000);
        lead.isDisplayed();
        TestUtil.sendKeys(lead, "Suraj","Lead clicked");
        TestUtil.click(RegistrationType, "Public type clicked");
        act.moveToElement(policyType).click().perform();
//        TestUtil.JsClick(policyType, "Policy type clicked");
        TestUtil.click(type, "Comp type clicked");
        Thread.sleep(3000);
        TestUtil.click(ClaimFiled, "Yes claim filed clicked");
        TestUtil.sendKeys(IDV, "12345","IDV entered");
        act.moveToElement(PreferredInsurer).click().perform();
//        TestUtil.JsClick(PreferredInsurer, "Preferred Insurer clicked");
        TestUtil.click(SelectInsurer, "FGGI insurer clicked");
        Thread.sleep(3000);
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Submit, "Submit clicked");
        TestUtil.click(Okay,"Okay clicked");
    }
}
