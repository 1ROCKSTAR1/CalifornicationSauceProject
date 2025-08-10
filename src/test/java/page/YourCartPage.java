package page;

import base.BasePage;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YourCartPage extends BasePage {

    @FindBy(xpath = "//button[@data-test='checkout']")
    private WebElement checkoutButton;

    public YourCartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement checkout1Button = getWait2().until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//button[@data-test='checkout']")));

    public BuyInformationPage clickCheckoutButton (){
        Allure.step("Go the the buyer's info page + filling the fields");
        getWait2().until(ExpectedConditions.visibilityOf(checkoutButton)).click();
        return new BuyInformationPage(getDriver());
    }
}
