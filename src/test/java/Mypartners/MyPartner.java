package Mypartners;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.Mypartners.*;
import com.qa.turtlemint.pages.NINJA.Ninja_Login;
import com.qa.turtlemint.pages.grow.CVQuote;
import com.qa.turtlemint.pages.grow.CVUpload;
import com.qa.turtlemint.pages.grow.Calculator;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class MyPartner extends TestBase {
    public MyPartner() {
        super();
    }

    Calculator calculator;
    CVQuote cv;
    TestUtil util;
    CVUpload upload;
    Ninja_Login login;
    com.qa.turtlemint.pages.Mypartners.MyPartner commonUI;
    AllPartners allPartners;
    FollowUps followUps;
    Reportasale reportasale;

    Filter filter ;


    String url;


    @BeforeClass
    public void start() throws Exception {
        initialization();
        calculator = new Calculator();
        cv = new CVQuote();
        util = new TestUtil();
        upload = new CVUpload();
        login = new Ninja_Login();
        commonUI = new com.qa.turtlemint.pages.Mypartners.MyPartner();
        allPartners = new AllPartners();
        followUps = new FollowUps();
        reportasale = new Reportasale();
        filter = new Filter();
//        calculator.login(prop.getProperty("EMAIL"), prop.getProperty("PASSWORD"));
        driver.get(prop.getProperty("URL"));
        login.NinjaLogin();
        url = driver.getCurrentUrl();
    }

    @BeforeMethod
    public void loginless() throws Exception {
        driver.get(url);
    }

    @Test(priority = 1, description = "My Partners Journey")
    public void UI() throws InterruptedException, AWTException, IOException {
        commonUI.UI();
    }

    @Test(priority = 2, description = "All Partners Journey")
    public void AllPartners() throws InterruptedException, AWTException, IOException {
        allPartners.allpartners();
    }

    @Test(priority = 3, description = "Follow Ups Journey")
    public void FollowUps() throws InterruptedException, AWTException, IOException {
        followUps.folloups();
    }

    @Test(priority = 4, description = "Report a Sale Journey")
    public void Reportasale() throws InterruptedException, AWTException, IOException {
        reportasale.report();
    }

    @Test(priority = 5, description = "Filters Journey")
    public void Filters() throws InterruptedException, AWTException, IOException {
        filter.filters();
    }

    @AfterClass
    public void close() {
        driver.quit();
    }
}
