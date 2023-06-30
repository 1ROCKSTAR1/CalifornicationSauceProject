package model;

import base.BasicModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoodsPage extends BasicModel {
    public GoodsPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnBikeLight() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#item_0_title_link > div"))).click();
    }
    public void clickOnBackPack() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#item_0_title_link > div"))).click();
    }
    public void clickOnBoltShirt() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#item_0_title_link > div"))).click();
    }
    public void clickOnFleeceJacket() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#item_0_title_link > div"))).click();
    }
    public void clickOnWhireShirt() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#item_0_title_link > div"))).click();
    }
    public void clickOnHoodyItem() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#item_0_title_link > div"))).click();
    }

    public final String bikeLightItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#item_0_title_link > div"))).getText();

    public final String backPackItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#item_4_title_link > div"))).getText();
    public final String boltShirtItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#item_1_title_link > div"))).getText();
    public final String fleeceJacketItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#item_5_title_link > div"))).getText();
    public final String whiteShirtItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#item_2_title_link > div"))).getText();
    public final String hoodyItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#item_2_title_link > div"))).getText();
}
