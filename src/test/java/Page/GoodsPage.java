package Page;

import Base.BasicModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoodsPage extends BasicModel {
    public GoodsPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnBikeLight() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Bike Light')]"))).click();
    }
    public void clickOnBackPack() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Backpack')]"))).click();
    }
    public void clickOnBoltShirt() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Bolt T-Shirt')]"))).click();
    }
    public void clickOnFleeceJacket() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Fleece Jacket')]"))).click();
    }
    public void clickOnWhiteShirt() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Onesie')]"))).click();
    }
    public void clickOnHoodyItem() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'T-Shirt (Red)')]"))).click();
    }

    public final String bikeLightItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Bike Light')]"))).getText();

    public final String backPackItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Backpack')]"))).getText();
    public final String boltShirtItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Bolt T-Shirt')]"))).getText();
    public final String fleeceJacketItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Fleece Jacket')]"))).getText();
    public final String whiteShirtItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Onesie')]"))).getText();
    public final String hoodyItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'T-Shirt (Red)')]"))).getText();
    public final String afterLoginHeaderString = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='app_logo']"))).getText();

    public void addToCardBackPackButtonClick() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']"))).click();
    }
    public void addToCardBikeLightButtonClick() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test='add-to-cart-sauce-labs-bike-light']"))).click();
    }
    public void addToCardBoltShirtButtonClick() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test='add-to-cart-sauce-labs-bolt-t-shirt']"))).click();
    }
    public void addToCardFleeceJacketButtonClick() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test='add-to-cart-sauce-labs-fleece-jacket']"))).click();
    }
    public void addToCardWhiteShirtButtonClick() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test='add-to-cart-sauce-labs-onesie']"))).click();
    }
    public void addToCardHoodyButtonClick() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@data-test,'red')]"))).click();
    }
}
