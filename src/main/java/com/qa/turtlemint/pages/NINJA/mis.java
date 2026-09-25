package com.qa.turtlemint.pages.NINJA;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class mis extends TestBase {
    @FindBy(xpath = "//input[@placeholder='Search by Policy No. or Registration No. (min. 4 chars)']")
    WebElement searchField;
    @FindBy(xpath = "//*[text()='Action Reqd']")
    WebElement selectLead;
    @FindBy(xpath = "//span[@class='anticon']//img[@alt='Edit']")
    WebElement editAction;
    @FindBy(xpath = "//label[text()='Policy Status']/../following-sibling::div")
    WebElement policyStatusDD;
    @FindBy(xpath = "//div[text()='Junk']")
    WebElement policyStatusJunk;
    @FindBy(xpath = "//label[text()='Issuance Sub Status']/../following-sibling::div")
    WebElement issuanceSubStatusDD;
    @FindBy(xpath = "//div[text()='Incorrect Request']")
    WebElement issuanceSubStatusIncorrectRequest;
    @FindBy(xpath = "//label[text()='Comments']/../following-sibling::div//input")
    WebElement commentField;
    @FindBy(xpath = "//span[@aria-label='message']")
    WebElement helpCentreMessageIcon;
    @FindBy(xpath = "//*[contains(text(),'started working on this request')]")
    WebElement helpCentreMessage;
    @FindBy(xpath = "//*[@data-icon='close']")
    WebElement closePopup;
    @FindBy(xpath = "//button[text()='Save Sale']")
    WebElement SaveSaleButton;
    @FindBy(xpath = "//div[text()='(View Mode)']")
    WebElement viewMode;
    @FindBy(xpath = "//span[text()='Junk']")
    WebElement junkText;

    public mis() {PageFactory.initElements(driver, this);}

    JavascriptExecutor js = (JavascriptExecutor) driver;
    public void SearchRequestAndCancel(String MISid) {
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(searchField, MISid, "Entered MIS id");
        TestUtil.sendKeys(searchField, String.valueOf(Keys.ENTER), "Clicked on enter button");
        WebCommands.staticSleep(5000);
        TestUtil.click(selectLead, "Clicked on lead");
        WebCommands.staticSleep(5000);
        TestUtil.click(editAction,"Clicked on edit option");
        TestUtil.click(policyStatusDD, "Clicked on policy status dropdown");
        TestUtil.click(policyStatusJunk, "Selected Junk status");
        WebCommands.staticSleep(1000);
        js.executeScript("arguments[0].scrollIntoView(true);", commentField);
        TestUtil.sendKeys(commentField, "test comment", "Entered comment in field");
        WebCommands.staticSleep(1000);
        TestUtil.click(SaveSaleButton, "Clicked on save issuance button");
        WebCommands.staticSleep(10000);
        Assert.assertTrue(viewMode.isDisplayed(), "View mode is not displayed after saving issuance");
        Assert.assertTrue(junkText.isDisplayed(), "Junk text not showing");
    }
}
