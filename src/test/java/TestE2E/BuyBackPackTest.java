package TestE2E;

import Base.BaseTest;
import Page.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyBackPackTest extends BaseTest {
    @Test
    public void buyBackPack() {

        AutorizationPage loginPage = new AutorizationPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        GoodsPage goodsPage = new GoodsPage(getDriver());
        goodsPage.clickOnBackPack();

        BackPackPage backPackPage = new BackPackPage(getDriver());
        backPackPage.addBackPackToCart.click();
        backPackPage.backPackCartIcon.click();

        YourCartPage yourCartPage = new YourCartPage(getDriver());
        yourCartPage.chekoutButton.click();

        BuyInformationPage buyInformationPage = new BuyInformationPage(getDriver());
        buyInformationPage.firstNameField.sendKeys("Tom");
        buyInformationPage.lastNameField.sendKeys("Harris");
        buyInformationPage.postCodeField.sendKeys("123456");
        buyInformationPage.sumbitButton.click();

        OverviewPage overviewPage = new OverviewPage(getDriver());
        Assert.assertEquals(overviewPage.checkoutTitle,"Checkout: Overview");
        Assert.assertEquals(overviewPage.checkPaymentInfo,"Payment Information");
        Assert.assertEquals(overviewPage.checkShipInfo,"Shipping Information");
        Assert.assertEquals(overviewPage.CheckPrice,"Price Total");
        overviewPage.finishButtonClick();

        CompletePage completePage = new CompletePage(getDriver());
        Assert.assertEquals(completePage.finishBuyHeader,"Thank you for your order!");
    }
}
