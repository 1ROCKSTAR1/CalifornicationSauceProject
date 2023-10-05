package Test;

import Base.BaseTest;
import Page.GoodsPage;
import Page.AutorizationPage;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
// ДАННЫЕ ТЕСТЫ ПРОВЕРЯЮТ НАЛИЧИЕ КАЖДОГО ТОВАРА НА СТРАНИЦЕ И КОРРЕКТНОСТЬ ЗАГОЛОВКА ТОВАРА
public class AllGoodsPageTest extends BaseTest {

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Bike Light + the correctness of the description of this product.")
    @Test(priority = 1, description = "Bike Light Main Page's Check")
    public void bikeLightHeaderTextTest() {

        AutorizationPage loginPage = new AutorizationPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());

        Assert.assertEquals(goodsPage.bikeLightItem, "Sauce Labs Bike Light");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Backpack + the correctness of the description of this product.")
    @Test(priority = 1, description = "Backpack Main Page's Check")
    public void backPackHeaderTextTest() {

        AutorizationPage loginPage = new AutorizationPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());

        Assert.assertEquals(goodsPage.backPackItem, "Sauce Labs Backpack");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the T-Shirt + the correctness of the description of this product.")
    @Test(priority = 1, description = "T-Shirt Main Page's Check")
    public void boltTshirtHeaderTextTest() {

        AutorizationPage loginPage = new AutorizationPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());

        Assert.assertEquals(goodsPage.boltShirtItem, "Sauce Labs Bolt T-Shirt");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Fleece jacket + the correctness of the description of this product.")
    @Test(priority = 1, description = "Fleece jacket Main Page's Check")
    public void fleeceJacketHeaderTextTest() {

        AutorizationPage loginPage = new AutorizationPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());

        Assert.assertEquals(goodsPage.fleeceJacketItem, "Sauce Labs Fleece Jacket");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Onesie + the correctness of the description of this product.")
    @Test(priority = 1, description = "Onesie Main Page's Check")
    public void whiteShirtHeaderTextTest() {

        AutorizationPage loginPage = new AutorizationPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());

        Assert.assertEquals(goodsPage.whiteShirtItem, "Sauce Labs Onesie");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the T-Shirt RED + the correctness of the description of this product.")
    @Test(priority = 1, description = "T-Shirt RED Main Page's Check")
    public void hoodyHeaderTextTest() {

        AutorizationPage loginPage = new AutorizationPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());

        Assert.assertEquals(goodsPage.hoodyItem, "T-Shirt (Red)");
    }
}
