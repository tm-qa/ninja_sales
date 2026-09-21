package com.qa.turtlemint.pages.Mypartners;

import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static com.qa.turtlemint.base.TestBase.driver;

public class Filter {
    public Filter() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[text()='My Partners']")
    WebElement MyPartners;

    @FindBy(xpath = "//button[contains(.,'Filter') and not(@disabled)]")
    WebElement filter;

    @FindBy(xpath = "//*[@id='FormBasedFilter_partner_status']/ancestor::div[contains(@class,'ant-select')]//div[contains(@class,'ant-select-selector')]")
    WebElement partnerStatus;

    @FindBy(xpath = "//div[normalize-space()='Certified']")
    WebElement certified;

    @FindBy(xpath = "//*[@id='FormBasedFilter_engagement']/ancestor::div[contains(@class,'ant-select')]//div[contains(@class,'ant-select-selector')]")
    WebElement engagement;

    @FindBy(xpath = "//*[normalize-space()='Never Contacted']")
    WebElement neverContacted;

    @FindBy(xpath = "//*[@id='FormBasedFilter_partnertype']/ancestor::div[contains(@class,'ant-select')]//div[contains(@class,'ant-select-selector')]")
    WebElement partnerType;

    @FindBy(xpath = "//*[normalize-space()='Partner Level 1']")
    WebElement partnerLevel1;
    @FindBy(xpath = "//*[@id='FormBasedFilter_aquiredby']/ancestor::div[contains(@class,'ant-select')]//div[contains(@class,'ant-select-selector')]")
    WebElement acquiredBy;

    @FindBy(xpath = "//*[normalize-space()='Online']")
    WebElement online;
    @FindBy(xpath = "//button[normalize-space()='Apply']")
    WebElement apply;

    @FindBy(xpath = "//button[normalize-space()='Clear Filters']")
    WebElement clearFilters;

    public void filters () throws InterruptedException, IOException {
        TestUtil.click(MyPartners, "My Partners clicked");
        TestUtil.getFullPageScreenShot();
        TestUtil.click(filter, "Filter clicked");
        Thread.sleep(3000);
        TestUtil.click(partnerStatus, "Partner Status clicked");
        TestUtil.click(certified, "Certified selected");
        TestUtil.click(engagement, "Engagement clicked");
        TestUtil.click(neverContacted, "Never Contacted selected");
        TestUtil.click(partnerType, "Partner Type clicked");
        TestUtil.click(partnerLevel1, "Partner Level 1 selected");
        TestUtil.click(acquiredBy, "Acquired By clicked");
        TestUtil.click(online, "Online selected");
        TestUtil.getFullPageScreenShot();
        TestUtil.click(apply, "Apply clicked");
        Thread.sleep(3000);
        TestUtil.click(filter, "Filter clicked");
        TestUtil.click(clearFilters, "Clear Filters clicked");
        TestUtil.getFullPageScreenShot();
    }
}
