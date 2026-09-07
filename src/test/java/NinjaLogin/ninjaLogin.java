package NinjaLogin;


import com.qa.turtlemint.pages.NINJA.Ninja_Login;
import com.qa.turtlemint.base.TestBase;

import com.qa.turtlemint.pages.grow.CVQuote;
import com.qa.turtlemint.pages.grow.CVUpload;
import com.qa.turtlemint.pages.grow.Calculator;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.*;

import java.awt.*;
import java.io.IOException;

public class ninjaLogin extends TestBase {
    public ninjaLogin() {
        super();
    }

    Calculator calculator;
    CVQuote cv;
    TestUtil util;
    CVUpload upload;
    Ninja_Login login;
    String url;

    @BeforeClass
    public void start() throws Exception {
        initialization();
        calculator = new Calculator();
        cv = new CVQuote();
        util = new TestUtil();
        upload = new CVUpload();
        login = new Ninja_Login();
//        calculator.login(prop.getProperty("EMAIL"), prop.getProperty("PASSWORD"));
        driver.get(prop.getProperty("URL"));
        login.NinjaLogin();
        url = driver.getCurrentUrl();
    }

    @BeforeMethod
    public void loginless() throws Exception {
        driver.get(url);
    }


    @Test(priority = 1, description = "Standalone Journey")
    public void Standalone() throws InterruptedException, AWTException, IOException {
        cv.cvFlow();
    }

    @Test(priority = 2,description = "QIS_GCV")
    public void CvUpload() throws IOException, InterruptedException {
        upload.upload();
    }

    @AfterClass
    public void close() {
        driver.quit();
    }
}

