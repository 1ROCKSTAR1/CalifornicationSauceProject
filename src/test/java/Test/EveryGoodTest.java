package Test;

import Page.*;
import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EveryGoodTest extends BaseTest {
    // ДАННЫЕ ТЕСТЫ ПРОВЕРЯЮТ СУЩЕСТВОВАНИЕ УНИКАЛЬНОЙ ТОВАРУ СТРАНИЦЫ А ТАК ЖЕ ПРАВИЛЬНОСТЬ ЗАГОЛОВКА И ОПИСАНИЯ
    // THESE TESTS CHECK AN ORIGINAL GOOD'S PAGE EXISTING AND CORRECTNESS OF HEADER AND DESCRIPTION

    @Epic(value = "Goods tests")
    @Feature(value = "Behavior + headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Bike Light Page + the correctness of the description of this product.")
    @Test(priority = 1, description = "Bike Light Check Page")
    public void bikeLightPageTextTest() {

        BikeLightPage bikeLightPage = new AutorizationPage(getDriver())
            .inputLogin()
            .inputPassword()
            .clickSubmit()
            .clickOnBikeLight();

        Allure.step("Checking of item's title");
        Assert.assertEquals(bikeLightPage.bikeLightItem, "Sauce Labs Bike Light");

        Allure.step("Checking of item's description");
        Assert.assertEquals(bikeLightPage.bikeLightDesc, "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Behavior + headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Backpack + the correctness of the description of this product.")
    @Test(priority = 2, description = "Backpack Check Page")
    public void backPackPageTextTest() {

        BackPackPage backPackPage = new AutorizationPage(getDriver())
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .clickOnBackPack();

        Allure.step("Checking of item's title");
        Assert.assertEquals(backPackPage.getBackPackItem(), "Sauce Labs Backpack");

        Allure.step("Checking of item's description");
        Assert.assertEquals(backPackPage.getBackPackDesc(), "Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Behavior + headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the T-Shirt + the correctness of the description of this product.")
    @Test(priority = 3, description = "T-Shirt Check Page")
    public void boltShirtPageTextTest() {

        BoltShirtPage boltShirtPage = new AutorizationPage(getDriver())
            .inputLogin()
            .inputPassword()
            .clickSubmit()
            .clickOnBoltShirt();

        Allure.step("Checking of item's title");
        Assert.assertEquals(boltShirtPage.boltShirtItem, "Sauce Labs Bolt T-Shirt");

        Allure.step("Checking of item's description");
        Assert.assertEquals(boltShirtPage.boltShirtDesc, "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Behavior + headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Fleece jacket + the correctness of the description of this product.")
    @Test(priority = 4, description = "Fleece Jacket Check Page")
    public void fleeceJacketPageTextTest() {

        FleeceJacketPage fleeceJacketPage = new AutorizationPage(getDriver())
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .clickOnFleeceJacket();

        Allure.step("Checking of item's title");
        Assert.assertEquals(fleeceJacketPage.fleeceJacketItem, "Sauce Labs Fleece Jacket");

        Allure.step("Checking of item's description");
        Assert.assertEquals(fleeceJacketPage.fleeceJacketDesc, "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Behavior + headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Onesie + the correctness of the description of this product.")
    @Test(priority = 5, description = "Onesie Check Page")
    public void whiteShirtPageTextTest() {

        WhiteShirtPage whiteShirtPage = new AutorizationPage(getDriver())
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .clickOnWhiteShirt();

        Allure.step("Checking of item's title");
        Assert.assertEquals(whiteShirtPage.whiteShirtItem, "Sauce Labs Onesie");

        Allure.step("Checking of item's description");
        Assert.assertEquals(whiteShirtPage.whiteShirtDesc, "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Behavior + headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the T-Shirt RED + the correctness of the description of this product.")
    @Test(priority = 6, description = "T-Shirt RED Check Page")
    public void hoodyPageTextTest() {

        HoodyPage hoodyPage = new AutorizationPage(getDriver())
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .clickOnHoody();

        Allure.step("Checking of item's title");
        Assert.assertEquals(hoodyPage.hoodyPageItem, "T-Shirt (Red)");

        Allure.step("Checking of item's description");
        Assert.assertEquals(hoodyPage.hoodyPageDesc,"This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.");
    }
}