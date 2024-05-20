package TestE2E;

import Base.BaseTest;
import Page.*;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
// ТРИ РАЗЛИЧНЫХ ПОДХОДА ДЛЯ АВТОТЕСТИРОВАНИЯ UI НА ПРИМЕРЕ Е2Е ТЕСТА
// HERE ARE THREE DIFFERENT APPROACHES FOR UI AUTOTESTING USING THE EXAMPLE OF THE E2E TEST

public class BuyBackPackTest extends BaseTest {
    @Epic(value = "E2E tests")
    @Feature(value = "Buying an item")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Buying an item. From an autorization to an order")
    @Test(priority = 1, description = "Checking of creating an order.")
    public void buyBackPack() {

        Allure.step("Autorization");
        AutorizationPage loginPage = new AutorizationPage(getDriver());
        loginPage.login1Field.sendKeys("standard_user");
        loginPage.pass1Field.sendKeys("secret_sauce");
        loginPage.submit1Button.click();

        Allure.step("Go to the Product's page");
        GoodsPage goodsPage = new GoodsPage(getDriver());
        goodsPage.backPackItemHeader.click();

        Allure.step("Go to the Backpack's page");
        BackPackPage backPackPage = new BackPackPage(getDriver());
        backPackPage.backPackAddToCartButton.click();
        backPackPage.goToCartFromBackPackPageIcon.click();

        Allure.step("Go to the cart");
        YourCartPage yourCartPage = new YourCartPage(getDriver());
        yourCartPage.checkout1Button.click();

        Allure.step("Go the the buyer's info page + filling the fields");
        BuyInformationPage buyInformationPage = new BuyInformationPage(getDriver());
        buyInformationPage.firstName1Field.sendKeys("Tom");
        buyInformationPage.lastName1Field.sendKeys("Harris");
        buyInformationPage.postCode1Field.sendKeys("123456");
        buyInformationPage.sumbit1Button.click();

        Allure.step("Go to \"Overview page\" + some fields check");
        OverviewPage overviewPage = new OverviewPage(getDriver());
        Assert.assertEquals(overviewPage.checkout1Title,"Checkout: Overview");
        Assert.assertEquals(overviewPage.checkPayment1Info,"Payment Information");
        Assert.assertEquals(overviewPage.checkShip1Info,"Shipping Information");
        Assert.assertEquals(overviewPage.check1Price,"Price Total");
        overviewPage.finish1Button.click();

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
        backPackPage.addBackPackToCart();
        backPackPage.clickBackPackCartIcon();

        Allure.step("Go to the cart");
        YourCartPage yourCartPage = new YourCartPage(getDriver());
        yourCartPage.clickCheckoutButton();

        Allure.step("Go the the buyer's info page + filling the fields");
        BuyInformationPage buyInformationPage = new BuyInformationPage(getDriver());
        buyInformationPage.fillThefirstNameField();
        buyInformationPage.fillThelastNameField();
        buyInformationPage.fillThepostCodeField();
        buyInformationPage.clickOnsumbitButton();

        Allure.step("Go to \"Overview page\" + some fields check");
        OverviewPage overviewPage = new OverviewPage(getDriver());
        overviewPage.checkoutTitleCheck();
        overviewPage.checkPaymentInfo();
        overviewPage.checkShipInfo();
        overviewPage.checkPrice();
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
            .clickBackPackCartIcon()
            .clickCheckoutButton()
            .fillThefirstNameField()
            .fillThelastNameField()
            .fillThepostCodeField()
            .clickOnsumbitButton()
            .checkoutTitleCheck()
            .checkPaymentInfo()
            .checkShipInfo()
            .checkPrice()
            .finishButtonClick()
            .getFinishBuyHeader();

        Assert.assertEquals(finishBuyHeader,"Thank you for order!");
    }
}