//package com.qa.turtlemint.pages.grow;
//
//import com.qa.turtlemint.base.TestBase;
//import com.slack.api.Slack;
//import com.slack.api.methods.MethodsClient;
//import com.slack.api.methods.SlackApiException;
//import com.slack.api.methods.request.files.FilesUploadV2Request;
//import com.slack.api.methods.response.files.FilesUploadV2Response;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.nio.file.Files;
//import java.util.Collections;
//import static com.qa.turtlemint.util.Utils.getTimeStamp;
//
//public class AllureServeAndSlackScreenshot extends TestBase {
//
//    public void  allureToSlack(String name) throws IOException, InterruptedException, SlackApiException {
//        String allureResultsPath = "/Users/surajgarud/Documents/cv_calculator/target/allure-results";  // ✅ Update your exact path
//
//        String slackToken = "";
////        String slackChannel = "D05E07XUM8E";
////        String slackChannel = "GR5361T3N";    ///tm-qa
//        String slackChannel = "C09F6LTTNQ7";     ///self crearted channel
//        // Step 1: Run Allure serve command
//        ProcessBuilder pb = new ProcessBuilder("allure", "serve", allureResultsPath);
//        pb.redirectErrorStream(true);
//        Process process = pb.start();
//
//        // Step 2: Wait for server to start
//        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
//        String line;
//        String allureUrl = null;
//
//        while ((line = reader.readLine()) != null) {
//            System.out.println(line);
//            if (line.contains("Server started at <")) {
//                int start = line.indexOf("http");
//                int end = line.indexOf(">");
//                allureUrl = line.substring(start, end);
//                break;
//            }
//        }
//
//        if (allureUrl == null) {
//            System.err.println("❌ Failed to extract Allure report URL");
//            return;
//        }
//
//        System.out.println("✅ Allure report URL: " + allureUrl);
//
//        // Step 3: Launch browser and capture screenshot
//        WebDriver driver = new ChromeDriver();
//        driver.get(allureUrl+"#behaviors");
//        Thread.sleep(5000); // Wait for report to load
//
//        java.io.File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        java.io. File destFile = new java.io.File("allure_slack - "+getTimeStamp()+".png");
//
//
//        Files.copy(screenshot.toPath(), destFile.toPath());
//
//        //  driver.quit();
//
//        // Step 4: Send to Slack
//        uploadToSlack(slackToken, slackChannel, destFile,name);
//
//        driver.get(allureUrl);
//        Thread.sleep(2000);
//        java.io.File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        java.io. File dd = new java.io.File("allure_slack - "+getTimeStamp()+".png");
//        Files.copy(ss.toPath(), dd.toPath());
//        uploadToSlack(slackToken, slackChannel, dd, name);
//    }
//
//    private static void uploadToSlack(String token, String channelId, java.io.File file,String name)
//            throws IOException, SlackApiException {
//
//        Slack slack = Slack.getInstance();
//        MethodsClient methods = slack.methods(token);
//
//        FilesUploadV2Request.UploadFile uploadFile = new FilesUploadV2Request.UploadFile();
//        uploadFile.setFile(file);
//        uploadFile.setFilename(file.getName());
//        uploadFile.setTitle( name);
//        uploadFile.setAltTxt("Allure Screenshot");
//
//        FilesUploadV2Request request = FilesUploadV2Request.builder()
//                .channel(channelId)
//                .uploadFiles(Collections.singletonList(uploadFile))
//                .build();
//
//        FilesUploadV2Response response = methods.filesUploadV2(request);
//        System.out.println("✅ Screenshot posted to Slack.");
//
//    }
//
//}
