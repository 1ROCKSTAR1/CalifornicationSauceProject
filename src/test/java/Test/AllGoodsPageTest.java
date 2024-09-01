package Test;

import Base.BaseTest;
import Page.GoodsPage;
import Page.AutorizationPage;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
// ДАННЫЕ ТЕСТЫ ПРОВЕРЯЮТ НАЛИЧИЕ КАЖДОГО ТОВАРА НА СТРАНИЦЕ И КОРРЕКТНОСТЬ ЗАГОЛОВКА ТОВАРА
// THESE TESTS CHECK EXISTING OF EVERY GOOD ON THE PAGE AND A GOOD'S HEADER CORRECTNESS

public class AllGoodsPageTest extends BaseTest {

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Bike Light + the correctness of the description of this product.")
    @Test(priority = 1, description = "Bike Light Main Page's Check")
    public void bikeLightHeaderTextTest() {

        GoodsPage goodsPage = new AutorizationPage(getDriver())
                .inputLogin()
                .inputPassword()
                .clickSubmit();

        Allure.step("Checking");
        Assert.assertEquals(goodsPage.bikeLightItem, "Sauce Labs Bike Light");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Backpack + the correctness of the description of this product.")
    @Test(priority = 2, description = "Backpack Main Page's Check")
    public void backPackHeaderTextTest() {

        GoodsPage goodsPage = new AutorizationPage(getDriver())
                .inputLogin()
                .inputPassword()
                .clickSubmit();

        Allure.step("Checking");
        Assert.assertEquals(goodsPage.backPackItem, "Sauce Labs Backpack");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the T-Shirt + the correctness of the description of this product.")
    @Test(priority = 3, description = "T-Shirt Main Page's Check")
    public void boltTshirtHeaderTextTest() {

        GoodsPage goodsPage = new AutorizationPage(getDriver())
                .inputLogin()
                .inputPassword()
                .clickSubmit();

        Allure.step("Checking");
        Assert.assertEquals(goodsPage.boltShirtItem, "Sauce Labs Bolt T-Shirt");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Fleece jacket + the correctness of the description of this product.")
    @Test(priority = 4, description = "Fleece jacket Main Page's Check")
    public void fleeceJacketHeaderTextTest() {

        GoodsPage goodsPage = new AutorizationPage(getDriver())
        .inputLogin()
        .inputPassword()
        .clickSubmit();

        Allure.step("Checking");
        Assert.assertEquals(goodsPage.fleeceJacketItem, "Sauce Labs Fleece Jacket");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Onesie + the correctness of the description of this product.")
    @Test(priority = 5, description = "Onesie Main Page's Check")
    public void whiteShirtHeaderTextTest() {

        GoodsPage goodsPage = new AutorizationPage(getDriver())
                .inputLogin()
                .inputPassword()
                .clickSubmit();

        Allure.step("Checking");
        Assert.assertEquals(goodsPage.whiteShirtItem, "Sauce Labs Onesie");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the T-Shirt RED + the correctness of the description of this product.")
    @Test(priority = 6, description = "T-Shirt RED Main Page's Check")
    public void hoodyHeaderTextTest() {

        GoodsPage goodsPage = new AutorizationPage(getDriver())
                .inputLogin()
                .inputPassword()
                .clickSubmit();

        Allure.step("Checking");
        Assert.assertEquals(goodsPage.hoodyItem, "T-Shirt (Red)");
    }
}
