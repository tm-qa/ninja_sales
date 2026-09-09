package NinjaLogin;


import com.qa.turtlemint.pages.NINJA.Ninja_Login;
import com.qa.turtlemint.base.TestBase;

import com.qa.turtlemint.pages.grow.*;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import util.iTestListener;

import java.lang.reflect.Method;
@Listeners(iTestListener.class)
@Test(groups = {"Full_suite"})
public class ninjaLogin extends TestBase {
    public ninjaLogin() {
        super();
    }

    Calculator calculator;
    CV_Standalone_Comp cv;
    TestUtil util;
    GCV_QIS_Automatic upload;

    PCV_QIS_Automatic pcv;
    Ninja_Login login;
    MISCD_QIS_Automatic miscd;
    CV_Standalone_TP tp;

    String url;

    @BeforeMethod
    public void start(Method method) throws Exception {
        TestBase.MethodName = method.getName();
        initialization();
        calculator = new Calculator();
        cv = new CV_Standalone_Comp();
        util = new TestUtil();
        upload = new GCV_QIS_Automatic();
        pcv = new PCV_QIS_Automatic();
        login = new Ninja_Login();
        miscd = new MISCD_QIS_Automatic();
        tp = new CV_Standalone_TP();
        driver.get(System.getProperty("ninjaurl"));
//        driver.get(prop.getProperty("URL"));
        Thread.sleep(2000);
        login.NinjaLogin();
        url = driver.getCurrentUrl();
    }



    @Test(priority = 1, description = "Request manual quote on standalone journey")
    public void Roll_GCVStandalone() throws Exception {
        cv.cvFlow();
        String id = upload.getUniqueID();
        driver.get(url);
        upload.Login_change();
        cv.QuoteRequest(id, url);
    }

    @Test(priority = 2, description = "SalesPro_GCV_QIS_Automatic_Request")
    public void QIS_GCV_Automatic() throws Exception {
        upload.upload_GCV();
        String id = upload.getUniqueID();
        driver.get(url);
        upload.Login_change();
        upload.Policy_Issunace_Form(id);
        driver.get(url);
        upload.MIS_Cancelled(url);
    }

    @Test(priority = 3, description = "QIS_PCV_Automatic")
    public void QIS_PCV_Automatic() throws Exception {
        pcv.upload_PCV();
        String id = upload.getUniqueID();
        driver.get(url);
        upload.Login_change();
        cv.QuoteRequest(id, url);
    }

    @Test(priority = 4, description = "QIS_MISCD_Automatic")
    public void QIS_MISCD_Automatic() throws Exception {
        miscd.uplod_MISCD();
        String id = upload.getUniqueID();
        driver.get(url);
        upload.Login_change();
        cv.QuoteRequest(id, url);
    }

    @Test(priority = 5, description = "Cv_Standalone_TP")
    public void GCV_Stand_TP() throws Exception {
        tp.TP_standalone();
        cv.ValidateAddons();
    }
    @AfterMethod
    public void close() {
        driver.quit();
    }

//    @AfterClass
//    public void Screenshot() throws SlackApiException, IOException, InterruptedException {
//        AllureServeAndSlackScreenshot a = new AllureServeAndSlackScreenshot();
//        a.allureToSlack("Cv Calculator Suite Report");
//    }
}

