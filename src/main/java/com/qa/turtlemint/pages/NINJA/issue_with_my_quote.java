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

public class issue_with_my_quote extends TestBase {

    @FindBy(xpath = "//span[@aria-label='arrow-left']/../following-sibling::div//div//div")
    WebElement request_Id;
    @FindBy(xpath = "//label[text()='DP Name']/../following-sibling::div//input")
    WebElement dpNameField;
    @FindBy(xpath = "//div[contains(text(),'test shubham')]")
    WebElement DpNameShubham;
    @FindBy(xpath = "//div[contains(text(),'automation')]")
    WebElement dpNameAutomation;
    @FindBy(xpath = "//label[text()='Vertical']/../following-sibling::div")
    WebElement verticalField;
    @FindBy(xpath = "//div[text()='Pvt Car']")
    WebElement verticalPvtCar;
    @FindBy(xpath = "//label[text()='Insurer']/../following-sibling::div")
    WebElement insurerField;
    @FindBy(xpath = "//div[text()='Acko General Insurance']")
    WebElement insurerAcko;
    @FindBy(xpath = "//label[text()='Registration Number']/../following-sibling::div//input")
    WebElement registrationNumberField;
    @FindBy(xpath = "//label[text()='Customer Mobile Number ']/../following-sibling::div//input")
    WebElement customerMobileNumberField;
    @FindBy(xpath = "//label[text()='Customer Email ID ']/../following-sibling::div//input")
    WebElement customerEmailIDField;
    @FindBy(xpath = "//label[text()='Title']/../following-sibling::div")
    WebElement titleField;
    @FindBy(xpath = "//div[text()='Mr']")
    WebElement titleMr;
    @FindBy(xpath = "//span[text()='No']")
    WebElement inspectionNoRadioButton;
    @FindBy(xpath = "//label[text()='Nominee Name']/../following-sibling::div//input")
    WebElement nomineeNameField;
    @FindBy(xpath = "//label[text()='Nominee Date of Birth']/../following-sibling::div//input")
    WebElement nomineeDateOfBirthField;
    @FindBy(xpath = "//div[text()='17']")
    WebElement nomineeDateOfBirth17;
    @FindBy(xpath = "//label[text()='Nominee’s Relation to Customer']/../following-sibling::div")
    WebElement nomineeRelationToCustomerField;
    @FindBy(xpath = "//div[text()='Son']")
    WebElement nomineeRelationToCustomerSon;
    @FindBy(xpath = "//label[text()='Comments']/../following-sibling::div//input")
    WebElement commentsField;
    By uploadFile = By.xpath("//input[@name='Files']");
    @FindBy(xpath = "//span[text()='RC Copy']")
    WebElement rcCopy;
    @FindBy(xpath = "//span[text()='Aadhar']")
    WebElement adharCopy;
    @FindBy(xpath = "//span[text()='Manual Quote']")
    WebElement manualQuote;
    @FindBy(xpath = "//button[text()='OK']")
    WebElement OKButton;
    @FindBy(xpath = "//button[text()='Save']")
    WebElement saveButton;

    public issue_with_my_quote() {
        PageFactory.initElements(driver, this);
    }

    String requestIdText;
    public String fwIssueWithMyQuote() {
        requestIdText = request_Id.getText();
        System.out.println("Request ID: " + requestIdText);
        Actions act = new Actions(driver);
        if(TestBase.env.equals("sanity")){
            TestUtil.sendKeys(dpNameField, "test shubham", "Dp name entered");
            act.sendKeys(Keys.BACK_SPACE).build().perform();
            TestUtil.click(DpNameShubham, "Test user clicked");
        } else if (TestBase.env.equals("prod")) {
            TestUtil.sendKeys(dpNameField, "mr automation", "Dp name entered");
            act.sendKeys(Keys.BACK_SPACE).build().perform();
            TestUtil.click(dpNameAutomation, "Test user clicked");
        }
//        TestUtil.sendKeys(dpNameField,"automation", "Entered DP Name");
//        TestUtil.click(dpNameAutomation, "Clicked on DP Name automation");
        WebCommands.staticSleep(1000);
        TestUtil.click(verticalField,"Clicked on Vertical field");
        TestUtil.click(verticalPvtCar, "Clicked on Vertical Pvt Car");
        TestUtil.click(insurerField,"Clicked on Insurer field");
        TestUtil.click(insurerAcko, "Clicked on Insurer Acko");
        TestUtil.sendKeys(registrationNumberField,"MH12AB1234", "Entered Registration Number");
        TestUtil.sendKeys(customerMobileNumberField,"6999912345", "Entered Customer Mobile Number");
        TestUtil.sendKeys(customerEmailIDField,"test@testting.com"," Entered Customer Email ID");
        TestUtil.click(titleField,"Clicked on Title field");
        TestUtil.click(titleMr, "Clicked on Title Mr");
        TestUtil.click(inspectionNoRadioButton,"Clicked on Inspection No Radio Button");
        TestUtil.sendKeys(nomineeNameField,"testtttt", "Entered Nominee Name");
        TestUtil.sendKeys(nomineeDateOfBirthField,"17-09-2000","Entered Nominee Date of Birth");
        TestUtil.click(nomineeDateOfBirth17, "Clicked on Nominee Date of Birth 17");
        TestUtil.click(nomineeRelationToCustomerField,"Clicked on Nominee Relation to Customer");
        TestUtil.click(nomineeRelationToCustomerSon, "Clicked on Nominee Relation to Customer Son");
        TestUtil.sendKeys(commentsField,"testtttt", "Entered Comments");
        WebCommands.staticSleep(1000);
        TestUtil.ElementPresent(uploadFile, "/Users/abhinavkamble/Documents/sampleJPG.jpg", "File uploaded");
        TestUtil.click(rcCopy,"Selected RC Copy as document Type");
        TestUtil.click(OKButton,"Clicked on OK Button");
        WebCommands.staticSleep(1000);
        TestUtil.ElementPresent(uploadFile, "/Users/abhinavkamble/Documents/samplePDF.pdf", "File uploaded");
        TestUtil.click(manualQuote,"Selected Previous Policy Copy as document Type");
        TestUtil.click(OKButton,"Clicked on OK Button");
        WebCommands.staticSleep(1000);
        TestUtil.ElementPresent(uploadFile, "/Users/abhinavkamble/Documents/samplePNG.png", "File uploaded");
        TestUtil.click(adharCopy,"Selected Adhar as document Type");
        TestUtil.click(OKButton,"Clicked on OK Button");
        TestUtil.click(saveButton,"Clicked on Save Button");
        WebCommands.staticSleep(10000);
        return requestIdText;
    }
}
