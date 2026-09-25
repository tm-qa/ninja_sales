package com.qa.turtlemint.pages.NINJA;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class quote_request extends TestBase {
    @FindBy(xpath = "//input[@placeholder='Search by Registration number, Request Id, POSP name']")
    WebElement searchField;
    @FindBy(xpath = "//input[@placeholder='Search by Reg Number, Customer Name, DP Name, DP Phone Number']")
    WebElement searchFieldIssuance;
    @FindBy(xpath = "//*[text()='KAM']")
    WebElement selectLead;
    @FindBy(xpath = "//button[normalize-space()='Own' or normalize-space()='OWN']")
    WebElement ownButton;
    @FindBy(xpath = "//button[text()='Finalise Data']")
    WebElement finaliseData;
    @FindBy(xpath = "//div[text()='QUOTES']")
    WebElement quotesPlus;
    @FindBy(xpath = "//span[text()='Add Quote']/..")
    WebElement addQuote;
    @FindBy(xpath = "//span[text()='Cover Amount']/../following-sibling::div//input[@inputmode='numeric']")
    WebElement coverAmount;
    @FindBy(xpath = "//span[text()='Final Premium']/../following-sibling::div//input[@inputmode='numeric']")
    WebElement finalPremium;
    @FindBy(xpath = "//div[text()='Manually added quote *']")
    WebElement manuallyAddedLable;
    @FindBy(xpath = "//span[text()='Close']")
    WebElement close;
    @FindBy(xpath = "//div[text()='Manually added quote *']/ancestor::div[contains(@class,'manualQuoteBanner')]/following-sibling::div//div//span[text()='Buy']")
    WebElement buyButton;
    @FindBy(xpath = "//span[text()='Confirm']")
    WebElement confirm;
    @FindBy(xpath = "//*[text()='Issuance request submitted!']")
    WebElement issuanceSubmitted;
    @FindBy(xpath = "//span[@class='anticon anticon-arrow-left']")
    WebElement backArrow;
    @FindBy(xpath = "//span[text()='Junk']")
    WebElement junkText;
    @FindBy(xpath = "//label[text()='Issuance Status']/../following-sibling::div")
    WebElement issuanceStatusDD;
    @FindBy(xpath = "//div[text()='Issued']")
    WebElement issuanceStatusIssued;
    @FindBy(xpath = "//label[text()='Issuance Sub Status']/../following-sibling::div")
    WebElement issuanceSubStatusDD;
    @FindBy(xpath = "//div[text()='Incorrect Request']")
    WebElement issuanceSubStatusIncorrectRequest;
    @FindBy(xpath = "//label[text()='Issuance Remark']/../following-sibling::div//textarea")
    WebElement issuanceRemarksField;
    @FindBy(xpath = "//label[text()='Proposer First Name']/../following-sibling::div//input")
    WebElement proposerFirstName;
    @FindBy(xpath = "//label[text()='Proposer Last Name']/../following-sibling::div//input")
    WebElement proposerLastName;
    @FindBy(xpath = "//label[text()='Proposer Phone']/../following-sibling::div//input")
    WebElement proposerPhone;
    @FindBy(xpath = "//label[text()='Vehicle Subtype']/../following-sibling::div//input")
    WebElement vehicleSubtype;
    @FindBy(xpath = "//div[@aria-selected='false']//div[text()='TAXI']")
    WebElement vehicleSubtypeTaxi;
    @FindBy(xpath = "//label[text()='Issuance Date']/../following-sibling::div//input")
    WebElement issuanceDate;
    @FindBy(xpath = "//div[text()='22']")
    WebElement issuanceDate22;
    @FindBy(xpath = "//label[text()='Payment Status']/../following-sibling::div//input")
    WebElement paymentStatus;
    @FindBy(xpath = "//div[text()='Payment Complete']")
    WebElement paymentStatusComplete;
    @FindBy(xpath = "//label[text()='Payment Complete Date']/../following-sibling::div//input")
    WebElement paymentCompleteDate;
    @FindBy(xpath = "//div[text()='22']")
    WebElement paymentComplete22;
    @FindBy(xpath = "//label[text()='Payment Verified']/../following-sibling::div//span")
    WebElement paymentVerifiedCheckbox;
    @FindBy(xpath = "//input[@id=\"pi-policyNumber\"]")
    WebElement PolicyNumber;
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
    @FindBy(xpath = "//label[text()='Risk Start Date']/../following-sibling::div//input")
    WebElement riskStartDate;
    @FindBy(xpath = "//div[text()='22']")
    WebElement riskStartDate22;
    @FindBy(xpath = "//label[text()='Risk End Date']/../following-sibling::div//input")
    WebElement riskEndDate;
    @FindBy(xpath = "//div[text()='22']")
    WebElement riskEndDate22;
    @FindBy(xpath = "//label[text()='Transaction Number']/../following-sibling::div//input")
    WebElement transactionNumberField;


    public quote_request() {
        PageFactory.initElements(driver, this);}

    JavascriptExecutor js = (JavascriptExecutor) driver;
    public void SearchRequestAndClose(String Request_id) {
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(searchField, Request_id, "Entered MIS id");
        TestUtil.sendKeys(searchField, String.valueOf(Keys.ENTER), "Clicked on enter button");
        WebCommands.staticSleep(2000);
        TestUtil.click(selectLead, "Clicked on lead");
        WebCommands.staticSleep(3000);
        TestUtil.click(ownButton, "Clicked on own button");
        WebCommands.staticSleep(22000);
        driver.switchTo().frame(0);
        TestUtil.click(finaliseData,"Clicked on finalise Data button");
        WebCommands.staticSleep(8000);
        driver.switchTo().frame(0);
        js.executeScript("arguments[0].scrollIntoView(true);", quotesPlus);
        js.executeScript("arguments[0].click();", quotesPlus);
        TestUtil.sendKeys(coverAmount,"1", "cover amount sent");
        TestUtil.sendKeys(finalPremium,"1", "final premium sent");
        WebCommands.staticSleep(2000);
        TestUtil.click(addQuote, "clicked on add quote");
        WebCommands.staticSleep(3000);
        String manuallyAddedLableText = manuallyAddedLable.getText();
        Assert.assertTrue(manuallyAddedLableText.contains("Manually added quote *"));
        js.executeScript("arguments[0].scrollIntoView(true);", close);
        js.executeScript("arguments[0].click();", close);
        WebCommands.staticSleep(5000);
        driver.switchTo().defaultContent();
    }
    public void SearchRequestAndBuy(String Request_id) {
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(searchField, Request_id, "Entered MIS id");
        TestUtil.sendKeys(searchField, String.valueOf(Keys.ENTER), "Clicked on enter button");
        WebCommands.staticSleep(2000);
        TestUtil.click(selectLead, "Clicked on lead");
        WebCommands.staticSleep(12000);
        driver.switchTo().frame(0);
        TestUtil.click(buyButton,"Clicked on buy button");
        WebCommands.staticSleep(1000);
        TestUtil.click(confirm,"Clicked on confirm cta");
        WebCommands.staticSleep(3000);
        String issuanceSubmittedText = issuanceSubmitted.getText();
        Assert.assertTrue(issuanceSubmittedText.contains("Issuance request submitted!"));
        WebCommands.staticSleep(2000);
        driver.switchTo().defaultContent();
        TestUtil.click(backArrow, "Clicked on back button");
        WebCommands.staticSleep(2000);
    }
    String MISid;
    public String SearchRequestAndIssue(String Request_id) {
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(searchFieldIssuance, Request_id, "Entered request id");
        TestUtil.sendKeys(searchFieldIssuance, String.valueOf(Keys.ENTER), "Clicked on enter button");
        WebCommands.staticSleep(5000);
        TestUtil.click(selectLead, "Clicked on lead");
        WebCommands.staticSleep(1000);
        TestUtil.click(ownButton, "Clicked on own button");
        WebCommands.staticSleep(10000);
        TestUtil.sendKeys(proposerFirstName,"Testing","Proposer first name entered");
        TestUtil.sendKeys(proposerLastName,"Testing","Proposer last name entered");
        TestUtil.sendKeys(proposerPhone,"6888812345","Proposer phone entered");
        WebCommands.staticSleep(1000);
        TestUtil.click(vehicleSubtype,"clicked on vehicle sub type DD");
        TestUtil.click(vehicleSubtypeTaxi,"clicked on vehicle sub type Taxi");
        WebCommands.staticSleep(1000);
        TestUtil.click(issuanceStatusDD, "Clicked on issuance status dropdown");
        WebCommands.staticSleep(500);
        TestUtil.click(issuanceStatusIssued, "Selected Issued status");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(issuanceDate,"22-09-2026","Entered issuance Date");
        WebCommands.staticSleep(500);
        TestUtil.click(issuanceDate22, "Clicked on issuance date 22");
        TestUtil.click(paymentStatus,"clicked on payment Status DD");
        WebCommands.staticSleep(500);
        TestUtil.click(paymentStatusComplete,"clicked on payment Status as complete");
        TestUtil.sendKeys(paymentCompleteDate,"22-09-2026","Entered payment Complete Date");
        WebCommands.staticSleep(500);
        TestUtil.click(paymentComplete22, "Clicked on payment Complete date 22");
        TestUtil.sendKeys(PolicyNumber, TestUtil.generateRandomPolicyNo(12), "Policy number entered");
        TestUtil.click(paymentVerifiedCheckbox,"Clicked on payment verified checkbox");
        WebCommands.staticSleep(1000);
        TestUtil.ElementPresent(uploadFile, "/Users/abhinavkamble/Documents/sampleJPG.jpg", "File uploaded");
        TestUtil.click(policyCopy,"Selected policy copy as document Type");
        TestUtil.click(OKButton,"Clicked on OK Button");
        WebCommands.staticSleep(1000);
        js.executeScript("arguments[0].scrollIntoView(true);", issuanceRemarksField);
        TestUtil.sendKeys(issuanceRemarksField, "test remarks", "Entered issuance remarks");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(transactionNumberField, "567895fgh", "Entered transaction Number");
        WebCommands.staticSleep(1000);

        TestUtil.sendKeys(riskStartDate,"22-09-2026","Entered risk Start Date");
        WebCommands.staticSleep(500);
        TestUtil.click(riskStartDate22, "Clicked on risk Start Date 22");
        TestUtil.sendKeys(riskEndDate,"22-09-2026","Entered risk End Date");
        WebCommands.staticSleep(500);
        TestUtil.click(riskEndDate22, "Clicked on risk End Date 22");

        WebCommands.staticSleep(2000);
        driver.switchTo().defaultContent();
        TestUtil.click(saveButton, "Clicked on Save Button");
        WebCommands.staticSleep(5000);
        Assert.assertTrue(viewMode.isDisplayed(), "View mode is not displayed after saving issuance");
        MISid = policyDetailsID.getAttribute("value");
        System.out.println("Policy Details ID: " + MISid);
        TestUtil.click(backArrow, "Clicked on back button");
        return MISid;

    }
}
