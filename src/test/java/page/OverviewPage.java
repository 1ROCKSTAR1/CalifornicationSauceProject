package page;

import base.BasePage;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class OverviewPage extends BasePage {

    @FindBy(xpath = "//span[@class='title'][contains(text(),'Checkout: Overview')]")
    private WebElement checkoutOverviewHeader;

    @FindBy(xpath = "//div[contains(text(),'Payment Information')]")
    private WebElement paymentInfo;

    @FindBy(xpath = "//div[contains(text(),'Shipping Information')]")
    private WebElement shipInfo;

    @FindBy(xpath = "//div[contains(text(),'Price Total')]")
    private WebElement price;

    @FindBy(xpath = "//button[@data-test='finish'][@name='finish']")
    private WebElement finishButton;

    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    public String checkout1TitleString = getWait2().until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//span[@class='title'][contains(text(),'Checkout: Overview')]"))).getText();

    public String checkPayment1InfoString = getWait2().until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[contains(text(),'Payment Information')]"))).getText();

    public String checkShip1InfoString = getWait2().until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[contains(text(),'Shipping Information')]"))).getText();

    public String check1PriceString = getWait2().until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[contains(text(),'Price Total')]"))).getText();

    public String getCheckoutHeaderPresence() {
        return getWait2().until(ExpectedConditions.visibilityOf(checkoutOverviewHeader)).getText();
    }

    public OverviewPage checkoutHeaderStringCheck() {
        getWait2().until(ExpectedConditions.visibilityOf(checkoutOverviewHeader)).getText();
        Assert.assertEquals(checkout1TitleString,"Checkout: Overview");
        return this;
    }

    public OverviewPage checkPaymentInfo() {
        getWait2().until(ExpectedConditions.visibilityOf(paymentInfo)).getText();
        Assert.assertEquals(checkPayment1InfoString,"Payment Information:");
        return this;
    }

    public OverviewPage checkShipInfo() {
        getWait2().until(ExpectedConditions.visibilityOf(shipInfo)).getText();
        Assert.assertEquals(checkShip1InfoString,"Shipping Information:");
        return this;
    }

    public OverviewPage checkPrice() {
        getWait2().until(ExpectedConditions.visibilityOf(price)).getText();
        Assert.assertEquals(check1PriceString,"Price Total");
        return this;
    }

    public CompletePage finishButtonClick() {
        Allure.step("Go the the Complete page");
        getWait2().until(ExpectedConditions.visibilityOf(finishButton)).click();
        return new CompletePage(getDriver());
    }

    public WebElement finish1Button = getWait2().until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//button[@data-test='finish'][@name='finish']")));
}
