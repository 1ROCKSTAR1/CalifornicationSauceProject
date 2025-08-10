package testE2E;

import base.BaseTest;
import page.*;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyBackPackTest extends BaseTest {

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