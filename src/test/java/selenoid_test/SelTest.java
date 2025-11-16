package selenoid_test;

import base.SelBaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.AutorizationPage;

public class SelTest extends SelBaseTest {

    private static final String BASE_URL = "https://www.saucedemo.com/";

    @BeforeMethod
    public void beforeEach() {
        getDriver().get(BASE_URL);
    }

    @Epic(value = "E2E tests")
    @Feature(value = "Buying an item")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Buying an item. From an autorization to an order. NEGATIVE.")
    @Test(priority = 1, description = "Checking of creating an order. CHAINS")
    public void buyBackPack() {

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
                .checkoutHeaderStringCheck()
                .checkPaymentInfo()
                .checkShipInfo()
                .checkPrice()
                .finishButtonClick()
                .getFinishBuyHeader();

        Assert.assertEquals(finishBuyHeader,"Thank you for order!");
    }

    @Epic(value = "E2E tests")
    @Feature(value = "Buying an item")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Buying an item. From an autorization to an order")
    @Test(priority = 1, description = "Checking of creating an order. CHAINS")
    public void buyBackPackTest() {

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
                .checkoutHeaderStringCheck()
                .checkPaymentInfo()
                .checkShipInfo()
                .checkPrice()
                .finishButtonClick()
                .getFinishBuyHeader();

        Assert.assertEquals(finishBuyHeader,"Thank you for your order!");
    }
}
