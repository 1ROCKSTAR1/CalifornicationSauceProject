package model;

import base.BasicModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BoltShirtPage extends BasicModel {
    public BoltShirtPage(WebDriver driver) {
        super(driver);
    }
    public final String boltShirtItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_details_name large_size')][contains(text(),'Sauce Labs Bolt T-Shirt')]"))).getText();
    public final String boltShirtDesc = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_details_desc large_size')][contains(text(),'Get your testing superhero')]"))).getText();
}
