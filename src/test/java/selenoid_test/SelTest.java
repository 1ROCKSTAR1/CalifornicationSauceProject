package selenoid_test;

import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.AutorizationPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SelTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        options.setBrowserVersion("latest");

        // Selenoid capabilities
        // Добавим аргументы для стабильной работы в контейнере
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        //options.addArguments("--headless"); // Можно попробовать headless для скорости
        options.addArguments("--window-size=1920,1080");

        // Вернем базовые selenoid options
        Map<String, Object> selenoidOptions = new HashMap<>();
        selenoidOptions.put("enableVNC", false);
        selenoidOptions.put("enableVideo", false);
        selenoidOptions.put("enableLog", true);
        selenoidOptions.put("sessionTimeout", "5m");

        options.setCapability("selenoid:options", selenoidOptions);

        // Connect to Selenoid
        driver = new RemoteWebDriver(new URL(
                "http://host.docker.internal:4444/wd/hub"),
                options);
    }

    @Epic(value = "E2E tests")
    @Feature(value = "Buying an item")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Buying an item. From an autorization to an order. NEGATIVE.")
    @Test(priority = 1, description = "Checking of creating an order. CHAINS")
    public void buyBackPack() {

        String finishBuyHeader = new AutorizationPage(driver)
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .clickOnBackPack()
                .addBackPackToCart()
                .clickBackPackCartIcon()
                .clickCheckoutButton()
                .fillThefirstNameField()
                .fillThelastNameField()
                .fillThepostCodeField()
                .clickOnsumbitButton()
                .checkoutHeaderStringCheck()
                .checkPaymentInfo()
                .checkShipInfo()
                .checkPrice()
                .finishButtonClick()
                .getFinishBuyHeader();

        Assert.assertEquals(finishBuyHeader,"Thank you for order!");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
