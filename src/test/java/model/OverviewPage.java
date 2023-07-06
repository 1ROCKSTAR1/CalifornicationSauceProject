package model;

import base.BasicModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OverviewPage extends BasicModel {
    public OverviewPage(WebDriver driver) {
        super(driver);
    }
    public String checkoutTitle = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(),'Checkout: Overview')]"))).getText();

    public String checkPaymentInfo = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Payment Information')]"))).getText();

    public String checkShipInfo = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Shipping Information')]"))).getText();

    public String CheckPrice = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Price Total')]"))).getText();

    public void finishButtonClick() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test='finish'][@name='finish']"))).click();
    }
}
