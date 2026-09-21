package com.qa.turtlemint.pages.Mypartners;
import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;


public class MyPartner extends TestBase {
    public MyPartner() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[text()='APGRID']")
    WebElement APGRID;



    @FindBy(xpath = "//*[text()='Sales Commitment']")
    WebElement SalesCommitment;

    @FindBy(xpath = "//*[contains(normalize-space(.),'Claims')]")
    WebElement Claims;
    @FindBy(xpath = "//*[normalize-space()='Claims']")
    WebElement claimspage;

    @FindBy(xpath = "//*[text()='Ninja Academy']")
    WebElement NinjaAcademy;
    @FindBy(xpath = "//h3[normalize-space(.)='Explore Academy']")
    WebElement exploreAcademy;

    @FindBy(xpath = "//span[text()='Insights']")
    WebElement Insights;

    @FindBy(xpath = "//span[text()='My Partners']")
    WebElement MyPartners;


    @FindBy(xpath = "//span[text()='Quote Request']")
    WebElement QuoteRequest;

    @FindBy(xpath = "//*[normalize-space()='All Quotes']")
    WebElement allQuotes;


    @FindBy(xpath = "//span[normalize-space(text())='Policy Issuance']/..")
    WebElement PolicyIssuance;
    @FindBy(xpath = "//*[normalize-space()='Get a Policy Issued']")
    WebElement getPolicyIssued;


    @FindBy(xpath = "//span[text()='Partner Lead Management']")
    WebElement PartnerLeadManagement;

    @FindBy(xpath = "//span[starts-with(normalize-space(),'All Records')]")
    WebElement allRecords;

    @FindBy(xpath = "//*[@aria-label='menu']")
    WebElement Menu;

    @FindBy(xpath = "//img[contains(@src,'turtlemint_sidenav-ninja-logo')]")
    WebElement NinjaLogo;

    @FindBy(xpath = "//*[@placeholder='Search for a Partner from the list.']")
    WebElement SearchPartner;
    @FindBy(xpath = "//*[contains(normalize-space(.),'Sneha Shinde')]")
    WebElement snehaShinde;

    @FindBy(xpath = "//*[text()='Back to Partner List']")
    WebElement BackToPartnerList;

    @FindBy(xpath = "//*[@src='/ninja-v2/static/media/bell.3ce7d7932a250e8ef67a91498ebba39e.svg']")
    WebElement bellIcon;


    @FindBy(xpath = "//*[text()='Report a Sale']")
    WebElement ReportASale;

    @FindBy(xpath = "//*[text()='Follow Ups']")
    WebElement FollowUps;

    @FindBy(xpath = "//*[contains(text(),'All Partners')]")
    WebElement allPartners;

    @FindBy(xpath = "//*[contains(text(),'All partners that are allowed to transact')]")
    WebElement allowedToTransact;

    @FindBy(xpath = "//*[contains(text(),'Last Month Active')]")
    WebElement lastMonthActive;

    @FindBy(xpath = "//*[contains(text(),'All partners active last month excluding super active partners and are inactive this month')]")
    WebElement inactiveThisMonth;

    @FindBy(xpath = "//div[@role='tab' and contains(text(),'Ever Active')]")
    WebElement everActive;

    @FindBy(xpath = "//*[contains(text(),'All partners who were active atleast once since acquisition and last active atleast one month ago but inactive this month')]")
    WebElement everActiveText;

    @FindBy(xpath = "//*[contains(text(),'Never Active')]")
    WebElement neverActive;

    @FindBy(xpath = "//*[contains(text(),'All verified partners who have never done a sale')]")
    WebElement neverActiveText;


    @FindBy(xpath = "//*[contains(text(),'MTD Active')]")
    WebElement mtdActive;

    @FindBy(xpath = "//*[contains(text(),'All partners who have sold a policy this month')]")
    WebElement mtdActiveText;


    @FindBy(xpath = "//*[contains(text(),'Super Active Partners')]")
    WebElement superActivePartners;

    @FindBy(xpath = "//*[contains(text(),'All partners who were active every month in the last 3 months and are inactive this month')]")
    WebElement superActivePartnersText;


    @FindBy(xpath = "//div[starts-with(normalize-space(.),'Y0')]")
    WebElement y0;

    @FindBy(xpath = "//div[starts-with(normalize-space(.),'Y1')]")
    WebElement y1;


    @FindBy(xpath = "//*[contains(text(),'Inactive M0-M2')]")
    WebElement inactiveM0M2;

    @FindBy(xpath = "//*[contains(text(),'All New partners onboarded in last 3 months and are inactive')]")
    WebElement inactiveM0M2Text;

    @FindBy(xpath = "//*[contains(text(),'Life Partners')]")
    WebElement lifePartners;

    @FindBy(xpath = "//*[contains(text(),'All partners active on life product since Jan 2023')]")
    WebElement lifePartnersText;


    @FindBy(xpath = "//*[contains(text(),'CV Partners')]")
    WebElement cvPartnersClick;

    @FindBy(xpath = "//*[contains(text(),'All partners active on CV product in Jan, Feb and March 2024')]")
    WebElement cvPartnersAsserttext;


    @FindBy(xpath = "//*[contains(text(),'Health Partners')]")
    WebElement healthPartnersClick;

    @FindBy(xpath = "//*[contains(text(),'All partners active on Health product since Jan 2023')]")
    WebElement healthPartnersAsserttext;


    @FindBy(xpath = "//*[contains(text(),'De-growing Partners')]")
    WebElement deGrowingPartnersClick;

    @FindBy(xpath = "//*[contains(text(),'All partners that have been de-growing consistently')]")
    WebElement deGrowingPartnersAsserttext;

    @FindBy(xpath = "//*[contains(text(),'Filter')]")
    WebElement filterAsserttext;


    @FindBy(xpath = "//*[contains(text(),'Sort By:')]")
    WebElement sortByAsserttext;
    @FindBy(xpath = "//label[normalize-space()='Sort By:']/following-sibling::div[1]")
    WebElement dropdown;


    @FindBy(xpath = "//div[@title='Last Monthly Premium (High to Low)']")
    WebElement lastMonthlyPremiumHighToLow;

    @FindBy(xpath = "//div[@title='Last Monthly Premium (Low to High)']")
    WebElement lastMonthlyPremiumLowToHigh;

    @FindBy(xpath = "//div[@title='Verification Date (Most Recent)']")
    WebElement verificationDateMostRecent;

    @FindBy(xpath = "//div[@title='Active Quote (High to Low)']")
    WebElement activeQuoteHighToLow;

    @FindBy(xpath = "//div[@title='MTD Premium (High to Low)']")
    WebElement mtdPremiumHighToLow;

    @FindBy(xpath = "//div[@title='MTD Premium (Low to high)' and not(contains(@style,'display: none'))]")
    WebElement mtdPremiumLowToHigh;

    @FindBy(xpath = "//div[@title='Last sale Date (Most Recent)']")
    WebElement lastSaleDateMostRecent;

    @FindBy(xpath = "//div[@title='Renewal Due Current Month (High To Low)']")
    WebElement renewalDueCurrentMonthHighToLow;
    @FindBy(xpath = "//img[contains(@src,'edit-table')]")
    WebElement editTable;

    @FindBy(xpath = "//span[normalize-space()='Back To Home']")
    WebElement backToHome;

    @FindBy(xpath = "//span[contains(text(),'Apply all')]")
    WebElement applyAll;


    @FindBy(xpath = "//*[contains(text(),'Reset')]")
    WebElement reset;


    public void UI() throws InterruptedException, IOException {

        TestUtil.click(APGRID, "Clicked on APGRID");
        for (String window : driver.getWindowHandles()) {
            driver.switchTo().window(window);
        }
        Thread.sleep(3000);
        TestUtil.click(backToHome, "Back To Home clicked");
        TestUtil.click(SalesCommitment, "Clicked on Sales Commitment");
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Claims, "Clicked on Claims");
        Assert.assertTrue(claimspage.isDisplayed(), "Claims is not displayed");
        TestUtil.click(NinjaAcademy, "Clicked on Ninja Academy");
        Assert.assertTrue(exploreAcademy.isDisplayed(), "Explore Academy is not displayed");
        backToHome.click();
        Thread.sleep(3000);
        TestUtil.click(Insights, "Clicked on Insights");
        TestUtil.getFullPageScreenShot();
        TestUtil.windowhandel();
        TestUtil.click(PolicyIssuance, "Clicked on Policy Issuance");
        Assert.assertTrue(getPolicyIssued.isDisplayed(), "Get a Policy Issued is not displayed");
        TestUtil.click(Menu, "Clicked on menu");
        Thread.sleep(3000);
        TestUtil.click(NinjaLogo, "Clicked on Ninja logo");
        TestUtil.getFullPageScreenShot();
        TestUtil.click(QuoteRequest, "Clicked on Quote Request");
        Assert.assertTrue(allQuotes.isDisplayed(), "All Quotes is not displayed");
        TestUtil.click(Menu, "Clicked on menu");
        Thread.sleep(3000);
        TestUtil.click(NinjaLogo, "Clicked on Ninja logo");
        TestUtil.click(PartnerLeadManagement, "Clicked on Partner Lead Management");
        Assert.assertTrue(allRecords.isDisplayed(), "All Records is not displayed");
        TestUtil.click(Menu, "Clicked on menu");
        Thread.sleep(3000);
        TestUtil.click(NinjaLogo, "Clicked on Ninja logo");
        TestUtil.click(MyPartners, "Clicked on My Partners");
        TestUtil.click(Menu, "Clicked on menu");
        Thread.sleep(3000);
        TestUtil.click(NinjaLogo, "Clicked on Ninja logo");
        TestUtil.click(MyPartners, "Clicked on My Partners");
        TestUtil.click(SearchPartner, "Clicked on Search Partner field");
        TestUtil.sendKeys(SearchPartner, "Sneha Shinde", "Entered partner name");
        TestUtil.click(BackToPartnerList, "Clicked on Back to Partner List");
        Assert.assertTrue(bellIcon.isDisplayed(), "Bell icon is not displayed");
        Assert.assertTrue(ReportASale.isDisplayed(), "Report a Sale is not displayed");
        Assert.assertTrue(FollowUps.isDisplayed(), "FollowUps is not displayed");
        allPartners.click();
        TestUtil.getFullPageScreenShot();
        Assert.assertTrue(allowedToTransact.isDisplayed());
        lastMonthActive.click();
        Assert.assertTrue(inactiveThisMonth.isDisplayed());
        everActive.click();
        Assert.assertTrue(everActiveText.isDisplayed());
        neverActive.click();
        Assert.assertTrue(neverActiveText.isDisplayed());
        mtdActive.click();
        Assert.assertTrue(mtdActiveText.isDisplayed());
        superActivePartners.click();
        Assert.assertTrue(superActivePartnersText.isDisplayed());
        inactiveM0M2.click();
        Assert.assertTrue(inactiveM0M2Text.isDisplayed());
        TestUtil.click(y0, "Clicked on Y0");
        TestUtil.click(y1, "Clicked on Y1");
        lifePartners.click();
        Assert.assertTrue(lifePartnersText.isDisplayed());
        cvPartnersClick.click();
        TestUtil.getFullPageScreenShot();
        Assert.assertTrue(cvPartnersAsserttext.isDisplayed());
        TestUtil.JsClick(healthPartnersClick, "healthPartnersClick clicked");
        TestUtil.getFullPageScreenShot();
        Assert.assertTrue(healthPartnersAsserttext.isDisplayed());
        Assert.assertTrue(filterAsserttext.isDisplayed());
        Assert.assertTrue(sortByAsserttext.isDisplayed());
        TestUtil.JsClick(allPartners, "allPartners clicked");
        Thread.sleep(5000);
        TestUtil.click(dropdown, "dropdown clicked");
        Thread.sleep(5000);
        TestUtil.click(lastMonthlyPremiumHighToLow, "Last Monthly Premium High To Low clicked");
        TestUtil.click(dropdown, "Dropdown clicked");
        TestUtil.click(lastMonthlyPremiumLowToHigh, "Last Monthly Premium Low To High clicked");
        TestUtil.click(dropdown, "Dropdown clicked");
        TestUtil.click(verificationDateMostRecent, "Verification Date Most Recent clicked");
        TestUtil.click(dropdown, "Dropdown clicked");
        TestUtil.click(activeQuoteHighToLow, "Active Quote High To Low clicked");
        TestUtil.click(dropdown, "Dropdown clicked");
        TestUtil.click(mtdPremiumHighToLow, "MTD Premium High To Low clicked");
        TestUtil.click(dropdown, "Dropdown clicked");
        TestUtil.click(mtdPremiumLowToHigh, "MTD Premium Low To High clicked");
        TestUtil.click(dropdown, "Dropdown clicked");
        TestUtil.click(lastSaleDateMostRecent, "Last Sale Date Most Recent clicked");
        TestUtil.click(dropdown, "Dropdown clicked");
        TestUtil.click(renewalDueCurrentMonthHighToLow,
                "Renewal Due Current Month High To Low clicked");
        TestUtil.click(dropdown, "Dropdown clicked");
        TestUtil.click(editTable, "Edit Table clicked");
        TestUtil.click(applyAll, "Apply All clicked");
        TestUtil.click(reset, "Reset clicked");
        TestUtil.getFullPageScreenShot();
        TestUtil.click(allPartners, "All Partners clicked");

    }
}




