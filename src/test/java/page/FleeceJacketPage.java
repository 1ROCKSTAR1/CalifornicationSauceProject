package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FleeceJacketPage extends BasePage {
    public FleeceJacketPage(WebDriver driver) {
        super(driver);
    }
    public final String fleeceJacketItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_details_name large_size')][contains(text(),'Sauce Labs Fleece Jacket')]"))).getText();
    public final String fleeceJacketDesc = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_details_desc large_size')][contains(text(),'relaxing day outdoors')]"))).getText();
}
