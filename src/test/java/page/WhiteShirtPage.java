package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WhiteShirtPage extends BasePage {
    public WhiteShirtPage(WebDriver driver) {
        super(driver);
    }
    public final String whiteShirtItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_details_name large_size')][contains(text(),'Sauce Labs Onesie')]"))).getText();
    public final String whiteShirtDesc = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_details_desc large_size')][contains(text(),'Rib snap infant onesie for the junior automation engineer')]"))).getText();
}
