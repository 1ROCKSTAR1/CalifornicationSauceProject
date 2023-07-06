package Test;

import base.BaseTest;
import model.GoodsPage;
import model.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoodsPageCardTest extends BaseTest {

    @Test
    public void backPackAddToCartTest() {
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());
        goodsPage.addToCardBackPackButton();
        Assert.assertTrue(goodsPage.backPackRemoveButton.isDisplayed());
    }

    @Test
    public void bikeLightAddToCartTest() {
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());
        goodsPage.addToCardBikeLightButton();
        Assert.assertTrue(goodsPage.bikeLightRemoveButton.isDisplayed());
    }
    @Test
    public void boltShirtAddToCartTest() {
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());
        goodsPage.addToCardBoltShirtButton();
        Assert.assertTrue(goodsPage.boltShirtRemoveButton.isDisplayed());
    }
    @Test
    public void fleeceJacketAddToCartTest() {
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());
        goodsPage.addToCardFleeceJacketButton();
        Assert.assertTrue(goodsPage.fleeceJacketRemoveButton.isDisplayed());
    }
    @Test
    public void whiteShirtAddToCartTest() {
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());
        goodsPage.addToCardWhiteShirtButton();
        Assert.assertTrue(goodsPage.whiteShirtRemoveButton.isDisplayed());
    }
    @Test
    public void hoodyAddToCartTest() {
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());
        goodsPage.addToCardHoodyButton();
        Assert.assertTrue(goodsPage.hoodyRemoveButton.isDisplayed());
    }
}