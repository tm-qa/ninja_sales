package com.qa.turtlemint.pages.grow;


import com.qa.turtlemint.base.TestBase;

import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class CVQuote extends TestBase {
    public CVQuote() {

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
    @FindBy(xpath = "//md-radio-button[@id='radio_18']")
    WebElement CVCal;
    @FindBy(xpath = "//button[text()= 'Create Quote']")
    WebElement Create;

    //        @FindBy (xpath = "//div[@class='Flexbox-module__gap-column-16--xaRYv']//following ::span[text()='Eg. MH01 - Mumbai']")
//    WebElement RTOLocation ;
    @FindBy(xpath = "//div[@class='Flexbox-module__gap-column-16--xaRYv']//following ::input[@id='rc_select_0']")
    WebElement RTOLocation;
    @FindBy(xpath = "//div[text()= 'MH-12-Pune']")
    WebElement RTOLocationselect;
    @FindBy(xpath = "//span[text()='GCV']")
    WebElement VehicleClass;

    @FindBy(xpath = "//span[text()='Public']")
    WebElement RegistrationType;
    @FindBy(xpath = "//span[text()= 'Continue']")
    WebElement Continue;
    @FindBy(xpath = "//span[text()= 'Comprehensive']")
    WebElement PolicyType;
    //    @FindBy(xpath = "//div[@class= 'ant-select-selector']//following::span[@class='ant-select-arrow']")
//    WebElement Fuel;
    @FindBy(xpath = "//input[@type= 'search']")
    WebElement make;
    @FindBy(xpath = "//div[text()= 'Tata']//following::div[@class='rc-virtual-list-holder-inner']")
    WebElement Tata;
    @FindBy(xpath = "//span[text()='Select fuel']")
    WebElement Fuel;
    @FindBy(xpath = "//div[@title= 'Petrol']")
    WebElement Petrol;
    @FindBy(xpath = "//span[text()= 'Select a value']")
    WebElement SubCategory;
    @FindBy(xpath = "//div[text()= '3 Wheeler Goods Carrying Vehicle']")
    WebElement ThreeWheel;
    @FindBy(xpath = "//input[@label= 'Gross vehicle weight']")
    WebElement Weight;
    @FindBy(xpath = "//input[@placeholder= 'Enter total idv']")
    WebElement IDV;
    @FindBy(xpath = "//span[text()='No']")
    WebElement No;
    @FindBy(xpath = "//div[text()= '20%']")
    WebElement claimPercentage;
    @FindBy(xpath = "//span[text()='Yes']//following::span[@class='ant-radio-inner']")
    WebElement Yes;
    @FindBy(xpath = "//input[@placeholder= 'Enter lead name']")
    WebElement Lead;
    @FindBy(xpath = "//span[text()= 'Confirm details']")
    WebElement Confirm;
    @FindBy(xpath = "//md-icon[@aria-label=\"Go back\"]")
    WebElement back;
    @FindBy(xpath = "//span[@aria-label=\"menu\"]")
    WebElement menu;
    @FindBy(xpath = "//a[@href='https://ninja.turtlemintinsurance.com']")
    WebElement NINJA;

    public void cvFlow() throws InterruptedException, IOException {
        TestUtil.click(Quote, "Quote request clicked");
        TestUtil.click(AllQuote, "All quote clicked");
        TestUtil.click(GetQuote, "Get quote clicked");
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Dp, "Dp name entered");
        TestUtil.click(Sneha, "Test user cliked");
        TestUtil.click(Verticle, "verticle cliked");
        TestUtil.click(CV, "CV clicked");
        Thread.sleep(2000);
        TestUtil.click(CVCal, "CV calulatore method selected");
        Thread.sleep(2000);
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Create, "Create quote clicked");

        Thread.sleep(3000);
        WebElement fr = driver.findElement(By.xpath("//iframe[@class='qis-profile-iframe']"));
        driver.switchTo().frame(fr);
        Thread.sleep(3000);
        TestUtil.JsClick(RTOLocation, "rto clicked");
        TestUtil.sendKeys(RTOLocation, "MH12", "RTO location entered");
        TestUtil.click(RTOLocationselect, "Pune selected");
        TestUtil util = new TestUtil();
        util.DatePicker("2010", "Oct", "10");
        Thread.sleep(3000);
        TestUtil.click(VehicleClass, "Vehicle class GCV clicked");
        TestUtil.click(RegistrationType, "Registration type public clicked");
        Thread.sleep(3000);
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Continue, "Continue clicked");
        Thread.sleep(2000);
        TestUtil.click(PolicyType, "Policy type COMP clicked");
        Thread.sleep(3000);
        TestUtil.sendKeys(make, "Tata", "Tata make entered");
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(Tata).click().perform();
        Thread.sleep(2000);
        actions.moveToElement(Fuel).click().perform();
//        TestUtil.JsClick(Fuel,"Fuel clicked");
//        TestUtil.click(Fuel,"Fuel clicked");
        Thread.sleep(2000);
        TestUtil.click(Petrol, "Petrol fuel clicked");
        Thread.sleep(3000);
        actions.moveToElement(SubCategory).click().perform();
//        TestUtil.JsClick(SubCategory,"SubCategory clicked");
        TestUtil.click(ThreeWheel, "3 wheel clicked");
        Thread.sleep(2000);
        TestUtil.sendKeys(Weight, "1245", "Weight entered");
        TestUtil.sendKeys(IDV, "12476", "IDV entered");
        Thread.sleep(2000);
        TestUtil.click(No, "Claim in previous year clicked");
        Thread.sleep(2000);
        actions.moveToElement(SubCategory).click().perform();
//        TestUtil.click(SubCategory,"NCB selected");
        TestUtil.click(claimPercentage, "Claim percentage clicked");
        Thread.sleep(2000);
        TestUtil.JsClick(Yes, "Previous Policy From Turtlemin clicked");
        TestUtil.sendKeys(Lead, "Suraj", "Lead name entered");
        Thread.sleep(3000);
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Continue, "Continue clicked");
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Confirm);
        Confirm.isDisplayed();
        TestUtil.click(Confirm, "Confirm details clicked");
        Thread.sleep(3000);
        TestUtil.getFullPageScreenShot();
        driver.switchTo().defaultContent();
/// Back to home
        TestUtil.click(back, "Back to home click");
        TestUtil.click(menu, "Menu click");
        TestUtil.JsClick(NINJA, "Ninja logo clicked");

    }
}
