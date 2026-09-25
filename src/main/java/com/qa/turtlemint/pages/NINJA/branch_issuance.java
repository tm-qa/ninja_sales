package com.qa.turtlemint.pages.NINJA;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class branch_issuance extends TestBase {

    @FindBy(xpath = "//input[@id='bi-registrationNumber']")
    WebElement registrationNumber;
    @FindBy(xpath = "//input[@id='AutoParsing_saleCloseDate']")
    WebElement saleCloseDate;
    @FindBy(xpath = "(//div[contains(@class,'ant-picker-dropdown') and not(contains(@class,'ant-picker-dropdown-hidden'))]//td[contains(@class,'ant-picker-cell-today')])[last()]")
    WebElement salectDate17;
    @FindBy(xpath = "//label[text()='Partner Name']/../following-sibling::div//input")
    WebElement partnerNameField;
    @FindBy(xpath = "//div[contains(@title,'test shubham')]")
    WebElement partnerNameShubham;
    @FindBy(xpath = "//div[contains(@title,'mr automation')]")
    WebElement partnerNameAutomation;
    @FindBy(xpath = "//input[@id='bi-proposerMobile']")
    WebElement proposerMobile;
    @FindBy(xpath = "//input[@id='bi-proposerEmail']")
    WebElement proposerEmail;
    @FindBy(xpath = "//input[@id='bi-policyNumber']")
    WebElement policyNumber;
    @FindBy(xpath = "//input[@id='AutoParsing_policyIssuanceDate']")
    WebElement policyIssuanceDate;
    @FindBy(xpath = "//input[@id='AutoParsing_policyStartDate']")
    WebElement riskStartDate;
    @FindBy(xpath = "//input[@id='AutoParsing_policyEndDate']")
    WebElement riskEndDate;
    @FindBy(xpath = "//label[text()='RTO Location']/../following-sibling::div//input")
    WebElement RTOlocation;
    @FindBy(xpath = "//div[@title='MH-01-Tardeo']")
    WebElement RTOlocationTardeo;
    @FindBy(xpath = "//label[text()='Net Premium']/../following-sibling::div//input")
    WebElement netPremium;
    By uploadFile = By.xpath("//input[@name='Files']");
    @FindBy(xpath = "//span[text()='Policy']")
    WebElement policyCopy;
    @FindBy(xpath = "//button[text()='OK']")
    WebElement OKButton;
    @FindBy(xpath = "//button[text()='Save Issuance']")
    WebElement saveButton;
    @FindBy(xpath = "//div[text()='(View Mode)']")
    WebElement viewMode;
    @FindBy(xpath = "//input[@name='policyDetailsId']")
    WebElement policyDetailsID;
    @FindBy(xpath = "//span[@class='anticon anticon-arrow-left']")
    WebElement backArrow;


    public branch_issuance() {
        PageFactory.initElements(driver, this);
    }

    Actions act = new Actions(driver);
    String MISid;

    public String branchIssuanceForm() {
        TestUtil.sendKeys(registrationNumber, "MH01AB4820", "Entered Registration Number");
        TestUtil.sendKeys(saleCloseDate, "15-09-2026", "Entered Sale Close Date");
        TestUtil.click(salectDate17, "Selected Sale Close Date");
        if (TestBase.env.equals("sanity")) {
            TestUtil.sendKeys(partnerNameField, "test shubham", "Dp name entered");
            act.sendKeys(Keys.BACK_SPACE).build().perform();
            TestUtil.click(partnerNameShubham, "Test user clicked");
        } else if (TestBase.env.equals("prod")) {
            TestUtil.sendKeys(partnerNameField, "mr automation", "Dp name entered");
            act.sendKeys(Keys.BACK_SPACE).build().perform();
            TestUtil.click(partnerNameAutomation, "Test user clicked");
        }
        TestUtil.sendKeys(proposerMobile, "9876543210", "Entered Proposer Mobile Number");
        TestUtil.sendKeys(proposerEmail, "test@testing.com", "Entered Proposer Email");
        TestUtil.sendKeys(policyNumber, "3546576dgfhj", "Entered Policy Number");
        TestUtil.sendKeys(policyIssuanceDate, "15-09-2026", "Entered Policy Issuance Date");
        TestUtil.click(salectDate17, "Selected Date 15");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(riskStartDate, "15-09-2026", "Entered Risk Start Date");
        TestUtil.click(salectDate17, "Selected Date 15");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(riskEndDate, "15-09-2026", "Entered Risk End Date");
        TestUtil.click(salectDate17, "Selected Date 15");
        WebCommands.staticSleep(1000);
//        TestUtil.sendKeys(RTOlocation, "MH-01", "RTO location entered");
//        TestUtil.click(RTOlocationTardeo, "RTO location Tardeo selected");
        TestUtil.sendKeys(netPremium, "1234", "Entered Net Premium");
        WebCommands.staticSleep(1000);
        TestUtil.ElementPresent(uploadFile, "/Users/abhinavkamble/Documents/sampleJPG.jpg", "File uploaded");
        TestUtil.click(policyCopy, "Selected policy Copy as document Type");
        TestUtil.click(OKButton, "Clicked on OK Button");
        WebCommands.staticSleep(2000);
        TestUtil.click(saveButton, "Clicked on Save Button");
        WebCommands.staticSleep(5000);
        Assert.assertTrue(viewMode.isDisplayed(), "View mode is not displayed after saving issuance");
        MISid = policyDetailsID.getAttribute("value");
        System.out.println("Policy Details ID: " + MISid);
        TestUtil.click(backArrow, "Clicked on back button");
        return MISid;
    }
}
