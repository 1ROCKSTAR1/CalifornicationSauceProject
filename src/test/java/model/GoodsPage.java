package model;

import base.BasicModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public void addToCardBackPackButton() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']"))).click();
    }
    public void addToCardBikeLightButton() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test='add-to-cart-sauce-labs-bike-light']"))).click();
    }
    public void addToCardBoltShirtButton() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test='add-to-cart-sauce-labs-bolt-t-shirt']"))).click();
    }
    public void addToCardFleeceJacketButton() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test='add-to-cart-sauce-labs-fleece-jacket']"))).click();
    }
    public void addToCardWhiteShirtButton() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test='add-to-cart-sauce-labs-onesie']"))).click();
    }
    public void addToCardHoodyButton() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@data-test,'red')]"))).click();
    }
    public WebElement backPackRemoveButton = getWait2().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-test='remove-sauce-labs-backpack']")));
    public WebElement bikeLightRemoveButton = getWait2().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-test='remove-sauce-labs-bike-light']")));
    public WebElement boltShirtRemoveButton = getWait2().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-test='remove-sauce-labs-bolt-t-shirt']")));
    public WebElement fleeceJacketRemoveButton = getWait2().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-test='remove-sauce-labs-fleece-jacket']")));
    public WebElement whiteShirtRemoveButton = getWait2().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-test='remove-sauce-labs-onesie']")));
    public WebElement hoodyRemoveButton = getWait2().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(@data-test,'red')][contains(text(),'Remove')]")));
    public WebElement cartIcon = getWait2().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='shopping_cart_link']")));
}
