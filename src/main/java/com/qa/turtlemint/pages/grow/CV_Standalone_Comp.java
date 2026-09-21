package com.qa.turtlemint.pages.grow;


import com.qa.turtlemint.base.TestBase;

import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class CV_Standalone_Comp extends TestBase {
    public String orderId;
    GCV_QIS_Automatic cv = new GCV_QIS_Automatic();


    public CV_Standalone_Comp() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space(text())='Quote Request']")
    WebElement Quote;
    @FindBy(xpath = "//button[text()='Own']")
    WebElement OWNbtn;

    @FindBy(xpath = "//div[text()='All Quotes']")
    WebElement AllQuote;
    @FindBy(xpath = "//div[text()='Get a Quote']")
    WebElement GetQuote;
    @FindBy(xpath = "//input[@id='dpLoginId']")
    WebElement Dp;
    @FindBy(xpath = "//span[text()='(1593963) test shubham']")
    WebElement DpSan;
    @FindBy(xpath = "//div[text()='(402392) mr automation']")
    WebElement Sneha;

    @FindBy(xpath = "//span[text()= 'Select Vertical']")
    WebElement Verticle;
    @FindBy(xpath = "//div[@title=\"CV\"]")
    WebElement CV;
    @FindBy(xpath = "//p[text()='CV Quote Calculator']")
    WebElement CVCal;
    @FindBy(xpath = "//button[text()= 'Create Quote']")
    WebElement Create;

    @FindBy(xpath = "//div[@class='Flexbox-module__gap-column-16--xaRYv']//following ::input[@placeholder='Eg. MH01AB1234']")
    WebElement RTOLocation;
    @FindBy(xpath = "//p[text()='I have a registration number']")
    WebElement Registration;
    @FindBy(xpath = "//div[text()= 'MH-12-Pune']")
    WebElement RTOLocationselect;
    @FindBy(xpath = "//span[text()='GCV']")
    WebElement VehicleClass;

    @FindBy(xpath = "//span[text()='Public']")
    WebElement RegistrationType;
    @FindBy(xpath = "//span[text()= 'Continue']")
    WebElement Continue;
    @FindBy(xpath = "//span[text()= 'Comprehensive']")
    WebElement PolicyType;
    //    @FindBy(xpath = "//div[@class= 'ant-select-selector']//following::span[@class='ant-select-arrow']")
//    WebElement Fuel;
    @FindBy(xpath = "//input[@type= 'search']")
    WebElement make;
    @FindBy(xpath = "//div[text()= 'Ashok Leyland']//following::div[@class='rc-virtual-list-holder-inner']")
    WebElement Tata;
    @FindBy(xpath = "//span[text()='Select fuel']")
    WebElement Fuel;
    @FindBy(xpath = "//div[@title= 'Diesel']")
    WebElement Petrol;
    @FindBy(xpath = "//span[text()= 'Select a value']")
    WebElement SubCategory;
    @FindBy(xpath = "//div[text()= '4 Wheeler Goods Carrying Vehicle']")
    WebElement ThreeWheel;
    @FindBy(xpath = "//input[@label= 'Gross vehicle weight']")
    WebElement Weight;
    @FindBy(xpath = "//input[@placeholder= 'Enter total idv']")
    WebElement IDV;
    @FindBy(xpath = "//span[text()='No']")
    WebElement No;
    @FindBy(xpath = "//div[text()= '20%']")
    WebElement claimPercentage;
    @FindBy(xpath = "//span[text()='Yes']//following::span[@class='ant-radio-inner']")
    WebElement Yes;
    @FindBy(xpath = "//input[@placeholder= 'Enter lead name']")
    WebElement Lead;
    @FindBy(xpath = "//span[text()= 'Confirm details']")
    WebElement Confirm;
    @FindBy(xpath = "//span[text()= 'Okay']")
    WebElement Submit;
    @FindBy(xpath = "//span[text()= 'Update Results']")
    WebElement UpdateResults;
    @FindBy(xpath = "//input[@type=\"checkbox\"]")
    WebElement Checkbox;
    @FindBy(xpath = "//a[text()=\"See More\"]")
    WebElement SeeMore;
    @FindBy(xpath = "//span[text()=\"Shriram\"]")
    WebElement Shriram;
    @FindBy(xpath = "//span[text()=\"Request Quotes\"]")
    WebElement RequestQuotes;
    @FindBy(xpath = "//input[@placeholder='Search by Registration number, Request Id, POSP name']")
    WebElement Search;

    @FindBy(xpath = "//span[text()='Status']//ancestor::th[contains(@class,'table-cell')]//span[@role=\"button\"]")
    WebElement Status;
    @FindBy(xpath = "//span[text()='Select all items']")
    WebElement Select;
    @FindBy(xpath = "(//span[text()='OK'])")
    WebElement Ok;
    @FindBy(xpath = "//button[text()='Logout']")
    WebElement logout;
    @FindBy(xpath = "//h3[text()='Welcome to Ninja']")
    WebElement WelcomeToNinja;
    @FindBy(xpath = "//span[text()='mr automation']")
    WebElement MrAutomation;
    @FindBy(xpath = "//div[text()='QUOTES']")
    WebElement Quotes;
    @FindBy(xpath = "//p[text()='ICICI Lombard']//ancestor::div[contains(@class,'ant-space-item')]//div[text()='QUOTES']")
    WebElement IciciLombardQuotes;
    @FindBy(xpath = "//textarea[@placeholder=\"Add remarks\"]")
    WebElement AddRemarks;
    @FindBy(xpath = "//div[text()='REJECT']")
    WebElement Reject;
    @FindBy(xpath = "//div[text()='Rejection Reason']//ancestor::div[contains(@class,'ant-modal-content')]//span[text()='Submit']")
    WebElement SubmitRejection;


    @FindBy(xpath = "//div[text()='Secure Towing']//ancestor::div[contains(@class,'addonRow')]//input[@inputmode=\"numeric\"]")
    WebElement SecureTowing;
    @FindBy(xpath = "//div[text()='Road Side Assistance']//ancestor::div[contains(@class,'addonRow')]//input[@inputmode=\"numeric\"]")
    WebElement RoadSideAssistance;
    @FindBy(xpath = "//div[text()='Zero Depreciation']//ancestor::div[contains(@class,'addonRow')]//input")
    WebElement ZeroDepreciation;
    @FindBy(xpath = "//div[text()='NCB Discount']//ancestor::div[contains(@class,'addonRow')]//input")
    WebElement NcbDiscount;

    @FindBy(xpath = "//span[text()='Select a reason']")
    WebElement Reason;
    @FindBy(xpath = "//div[@title=\"Changed IDV\"]")
    WebElement IdvReason;
    @FindBy(xpath = "//div[text()='Share Quotes']")
    WebElement ShareQuotes;
    @FindBy(xpath = "//span[text()='Add Quote']/ancestor::button")
    WebElement AddQuote;
    @FindBy(xpath = "//a[text()='Details']")
    WebElement Details;
    @FindBy(xpath = "//span[text()='Share']")
    WebElement Share;
    @FindBy(xpath = "//span[@aria-label=\"close\"]")
    WebElement Cross;
    @FindBy(xpath = "//span[text()='Close']")
    WebElement Close;
    @FindBy(xpath = "//input[@inputmode=\"numeric\"]")
    By DoB = By.xpath("//md-icon[@aria-label=\"md-calendar\"]");
    By yearselect = By.xpath("//select[@class=\"sc-kIPQKe bjoHsz\"]");
    By monthselect = By.xpath("//select[@class=\"sc-kIPQKe bjoHsz\"][2]");


    public void cvFlow() throws Exception {
        Actions actions = new Actions(driver);
        TestUtil.click(Quote, "Quote request clicked");
        TestUtil.click(AllQuote, "All quote clicked");
        Thread.sleep(3000);
        TestUtil.click(GetQuote, "Get quote clicked");
        Thread.sleep(8000);
        TestUtil.click(Dp, "Dp name entered");
        if (TestBase.env.equals("sanity")) {
            TestUtil.sendKeys(Dp, "test shubham", "Dp name entered");
            actions.sendKeys(Keys.BACK_SPACE).build().perform();
            TestUtil.click(DpSan, "Test user cliked");
        } else if (TestBase.env.equals("prod")) {
            TestUtil.sendKeys(Dp, "mr automation", "Dp name entered");
            actions.sendKeys(Keys.BACK_SPACE).build().perform();
            TestUtil.click(Sneha, "Test user cliked");
        }
        Thread.sleep(3000);
        actions.moveToElement(Verticle).click().build().perform();
//        TestUtil.JsClick(Verticle, "verticle cliked");
        TestUtil.click(CV, "CV clicked");
        Thread.sleep(2000);
        TestUtil.click(CVCal, "CV calulatore method selected");
        Thread.sleep(2000);
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Create, "Create quote clicked");
        Thread.sleep(3000);
        WebElement fr = driver.findElement(By.xpath("//iframe[@title=\"Get a Quote\"]"));
        driver.switchTo().frame(fr);
        Thread.sleep(3000);
        TestUtil.JsClick(Registration, "Registration clicked");
        TestUtil.sendKeys(RTOLocation, "MH12sk1234", "RTO Number entered");
        TestUtil util = new TestUtil();
        util.DatePicker("2024", "Oct", "10");
        Thread.sleep(2000);
        TestUtil.click(VehicleClass, "Vehicle class GCV clicked");
        TestUtil.click(RegistrationType, "Registration type public clicked");
        Thread.sleep(3000);
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Continue, "Continue clicked");
        Thread.sleep(2000);
        TestUtil.click(PolicyType, "Policy type COMP clicked");
        Thread.sleep(3000);
        TestUtil.sendKeys(make, "Ashok", "Ashok make entered");
        Thread.sleep(2000);
        actions.moveToElement(Tata).click().perform();
        Thread.sleep(2000);
        actions.moveToElement(Fuel).click().perform();
        Thread.sleep(2000);
        TestUtil.click(Petrol, "Diesel fuel clicked");
        Thread.sleep(3000);
        actions.moveToElement(SubCategory).click().perform();
        TestUtil.click(ThreeWheel, "4 wheel clicked");
        Thread.sleep(2000);
        TestUtil.sendKeys(Weight, "2400", "Weight entered");
        TestUtil.sendKeys(IDV, "500000", "IDV entered");
        Thread.sleep(2000);
        TestUtil.click(No, "Claim in previous year clicked");
        Thread.sleep(2000);
        actions.moveToElement(SubCategory).click().perform();
        TestUtil.click(claimPercentage, "Claim percentage clicked");
        Thread.sleep(2000);
        TestUtil.JsClick(Yes, "Previous Policy From Turtlemin clicked");
        TestUtil.sendKeys(Lead, "Suraj Automation", "Lead name entered");
        Thread.sleep(3000);
        TestUtil.click(Continue, "Continue clicked");
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Confirm);
        Confirm.isDisplayed();
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Confirm, "Confirm details clicked");
        Thread.sleep(3000);
        TestUtil.getFullPageScreenShot();
        By frame = By.id("qis-results-iframe");
        TestUtil.fluentWait(frame, "Waiting for frame to get load");
        TestUtil.FrameSwitch(frame, "Switching to Frame");
        while (true) {
            try {

                WebElement detail = driver.findElement(By.xpath("//a[text()='Details']"));
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
                wait.until(ExpectedConditions.elementToBeClickable(detail));
                Thread.sleep(2000);
                wait.until(ExpectedConditions.invisibilityOf(Submit));
                LogUtils.info("Okay Not appear on result page...");
                break;
            } catch (Exception e) {
                LogUtils.info("Clicking Okay...");
                TestUtil.click(Submit, "Ok clicked");
                Thread.sleep(3000);
            }
        }
        ClickCheckbox();
        Thread.sleep(1000);
        actions.moveToElement(driver.findElement(By.xpath("//a[text()='Details']"))).perform();
        Thread.sleep(4000);
        TestUtil.click(UpdateResults, "Update results clicked");
        Thread.sleep(4000);
        By seeMoreBy = By.xpath("//a[text()='See More']");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        JavascriptExecutor js = (JavascriptExecutor) driver;

        int attempts = 0;
        while (attempts < 4) {
            try {
                // 3️⃣ Always re-find from fresh DOM
                WebElement seeMore = wait.until(
                        ExpectedConditions.presenceOfElementLocated(seeMoreBy)
                );
                // 4️⃣ Immediate scroll
                js.executeScript(
                        "arguments[0].scrollIntoView({block:'center'});",
                        seeMore
                );
                // 5️⃣ Immediate click
                js.executeScript("arguments[0].click();", seeMore);
                LogUtils.info("See More clicked after Update Results");
                break;
            } catch (StaleElementReferenceException | ElementClickInterceptedException
                     | JavascriptException e) {
                LogUtils.info("Results re-rendered again, retrying...");
                attempts++;
            }
        }

        Thread.sleep(2000);

        TestUtil.click(Shriram, "Shriram clicked");
        TestUtil.click(RequestQuotes, "Request quotes clicked");
        Thread.sleep(5000);
        TestUtil.getFullPageScreenShot();
    }

    public void QuoteRequest(String id, String url) throws InterruptedException {
        TestUtil.click(Quote, "Quote request clicked");
        TestUtil.sendKeys(Search, id, "Request id entered");
        Thread.sleep(2000);
        Search.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        try {
            if (MrAutomation.isDisplayed()) {
                Thread.sleep(2000);
                TestUtil.getScreenShot();
                TestUtil.click(MrAutomation, "MrAutomation clicked");
            }
        } catch (Exception e) {
            LogUtils.info("Clearing Filter");
            TestUtil.click(Status, "Status clicked");
            Thread.sleep(2000);
            TestUtil.click(Select, "Select All iterm in filter clicked");
            TestUtil.click(Ok, "Ok clicked");
            Thread.sleep(2000);
            TestUtil.getScreenShot();
            TestUtil.click(MrAutomation, "MrAutomation clicked");
        }
        TestUtil.click(OWNbtn, "OWN clicked");
        Thread.sleep(5000);
        driver.switchTo().frame("qis-results-iframe");
        Thread.sleep(3000);
        try {
            if (Submit.isDisplayed()) {
                Thread.sleep(2000);
                TestUtil.click(Submit, "Submit clicked");
            }
        } catch (Exception e) {
            System.out.println("Okay button is not displayed");
        }
//        if (TestBase.MethodName.equals("OD_Discount_Flow")) {
//            CV_Standalone_Comp auto = new CV_Standalone_Comp();
//            auto.ClickCheckbox();
//            Thread.sleep(1000);
//            Actions actions = new Actions(driver);
//            actions.moveToElement(driver.findElement(By.xpath("//a[text()='Details']"))).perform();
//            Thread.sleep(4000);
//            TestUtil.click(UpdateResults, "Update results clicked");
//            Thread.sleep(4000);
//            TestUtil.click(Reject, "Reject clicked");
//            TestUtil.sendKeys(AddRemarks, "Test Remarks", "Remarks added");
//            TestUtil.click(SubmitRejection, "Submit rejection clicked");
//            Thread.sleep(2000);
//            driver.navigate().refresh();
//            Thread.sleep(4000);
//            TestUtil.getScreenShot();
//            TestUtil.click(IciciLombardQuotes, "ICICI Lombard Quotes clicked");
//            TestUtil.sendKeys(RoadSideAssistance, "270", "Secure towing entered");
//            TestUtil.sendKeys(ZeroDepreciation, "270", "Zero Depreciation entered");
//            TestUtil.sendKeys(NcbDiscount, "270", "NCB Discount entered");
//        }
        Thread.sleep(2000);
        TestUtil.click(Quotes, "Quote request clicked");
        Thread.sleep(2000);
        if (TestBase.MethodName.equals("Roll_GCVStandalone")) {
            SecureTowing.click();
            SecureTowing.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            SecureTowing.sendKeys(Keys.BACK_SPACE);
            TestUtil.sendKeys(SecureTowing, "270", "Secure towing entered");
            Thread.sleep(2000);
            RoadSideAssistance.click();
            SecureTowing.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            SecureTowing.sendKeys(Keys.BACK_SPACE);
            TestUtil.sendKeys(RoadSideAssistance, "270", "Secure towing entered");
            Thread.sleep(2000);
        }
        if (TestBase.MethodName.equals("QIS_MISCD_Automatic")) {
            SecureTowing.click();
            SecureTowing.sendKeys(Keys.chord(Keys.COMMAND, "a"));
            SecureTowing.sendKeys(Keys.BACK_SPACE);
            TestUtil.sendKeys(SecureTowing, "270", "Secure towing entered");
            Thread.sleep(2000);
            TestUtil.sendKeys(ZeroDepreciation, "270", "Zero Depreciation entered");
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                Reason);
        Thread.sleep(1000);
        js.executeScript(
                "arguments[0].dispatchEvent(new MouseEvent('mousedown', {bubbles:true}));",
                Reason
        );
        Thread.sleep(3000);
        TestUtil.click(IdvReason, "IDV Reason clicked");
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        try {
            TestUtil.click(AddQuote, "Add quote clicked");
            TestUtil.getScreenShot();
            new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.invisibilityOfElementLocated(
                    By.cssSelector(".ant-modal-wrap")
            ));
        } catch (TimeoutException | ElementClickInterceptedException e) {
            js.executeScript("arguments[0].scrollIntoView({block:'center'});", AddQuote);
            js.executeScript("arguments[0].click();", AddQuote);
            LogUtils.info("Add quote clicked with JS");
            TestUtil.getScreenShot();
        }
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.cssSelector(".ant-modal-wrap")
        ));
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", ShareQuotes);
        try {
            LogUtils.info("try runs");
            TestUtil.click(Details, "Details clicked");
        } catch (ElementClickInterceptedException r) {
            Thread.sleep(1000);
            LogUtils.info("catch runs");
            TestUtil.click(Details, "Details clicked");
        }
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(Cross, "Cross clicked");
        Thread.sleep(5000);
        TestUtil.JsClick(Share, "Whatsapp Share clicked");
        Thread.sleep(5000);
        TestUtil.getScreenShot();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[@aria-label=\"close\"]")
        ));
        TestUtil.click(Cross, "Cross clicked");
        Thread.sleep(2000);
        TestUtil.JsClick(Close, "Close clicked");
        Thread.sleep(4000);
        driver.navigate().to("https://ninja.turtlemintinsurance.com/");
        Thread.sleep(4000);
        TestUtil.getScreenShot();
        TestUtil.click(Quote, "Quote request clicked");
//        try {
//            if (Quotes.isDisplayed()) {
//                LogUtils.info("Quotes is displayed");
//                TestUtil.click(Quote, "Quote request clicked");
//            }
//        } catch (NoSuchElementException e) {
//            LogUtils.info("Quotes is not displayed");
//            LogUtils.info("Navigated back to previous page");
//            driver.navigate().back();
//           Thread.sleep(2000);
//            TestUtil.getScreenShot();
//            TestUtil.click(Quote, "Quote request clicked");
//       }
        TestUtil.sendKeys(Search, id, "Request id entered");
        Search.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        Thread.sleep(2000);
        driver.get(url);
        Thread.sleep(4000);
        TestUtil.click(logout, "Logout clicked");
        while (true) {
            try {
                Thread.sleep(2000);
                if (WelcomeToNinja.isDisplayed()) {
                    LogUtils.info("User Logged Out");
                    break;
                }
            } catch (NoSuchElementException e) {
                LogUtils.info("Logout is Visible clicking logout");
                TestUtil.click(logout, "Logout clicked");
                Thread.sleep(2000);
            }
        }
    }

    public void ValidateAddons() {
        /// Checking addons with actual list to confirm all addons are visible
        TestUtil util = new TestUtil();
        List<String> Expectedaddons = util.getExpectedAddons();
        List<String> ActualAddOns = Addonlist();

        for (String Expected : Expectedaddons) {
            if (!ActualAddOns.contains(Expected)) {
                Assert.fail("Addon " + Expected + " is not present in addonlist");
            }
        }
        LogUtils.info("All of these addons are present in addon list: " + Expectedaddons);


    }

    public void ClickCheckbox() {
        ValidateAddons();
        /// Clicking addons flow starts from here
        List<WebElement> addons =
                /// Finds all addon boxes on the page
                /// Stores them in a list called addons
                driver.findElements(By.xpath("//div[contains(@class,'addonWrapper')]"));

        for (int i = 0; i < addons.size() - 1; i++) {
            /// Takes one addon from the list
            ///  Now we work only inside this addon
            WebElement addon = addons.get(i);

            WebElement checkbox =

                    addon.findElement(By.xpath(".//input[@type='checkbox']"));
            /// Now Selenium does NOT search the whole page
            ///  It searches ONLY inside this one addon
            /// this ".//" means Start from the current element (addon), not from the page
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView({block:'center'});", checkbox);
            if (!checkbox.isSelected()) {
                checkbox.click();
            }

            /// Check if input field exists inside this addon
            /// here its checking wether there is any input field of type text inside the addon
            /// its not checking wether that input field is empty or not.
            List<WebElement> inputFields =
                    addon.findElements(By.xpath(".//input[@type='text']"));
            /// If at least one text box is there
            /// Takes the first text box by get(0) here 0 means first element
            /// Types 1 into it
            if (!inputFields.isEmpty()) {
                inputFields.get(0).sendKeys("1");
            }
        }

    }

    public List<String> Addonlist() {
        List<WebElement> addonNameElements =
                driver.findElements(By.xpath(
                        "//label[contains(@class,'ant-checkbox-css-var')]//span[text()]"
                ));

        List<String> actualAddons = new ArrayList<>();

        for (WebElement addon : addonNameElements) {
            actualAddons.add(addon.getText().trim());
        }
        return actualAddons;

    }

    public void date123(String demo, String dem, String element) throws InterruptedException {
        driver.findElement(DoB).click();
        WebElement years = driver.findElement(yearselect);
        Select yearSelect = new Select(years);
        yearSelect.selectByValue(demo);
        WebElement months = driver.findElement(monthselect);
        Select monthSelect = new Select(months);
        monthSelect.selectByVisibleText(dem);
        List<WebElement> co = driver.findElements(By.xpath("//div[contains(@class,'react-datepicker__day') and not(contains(@class,'react-datepicker__day--outside-month')) and @aria-disabled='false']"));
        for (WebElement dateElement : co) {
            if (dateElement.getText().trim().equals(element)) {
                dateElement.click();
                break;
            }
        }

    }

}
