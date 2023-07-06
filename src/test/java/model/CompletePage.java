package model;

import base.BasicModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CompletePage extends BasicModel {
    public CompletePage(WebDriver driver) {
        super(driver);
    }
    public String finishBuyHeader = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='complete-header'][contains(text(),'Thank you for your order!')]"))).getText();
}
