package model;

import model.base.BasicModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasicModel {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void inputLogin(String login) {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='user-name']"))).sendKeys(login);
    }
    public void inputPassword(String password) {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password']"))).sendKeys(password);
    }
    public void clickSubmit() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login-button']"))).click();
    }
}
