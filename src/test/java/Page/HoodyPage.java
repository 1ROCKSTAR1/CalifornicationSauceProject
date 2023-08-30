package Page;

import Base.BasicModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HoodyPage extends BasicModel {
    public HoodyPage(WebDriver driver) {
        super(driver);
    }
    public final String hoodyPageItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_details_name large_size')][contains(text(),'T-Shirt (Red)')]"))).getText();
    public final String hoodyPageDesc = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'inventory_details_desc large_size')][contains(text(),'Super-soft')]"))).getText();
}
