package TestE2E;

import Base.BaseTest;
import Page.*;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyBackPackTest extends BaseTest {
    @Epic(value = "E2E tests")
    @Feature(value = "Buying an item")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Buying an item. From an autorization to an order")
    @Test(priority = 1, description = "Checking of creating an order.")
    public void buyBackPack() {

        Allure.step("Autorization");
        AutorizationPage loginPage = new AutorizationPage(getDriver());
        loginPage.inputLogin();
        loginPage.inputPassword();
        loginPage.clickSubmit();

        Allure.step("Go to the Product's page");
        GoodsPage goodsPage = new GoodsPage(getDriver());
        goodsPage.clickOnBackPack();

        Allure.step("Go to the Backpack's page");
        BackPackPage backPackPage = new BackPackPage(getDriver());
        backPackPage.addBackPackToCart.click();
        backPackPage.backPackCartIcon.click();

        Allure.step("Go to the cart");
        YourCartPage yourCartPage = new YourCartPage(getDriver());
        yourCartPage.checkoutButton.click();

        Allure.step("Go the the buyer's info page + filling the fields");
        BuyInformationPage buyInformationPage = new BuyInformationPage(getDriver());
        buyInformationPage.firstNameField.sendKeys("Tom");
        buyInformationPage.lastNameField.sendKeys("Harris");
        buyInformationPage.postCodeField.sendKeys("123456");
        buyInformationPage.sumbitButton.click();

        Allure.step("Go to \"Overview page\" + some fields check");
        OverviewPage overviewPage = new OverviewPage(getDriver());
        Assert.assertEquals(overviewPage.checkoutTitle,"Checkout: Overview");
        Assert.assertEquals(overviewPage.checkPaymentInfo,"Payment Information");
        Assert.assertEquals(overviewPage.checkShipInfo,"Shipping Information");
        Assert.assertEquals(overviewPage.CheckPrice,"Price Total");
        overviewPage.finishButtonClick();

        Allure.step("Go the the Complete page");
        CompletePage completePage = new CompletePage(getDriver());
        Assert.assertEquals(completePage.finishBuyHeader,"Thank you for your order!");
    }

    @Epic(value = "E2E tests")
    @Feature(value = "Buying an item")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Buying an item. From an autorization to an order. NEGATIVE.")
    @Test(priority = 1, description = "Checking of creating an order.")
    public void buyBackPack2() {

        Allure.step("Autorization");
        AutorizationPage loginPage = new AutorizationPage(getDriver());
        loginPage.inputLogin();
        loginPage.inputPassword();
        loginPage.clickSubmit();

        Allure.step("Go to the Product's page");
        GoodsPage goodsPage = new GoodsPage(getDriver());
        goodsPage.clickOnBackPack();

        Allure.step("Go to the Backpack's page");
        BackPackPage backPackPage = new BackPackPage(getDriver());
        backPackPage.addBackPackToCart.click();
        backPackPage.backPackCartIcon.click();

        Allure.step("Go to the cart");
        YourCartPage yourCartPage = new YourCartPage(getDriver());
        yourCartPage.checkoutButton.click();

        Allure.step("Go the the buyer's info page + filling the fields");
        BuyInformationPage buyInformationPage = new BuyInformationPage(getDriver());
        buyInformationPage.firstNameField.sendKeys("Tom");
        buyInformationPage.lastNameField.sendKeys("Harris");
        buyInformationPage.postCodeField.sendKeys("123456");
        buyInformationPage.sumbitButton.click();

        Allure.step("Go to \"Overview page\" + some fields check");
        OverviewPage overviewPage = new OverviewPage(getDriver());
        Assert.assertEquals(overviewPage.checkoutTitle,"Checkout: Overview");
        Assert.assertEquals(overviewPage.checkPaymentInfo,"Payment Information");
        Assert.assertEquals(overviewPage.checkShipInfo,"Shipping Information");
        Assert.assertEquals(overviewPage.CheckPrice,"Price Total");
        overviewPage.finishButtonClick();

        Allure.step("Go the the Complete page");
        CompletePage completePage = new CompletePage(getDriver());
        Assert.assertEquals(completePage.finishBuyHeader,"Thank you for order!");
    }

    @Epic(value = "E2E tests")
    @Feature(value = "Buying an item")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Buying an item. From an autorization to an order. NEGATIVE.")
    @Test(priority = 1, description = "Checking of creating an order. CHAINS")
    public void buyBackPack3() {

        String finishBuyHeader = new AutorizationPage(getDriver())
            .inputLogin()
            .inputPassword()
            .clickSubmit()
            .clickOnBackPack()
            .addBackPackToCart()
            .backPackCartIcon()
            .clickCheckoutButton()
            .fillThefirstNameField()
            .fillThelastNameField()
            .fillThepostCodeField()
            .clickOnsumbitButton()
            .checkoutTitle()
            .checkPaymentInfo()
            .checkShipInfo()
            .CheckPrice()
            .finishButtonClick()
            .getFinishBuyHeader();

        Assert.assertEquals(finishBuyHeader,"Thank you for order!");
    }
}