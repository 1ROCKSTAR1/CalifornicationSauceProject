package Page;

import Base.BasicModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BikeLightPage extends BasicModel {
    public BikeLightPage(WebDriver driver) {
        super(driver);
    }
    public final String bikeLightItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_details_name large_size')][contains(text(),'Sauce Labs Bike Light')]"))).getText();
    public final String bikeLightDesc = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_details_desc large_size')][contains(text(),'when riding your bike at night')]"))).getText();



    public final String whiteShirtDesc = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inventory_details_desc large_size']"))).getText();
    public final String hoodyDesc = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inventory_details_desc large_size']"))).getText();

}
