package Test;

import Page.GoodsPage;
import Page.AutorizationPage;
import Base.BaseTest;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


// ДАННЫЕ ТЕСТЫ ПРОВЕРЯЮТ АВТОРИЗАЦИЮ
public class LoginPageTest extends BaseTest {

    String AfterLoginHeader = "Swag Labs";

    @Epic(value = "Basic checking")
    @Feature(value = "Autorization")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks a basic autorization without PageObject.")
    @Test(priority = 1, description = "Checking a basic autorization without POM.")
    public void enterTest() {

    WebElement loginField = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='user-name']")));
    WebElement passField = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password']")));
    WebElement submitButton = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login-button']")));

    Allure.step("Autorization");
    loginField.sendKeys("standard_user");
    passField.sendKeys("secret_sauce");
    submitButton.click();

    String afterLoginHeaderString = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='app_logo']"))).getText();

    Allure.step("Checking that main page is existed");
    Assert.assertEquals(afterLoginHeaderString,AfterLoginHeader);
    }

    @Epic(value = "Basic checking")
    @Feature(value = "Autorization")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks a basic autorization with PageObject model")
    @Test(priority = 2, description = "Checking a basic autorization with POM.")
    public void enter2Test() {

        final String AfterLoginHeader = "Swag Labs";
        AutorizationPage loginPage = new AutorizationPage(getDriver());

        Allure.step("Autorization");
        loginPage.inputLogin();
        loginPage.inputPassword();
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());
        Allure.step("Checking that main page is existed");
        Assert.assertEquals(goodsPage.getAfterLoginHeaderString(),AfterLoginHeader);
    }

    @Epic(value = "Basic checking")
    @Feature(value = "Autorization")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Проверка авторизации с использованием Page Object Model + Chains")
    @Test(description = "Авторизация с Chains")
    public void autorize2Test() {

        final String expectedGoodsHeader = "Swag Labs";

        Allure.step("Autorization");
        new AutorizationPage(getDriver())
                .inputLogin()
                .inputPassword()
                .clickSubmit();

        String actualHeader = new GoodsPage(getDriver())
                .getAfterLoginHeaderString();
        Allure.step("Checking that main page is existed");
        Assert.assertEquals(actualHeader, expectedGoodsHeader);
    }
}
