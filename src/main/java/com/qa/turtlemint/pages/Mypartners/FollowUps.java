package com.qa.turtlemint.pages.Mypartners;

import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.time.LocalDate;

import static com.qa.turtlemint.base.TestBase.driver;

public class FollowUps {
    public FollowUps() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//tr[.//*[normalize-space()='Sneha Shinde']]//td[normalize-space()='Hot Lead']")
    WebElement hotLeadDisposition;


    @FindBy(xpath = "//div[text()='Renewals ']")
    WebElement renewals;


    @FindBy(xpath = "//div[@id='rc-tabs-0-tab-contests']")
    WebElement contests;

    @FindBy(xpath = "//div[@id='rc-tabs-0-tab-profile']")
    WebElement profile;

    @FindBy(xpath = "//input[@placeholder='Name' and @value='sneha shinde']")
    WebElement name;


    @FindBy(xpath = "//div[@id='rc-tabs-0-tab-follow_ups']")
    WebElement followUpslead;


    @FindBy(xpath = "//div[contains(@class,'followUpCardWrapper')][.//div[contains(@class,'followUpComment') and normalize-space()='Prod Testing'] and .//div[contains(@class,'timeDetails') and contains(normalize-space(.),'12:00 AM')]]")
    WebElement prodTestingRecord;

    @FindBy(xpath = "//div[contains(@class,'followUpCardWrapper')][.//div[contains(@class,'followUpComment') and normalize-space()='Prod Testing'] and .//div[contains(@class,'timeDetails') and contains(normalize-space(.),'12:00 AM')]]//button[normalize-space()='Edit Follow-up']")
    WebElement editFollowUp;

    @FindBy(xpath = "//div[contains(@class,'followUpCardWrapper')][.//*[normalize-space()='Prod TestingTest']]//button[normalize-space()='Mark As Complete']")
    WebElement markAsComplete;


    @FindBy(xpath = "//div[@id='rc-tabs-0-tab-crm_insights']")
    WebElement crmInsights;

    @FindBy(xpath = "//li[normalize-space()='Sneha Shinde']")
    WebElement snehashinde;
    @FindBy(xpath = "//iframe[@title=\"Insights\"]")
    WebElement Frame;

    @FindBy(xpath = "//p[text()='Sneha Shinde']")
    WebElement snehashindeprofile;

    @FindBy(xpath = "//p[text()='1311639']")
    WebElement number402392;


    @FindBy(xpath = "//span[text()='Notes']")
    WebElement notes;
    @FindBy(xpath = "//button[@aria-label='Edit note']")
    WebElement editNote;
//    @FindBy(id = "addNote_note")
//    WebElement addNoteNote;

    @FindBy(xpath = "//p[text()='Sneha Shinde']/../../..//span[@aria-label='ellipsis']")
    WebElement ellipsis;


    @FindBy(xpath = "//button[text()='AP Grid']")
    WebElement apGrid;

    @FindBy(xpath = "//*[@data-icon='arrow-left']")
    WebElement arrowLeft;


    @FindBy(xpath = "//*[text()='Back to Partner List']")
    WebElement backToPartnerList;


    @FindBy(xpath = "//span[text()='My Partners']")
    WebElement MyPartners;

    @FindBy(xpath = "//*[text()='Follow Ups']")
    WebElement FollowUps;


    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement save;

    @FindBy(xpath = "//div[contains(@class,'ant-modal-content')]//span[@aria-label='close']")
    WebElement closeButton;

    @FindBy(xpath = "//button[text()='Call Partner']")
    WebElement callPartner1;

    @FindBy(xpath = "//span[text()='Add Alternate Number']")
    WebElement addAlternateNumber;

    @FindBy(id = "alternativeMobile")
    WebElement alternativeMobile;

    @FindBy(xpath = "//p[text()='Alternate Number edited successfully for ']")
    WebElement alternateNumberEditedSuccessfully;


    @FindBy(xpath = "//span[text()='Update Disposition']")
    WebElement updateDisposition;

    @FindBy(xpath = "//div[normalize-space()='Sneha Shinde']")
    WebElement snehashindeadddis;

    @FindBy(xpath = "//label[normalize-space()='Remark']/following::div[contains(@class,'ant-select-selector')][1]")
    WebElement remark;

    @FindBy(xpath = "//div[@title='Hot Lead' and normalize-space()='Hot Lead']")
    WebElement hotLead;

    @FindBy(xpath = "//input[@id='rc_select_1']/ancestor::span[contains(@class,'ant-select-selection-search')]/..")
    WebElement reason;


    @FindBy(xpath = "//div[text()='Promise to get active']")
    WebElement promiseToGetActive;

    @FindBy(xpath = "//p[text()='Disposition set for Sneha Shinde']")
    WebElement dispositionSetForsnehashinde;

    @FindBy(xpath = "//li[contains(@class,'ant-dropdown-menu-item') and .//span[normalize-space()='Remove Partner']]")
    WebElement removePartner;


    @FindBy(xpath = "//b[contains(normalize-space(.),'Reason to Remove Partner?')]")
    WebElement reasonToRemovePartner;


    @FindBy(xpath = "//div[normalize-space()='Add Reminder']")
    WebElement addReminder;

    @FindBy(xpath = "//textarea[@id='addReminder_note']")
    WebElement addReminderNote;

    @FindBy(xpath = "//input[@placeholder='Select date']")
    WebElement selectDate;

    @FindBy(xpath = "//*[normalize-space()='Add Note']")
    WebElement addNote;

    @FindBy(xpath = "//textarea[@id='addNote_note']")
    WebElement addNoteNote;


    public void folloups() throws InterruptedException, IOException {

        TestUtil.click(MyPartners, "My Partners clicked");
        TestUtil.click(FollowUps, "Follow Ups clicked");
        TestUtil.getFullPageScreenShot();
        Assert.assertTrue(hotLeadDisposition.isDisplayed());
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", hotLeadDisposition);
        TestUtil.JsClick(hotLeadDisposition, "Hot lead clicked");
        TestUtil.click(renewals, "Renewals clicked");
        TestUtil.click(contests, "Contests clicked");
        TestUtil.click(profile, "Profile clicked");
        Assert.assertEquals(name.getAttribute("value"), "sneha shinde");
        TestUtil.click(followUpslead, "Follow Ups clicked");
        TestUtil.click(prodTestingRecord, "Prod Testing Record clicked");
        TestUtil.click(editFollowUp, "Edit Follow Up clicked");
        TestUtil.click(addReminderNote, "Reminder Note clicked");
        addReminderNote.clear();
        addReminderNote.sendKeys("Test");
        TestUtil.getFullPageScreenShot();
        TestUtil.click(save, "Save clicked");
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        TestUtil.click(markAsComplete, "Mark As Complete clicked");
        TestUtil.click(crmInsights, "CRM Insights clicked");
        driver.switchTo().frame(Frame);
        Assert.assertTrue(snehashinde.isDisplayed());
        driver.switchTo().defaultContent();
        Assert.assertTrue(snehashindeprofile.isDisplayed());
        Assert.assertTrue(number402392.isDisplayed());
        TestUtil.click(apGrid, "AP Grid clicked");
        TestUtil.getFullPageScreenShot();
        TestUtil.click(closeButton, "Close button clicked");
        driver.navigate().refresh();
        Thread.sleep(3000);
        TestUtil.click(callPartner1, "Call Partner clicked");
        Thread.sleep(5000);
        TestUtil.click(closeButton, "Close button clicked");
        TestUtil.click(ellipsis, "Ellipsis clicked");
        TestUtil.click(addAlternateNumber, "Add Alternate Number clicked");
        alternativeMobile.sendKeys(Keys.COMMAND + "a");
        alternativeMobile.sendKeys("9112345678");
        TestUtil.click(save, "Save clicked");
        Thread.sleep(3000);
        Assert.assertTrue(alternateNumberEditedSuccessfully.isDisplayed());
        TestUtil.getFullPageScreenShot();
        TestUtil.click(closeButton, "Close button clicked");
        TestUtil.click(ellipsis, "Ellipsis clicked");
        TestUtil.click(updateDisposition, "Update Disposition clicked");
        Thread.sleep(3000);
        Assert.assertTrue(snehashindeadddis.isDisplayed());
        TestUtil.click(remark, "Remark clicked");
        Thread.sleep(3000);
        TestUtil.click(hotLead, "Hot Lead clicked");
        Thread.sleep(3000);
        TestUtil.click(reason, "Reason clicked");
        TestUtil.click(promiseToGetActive, "Promise To Get Active clicked");
        TestUtil.click(save, "Save clicked");
        Assert.assertTrue(dispositionSetForsnehashinde.isDisplayed());
        TestUtil.click(closeButton, "Close button clicked");
        TestUtil.click(ellipsis, "Ellipsis clicked");
        TestUtil.getFullPageScreenShot();
        TestUtil.click(removePartner, "Remove Partner clicked");
        Thread.sleep(3000);
        Assert.assertTrue(reasonToRemovePartner.isDisplayed());
        TestUtil.click(closeButton, "Close button clicked");
        TestUtil.click(ellipsis, "Ellipsis clicked");
        Thread.sleep(3000);
        TestUtil.click(addReminder, "Add Reminder clicked");
        TestUtil.click(addReminderNote, "Add Reminder Note clicked");
        TestUtil.sendKeys(addReminderNote, "Prod", "Added comment as Prod");
        TestUtil.getFullPageScreenShot();
        TestUtil.click(selectDate, "Select Date clicked");
        String nextDay = LocalDate.now().plusDays(1).toString();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement nextDayDate = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//td[@title='" + nextDay + "']")
                )
        );
        TestUtil.click(nextDayDate, "Next day date selected");
        Actions act = new Actions(driver);
        Thread.sleep(3000);
        act.moveToElement(save).click().build().perform();
        TestUtil.click(save, "Save clicked");
        Thread.sleep(5000);
        TestUtil.click(ellipsis, "Ellipsis clicked");
        TestUtil.click(addNote, "Add Note clicked");
        TestUtil.click(addNoteNote, "Add Note field clicked");
        TestUtil.sendKeys(addNoteNote, "Testing", "Test entered in Add Note");
        TestUtil.getFullPageScreenShot();
        TestUtil.click(save, "Save clicked");
        TestUtil.click(notes, "Notes clicked");
        TestUtil.click(editNote, "Edit Note clicked");
        TestUtil.sendKeys(addNoteNote, "Testing123", "Test entered in Add Note");
        TestUtil.click(save, "Save clicked");
        TestUtil.click(arrowLeft, "Arrow Left clicked");
        TestUtil.getFullPageScreenShot();
        TestUtil.click(backToPartnerList, "Back to Partner List clicked");
    }
}
