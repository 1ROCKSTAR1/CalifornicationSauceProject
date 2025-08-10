package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CompletePage extends BasePage {
    public CompletePage(WebDriver driver) {
        super(driver);
    }
    public String finishBuyHeader = getWait2().until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//h2[@class='complete-header'][contains(text(),'Thank you for your order!')]"))).getText();

    public String getFinishBuyHeader() {
        return getWait2().until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h2[@class='complete-header'][contains(text(),'Thank you for your order!')]"))).getText();

    }
}
