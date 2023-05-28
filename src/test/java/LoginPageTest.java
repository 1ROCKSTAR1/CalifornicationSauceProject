import model.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    String AfterLoginHeader = "Swag Labs";
    WebElement afterLoginHeaderString = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='app_logo']")));

    @Test
    public void enterTest() {
    WebElement loginField = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='user-name']")));
    WebElement passField = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password']")));
    WebElement submitButton = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login-button']")));

    loginField.sendKeys("standard_user");
    passField.sendKeys("secret_sauce");
    submitButton.click();

    }

    @Test // ИСП. PAGE OBJECT
    public void enter2Test() {
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickSubmit();

        Assert.assertEquals(afterLoginHeaderString.getText(),AfterLoginHeader);
    }
}
