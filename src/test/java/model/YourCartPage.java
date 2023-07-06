package model;

import base.BasicModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YourCartPage extends BasicModel {
    public YourCartPage(WebDriver driver) {
        super(driver);
    }
    public WebElement chekoutButton = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']")));

}
