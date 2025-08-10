package base;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestUtils {

    public static void autorize(BaseTest baseTest) {

        WebElement loginField = baseTest.getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='user-name']")));
        WebElement passField = baseTest.getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password']")));
        WebElement submitButton = baseTest.getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login-button']")));

        Allure.step("Autorization");
        loginField.sendKeys("standard_user");
        passField.sendKeys("secret_sauce");
        submitButton.click();
    }
}
