package model;

import base.BasicModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FleeceJacketPage extends BasicModel {
    public FleeceJacketPage(WebDriver driver) {
        super(driver);
    }
    public final String fleeceJacketItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#inventory_item_container > div > div > div.inventory_details_desc_container > div.inventory_details_name.large_size"))).getText();
    public final String fleeceJacketDesc = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inventory_details_desc large_size']"))).getText();
}
