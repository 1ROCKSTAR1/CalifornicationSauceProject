package base;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class BaseTest {
    private WebDriverWait wait2;
    private WebDriverWait wait5;
    private WebDriver driver;
    private static final String BASE_URL = "https://www.saucedemo.com/";

    @BeforeMethod(description = "Browser startUp")
    protected void beforeMethod() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*", "--headless", "--window-size=1920,1080", "--incognito");
        driver = new ChromeDriver(chromeOptions);
        getDriver().get(BASE_URL);
    }

    @AfterMethod
    protected void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            takeScreenshotOnFailure(result.getName());
        }
        if (driver != null) {
            driver.quit();
        }
    }
    protected WebDriver getDriver() {
        return driver;
    }
    protected WebDriverWait getWait2() {
        if (wait2 == null) {
            wait2 = new WebDriverWait(getDriver(), Duration.ofSeconds(2));
        }
        return wait2;
    }
    protected WebDriverWait getWait5() {
        if (wait5 == null) {
            wait5 = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        }
        return wait5;
    }

    public void takeScreenshotOnFailure(String testName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            Allure.getLifecycle().addAttachment(testName, "image/png", ".png", screenshot);
            System.out.println("✅ Screenshot taken for: " + testName);
        } catch (Exception e) {
            System.err.println("❌ Failed to take screenshot: " + e.getMessage());
        }
    }
}