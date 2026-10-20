package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Локейторы (заглушки)
    public By loginInput = By.id("user-name");
    By passwordInput = By.id("password");
    By loginButton = By.id("login-button");

    // Метод для проверки ошибки (предположим, что ошибка добавляет класс 'error' или меняет border-color)
    public boolean hasError(By locator) {
        return driver.findElement(locator).getAttribute("class").contains("error");
    }

    public LoginPage setLogin(String login) {
        driver.findElement(loginInput).clear();
        driver.findElement(loginInput).sendKeys(login);
        return this;
    }

    public LoginPage setPassword(String pass) {
        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(pass);
        return this;
    }

    public void clickSubmit() {
        driver.findElement(loginButton).click();
    }
}
