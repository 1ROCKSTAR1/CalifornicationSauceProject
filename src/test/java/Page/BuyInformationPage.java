package Page;

import Base.BasicModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BuyInformationPage extends BasicModel {
    public BuyInformationPage(WebDriver driver) {
        super(driver);
    }


     public WebElement firstNameField = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First Name']")));
     public WebElement lastNameField = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Last Name']")));
     public WebElement postCodeField = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Zip/Postal Code']")));


    public WebElement sumbitButton = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));
}