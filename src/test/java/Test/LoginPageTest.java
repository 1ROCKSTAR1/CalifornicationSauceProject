package Test;

import model.GoodsPage;
import model.LoginPage;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
// ДАННЫЕ ТЕСТЫ ПРОВЕРЯЮТ АВТОРИЗАЦИЮ
public class LoginPageTest extends BaseTest {

    String AfterLoginHeader = "Swag Labs";

    @Test
    public void enterTest() {

    WebElement loginField = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='user-name']")));
    WebElement passField = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password']")));
    WebElement submitButton = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login-button']")));

    loginField.sendKeys("standard_user");
    passField.sendKeys("secret_sauce");
    submitButton.click();

    String afterLoginHeaderString = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='app_logo']"))).getText();

    Assert.assertEquals(afterLoginHeaderString,AfterLoginHeader);
    }

    @Test // ИСП. PAGE OBJECT
    public void enter2Test() {

        final String AfterLoginHeader = "Swag Labs";
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());
        Assert.assertEquals(goodsPage.afterLoginHeaderString,AfterLoginHeader);
    }
}
