package com.qa.turtlemint.pages.NINJA;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.apache.xerces.util.JAXPNamespaceContextWrapper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class policy_issuance extends TestBase {

    @FindBy(xpath = "//span[text()='Policy Issuance']")
    WebElement policy_issuance;
    @FindBy(xpath = "//span[text()='MIS']")
    WebElement MIS;
    @FindBy(xpath = "//span[normalize-space(text())='Quote Request']")
    WebElement quoteRequest;
    @FindBy(xpath = "//button[text()='Get a Policy Issued']")
    WebElement get_policy_issued;
    @FindBy(xpath = "//span[@aria-label='menu']")
    WebElement menuIcon;
    @FindBy(xpath = "//button[text()='Logout']")
    WebElement logoutButton;
    @FindBy(xpath = "//input[@placeholder='Search by Reg Number, Customer Name, DP Name, DP Phone Number']")
    WebElement searchField;
    @FindBy(xpath = "//span[text()='Action Reqd']")
    WebElement selectLead;
    @FindBy(xpath = "//button[text()='OWN']")
    WebElement ownButton;
    @FindBy(xpath = "//label[text()='Issuance Status']/../following-sibling::div")
    WebElement issuanceStatusDD;
    @FindBy(xpath = "//div[text()='Cancelled']")
    WebElement issuanceStatusCancelled;
    @FindBy(xpath = "//label[text()='Issuance Sub Status']/../following-sibling::div")
    WebElement issuanceSubStatusDD;
    @FindBy(xpath = "//div[text()='Incorrect Request']")
    WebElement issuanceSubStatusIncorrectRequest;
    @FindBy(xpath = "//label[text()='Issuance Remark']/../following-sibling::div//textarea")
    WebElement issuanceRemarksField;
    @FindBy(xpath = "//span[@aria-label='message']")
    WebElement helpCentreMessageIcon;
    @FindBy(xpath = "//*[contains(text(),'started working on this request')]")
    WebElement helpCentreMessage;
    @FindBy(xpath = "//*[@data-icon='close']")
    WebElement closePopup;
    @FindBy(xpath = "//button[text()='Save Issuance']")
    WebElement SaveIssuanceButton;
    @FindBy(xpath = "//div[text()='(View Mode)']")
    WebElement viewMode;
    @FindBy(xpath = "//span[contains(text(),'Report a Sale')]")
    WebElement reportAsaleTab;
    @FindBy(xpath = "//button[text()='REPORT A SALE']")
    WebElement reportAsaleButton;
    @FindBy(xpath = "//label[text()='Product Category']/../following-sibling::div")
    WebElement productCategoryDD;
    @FindBy(xpath = "//div[@title='TW']")
    WebElement productCategoryTW;
    @FindBy(xpath = "//label[text()='Insurer']/../following-sibling::div//input")
    WebElement insurerDD;
    @FindBy(xpath = "//label[text()='Issuance Status']/../following-sibling::div")
    WebElement issuanceStatusRSDD;
    @FindBy(xpath = "//div[text()='Raheja QBE']")
    WebElement insurerRaheja;
    @FindBy(xpath = "//input[@id='policyNo']")
    WebElement policyNumberField;
    @FindBy(xpath = "//button[text()='Proceed']")
    WebElement proceedButton;
    @FindBy(xpath = "//input[@id='bi-registrationNumber']")
    WebElement registrationNumber;

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public policy_issuance() {
        PageFactory.initElements(driver, this);
    }

    public void policyIssuance() {
        WebCommands.staticSleep(1000);
        TestUtil.click(policy_issuance, "Clicked Policy Issuance");
        WebCommands.staticSleep(1000);
    }
    public void MIS() {
        WebCommands.staticSleep(1000);
        TestUtil.click(MIS, "Clicked on MIS");
        WebCommands.staticSleep(1000);
    }
    public void quoteRequest() {
        WebCommands.staticSleep(1000);
        TestUtil.click(quoteRequest, "Clicked Quote Request");
        WebCommands.staticSleep(1000);
    }

    public void getPolicyIssued() {

        TestUtil.click(get_policy_issued, "Clicked on get policy issued");
        WebCommands.staticSleep(2000);
    }

    public void OpsLogin() {
        WebCommands.staticSleep(2000);
        TestUtil.click(menuIcon, "Clicked on menu icon");
        WebCommands.staticSleep(1000);
        TestUtil.click(logoutButton, "Clicked on logout button");
        WebCommands.staticSleep(2000);
    }

    public void SearchRequestAndCancel(String requestId) {
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(searchField, requestId, "Entered request id");
        TestUtil.sendKeys(searchField, String.valueOf(Keys.ENTER), "Clicked on enter button");
        WebCommands.staticSleep(5000);
        TestUtil.click(selectLead, "Clicked on lead");
        TestUtil.click(ownButton, "Clicked on own button");
        WebCommands.staticSleep(10000);
        TestUtil.click(issuanceStatusDD, "Clicked on issuance status dropdown");
        TestUtil.click(issuanceStatusCancelled, "Selected cancelled status");
        WebCommands.staticSleep(1000);
        TestUtil.click(issuanceSubStatusDD, "Clicked on issuance sub status dropdown");
        TestUtil.click(issuanceSubStatusIncorrectRequest, "Selected sub status Incorrect Request");
        WebCommands.staticSleep(1000);
        js.executeScript("arguments[0].scrollIntoView(true);", issuanceRemarksField);
        TestUtil.sendKeys(issuanceRemarksField, "test remarks", "Entered issuance remarks");
        WebCommands.staticSleep(1000);
        TestUtil.click(helpCentreMessageIcon, "Clicked on help centre message icon");
        WebCommands.staticSleep(1000);
        String messageVerify = helpCentreMessage.getText();
        Assert.assertEquals(messageVerify.contains("started working on this request"), true);
        TestUtil.click(closePopup, "Clicked on close popup");
        WebCommands.staticSleep(1000);
        TestUtil.click(SaveIssuanceButton, "Clicked on save issuance button");
        WebCommands.staticSleep(10000);
        Assert.assertTrue(viewMode.isDisplayed(), "View mode is not displayed after saving issuance");
    }

    public void reportASale() {
        TestUtil.click(reportAsaleTab, "Clicked on report a sale tab");
        WebCommands.staticSleep(1000);
        TestUtil.click(reportAsaleButton, "Clicked on report a sale button");
        WebCommands.staticSleep(1000);
        TestUtil.click(productCategoryDD,"Clicked on product category dropdown");
//        WebCommands.staticSleep(1000);
        TestUtil.click(productCategoryTW,"Selected product category TW");
        WebCommands.staticSleep(1000);
        TestUtil.click(insurerDD,"Clicked on insurer dropdown");
        TestUtil.sendKeys(insurerDD,"raheja","Raheja insurer sent");
        TestUtil.click(insurerRaheja,"Selected insurer Raheja");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(policyNumberField,"123980ABCD2","Entered policy number");
        TestUtil.click(proceedButton,"Clicked on proceed button");
        WebCommands.staticSleep(3000);
    }
}
