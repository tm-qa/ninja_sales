package com.qa.turtlemint.pages.Mypartners;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import static com.qa.turtlemint.base.TestBase.driver;

public class AllPartners  {

    public AllPartners() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[text()='My Partners']")
    WebElement MyPartners;

    @FindBy(xpath = "//tr[.//*[normalize-space()='Sneha Shinde']]//span[@aria-label='more']")
    WebElement ActionButton;

    @FindBy(xpath = "//span[text()='Call Partner']")
    WebElement callPartner;

    @FindBy(xpath = "//button[text()='Call Partner']")
    WebElement callPartner1;

    @FindBy(xpath = "//div[contains(@class,'ant-modal')]//span[@aria-label='close']")
    WebElement closeButton;

    @FindBy(xpath = "//li[contains(@class,'ant-dropdown-menu-item') and .//span[normalize-space()='Remove Partner']]")
    WebElement removePartner;


    @FindBy(xpath = "//b[contains(normalize-space(.),'Reason to Remove Partner?')]")
    WebElement reasonToRemovePartner;

    @FindBy(xpath = "//li[contains(@data-menu-id,'addReminder')]//span[normalize-space()='Add Reminder']")
    WebElement addReminder;

    @FindBy(xpath = "//textarea[@id='addReminder_note']")
    WebElement addReminderNote;

    @FindBy(xpath = "//input[@placeholder='Select date']")
    WebElement selectDate;


    @FindBy(xpath = "//button[text()='Save']")
    WebElement save;


    @FindBy(xpath = "//div[@class='sc-gsFSXq TVESb']")
    WebElement sideelement;

    @FindBy(xpath = "//*[normalize-space()='Add Alternate Number']")
    WebElement addAlternateNumber;

    @FindBy(id = "alternativeMobile")
    WebElement alternativeMobile;


    @FindBy(xpath = "//p[text()='Alternate Number edited successfully for ']")
    WebElement alternateNumberEditedSuccessfully;

    @FindBy(xpath = "//span[text()='Update Disposition']")
    WebElement updateDisposition;

    @FindBy(xpath = "//div[normalize-space()='Sneha Shinde']")
    WebElement snehashinde;

    @FindBy(xpath = "//*[@id='rc_select_1']/ancestor::div[contains(@class,'ant-select-selector')]")
    WebElement remark;

    @FindBy(xpath = "//div[@title='Hot Lead' and normalize-space()='Hot Lead']")
    WebElement hotLead;

    @FindBy(xpath = "//*[@id='rc_select_2']/ancestor::div[contains(@class,'ant-select-selector')]")
    WebElement reason;


    @FindBy(xpath = "//div[text()='Promise to get active']")
    WebElement promiseToGetActive;

    @FindBy(xpath = "//p[text()='Disposition set for Sneha Shinde']")
    WebElement dispositionSetForsnehashinde;

    @FindBy(xpath = "//*[contains(text(),'All Partners')]")
    WebElement allPartners;






    public void allpartners () throws InterruptedException, IOException {
        TestUtil.click(MyPartners, "My Partners clicked");
        TestUtil.click(allPartners, "All Partners clicked");
        TestUtil.click(ActionButton, "Action Button clicked");
        TestUtil.getFullPageScreenShot();
        TestUtil.click(callPartner, "Call Partner clicked");
        TestUtil.getFullPageScreenShot();
        Assert.assertTrue(callPartner.isDisplayed());
        TestUtil.click(closeButton, "Closed button clicked");
        TestUtil.click(ActionButton, "Action Button clicked");
        TestUtil.click(removePartner, "Remove Partner clicked");
        Thread.sleep(3000);
        Assert.assertTrue(reasonToRemovePartner.isDisplayed());
        TestUtil.click(closeButton, "Close button clicked");
        TestUtil.click(ActionButton, "Action Button clicked");
        TestUtil.click(addReminder, "Add Reminder clicked");
        TestUtil.click(addReminderNote, "Add Reminder Note clicked");
        TestUtil.sendKeys(addReminderNote, "Prod Testing", "Added comment as Prod Testing");
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
        TestUtil.click(ActionButton, "Action Button clicked");
        TestUtil.click(addAlternateNumber, "Add Alternate Number clicked");
        TestUtil.click(alternativeMobile, "Alternative Mobile clicked");
        alternativeMobile.sendKeys(Keys.COMMAND + "a");
        alternativeMobile.sendKeys("9112345678");
        TestUtil.click(save, "Save clicked");
        Thread.sleep(3000);
        Assert.assertTrue(alternateNumberEditedSuccessfully.isDisplayed());
        TestUtil.getFullPageScreenShot();
        TestUtil.click(closeButton, "Close button clicked");
        TestUtil.click(ActionButton, "Action Button clicked");
        TestUtil.click(updateDisposition, "Update Disposition clicked");
        Thread.sleep(3000);
        Assert.assertTrue(snehashinde.isDisplayed());
        TestUtil.getFullPageScreenShot();
        TestUtil.click(remark, "Remark clicked");
        Thread.sleep(3000);
        TestUtil.click(hotLead, "Hot Lead clicked");
        TestUtil.click(reason, "Reason clicked");
        TestUtil.click(promiseToGetActive, "Promise To Get Active clicked");
        TestUtil.click(save, "Save clicked");
        Assert.assertTrue(dispositionSetForsnehashinde.isDisplayed());
        TestUtil.getFullPageScreenShot();
        TestUtil.click(closeButton, "Close button clicked");



    }
}


