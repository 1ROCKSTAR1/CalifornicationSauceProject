package Test;

import Page.*;
import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EveryGoodTest extends BaseTest {
    // ДАННЫЕ ТЕСТЫ ПРОВЕРЯЮТ СУЩЕСТВОВАНИЕ УНИКАЛЬНОЙ ТОВАРУ СТРАНИЦЫ А ТАК ЖЕ ПАРВИЛЬНОСТЬ ЗАГОЛОВКА И ОПИСАНИЯ

    @Epic(value = "Goods tests")
    @Feature(value = "Behavior + headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Bike Light Page + the correctness of the description of this product.")
    @Test(priority = 1, description = "Bike Light Check Page")
    public void bikeLightPageTextTest() {

        AutorizationPage loginPage = new AutorizationPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());
        goodsPage.clickOnBikeLight();

        BikeLightPage bikeLightPage = new BikeLightPage(getDriver());

        Assert.assertEquals(bikeLightPage.bikeLightItem, "Sauce Labs Bike Light");
        Assert.assertEquals(bikeLightPage.bikeLightDesc, "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Behavior + headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Backpack + the correctness of the description of this product.")
    @Test(priority = 1, description = "Backpack Check Page")
    public void backPackPageTextTest() {
        AutorizationPage loginPage = new AutorizationPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());
        goodsPage.clickOnBackPack();

        BackPackPage backPackPage = new BackPackPage(getDriver());

        Assert.assertEquals(backPackPage.backPackItem, "Sauce Labs Backpack");
        Assert.assertEquals(backPackPage.backPackDesc, "Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Behavior + headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the T-Shirt + the correctness of the description of this product.")
    @Test(priority = 1, description = "T-Shirt Check Page")
    public void boltShirtPageTextTest() {

        AutorizationPage loginPage = new AutorizationPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());
        goodsPage.clickOnBoltShirt();

        BoltShirtPage boltShirtPage = new BoltShirtPage(getDriver());

        Assert.assertEquals(goodsPage.boltShirtItem, "Sauce Labs Bolt T-Shirt");
        Assert.assertEquals(boltShirtPage.boltShirtDesc, "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Behavior + headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Fleece jacket + the correctness of the description of this product.")
    @Test(priority = 1, description = "Fleece Jacket Check Page")
    public void fleeceJacketPageTextTest() {

        AutorizationPage loginPage = new AutorizationPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());
        goodsPage.clickOnFleeceJacket();

        FleeceJacketPage fleeceJacketPage = new FleeceJacketPage(getDriver());

        Assert.assertEquals(fleeceJacketPage.fleeceJacketItem, "Sauce Labs Fleece Jacket");
        Assert.assertEquals(fleeceJacketPage.fleeceJacketDesc, "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Behavior + headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Onesie + the correctness of the description of this product.")
    @Test(priority = 1, description = "Onesie Check Page")
    public void whiteShirtPageTextTest() {

        AutorizationPage loginPage = new AutorizationPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());
        goodsPage.clickOnWhiteShirt();

        WhiteShirtPage whiteShirtPage = new WhiteShirtPage(getDriver());

        Assert.assertEquals(whiteShirtPage.whiteShirtItem, "Sauce Labs Onesie");
        Assert.assertEquals(whiteShirtPage.whiteShirtDesc, "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Behavior + headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the T-Shirt RED + the correctness of the description of this product.")
    @Test(priority = 1, description = "T-Shirt RED Check Page")
    public void hoodyPageTextTest() {

        AutorizationPage loginPage = new AutorizationPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());
        goodsPage.clickOnHoodyItem();

        HoodyPage hoodyPage = new HoodyPage(getDriver());

        Assert.assertEquals(hoodyPage.hoodyPageItem, "T-Shirt (Red)");
        Assert.assertEquals(hoodyPage.hoodyPageDesc,"This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.");
    }
}