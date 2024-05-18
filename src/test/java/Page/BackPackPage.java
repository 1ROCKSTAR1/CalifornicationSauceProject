package Page;

import Base.BasicModel;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BackPackPage extends BasicModel {
    public BackPackPage(WebDriver driver) {
        super(driver);
    }

    public WebElement addBackPackToCart = getWait2().until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//button[@data-test='add-to-cart']")));
    public WebElement backPackCartIcon = getWait2().until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//a[@class='shopping_cart_link']")));
    public final String backPackItem = getWait2().until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[contains(text(),'Sauce Labs Backpack')]"))).getText();
    public final String backPackDesc = getWait2().until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[contains(@class,'inventory_details_desc large_size')][contains(text(),'uncompromising')]"))).getText();
    public BackPackPage addBackPackToCart() {
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test='add-to-cart']"))).click();
        return this;
    }
    public YourCartPage backPackCartIcon() {
        Allure.step("Go to the cart with BackPack");
        getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='shopping_cart_link']"))).click();
        return new YourCartPage(getDriver());
    }


}
