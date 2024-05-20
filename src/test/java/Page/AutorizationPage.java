package Page;

import Base.BasicModel;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AutorizationPage extends BasicModel {

    @FindBy(xpath = "//*[@id='user-name']")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement passField;

    @FindBy(xpath = "//*[@id='login-button']")
    private WebElement submitButton;

    public AutorizationPage(WebDriver driver) {
        super(driver);
    }

    public AutorizationPage inputLogin() {
        Allure.step("Autorization");
        Allure.step("Заполнение поля логина");
        getWait2().until(ExpectedConditions.visibilityOf(loginField)).sendKeys("standard_user");
        return this;
    }
    public AutorizationPage inputPassword() {
        Allure.step("Заполнение поля пароля");
        getWait2().until(ExpectedConditions.visibilityOf(passField)).sendKeys("secret_sauce");
        return this;
    }
    public GoodsPage clickSubmit() {
        Allure.step("Клик по клавише Login (Submit)");
        getWait2().until(ExpectedConditions.visibilityOf(submitButton)).click();
        return new GoodsPage(getDriver());
    }

    public WebElement login1Field = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='user-name']")));
    public WebElement pass1Field = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password']")));
    public WebElement submit1Button = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login-button']")));
}
