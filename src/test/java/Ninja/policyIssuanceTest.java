package Ninja;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.NINJA.*;
import com.qa.turtlemint.pages.grow.Calculator;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
@Test(groups = {"policyIssuanceTest","Sales"})
public class policyIssuanceTest extends TestBase {
    public policyIssuanceTest() {
        super();
    }

    Calculator calculator;
    TestUtil util;
    Ninja_Login login;
    policy_issuance PI;
    issue_with_my_quote IQ;
    branch_issuance BI;
    mis MI;
    String url;

    @BeforeClass
    public void start() throws Exception {
        initialization();
        calculator = new Calculator();
        util = new TestUtil();
        login = new Ninja_Login();
        PI = new policy_issuance();
        IQ = new issue_with_my_quote();
        BI = new branch_issuance();
        MI = new mis();
        driver.get(System.getProperty("ninjaurl"));
        login.NinjaLogin("6999123456");
        url = driver.getCurrentUrl();
//        calculator.login(prop.getProperty("EMAIL"), prop.getProperty("PASSWORD"));
    }

    @BeforeMethod
    public void less() throws Exception {
        driver.get(url);

    }


    @Test(description = "FW Issue with my Quote Journey")
    public void fwIssueWithMyQuoteVerify() throws Exception {
        PI.policyIssuance();
        PI.getPolicyIssued();
        String requestId = IQ.fwIssueWithMyQuote();
        System.out.println("Request ID captured: " + requestId);
        PI.OpsLogin();
        login.NinjaLogin("6999912345");
        PI.policyIssuance();
        PI.SearchRequestAndCancel(requestId);
    }
    @Test(description = "TW Report A Sale Journey")
    public void reportASaleVerify() throws Exception {
        PI.policyIssuance();
        PI.reportASale();
        String MISid = BI.branchIssuanceForm();
        System.out.println("MIS ID captured: " + MISid);
        PI.OpsLogin();
        login.NinjaLogin("6999912345");
        PI.MIS();
        MI.SearchRequestAndCancel(MISid);
    }


    @AfterClass
    public void close() {
        driver.quit();
    }
}
