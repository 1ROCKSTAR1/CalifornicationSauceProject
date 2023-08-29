package Test;

import base.BaseTest;
import model.GoodsPage;
import model.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
// ДАННЫЕ ТЕСТЫ ПРОВЕРЯЮТ НАЛИЧИЕ КАЖДОГО ТОВАРА НА СТРАНИЦЕ И КОРРЕКТНОСТЬ ЗАГОЛОВКА ТОВАРА
public class AllGoodsPageTest extends BaseTest {

    @Test
    public void bikeLightHeaderTextTest() {

        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());

        Assert.assertEquals(goodsPage.bikeLightItem, "Sauce Labs Bike Light");
    }

    @Test
    public void backPackHeaderTextTest() {

        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());

        Assert.assertEquals(goodsPage.backPackItem, "Sauce Labs Backpack");
    }

    @Test
    public void boltTshirtHeaderTextTest() {

        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());

        Assert.assertEquals(goodsPage.boltShirtItem, "Sauce Labs Bolt T-Shirt");
    }

    @Test
    public void fleeceJacketHeaderTextTest() {

        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());

        Assert.assertEquals(goodsPage.fleeceJacketItem, "Sauce Labs Fleece Jacket");
    }

    @Test
    public void whiteShirtHeaderTextTest() {

        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());

        Assert.assertEquals(goodsPage.whiteShirtItem, "Sauce Labs Onesie");
    }

    @Test
    public void hoodyHeaderTextTest() {

        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());

        Assert.assertEquals(goodsPage.hoodyItem, "T-Shirt (Red)");
    }
}
