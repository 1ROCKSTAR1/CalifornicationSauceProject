package Page;

import Base.BasicModel;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoodsPage extends BasicModel {

    @FindBy(xpath = "//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Backpack')]")
    private WebElement backPackHeader;

    @FindBy(xpath = "//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Bike Light')]")
    private WebElement bikeLightHeader;

    @FindBy(xpath = "//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Bolt T-Shirt')]")
    private WebElement boltShirtHeader;

    @FindBy(xpath = "//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Fleece Jacket')]")
    private WebElement fleeceJacketHeader;

    @FindBy(xpath = "//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Onesie')]")
    private WebElement whiteShirtHeader;

    @FindBy(xpath = "//div[contains(@class,'inventory_item_name')][contains(text(),'T-Shirt (Red)')]")
    private WebElement HoodyHeader;

    public GoodsPage(WebDriver driver) {
        super(driver);
    }

    public BikeLightPage clickOnBikeLight() {
        Allure.step("Go to the Bikelight page");
        getWait2().until(ExpectedConditions.visibilityOf(bikeLightHeader)).click();
        return new BikeLightPage(getDriver());
    }

    public BackPackPage clickOnBackPack() {
        Allure.step("Go to the Backpack's page");
        getWait2().until(ExpectedConditions.visibilityOf(backPackHeader)).click();
        return new BackPackPage(getDriver());
    }

    public BoltShirtPage clickOnBoltShirt() {
        Allure.step("Go to the BoltShirt's page");
        getWait2().until(ExpectedConditions.visibilityOf(boltShirtHeader)).click();
        return new BoltShirtPage(getDriver());
    }

    public FleeceJacketPage clickOnFleeceJacket() {
        Allure.step("Go to the FleeceJacket's page");
        getWait2().until(ExpectedConditions.visibilityOf(fleeceJacketHeader)).click();
        return new FleeceJacketPage(getDriver());
    }

    public WhiteShirtPage clickOnWhiteShirt() {
        Allure.step("Go to the White shirt's page");
        getWait2().until(ExpectedConditions.visibilityOf(fleeceJacketHeader)).click();
        return new WhiteShirtPage(getDriver());
    }

    public HoodyPage clickOnHoody() {
        Allure.step("Go to the Hoody's page");
        getWait2().until(ExpectedConditions.visibilityOf(HoodyHeader)).click();
        return new HoodyPage(getDriver());
    }

    public final String bikeLightItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Bike Light')]"))).getText();

    public final String backPackItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Backpack')]"))).getText();
    public final String boltShirtItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Bolt T-Shirt')]"))).getText();
    public final String fleeceJacketItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Fleece Jacket')]"))).getText();
    public final String whiteShirtItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Onesie')]"))).getText();
    public final String hoodyItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'T-Shirt (Red)')]"))).getText();

    public final WebElement afterLoginHeader = getWait2().until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[@class='app_logo']")));

    public String getAfterLoginHeaderString() {

        return afterLoginHeader.getText();
    }

    public WebElement backPackItemHeader = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Backpack')]")));

}
