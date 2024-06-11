package Base;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtils {

    public static void autorize(WebDriverWait getWait) {

        WebElement loginField = getWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='user-name']")));
        WebElement passField = getWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password']")));
        WebElement submitButton = getWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login-button']")));

        Allure.step("Autorization");
        loginField.sendKeys("standard_user");
        passField.sendKeys("secret_sauce");
        submitButton.click();
    }
}
