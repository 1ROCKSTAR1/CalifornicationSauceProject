package model;

import base.BasicModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BikeLightPage extends BasicModel {
    public BikeLightPage(WebDriver driver) {
        super(driver);
    }
    public final String bikeLightItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#inventory_item_container > div > div > div.inventory_details_desc_container > div.inventory_details_name.large_size"))).getText();
    public final String bikeLightDesc = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inventory_details_desc large_size']"))).getText();



    public final String whiteShirtDesc = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inventory_details_desc large_size']"))).getText();
    public final String hoodyDesc = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inventory_details_desc large_size']"))).getText();

}
