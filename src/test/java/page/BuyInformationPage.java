package page;

import base.BasePage;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BuyInformationPage extends BasePage {

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@placeholder='Zip/Postal Code']")
    private WebElement postCodeField;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;

    public BuyInformationPage(WebDriver driver) {
        super(driver);
    }


     public WebElement firstName1Field = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First Name']")));
     public WebElement lastName1Field = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Last Name']")));
     public WebElement postCode1Field = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Zip/Postal Code']")));


    public WebElement sumbit1Button = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));

    public BuyInformationPage fillThefirstNameField() {
        getWait2().until(ExpectedConditions.visibilityOf(firstNameField)).sendKeys("Tom");
        return this;
    }
    public BuyInformationPage fillThelastNameField() {
        getWait2().until(ExpectedConditions.visibilityOf(lastNameField)).sendKeys("Harris");
        return this;
    }
    public BuyInformationPage fillThepostCodeField() {
        getWait2().until(ExpectedConditions.visibilityOf(postCodeField)).sendKeys("000");
        return this;
    }

    public BuyInformationPage fillThefirstNameFieldDP(String s) {
        getWait2().until(ExpectedConditions.visibilityOf(firstNameField)).sendKeys(s);
        return this;
    }
    public BuyInformationPage fillThelastNameFieldDP(String s) {
        getWait2().until(ExpectedConditions.visibilityOf(lastNameField)).sendKeys(s);
        return this;
    }
    public BuyInformationPage fillThepostCodeFieldDP(String s) {
        getWait2().until(ExpectedConditions.visibilityOf(postCodeField)).sendKeys(s);
        return this;
    }


    public OverviewPage clickOnsumbitButton() {
        Allure.step("Go to \"Overview page\" + some fields check");
        getWait2().until(ExpectedConditions.visibilityOf(submitButton)).click();
        return new OverviewPage(getDriver());
    }
}