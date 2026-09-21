package com.qa.turtlemint.pages.Mypartners;

import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static com.qa.turtlemint.base.TestBase.driver;

public class Reportasale {
    public Reportasale() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[text()='My Partners']")
    WebElement MyPartners;
    @FindBy(xpath = "//button[normalize-space()='Report a Sale']")
    WebElement reportASale;

    @FindBy(xpath = "//*[@id='reportSaleEntry_vertical']/..")
    WebElement ProductCategory;

    @FindBy(xpath = "(//div[normalize-space()='Motor'])[1]")
    WebElement motorFirst;

    @FindBy(xpath = "//*[@id='reportSaleEntry_policyIssuanceStatus']/..")
    WebElement policyIssuanceStatus;

    @FindBy(xpath = "//*[@id='reportSaleEntry_insurer']")
    WebElement insurer;

    @FindBy(xpath = "//div[normalize-space()='HDFC Ergo']")
    WebElement hdfcErgo;

    @FindBy(xpath = "//input[@id='policyNo']")
    WebElement policyNo;

    @FindBy(xpath = "//button[normalize-space()='Proceed']")
    WebElement proceed;

    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    WebElement cancel;





    public void report () throws InterruptedException, IOException {
        TestUtil.click(MyPartners, "My Partners clicked");
        TestUtil.click(reportASale, "Report a Sale clicked");
        TestUtil.getFullPageScreenShot();
        TestUtil.click(ProductCategory, "ProductCategory clicked");
        TestUtil.click(motorFirst, "Motor clicked");
        TestUtil.click(insurer, "Insurer dropdown opened");
        TestUtil.click(hdfcErgo, "HDFC Ergo clicked");
        TestUtil.click(policyNo, "Policy Number field clicked");
        TestUtil.sendKeys(policyNo,"Test12345","policy number Test12345");
        TestUtil.getFullPageScreenShot();
        TestUtil.click(cancel, "Cancel clicked");



    }
}
