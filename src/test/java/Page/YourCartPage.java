package Page;

import Base.BasicModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YourCartPage extends BasicModel {
    public YourCartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement checkoutButton = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test='checkout']")));
    public YourCartPage checkoutButton (){
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test='checkout']"))).click();
        return this;
    }
}
