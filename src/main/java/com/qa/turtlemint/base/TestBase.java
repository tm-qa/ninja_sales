//package com.qa.turtlemint.base;
//
//import com.qa.turtlemint.util.LogUtils;
//import com.qa.turtlemint.util.TestUtil;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.time.Duration;
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.logging.LogType;
//import org.openqa.selenium.logging.LoggingPreferences;
//
//import java.util.logging.Level;
//
//public class TestBase {
//
//    public static WebDriver driver;
//    public static Properties prop;
//    public static String MethodName;
//    public static String env;
//
//
//    public TestBase() {
//
//        try {
//            prop = new Properties();
//            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/qa/turtlemint/config/config.properties");
//            prop.load(ip);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public static void initialization() {
//        String browserName = prop.getProperty("browser");
//        LogUtils.info("Browser name: " + browserName);
//
//        if (browserName.equalsIgnoreCase("chrome")) {
//
//            ChromeOptions options = new ChromeOptions();
/// /            options.setBrowserVersion("124");
/// /            driver = new ChromeDriver(options);
//
//            options.setBinary("/opt/chrome145/chrome");
//
//            options.addArguments("--headless=new");
//            options.addArguments("--no-sandbox");
//            options.addArguments("--disable-dev-shm-usage");
//            options.addArguments("--disable-gpu");
//            options.addArguments("--remote-allow-origins=*");
//            options.addArguments("--disable-software-rasterizer");
//            options.addArguments("--disable-setuid-sandbox");
//            options.addArguments("--single-process");
//            options.addArguments("--no-zygote");
//            options.addArguments("--window-size=1920,1080");
//            options.addArguments("--disable-extensions");
//            options.addArguments("--disable-infobars");
//
//            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
//
//            driver = new ChromeDriver(options);
//
//            driver.manage().deleteAllCookies();
//
//            driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_time, TimeUnit.SECONDS);
//            driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
//            String url =System.getProperty("ninjaurl");
////            String url = prop.getProperty("URL");
//            if (url.contains(".sanity.")) {
//                env = "sanity";
//                System.out.println("Running Environment: " + env);
//            } else if (url.contains("turtlemintinsurance.com")) {
//                env = "prod";
//                System.out.println("Running Environment: " + env);
//            }
//            driver.get(System.getProperty("ninjaurl"));
////             driver.get(prop.getProperty("URL"));
//        }
//    }
//}
//
//

package com.qa.turtlemint.base;

import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;
    public static String MethodName;
    public static String env;

    public TestBase() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(
                    System.getProperty("user.dir") + "/src/main/java/com/qa/turtlemint/config/config.properties"
            );
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization() {
        String browserName = prop.getProperty("browser");
        LogUtils.info("Browser name: " + browserName);

        if (browserName.equalsIgnoreCase("chrome")) {

            ChromeOptions options = new ChromeOptions();

            // Jenkins Chrome Binary
            options.setBinary("/opt/chrome145/chrome");

            // Headless Configuration
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--window-size=1920,1080");

            String downloadPath = System.getProperty("user.dir");

            HashMap<String, Object> prefs = new HashMap<>();
            prefs.put("download.default_directory", downloadPath);
            prefs.put("download.prompt_for_download", false);
            prefs.put("download.directory_upgrade", true);
            prefs.put("safebrowsing.enabled", true);

            prefs.put("plugins.always_open_pdf_externally", true);

            prefs.put("profile.default_content_settings.popups", 0);
            prefs.put("profile.content_settings.exceptions.automatic_downloads.*.setting", 1);

            options.setExperimentalOption("prefs", prefs);

            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

            driver = new ChromeDriver(options);


            Map<String, Object> params = new HashMap<>();
            params.put("behavior", "allow");

            params.put("downloadPath", downloadPath);

            ((ChromeDriver) driver).executeCdpCommand("Page.setDownloadBehavior", params);

            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_time, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);

            driver.get(System.getProperty("url"));
            ////            String url = prop.getProperty("URL");
            String url = System.getProperty("ninjaurl");
            if (url.contains(".sanity.")) {
                env = "sanity";
                System.out.println("Running Environment: " + env);
            } else if (url.contains("turtlemintinsurance.com")) {
                env = "prod";
                System.out.println("Running Environment: " + env);
            }
            driver.get(System.getProperty("ninjaurl"));
//             driver.get(prop.getProperty("URL"));
        }
    }
}
