package com.qa.turtlemint.pages.NINJA;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.LogUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;

public class Ninja_Login extends TestBase {
    public static void setPlatformCookie(String value) {
        try {
            Cookie cookie = new Cookie
                    .Builder("PLATFORM", value)
//                    .domain(prop.getProperty("cookieDomain"))
                    .path("/")
                    .isHttpOnly(false)
                    .isSecure(false)
                    .build();

            driver.manage().deleteCookieNamed("PLATFORM");
            driver.manage().addCookie(cookie);

            LogUtils.info("Updated cookie PLATFORM = " + value);
        } catch (Exception e) {
            LogUtils.error("Failed to set cookie PLATFORM", e);
        }
    }



    public static void loginWithMobileAndOTP() {
        try {

            WebElement mobile = driver.findElement(By.xpath("//input[@placeholder=\"Enter Your Mobile Number\"]"));
//            mobile.sendKeys(prop.getProperty("loginMobile"));
            mobile.sendKeys("6999912345");

            driver.findElement(By.xpath("//form[@name=\"mobileNoForm\"]//button[text()=\"Continue\"]")).click();


            WebElement otp = driver.findElement(By.xpath("(//input[@ng-model=\"otp\"])[2]"));
//           otp.sendKeys(prop.getProperty("loginOtp"));
            otp.sendKeys("1234");

            driver.findElement(By.xpath("(//button[text()=\"Submit\"])[2]")).click();

            LogUtils.info("Login completed");
            Thread.sleep(5000);

        } catch (Exception e) {
            LogUtils.error("Login failed", e);
        }
    }

    public void NinjaLogin() throws Exception {
        //               driver.get("https://ninja.turtlemint.com/login");
//
//      //  driver.get(prop.getProperty("pmurl"));
//      //  driver.get(System.getProperty("ninjaurl"));

        setPlatformCookie("APP");
        driver.navigate().refresh();

        loginWithMobileAndOTP();

        setPlatformCookie("WEB_APP");
        driver.navigate().refresh();

//        public static String generateRandomString(int count) { /* ... */ return ""; }
//        public static long generateRandomMobileNumber() { /* ... */ return 0; }

    }
}
