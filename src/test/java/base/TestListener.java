package base;

import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;



public class TestListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult result) {
        Object currentClass = result.getInstance();
        WebDriver driver = ((BaseTest) currentClass).getDriver();
        takeScreenshot(driver, result.getName());
        saveScreenshotToAllure(result.getName());
    }

    private void saveScreenshotToAllure(String screenshotName) {
        try {
            File screenshot = new File("./screenshots/" + screenshotName + ".png");
            if (screenshot.exists()) {
                byte[] screenshotContent = Files.readAllBytes(screenshot.toPath());
                Allure.getLifecycle().addAttachment(screenshotName, "image/png", ".png", screenshotContent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void takeScreenshot(WebDriver driver, String screenshotName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("./screenshots/" + screenshotName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
