package com.qa.turtlemint.pages.grow;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import com.qa.turtlemint.util.LogUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class GrowPage extends TestBase {
    String url;

    @FindBy(xpath = "//span[text()='Grow']")
    WebElement growpage;

    @FindBy(xpath = "//span[contains(text(),'Lead')]//parent::div")
    WebElement Leadform;

    @FindBy(xpath = "//span[text()='Daily Posters']//parent::div")
    WebElement DailyPosters;

    @FindBy(xpath = "//span[text()='New Content']//parent::div")
    WebElement NewContent;

    @FindBy(xpath = "//span[text()='Brochures']//parent::div")
    WebElement Brochures;

    @FindBy(xpath = "//span[text()='Videos']//parent::div")
    WebElement Videos;
    @FindBy(xpath = "//span[text()='Academy']//parent::div")
    WebElement Academy;
    @FindBy(xpath = "//span[text()='Articles']//parent::div")
    WebElement Articles;
    @FindBy(xpath = "//span[text()='AP Grid']//parent::div")
    WebElement APGrid;
    @FindBy(xpath = "//span[text()='Turtlemint Store']//parent::div")
    WebElement Turtlemint_store;
    @FindBy(xpath = "//button[@aria-label='redirected-to-home']")
    WebElement Back_to_home;
    @FindBy(xpath = "(//div[text()='View your website']//parent::div)[2]")
    WebElement MyWebsite;

    @FindBy(xpath = "//span[text()='Ad with MS Dhoni']//parent::div")
    WebElement AdWithMSdhoni;

    @FindBy(xpath = "//a[@href='/grow/Daily_Posters']")
    WebElement ViewMoreDailyPosters;

    @FindBy(xpath = "//a[@href='/leadGenerationForms']")
    WebElement ViewMoreLeadForms;

    @FindBy(xpath = "//a[@href='/plans']")
    WebElement ViewMoreInsurerContent;

    @FindBy(xpath = "//a[@href='/grow/Videos']")
    WebElement ViewMoreVideos;

    @FindBy(xpath = "//a[@href='/grow/Articles']")
    WebElement ViewMoreArticals;

    @FindBy(xpath = "//a[text()='Lead Forms']")
    WebElement leadformsassert;

    @FindBy(xpath = "//a[text()='Daily Posters']")
    WebElement DailyPostersAssert;

    @FindBy(xpath = "//a[@href='/grow/Personalised_Greetings']")
    WebElement Personalised_Greetings;

    @FindBy(xpath = "//a[text()='Plans']")
    WebElement plansassert;

    @FindBy(xpath = "//a[text()='Videos']")
    WebElement Videosassert;

    @FindBy(xpath = "//a[text()='Articles']")
    WebElement Articalassert;

    @FindBy(xpath = "//a[text()='Personalised Greetings']")
    WebElement Personalised_Greetings_assert;

    @FindBy(xpath = "//div[@class='cardContainer']")
    WebElement Personalised_Greetings_Card;

    @FindBy(xpath = "//input[@name='fname']")
    WebElement Personalised_Greetings_First_name;

    @FindBy(xpath = "//input[@name='lname']")
    WebElement Personalised_Greetings_Last_name;

    @FindBy(xpath = "//span[text()='Apply']")
    WebElement Personalised_Greetings_Apply;

    @FindBy(xpath = "//div[text()='personal website']//parent::div//child::span[text()='Share']")
    WebElement Share;

    @FindBy(xpath = "//div[@class='whatsAppButton_new']")
    WebElement ShareViaWhatsapp;

    @FindBy(xpath = "//h2[text()='Send the following on WhatsApp']")
    WebElement SendViaWhatsapp;

    @FindBy(xpath = "//img[@src='images/copy_desktop.webp']")
    WebElement CopyLinkCTA;

    @FindBy(xpath = "(//input[@name='name'])[1]")
    WebElement EnterName;

    @FindBy(xpath = "//input[@placeholder='Enter Your Mobile Number']")
    WebElement EnterMobile;

    @FindBy(xpath = "//span[text()='Request Call']")
    WebElement Request_A_call;

    @FindBy(xpath = "//p[text()='We have successfully received your details.']")
    WebElement SuccessResponse;

    @FindBy(xpath = "//div[text()='Complete KYC']")
    WebElement KYC_Verification;

    @FindBy(xpath = "//div[text()='Start KYC']")
    WebElement Star_KYC;
    @FindBy(xpath = "//span[contains(text(),'Verify')]")
    WebElement verify;
    @FindBy(xpath = "//span[text()='Grow']")
    WebElement Grow_tab;
    @FindBy(xpath = "//p[text()='Recommended Posters']//parent::div")
    WebElement Recommended_Posters;
   @FindBy(xpath = "//p[text()='Daily Posters']//parent::div//parent::div//parent::div//div[@class=\"growItem\"]//div[@class=\"daily_poster\"]//parent::div//parent::div//div[@class=\"thumbnailBgImage bg_image_url\"]")
   WebElement first_Poster;


    @FindBy(xpath = "//div[@class='posterShare']//child::div[@class='buttonContainer']")
    WebElement DownloadANDShareButton;
    @FindBy(xpath = "//a[text()='Grow']")
    WebElement grow_breadcrumbs;
    @FindBy(xpath = "//a[@href='/grow/Recommended_Posters']//parent::span[@class='view_more_text']")
    WebElement View_more;


    public GrowPage() {
        PageFactory.initElements(driver, this);
    }

    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions act = new Actions(driver);

    public void grow_page() {
        WebCommands.staticSleep(10000);
        TestUtil.click(Grow_tab, "Clicked on grow page tab");
    }

    public void quickLinks() {
        TestUtil.click(DailyPosters, "Clicked on Daily Posters");
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
        driver.navigate().back();
        WebCommands.staticSleep(2000);

        TestUtil.click(Brochures, "Clicked on Brochures");
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
        driver.navigate().back();
        WebCommands.staticSleep(2000);

        TestUtil.click(NewContent, "Clicked on New Content");
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
        driver.navigate().back();
        WebCommands.staticSleep(2000);

        TestUtil.click(Turtlemint_store, "Clicked on Turtlemint_store");
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
        driver.navigate().back();
        WebCommands.staticSleep(2000);

//        TestUtil.click(Articles, "Clicked on article");
//        WebCommands.staticSleep(4000);
//        TestUtil.getScreenShot();
//        TestUtil.click(Grow_tab, "Clicked on grow page tab");
//        WebCommands.staticSleep(2000);

        WebCommands.staticSleep(2000);
        TestUtil.click(Leadform, "Clicked on Leadform");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
        driver.navigate().back();
        WebCommands.staticSleep(3000);

//        TestUtil.click(APGrid, "Clicked on APGrid");
//        WebCommands.staticSleep(4000);
//        TestUtil.getScreenShot();

    }

    public void share_your_personal_website_Verified() {
        TestUtil.click(MyWebsite, "Clicked on My Website");
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
        driver.navigate().back();
        WebCommands.staticSleep(2000);

        TestUtil.click(Share, "Clicked on Share your ad now");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(ShareViaWhatsapp, "Clicked on Share your ad Via Whatsapp");
        WebCommands.staticSleep(2000);
        String parentWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        String SendViaWA = SendViaWhatsapp.getText();
        System.out.println("Text of the element: " + SendViaWA);
        Assert.assertEquals(SendViaWA,"Send the following on WhatsApp","Redirected to new window");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
        driver.close();
        driver.switchTo().window(parentWindowHandle);
        WebCommands.staticSleep(2000);
        CopyLinkCTA.click(); //copying the URL
        WebCommands.staticSleep(2000);
        WebElement l = driver.findElement(By.id("copyUrl"));
        String val = l.getAttribute("value");

        Actions actions = new Actions(driver);
        ((JavascriptExecutor) driver).executeScript("window.open();");
        // Switch to the new tab
        String originalHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        driver.get(val);
        // Press Enter on the keyboard
        actions.sendKeys(Keys.ENTER).perform();
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(EnterName, "Test Automation", "Name Entered");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(EnterMobile, "6999912345", "Mobile Entered");
        WebCommands.staticSleep(1000);
        TestUtil.click(Request_A_call, "Clicked on req a call cta");
        WebCommands.staticSleep(1000);
        System.out.println("Ad shared via copy link");
      //  String CopylinkResponse = SuccessResponse.getText();
      //  Assert.assertEquals(CopylinkResponse,"We have successfully received your details.","Redirected to new window");

        // Close the browser
        driver.close();
        WebCommands.staticSleep(2000);
        driver.switchTo().window(parentWindowHandle);

    }

    public void share_your_personal_website_Non_Verified() {
        TestUtil.click(verify, "Clicked on Start KYC Posters");
        WebCommands.staticSleep(2000);
   //     String KYC_Page = KYC_Verification.getText();
  //      Assert.assertEquals(KYC_Page, "Complete KYC", "Redirected to partnerVideoLandingPage Page");
    //    WebCommands.staticSleep(3000);
    //    TestUtil.click(KYC_Verification, "Clicked on complete KYC ");
        url= driver.getCurrentUrl();
        WebCommands.staticSleep(1000);
        url.contains("/myaccount");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
    }

    public void allSeemore() {
        WebCommands.staticSleep(3000);
        js.executeScript("arguments[0].scrollIntoView(true)", ViewMoreDailyPosters);
        WebCommands.staticSleep(3000);
        TestUtil.click(ViewMoreDailyPosters, "Clicked on see more Daily Posters");
        WebCommands.staticSleep(5000);
        String expectedResult = DailyPostersAssert.getText();
        String actualResult = "Daily Posters";
        Assert.assertEquals(expectedResult, actualResult);
        LogUtils.info("Verified: " + expectedResult);
        TestUtil.click(growpage, "Clicked on grow page");
        WebCommands.staticSleep(4000);

        WebCommands.staticSleep(3000);
        js.executeScript("arguments[0].scrollIntoView(true)", ViewMoreLeadForms);
        WebCommands.staticSleep(5000);
        TestUtil.click(ViewMoreLeadForms, "Clicked on see more lead forms");
        WebCommands.staticSleep(5000);
        String expectedResult1 = leadformsassert.getText();
        String actualResult1 = "Lead Forms";
        Assert.assertEquals(expectedResult1, actualResult1);
        LogUtils.info("Verified: " + expectedResult1);
        TestUtil.click(growpage, "Clicked on grow page");
        WebCommands.staticSleep(4000);

        js.executeScript("arguments[0].click();", ViewMoreInsurerContent);
        LogUtils.info("Clicked on Seemore Plan");
        String expectedResult2 = plansassert.getText();
        String actualResult2 = "Plans";
        Assert.assertEquals(expectedResult2, actualResult2);
        LogUtils.info("Verified: " + expectedResult2);
        WebCommands.staticSleep(5000);
        TestUtil.click(growpage, "Clicked on grow page");
        WebCommands.staticSleep(5000);

        js.executeScript("arguments[0].click();", ViewMoreVideos);
        LogUtils.info("Clicked on Seemore Videos");
        String expectedResult3 = Videosassert.getText();
        String actualResult3 = "Videos";
        Assert.assertEquals(expectedResult3, actualResult3);
        LogUtils.info("Verified: " + expectedResult3);
        TestUtil.click(growpage, "Clicked on grow page");
        WebCommands.staticSleep(2000);

        js.executeScript("arguments[0].click();", ViewMoreArticals);
        LogUtils.info("Clicked on Seemore Videos");
        String expectedResult4 = Articalassert.getText();
        String actualResult4 = "Articles";
        Assert.assertEquals(expectedResult4, actualResult4);
        LogUtils.info("Verified: " + expectedResult4);
        TestUtil.click(growpage, "Clicked on grow page");
        WebCommands.staticSleep(2000);



//        js.executeScript("arguments[0].click();", Personalised_Greetings);
//        LogUtils.info("Clicked on view more Personalised_Greetings");
//        String expectedResult5 = Personalised_Greetings_assert.getText();
//        String actualResult5 = "Personalised Greetings";
//        Assert.assertEquals(expectedResult5, actualResult5);
//        LogUtils.info("Verified: " + expectedResult5);
//        TestUtil.click(Personalised_Greetings_Card, "Clicked on Personalised_Greetings Card");
//        WebCommands.staticSleep(2000);
//        TestUtil.getScreenShot();
//        TestUtil.sendKeys(Personalised_Greetings_First_name, "Card", "First name added in card page");
//        TestUtil.sendKeys(Personalised_Greetings_Last_name, "Test", "Last name added in card page");
//        WebCommands.staticSleep(1000);
//        TestUtil.click(Personalised_Greetings_Apply, "Clicked on Personalised_Greetings apply button and changes applied");
//        WebCommands.staticSleep(2000);
//        TestUtil.getScreenShot();
//        TestUtil.click(growpage, "Clicked on grow page");
//        WebCommands.staticSleep(2000);

    }

    public void Recommended_Posters() {
        TestUtil.IsDisplayed(Recommended_Posters,"Recommended_Posters displayed");
        WebCommands.staticSleep(2000);
        TestUtil.click(first_Poster, "Clicked on first_Poster");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        url= driver.getCurrentUrl();
        WebCommands.staticSleep(1000);
        url.contains("/Recommended_Posters");
        WebCommands.staticSleep(3000);
        TestUtil.click(DownloadANDShareButton, "Clicked on download");
        WebCommands.staticSleep(5000);
        TestUtil.click(grow_breadcrumbs, "Clicked on grow_breadcrumbs");
        WebCommands.staticSleep(2000);
        TestUtil.click(View_more, "Clicked on view more");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(1000);

        List<WebElement> recommended_page_posters_count = driver.findElements(By.xpath("//div[@class='slick-track']//div[@data-index]"));
         if (recommended_page_posters_count.size()>0){
             System.out.println("posters are present on view more page");
        }

        driver.navigate().back();
         TestUtil.IsDisplayed(first_Poster,"first poster of Recommended Posters on grow page displayed");
    }


}
