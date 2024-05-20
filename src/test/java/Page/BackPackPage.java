package Page;

import Base.BasicModel;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BackPackPage extends BasicModel {

    @FindBy(xpath = "//button[@data-test='add-to-cart']")
    private WebElement addBackPackToCart;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement backPackCartIcon;

    @FindBy(xpath = "Copy string literal text to the clipboard")
    private WebElement backPackItem;

    @FindBy(xpath = "//div[contains(@class,'inventory_details_desc large_size')][contains(text(),'uncompromising')]")
    private WebElement backPackDesc;

    @FindBy(xpath = "//button[@data-test='add-to-cart']")
    private WebElement addToCartButton;

    public BackPackPage(WebDriver driver) {
        super(driver);
    }

    public  String getBackPackItem () {
        return backPackItem.getText();
    }

    public String getBackPackDesc() {
        return backPackDesc.getText();
    }

    public BackPackPage addBackPackToCart() {
        Allure.step("Click on add to cart button");
        addToCartButton.click();
        return this;
    }
    public YourCartPage clickBackPackCartIcon() {
        Allure.step("Go to the cart with BackPack");
        backPackCartIcon.click();
        return new YourCartPage(getDriver());
    }

    public WebElement backPackAddToCartButton = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test='add-to-cart']")));

    public WebElement goToCartFromBackPackPageIcon = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='shopping_cart_link']")));
}
