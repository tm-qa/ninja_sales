package com.qa.turtlemint.pages.grow;


import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.NINJA.Ninja_Login;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class GCV_QIS_Automatic extends TestBase {
    public GCV_QIS_Automatic() {
        PageFactory.initElements(driver, this);
    }

    public String getUrl;
    public String orderID;
    public String MIS_ID;
    public static String requestID;

    @FindBy(xpath = "//span[normalize-space(text())='Quote Request']")
    WebElement Quote;
    @FindBy(xpath = "//div[text()='All Quotes']")
    WebElement AllQuote;
    By requestId = By.xpath("//strong[contains(text(),'Request ID:')]");
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
    @FindBy(xpath = "//p[text()='Upload Documents']")
    WebElement CVUpld;
    @FindBy(xpath = "//button[text()= 'Create Quote']")
    WebElement Create;
    @FindBy(xpath = "//input[@type='file']")
    WebElement FileUpload;
    @FindBy(xpath = "//input[@type='file']")

    By uploadFile = By.xpath("//input[@name='file']");
    @FindBy(xpath = "//img[@src='/ninja-v2/static/media/eye-with-circle2.cab61d28a80ca61fa4cfbab66b489752.svg']")
    WebElement eye;
    @FindBy(xpath = "(//span[@role='img'])[5]")//(//span[@role='img'])[6]
    WebElement close;
    @FindBy(xpath = "//button[text()='Add Tag']")
    WebElement tag;
    @FindBy(xpath = "//span[text()='Previous Policy']")
    WebElement previouspolicy;
    @FindBy(xpath = "//button[text()='OK']")
    WebElement ok;
    @FindBy(xpath = "//input[@id= 'vertical']")
    WebElement Verticle1;
    @FindBy(xpath = "//div[@title= 'GCV']")
    WebElement vertSelect;
    @FindBy(xpath = "//div[@title= 'PCV']")
    WebElement vertSelectPCV;
    @FindBy(xpath = "//div[@title= 'MiscD']")
    WebElement vertSelectMiscD;
    @FindBy(xpath = "//span[text()= 'Select Sub Vertical']")
    WebElement Subctgr;
    @FindBy(xpath = "//div[text()= '4 Wheeler Goods Carrying Vehicle']")
    WebElement SchoolBus;
    @FindBy(xpath = "//div[text()= 'Taxi']")
    WebElement Taxi;
    @FindBy(xpath = "//div[text()= 'Trailers Agriculture Tractors upto 6HP']")
    WebElement aggri;
    @FindBy(xpath = "//span[text()= 'Continue']")
    WebElement Continue;

    @FindBy(xpath = "//input[@placeholder= 'Enter Lead Name']")
    WebElement lead;
    @FindBy(xpath = "//span[text()= 'Public']")
    WebElement RegistrationType;
    @FindBy(xpath = "//span[text()= 'Select Policy Type']")
    WebElement policyType;
    @FindBy(xpath = "//div[text()= 'Comprehensive']")
    WebElement type;
    @FindBy(xpath = "//span[text()= 'Yes']")
    WebElement ClaimFiled;
    @FindBy(xpath = "//input[@placeholder= 'Enter Preffered IDV']")
    WebElement IDV;
    @FindBy(xpath = "//span[text()= 'Select Insurer']")
    WebElement PreferredInsurer;
    @FindBy(xpath = "//div[text()= 'Kotak General Insurance']")
    WebElement SelectInsurer;
    @FindBy(xpath = "//div[text()= 'ICICI Lombard']")
    WebElement SelectInsurerICICI;
    @FindBy(xpath = "//button[@role='switch']")
    WebElement AddonsSwitch;
    @FindBy(xpath = "//span[@role=\"img\"]//ancestor::div[contains(@class,'custom-form')]//span[contains(text(),'Add-Ons Selected')]")
    WebElement Addons;

    @FindBy(xpath = "//input[@id=\"secureTowing\"]")
    WebElement SecureTowing;
    @FindBy(xpath = "//input[@id=\"geographicExt\"]")
    WebElement GeographicExt;
    @FindBy(xpath = "//input[@id=\"paOwnerDriver\"]")
    WebElement PAOwnerDriver;
    @FindBy(xpath = "//input[@id=\"zeroDep\"]")
    WebElement ZeroDep;
    @FindBy(xpath = "//button[text()= 'Save']")
    WebElement Save;
    @FindBy(xpath = "//span[text()= 'Submit']")
    WebElement Submit;
    @FindBy(xpath = "//span[text()= 'Okay']")
    WebElement Okay;
    @FindBy(xpath = "//span[text()= 'Buy']")
    WebElement Buy;
    @FindBy(xpath = "//span[text()= 'Confirm']")
    WebElement Confirm;
    @FindBy(xpath = "//span[text()='Enter Values']")
    WebElement EnterValue;

    @FindBy(xpath = "//div[text()='Previous Policy']")
    WebElement okSecond;

    @FindBy(xpath = "//span[normalize-space()='For Zero Depreciation'] /following::span[normalize-space()='Premium Amount ₹'] /following-sibling::span//input")
    WebElement PremiumAmount;

    @FindBy(xpath = "//span[normalize-space()='For Secure Towing'] /following::span[normalize-space()='Premium Amount ₹'] /following-sibling::span//input")
    WebElement SecureTowingPremium;

    @FindBy(xpath = "//span[@aria-label=\"more\"]")
    WebElement filter;
    @FindBy(xpath = "//span[text()='Clear filters']")
    WebElement ClearFilters;
    @FindBy(xpath = "//span[@aria-label=\"Close\"]")
    WebElement Close;

    @FindBy(xpath = "//button[text()='Logout']")
    WebElement logout;
    @FindBy(xpath = "//h3[text()='Welcome to Ninja']")
    WebElement WelcomeToNinja;

    @FindBy(xpath = "//span[contains(text(),'Policy Issuance')]")
    WebElement PolicyIssuance;
    @FindBy(xpath = "//input[@placeholder=\"Search by Reg Number, Customer Name, DP Name, DP Phone Number\"]")
    WebElement searchBox;
    @FindBy(xpath = "//button[text()='OWN']")
    WebElement OWNbtn;
    @FindBy(xpath = "//md-icon[@aria-label=\"Collapse Card\"]")
    WebElement collapse;
    @FindBy(xpath = "//input[@name=\"proposerFName\"]")
    WebElement proposerName;
    @FindBy(xpath = "//input[@name=\"proposerLName\"]")
    WebElement proposerLastName;
    @FindBy(xpath = "//input[@name=\"proposerMobile\"]")
    WebElement proposerMobile;
    @FindBy(xpath = "//input[@name=\"proposerEmail\"]")
    WebElement proposerEmail;
    @FindBy(xpath = "//input[@id='Motor_vehicleSubType']/ancestor::div[contains(@class,'ant-select-selector')]")
    WebElement vehicleSubType;
    @FindBy(xpath = "//div[@title='TRACTOR']")
    WebElement vehicleSubTypeSelect;
    @FindBy(xpath = "//input[@name=\"GVW in kgs\"]")
    WebElement grossVehicleWeight;
    @FindBy(xpath = "//input[@id='Motor_policyStartDate']")
    WebElement RSDDate;
    @FindBy(xpath = "//input[@id='Motor_policyEndDate']")
    WebElement REDDate;
    @FindBy(xpath = "//td[contains(@class,'ant-picker-cell-today') and not(contains(@class,'ant-picker-cell-disabled'))]")
    WebElement todayDate;
    @FindBy(xpath = "(//div[contains(@class,'ant-picker-dropdown') and not(contains(@class,'ant-picker-dropdown-hidden'))]//td[contains(@class,'ant-picker-cell-today')])[last()]")
    WebElement todayPCDDate;
    @FindBy(xpath = "(//div[contains(@class,'ant-picker-dropdown') and not(contains(@class,'ant-picker-dropdown-hidden'))]//td[contains(@class,'ant-picker-cell-today')])[last()]")
    WebElement todayIssuanceDate;
    @FindBy(xpath = "(//div[contains(@class,'ant-picker-dropdown') and not(contains(@class,'ant-picker-dropdown-hidden'))]//td[contains(@class,'ant-picker-cell-today')])[last()]")
    WebElement tomorrowDate;
    @FindBy(xpath = "//input[@name=\"txnNo\"]")
    WebElement TransactionNo;
    @FindBy(xpath = "//span[text()='Payment Pending']")
    WebElement PaymentStatus;
    @FindBy(xpath = "//div[@title=\"Payment Complete\"]")
    WebElement PaymentStatusSelect;
    @FindBy(xpath = "//input[@id='Motor_paymentCompleteDate']")
    WebElement PCDDate;
    @FindBy(xpath = "//input[@id='Motor_paymentVerified']/ancestor::span[contains(@class,'ant-checkbox')]")
    WebElement PaymentVerified;
    @FindBy(xpath = "//span[text()='Pending']")
    WebElement IssuanceStatus;
    @FindBy(xpath = "//div[@title=\"Issued\"]")
    WebElement IssuanceStatusSelect;
    @FindBy(xpath = "//input[@id='Motor_policyIssuanceDate']")
    WebElement PolicyIssuanceDate;

    @FindBy(xpath = "//input[@id=\"pi-policyNumber\"]")
    WebElement PolicyNumber;
    By UploadDocument = By.xpath("//input[@type='file']");
    @FindBy(xpath = "//input[@value='POLICY']/ancestor::label")
    WebElement DocumentType;
    @FindBy(xpath = "//button[text()=\"OK\"]")
    WebElement Done;
    @FindBy(xpath = "//button[text()=\"Save Issuance\"]")
    WebElement SaveIssuance;
    @FindBy(xpath = "//input[@name=\"policyDetailsId\"]")
    WebElement PolicyDetailsId;
    @FindBy(xpath = "//span[text()='MIS']")
    WebElement MIS;
    @FindBy(xpath = "//input[@placeholder=\"Search by Policy No. or Registration No. (min. 4 chars)\"]")
    WebElement searchBoxMIS;
    @FindBy(xpath = "//button[@aria-label=\"Close\"]")
    WebElement closeMIS;
    @FindBy(xpath = "//img[@src=\"/ninja-v2/static/media/edit-outline.0fa8510ad152c0aa72bc65d4c283eadd.svg\"]")
    WebElement editMIS;
    @FindBy(xpath = "//span[@title=\"Issued\"]")
    WebElement potentialDuplicate;
    @FindBy(xpath = "//div[text()='Junk']")
    WebElement Junk;
    @FindBy(xpath = "//button[text()=\"Save Sale\"]")
    WebElement SaveSale;
    @FindBy(xpath = "//input[@id=\"opsDetail.comments\"]")
    WebElement commentsBox;

    Ninja_Login login;


    public void upload_GCV() throws InterruptedException, IOException {
        LogUtils.info("########## CV Upload flow started ##########");
        Actions act = new Actions(driver);
        Thread.sleep(3000);
        TestUtil.click(Quote, "Quote request clicked");
        TestUtil.click(AllQuote, "All quote clicked");
        TestUtil.click(GetQuote, "Get quote clicked");
        TestUtil.click(Dp, "Dp clicked");
        if (TestBase.env.equals("sanity")) {
            TestUtil.sendKeys(Dp, "test shubham", "Dp name entered");
            act.sendKeys(Keys.BACK_SPACE).build().perform();
            TestUtil.click(DpSan, "Test user cliked");
        } else if (TestBase.env.equals("prod")) {
            TestUtil.sendKeys(Dp, "mr automation", "Dp name entered");
            act.sendKeys(Keys.BACK_SPACE).build().perform();
            TestUtil.click(Sneha, "Test user cliked");
        }
        Thread.sleep(3000);
        act.moveToElement(Verticle).click().build().perform();
        TestUtil.click(CV, "CV clicked");
        TestUtil.JsClick(CVUpld, "Cv Upload clicked");
        Thread.sleep(3000);
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Create, "Create quote clicked");
        Thread.sleep(2000);
        FileUpload.sendKeys("/home/ubuntu/storage/GCVAutomated.pdf"); ///Only for jenkins
        Thread.sleep(1000);
        /// Added presence of elemnt here to upload a file so created new method in util and for presence of element it require BY element
        /// it doesn't work with web element so upload file is By element
//        if (TestBase.MethodName.equals("QIS_GCV_Automatic")) {
//        TestUtil.ElementPresent(uploadFile, "/Users/surajgarud/Downloads/GCV Automated.pdf", "File uploaded");
//        }
//        if (TestBase.MethodName.equals("OD_Discount_Flow")) {
//            TestUtil.ElementPresent(uploadFile, "/Users/surajgarud/Downloads/GCV_ MH14GU1188_PYP.pdf", "File uploaded");
//        }
        TestUtil.click(eye, "View policy");
        Thread.sleep(3000);
        TestUtil.click(close, "Close clicked");
        Thread.sleep(3000);
        TestUtil.click(tag, "Add Tag clicked");
        TestUtil.click(previouspolicy, "Prevoius policy tag clicked");
        TestUtil.click(ok, "ok clicked");
        act.moveToElement(Verticle1).click().perform();
        Thread.sleep(3000);
        TestUtil.JsClick(vertSelect, "GCV selected");
        Thread.sleep(3000);
        act.moveToElement(Subctgr).click().perform();
        TestUtil.click(SchoolBus, "4 Wheeler Goods Carrying Vehicle selected");
        Thread.sleep(3000);
        TestUtil.getFullPageScreenShot();
        TestUtil.click(Continue, "Continue clicked");
        Thread.sleep(3000);
        lead.isDisplayed();
        TestUtil.sendKeys(lead, "Suraj Automation", "Lead clicked");
        TestUtil.click(RegistrationType, "Public type clicked");
        act.moveToElement(policyType).click().perform();
        TestUtil.click(type, "Comp type clicked");
        Thread.sleep(3000);
        TestUtil.click(ClaimFiled, "Yes claim filed clicked");

//        if (TestBase.MethodName.equals("OD_Discount_Flow")) {
//            act.moveToElement(PreferredInsurer).click().perform();
//            ((JavascriptExecutor) driver).executeScript(
//                    "arguments[0].scrollTop = arguments[0].scrollHeight;",
//                    SelectInsurer
//            );
//            TestUtil.click(SelectInsurer, "Kotak General Insurance insurer clicked");
//            TestUtil.click(SelectInsurerICICI, "ICICI Lombard insurer clicked");
//            act.sendKeys(Keys.ESCAPE).perform();
//            TestUtil.click(Submit, "Submit clicked");
//            Thread.sleep(3000);
//            TestUtil.getFullPageScreenShot();
//            TestUtil.waitUntilElementToBeVisible(requestId);
//            requestID = driver.findElement(requestId)
//                    .getText()
//                    .replace("Request ID:", "")
//                    .trim();
//        }
        if (TestBase.MethodName.equals("QIS_GCV_Automatic")) {
            Thread.sleep(3000);
            TestUtil.click(AddonsSwitch, "Add ons switch clicked");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
            wait.until(ExpectedConditions.visibilityOf(Addons));
            TestUtil.click(Addons, "Add ons clicked");
            Thread.sleep(3000);
            TestUtil.getScreenShot();
            act.moveToElement(ZeroDep).click().perform();
            Thread.sleep(3000);
            TestUtil.click(Save, "Save clicked");
            Thread.sleep(3000);
            TestUtil.getFullPageScreenShot();
            TestUtil.click(Submit, "Submit clicked");
            By frame = By.id("qis-results-iframe");
            TestUtil.fluentWait(frame, "Waiting for frame to get load");
            TestUtil.FrameSwitch(frame, "Switching to Frame");
            By detailBy = By.xpath("//a[text()='Details']");
            By okayBy = By.xpath("//span[normalize-space()='Okay']");

            LogUtils.info("⏳ Waiting for Details CTA (result page readiness)");
// 1️⃣ Result page readiness
            wait.until(ExpectedConditions.elementToBeClickable(detailBy));
            LogUtils.info("✅ Details CTA is clickable");

// 2️⃣ Optional OK popup handling
            LogUtils.info("⏳ Checking for optional OK popup");
            try {
                WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(4));
                WebElement ok = shortWait.until(
                        ExpectedConditions.elementToBeClickable(okayBy)
                );

                LogUtils.info("⚠️ OK popup appeared, clicking");
                TestUtil.JsClick(ok, "Ok clicked");

            } catch (TimeoutException e) {
                LogUtils.info("ℹ️ OK popup did not appear");
            }

// 3️⃣ Final stabilization
            LogUtils.info("⏳ Ensuring OK popup is not present anymore");
            wait.until(ExpectedConditions.invisibilityOfElementLocated(okayBy));
            LogUtils.info("✅ Result page stabilized, proceeding further");

            CV_Standalone_Comp auto = new CV_Standalone_Comp();
            auto.ValidateAddons();
            checkTriangleIcon();
            TestUtil.click(EnterValue, "Enter value clicked");
//            checkAddonsInEnterValueSection();
            List<String> availableAddons = checkAddonsInEnterValueSection();
            System.out.println("Available Addons List: " + availableAddons);
            if (availableAddons.contains("Zero Depreciation")) {
                TestUtil.sendKeys(PremiumAmount, "200", "ZD Premium amount entered");
            } else if (availableAddons.contains("Secure Towing")) {
                TestUtil.sendKeys(SecureTowingPremium, "200", "Secure Towing Premium amount entered");
            } else {
                System.out.println(
                        "Zero Depreciation is not available, so value is not entered"
                );
            }
//            TestUtil.sendKeys(PremiumAmount, "200", "ZD Premium amount entered");
            TestUtil.click(Submit, "Submit clicked");
            Thread.sleep(2000);
            TestUtil.getFullPageScreenShot();
            TestUtil.click(Buy, "Buy clicked");
            TestUtil.click(Confirm, "Confirm clicked");
            Thread.sleep(2000);
            TestUtil.getFullPageScreenShot();
        }
    }
    public void checkTriangleIcon() throws InterruptedException {

        System.out.println("\n========================================");
        System.out.println("     INSURER ADDON STATUS");
        System.out.println("========================================");

        Thread.sleep(2000);

        WebElement firstSection = driver.findElements(
                By.cssSelector("div[class*='quoteCard']")
        ).get(0);

        // Insurer name
        String insurerSrc = firstSection.findElement(
                By.cssSelector("img[alt='insurer-logo']")
        ).getAttribute("src");

        String insurerName = insurerSrc.substring(
                insurerSrc.lastIndexOf("/", insurerSrc.lastIndexOf("/") - 1) + 1,
                insurerSrc.lastIndexOf("/")
        );

        System.out.println("Insurer Name: " + insurerName);
        System.out.println("----------------------------------------");

        // Check all addon icons
        List<WebElement> addonIcons = firstSection.findElements(
                By.cssSelector("svg[class*='markIcu']")
        );

        for (WebElement icon : addonIcons) {

            WebElement row = icon.findElement(
                    By.xpath("./ancestor::div[contains(@class,'ant-flex-justify-space-between')][1]")
            );

            String addonName = row.findElement(
                    By.cssSelector("div[class*='addonName']")
            ).getText();

            String value = row.findElements(
                    By.cssSelector("div[class*='addonName']")
            ).size() > 1
                    ? row.findElements(By.cssSelector("div[class*='addonName']")).get(1).getText()
                    : "---";

            String color = icon.getAttribute("color");

            String parentClass = icon.findElement(
                    By.xpath("./parent::*")
            ).getAttribute("class");

            if ("#009F69".equalsIgnoreCase(color)) {

                System.out.println(
                        addonName + " is supported and value is available i.e. " + value
                );

            } else if (parentClass.contains("addedna")) {

                System.out.println(
                        addonName + " is not supported"
                );

            } else {

                System.out.println(
                        addonName + " is supported but value is not available"
                );
            }
        }

        System.out.println("========================================\n");
    }
    public List<String> checkAddonsInEnterValueSection() {

        System.out.println("\n========================================");
        System.out.println("     ENTER VALUE SECTION ADDONS");
        System.out.println("========================================");

        List<String> availableAddons = new ArrayList<>();

        List<WebElement> enterValueAddons = driver.findElements(
                By.xpath("//div[contains(@class,'premiumModal')]//span[starts-with(normalize-space(.),'For ')]")
        );

        for (WebElement addon : enterValueAddons) {

            String addonName = addon.getAttribute("textContent")
                    .replace("For ", "")
                    .trim();

            System.out.println(
                    addonName + " is available in Enter Value section"
            );

            availableAddons.add(addonName);
        }

        System.out.println("----------------------------------------");
        System.out.println("Available Addons List: " + availableAddons);
        System.out.println("========================================\n");

        return availableAddons;
    }
    public String getUniqueID() throws InterruptedException {
        WebCommands.staticSleep(3000);

        getUrl = driver.getCurrentUrl();
        System.out.println("page URl " + getUrl);

        String[] result = getUrl.split("result/");
        System.out.println("Order ID = " + result[1]);
        orderID = result[1];
        WebCommands.staticSleep(2000);
        return orderID;

    }

    public void Login_change() throws Exception {
        Thread.sleep(3000);
        TestUtil.JsClick(logout, "Logout clicked");
        Thread.sleep(10000);
        LogUtils.info("########## Ninja Ops Login started ##########");
        login.NinjaLogin("6999912345");
        LogUtils.info("########## Ninja Ops Login completed ##########");
    }

    public void Policy_Issunace_Form(String id) throws InterruptedException {
        Actions act = new Actions(driver);
        TestUtil.click(PolicyIssuance, "Policy issuance clicked");
        TestUtil.click(filter, "Filter clicked");
        TestUtil.click(ClearFilters, "Clear filter clicked");
        Thread.sleep(2000);
        TestUtil.sendKeys(searchBox, orderID, "Order ID entered in search box");
        Thread.sleep(2000);
        searchBox.sendKeys(Keys.RETURN);
        Thread.sleep(4000);
        WebElement clic = driver.findElement(By.xpath("//td[normalize-space()='" + id + "']"));
        TestUtil.click(clic, "Order ID verify clicked");
        Thread.sleep(2000);
        TestUtil.click(OWNbtn, "Clicked on OWN button");
        Thread.sleep(3000);
//        TestUtil.click(collapse, "Collapse clicked");
        TestUtil.sendKeys(proposerName, "Suraj", "Proposer name entered");
        TestUtil.sendKeys(proposerLastName, "Garud", "Proposer last name entered");
        TestUtil.sendKeys(proposerMobile, TestUtil.generateRandommobileNo(10), "Proposer mobile number entered");
        TestUtil.sendKeys(proposerEmail, "testuser@gmail.com", "Proposer email entered");
        TestUtil.click(vehicleSubType, "Vehicle sub type clicked");
        TestUtil.click(vehicleSubTypeSelect, "Tractor selected");
        grossVehicleWeight.click();
        grossVehicleWeight.sendKeys(Keys.COMMAND, "a");
        grossVehicleWeight.sendKeys(Keys.BACK_SPACE);
        TestUtil.sendKeys(grossVehicleWeight, "1500", "Gross vehicle weight entered");
        Thread.sleep(2000);
        TestUtil.click(RSDDate, "Policy start date clicked");
        Thread.sleep(2000);
        TestUtil.click(todayDate, "Today date selected");
        Thread.sleep(2000);
        TestUtil.click(REDDate, "Policy end date clicked");
        Thread.sleep(2000);
        TestUtil.click(tomorrowDate, "Tomorrow date selected");
        TestUtil.getScreenShot();
        TestUtil.sendKeys(TransactionNo, TestUtil.getRandomTransactionNo(), "Transaction number entered");
        Thread.sleep(3000);
        act.moveToElement(PaymentStatus).click().perform();
        TestUtil.click(PaymentStatusSelect, "Payment status completed selected");
        TestUtil.click(PCDDate, "Payment complete date clicked");
        TestUtil.click(todayPCDDate, "Today date selected");
        Thread.sleep(2000);
        TestUtil.click(PaymentVerified, "Payment verified clicked");
        Thread.sleep(3000);
        act.moveToElement(IssuanceStatus).click().perform();
        TestUtil.click(IssuanceStatusSelect, "Issuance status issued selected");
        TestUtil.click(PolicyIssuanceDate, "Policy issuance date clicked");
        TestUtil.click(todayIssuanceDate, "Today date selected");
        FileUpload.sendKeys("/home/ubuntu/storage/PCVAutomaticRequest.pdf");
//      TestUtil.ElementPresent(UploadDocument, "/Users/surajgarud/Downloads/PCV Automatic Request.pdf", "File uploaded");
        TestUtil.click(DocumentType, "Document type clicked");
        TestUtil.click(Done, "Ok clicked");
        Thread.sleep(2000);
        TestUtil.sendKeys(PolicyNumber, TestUtil.generateRandomPolicyNo(12), "Policy number entered");
        TestUtil.getScreenShot();
        Thread.sleep(3000);
        TestUtil.click(SaveIssuance, "Save issuance clicked");
        Thread.sleep(3000);
        MIS_ID = PolicyDetailsId.getAttribute("value");
        System.out.println("MIS ID is : " + MIS_ID);
        TestUtil.getScreenShot();
    }

    public void MIS_Cancelled(String url) throws InterruptedException {
        TestUtil.click(MIS, "MIS clicked");
        TestUtil.sendKeys(searchBoxMIS, MIS_ID, "MIS ID entered in search box");
        searchBoxMIS.sendKeys(Keys.RETURN);
        WebElement clic = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//td[normalize-space()='" + MIS_ID + "']")
                ));
        TestUtil.click(clic, "MIS ID verify clicked");
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        try {
            if (closeMIS.isDisplayed())
                TestUtil.click(closeMIS, "MIS clicked");
        } catch (Exception e) {
            System.out.println("No popup shown in MIS");
        }

        TestUtil.click(editMIS, "Edit MIS clicked");
        Thread.sleep(3000);
        TestUtil.click(potentialDuplicate, "Potential duplicate clicked");
        TestUtil.click(Junk, "Junk clicked");
        TestUtil.sendKeys(commentsBox, "Automation test - junked", "Comments entered");
        TestUtil.click(SaveSale, "Save sale clicked");
        Thread.sleep(3000);
        TestUtil.getScreenShot();
        driver.get(url);
        Thread.sleep(2000);
        TestUtil.click(logout, "Logout clicked");
        while (true) {
            try {
                Thread.sleep(2000);
                if (WelcomeToNinja.isDisplayed()) {
                    LogUtils.info("User Logged Out");
                    break;
                }
            } catch (NoSuchElementException e) {
                LogUtils.info("Logout is Visible clickikng logout");
                TestUtil.click(logout, "Logout clicked");
                Thread.sleep(2000);
            }
        }

    }


}
