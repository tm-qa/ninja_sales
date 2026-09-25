package com.qa.turtlemint.pages.grow;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Set;

public class CV_QuoteViaMintpro extends TestBase {
    @FindBy(xpath = "//span[@aria-label='arrow-left']/../following-sibling::div//div//div")
    WebElement request_Id;
    @FindBy(xpath = "//div[text()='All Quotes']")
    WebElement AllQuote;
    @FindBy(xpath = "//div[text()='Get a Quote']")
    WebElement GetQuote;
    @FindBy(xpath = "//input[@id='dpLoginId']")
    WebElement Dp;
    @FindBy(xpath = "//div[text()='(Dp-1593963) test shubham']")
    WebElement DpSan;
    @FindBy(xpath = "//div[text()='(Dp-402392) mr automation']")
    WebElement Automation;
    @FindBy(xpath = "//span[text()= 'Select Vertical']")
    WebElement Vertical;
    @FindBy(xpath = "//div[@title='CV']")
    WebElement CV;
    @FindBy(xpath = "//p[text()='Quotes via MintPro']")
    WebElement quoteViaMintpro;
    @FindBy(xpath = "//button[text()= 'Create Quote']")
    WebElement create;
    @FindBy(xpath = "//iframe[@title='Get a Quote']")
    WebElement frame;
    @FindBy(xpath = "//span[text()='Taxis']")
    WebElement categoryTaxi;
    @FindBy(xpath = "//input[@type= 'text']")
    WebElement regNoField;
    @FindBy(xpath = "//span[text()= 'Get Quote']")
    WebElement getQuoteCV;
    @FindBy(xpath = "//input[@placeholder= 'dd/mm/yyyy']")
    WebElement regDate;
    @FindBy(xpath = "//div[text()= '15']")
    WebElement regDate15;
    @FindBy(xpath = "//span[text()= 'Public']")
    WebElement regTypePublic;
    @FindBy(xpath = "//span[text()= 'Next']")
    WebElement nextButton;
    @FindBy(xpath = "//span[text()= 'Comprehensive']")
    WebElement policyTypeComp;
    @FindBy(xpath = "//span[text()='Made any claims in previous year?']/../following-sibling::div//span[text()= 'No']")
    WebElement ClaimNo;
    @FindBy(xpath = "//div[text()= '0%']")
    WebElement ncb0;
    @FindBy(xpath = "//div[text()= 'Bajaj Allianz']")
    WebElement insurerBajaj;
    @FindBy(xpath = "//input[@type= 'search']")
    WebElement make;
    @FindBy(xpath = "//span[text()='Previous Policy From Turtlemint ?']/../following-sibling::div//span[text()= 'No']")
    WebElement prevPolicyFromTMno;
    @FindBy(xpath = "//div[@class= 'ant-select-item-option-content']")
    WebElement makeMaruti;
    @FindBy(xpath = "//div[@aria-selected='false']//div[text()= '2019']")
    WebElement manufacturingYear2019;
    @FindBy(xpath = "//span[text()= 'Diesel']")
    WebElement fuelTypeDiesel;
    @FindBy(xpath = "//span[text()='Model & Variant']/../following-sibling::div//input[@type= 'search']")
    WebElement model;
    @FindBy(xpath = "//div[@aria-selected='false']//div[contains(text(),'DZIRE VDI PLUS')]")
    WebElement variant;
    @FindBy(xpath = "//div[@name='Kaali Peeli / Driver Driven']//div")
    WebElement bodyType;
    @FindBy(xpath = "//input[@placeholder='Reference Name']")
    WebElement leadName;
    @FindBy(xpath = "//span[text()= 'Royal Sundaram']")
    WebElement insurerSelect;
    @FindBy(xpath = "//iframe[@title='Quote Results']")
    WebElement getFrame;
    @FindBy(xpath = "//span[text()='Request Quotes']")
    WebElement requestQuoteCTA;
    @FindBy(xpath = "//div[contains(@class,'ant-typography')]")
    WebElement requestID;
    @FindBy(xpath = "//span[@class='anticon anticon-arrow-left']")
    WebElement backArrow;

    public CV_QuoteViaMintpro(){PageFactory.initElements(driver,this);}
    Actions actions = new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    public String CV_QuoteViaMintpro() throws IOException {
        TestUtil.click(AllQuote, "All quote clicked");
        WebCommands.staticSleep(3000);
        TestUtil.click(GetQuote, "Get quote clicked");
        WebCommands.staticSleep(3000);
        TestUtil.click(Dp, "Dp name entered");
        if (TestBase.env.equals("sanity")) {
            TestUtil.sendKeys(Dp, "test shubham", "Dp name entered");
            actions.sendKeys(Keys.BACK_SPACE).build().perform();
            TestUtil.click(DpSan, "Test user clicked");
        } else if (TestBase.env.equals("prod")) {
            TestUtil.sendKeys(Dp, "mr automation", "Dp name entered");
            actions.sendKeys(Keys.BACK_SPACE).build().perform();
            TestUtil.click(Automation, "Automation dp clicked");
        }
        WebCommands.staticSleep(1000);
        actions.moveToElement(Vertical).click().build().perform();
        TestUtil.click(CV, "CV clicked");
        WebCommands.staticSleep(1000);
        TestUtil.click(quoteViaMintpro,"Clicked on quote via Mintpro button");
        TestUtil.getFullPageScreenShot();
        TestUtil.click(create, "Create quote clicked");
        WebCommands.staticSleep(4000);
        Set<String> count = driver.getWindowHandles();
        System.out.println(count.size());
        driver.switchTo().frame(frame);
        js.executeScript("arguments[0].scrollIntoView(true)", categoryTaxi);
        js.executeScript("arguments[0].click();", categoryTaxi);
//        TestUtil.click(categoryTaxi,"Selected category as Taxi");
        TestUtil.sendKeys(regNoField,"MH01BF8490","Reg No Sent");
        WebCommands.staticSleep(500);
        TestUtil.click(getQuoteCV,"Clicked on get quote cta");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(regDate,"15/09/2019","registration date sent");
        TestUtil.click(regDate15,"Selected 15 date");
        TestUtil.click(regTypePublic,"Selected Registration Type as Public");
        WebCommands.staticSleep(1000);
        TestUtil.click(nextButton,"Clicked on Next Button");
        WebCommands.staticSleep(500);
        TestUtil.click(policyTypeComp,"Policy Type Comprehensive Selected");
        WebCommands.staticSleep(1000);
        TestUtil.click(nextButton,"Clicked on Next Button");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(regDate,"15/11/2026","registration date sent");
        TestUtil.click(regDate15,"Selected 15 date");
        TestUtil.click(policyTypeComp,"Previous Policy Type Comprehensive Selected");
        TestUtil.click(ClaimNo,"Clicked on Made any claims in previous year? as NO");
        TestUtil.click(ncb0,"Selected NCB as 0");
        TestUtil.click(insurerBajaj,"Selected insurer as BAJAJ");
        TestUtil.click(prevPolicyFromTMno,"Selected Previous Policy From Turtlemint ? as NO");
        WebCommands.staticSleep(1000);
        TestUtil.click(nextButton,"Clicked on Next Button");
        WebCommands.staticSleep(2000);
        TestUtil.click(insurerBajaj,"Selected insurer as BAJAJ");
        WebCommands.staticSleep(1000);
        TestUtil.click(nextButton,"Clicked on Next Button");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(make,"maruti","Make sent in dropdown");
        WebCommands.staticSleep(1000);
        TestUtil.click(makeMaruti,"Make as Maruti selected");
        WebCommands.staticSleep(2000);
        TestUtil.click(manufacturingYear2019,"Manufacturing year 2019 selected ");
        TestUtil.click(fuelTypeDiesel,"Fuel type as Diesel selected");
        TestUtil.sendKeys(model,"Dzire","Clicked on model dropdown");
        WebCommands.staticSleep(2000);
        TestUtil.click(variant,"Variant selected");
        WebCommands.staticSleep(1000);
        TestUtil.click(bodyType,"Selected body type");
        WebCommands.staticSleep(1000);
        TestUtil.click(nextButton,"Clicked on Next Button");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(leadName,"testing lead cv","Lead name sent");
        WebCommands.staticSleep(1000);
        TestUtil.click(nextButton,"Clicked on Next Button");
        WebCommands.staticSleep(18000);
        driver.switchTo().frame(0);
        TestUtil.waitUntilVisibilityOfElement(insurerSelect);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        js.executeScript("arguments[0].scrollIntoView(true)", insurerSelect);
        js.executeScript("arguments[0].click();", insurerSelect);
//        TestUtil.click(insurerSelect,"Looking for quote insurer selected");
        String insurerSelectText = insurerSelect.getText();
        System.out.println("Looking for your favourite quote for " +insurerSelectText +" insurer");
        TestUtil.click(requestQuoteCTA,"clicked on request quote cta");
        WebCommands.staticSleep(10000);
        driver.switchTo().defaultContent();
        String requestIDText = requestID.getText();
        System.out.println("request ID is : "+requestIDText);
        TestUtil.click(backArrow, "Clicked on back button");
        return requestIDText;

    }
}
