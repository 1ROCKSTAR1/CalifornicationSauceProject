package Page;

import Base.BasicModel;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AutorizationPage extends BasicModel {
    public AutorizationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement loginField = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='user-name']")));

    public AutorizationPage inputLogin() {
        Allure.step("Заполнение поля логина");
        loginField.sendKeys("standard_user");
        return this;
    }
    public AutorizationPage inputPassword() {
        Allure.step("Заполнение поля пароля");
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password']"))).sendKeys("secret_sauce");
        return this;
    }
    public AutorizationPage clickSubmit() {
        Allure.step("Клик по клавише Login (Submit)");
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login-button']"))).click();
        return this;
    }
}
