package Test;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class ExperimenthalTest {

    @DataProvider(name = "data2")
    public Object [][] data () {

            return new Object[][]{
                    {""},
                    {"a"},
                    {"al"},
                    {"ale"},
                    {"aaaaaaaaaaaaalex"},
                    {"aaaaaaaaaaaaaalex"},
                    {"aaaaaaaaaaaaaaalex"},
                    {"alex!"},
                    {"alex@"},
                    {"alex#"},
                    {"alex$"},
                    {"alex%"}
            };
    }

    @Epic(value = "Проверки полей")
    @Feature(value = "Данные покупателя")
    @Story(value = "Проверки полей страницы заполнения данных юзера")
    @Severity(value = SeverityLevel.NORMAL)
    @Description(value = "Проверка поля NAME на граничные значения и спецсимволы ....")
    @Test(dataProvider = "data2", description = "Проверка поля NAME")
    public void theFirstDataProviderTest(String option) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");

        WebElement loginField = driver.findElement(By.xpath("//*[@id='user-name']"));
        WebElement passField = driver.findElement(By.xpath("//*[@id='password']"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@id='login-button']"));

        Allure.step("Autorization");
        loginField.sendKeys("standard_user");
        passField.sendKeys("secret_sauce");
        submitButton.click();

        Allure.step("Going to the backpack's page");
        WebElement backPackTitle = driver.findElement(By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Backpack')]"));
        backPackTitle.click();

        Allure.step("Adding the backpack to the cart");
        WebElement addBackPackToCart = driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']"));
        addBackPackToCart.click();

        Allure.step("Going to the cart");
        WebElement backPackCartIcon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        backPackCartIcon.click();

        Allure.step("Going to the checkout page");
        WebElement chekoutButton = driver.findElement(By.xpath("//button[@data-test='checkout']"));
        chekoutButton.click();

        final String buyersInfoPageTitle = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Allure.step("Checking that the checkout info page is existed");
        Assert.assertEquals(buyersInfoPageTitle, "Checkout: Your Information");

        Allure.step("Filling the field NAME");
        WebElement firstNameField = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstNameField.sendKeys(option);

        Allure.step("Filling the field LASTNAME");
        WebElement lastNameField = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastNameField.sendKeys("Harris");

        Allure.step("Filling the field POSTCODE");
        WebElement postCodeField = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
        postCodeField.sendKeys("123456");

        Allure.step("Clicking on the submit button");
        WebElement submitButtonCheckout = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButtonCheckout.click();

        Allure.step("Checking that the checkout overview page is existed");
        String checkoutTitle = driver.findElement(By.xpath("//span[@class='title'][contains(text(),'Checkout: Overview')]")).getText();
        Assert.assertEquals(checkoutTitle,"Checkout: Overview");

        driver.quit();
     }

    @Epic(value = "Проверки полей")
    @Feature(value = "Данные покупателя")
    @Story(value = "Проверки полей страницы заполнения данных юзера")
    @Severity(value = SeverityLevel.NORMAL)
    @Description(value = "Проверка поля LASTNAME на граничные значения и спецсимволы ....")
    @Test(dataProvider = "data2", description = "Проверка поля LASTNAME")
    public void theFirstDataProviderTest2(String option) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");

        WebElement loginField = driver.findElement(By.xpath("//*[@id='user-name']"));
        WebElement passField = driver.findElement(By.xpath("//*[@id='password']"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@id='login-button']"));

        Allure.step("Autorization");
        loginField.sendKeys("standard_user");
        passField.sendKeys("secret_sauce");
        submitButton.click();

        Allure.step("Going to the backpack's page");
        WebElement backPackTitle = driver.findElement(By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Backpack')]"));
        backPackTitle.click();

        Allure.step("Adding the backpack to the cart");
        WebElement addBackPackToCart = driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']"));
        addBackPackToCart.click();

        Allure.step("Going to the cart");
        WebElement backPackCartIcon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        backPackCartIcon.click();

        Allure.step("Going to the checkout page");
        WebElement chekoutButton = driver.findElement(By.xpath("//button[@data-test='checkout']"));
        chekoutButton.click();

        final String buyersInfoPageTitle = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Allure.step("Checking that the checkout info page is existed");
        Assert.assertEquals(buyersInfoPageTitle, "Checkout: Your Information");

        Allure.step("Filling the field NAME");
        WebElement firstNameField = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstNameField.sendKeys("Tom");

        Allure.step("Filling the field LASTNAME");
        WebElement lastNameField = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastNameField.sendKeys(option);

        Allure.step("Filling the field POSTCODE");
        WebElement postCodeField = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
        postCodeField.sendKeys("123456");

        Allure.step("Clicking on the submit button");
        WebElement submitButtonCheckout = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButtonCheckout.click();

        Allure.step("Checking that the checkout overview page is existed");
        String checkoutTitle = driver.findElement(By.xpath("//span[@class='title'][contains(text(),'Checkout: Overview')]")).getText();
        Assert.assertEquals(checkoutTitle,"Checkout: Overview");

        driver.quit();
    }

    @Epic(value = "Проверки полей")
    @Feature(value = "Данные покупателя")
    @Story(value = "Проверки полей страницы заполнения данных юзера")
    @Severity(value = SeverityLevel.NORMAL)
    @Description(value = "Проверка поля POSTCODE на граничные значения и спецсимволы ....")
    @Test(dataProvider = "data2", description = "Проверка поля POSTCODE")
    public void theFirstDataProviderTest3(String option) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");

        WebElement loginField = driver.findElement(By.xpath("//*[@id='user-name']"));
        WebElement passField = driver.findElement(By.xpath("//*[@id='password']"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@id='login-button']"));

        Allure.step("Autorization");
        loginField.sendKeys("standard_user");
        passField.sendKeys("secret_sauce");
        submitButton.click();

        Allure.step("Going to the backpack's page");
        WebElement backPackTitle = driver.findElement(By.xpath("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Backpack')]"));
        backPackTitle.click();

        Allure.step("Adding the backpack to the cart");
        WebElement addBackPackToCart = driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']"));
        addBackPackToCart.click();

        Allure.step("Going to the cart");
        WebElement backPackCartIcon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        backPackCartIcon.click();

        Allure.step("Going to the checkout page");
        WebElement chekoutButton = driver.findElement(By.xpath("//button[@data-test='checkout']"));
        chekoutButton.click();

        final String buyersInfoPageTitle = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Allure.step("Checking that the checkout info page is existed");
        Assert.assertEquals(buyersInfoPageTitle, "Checkout: Your Information");

        Allure.step("Filling the field NAME");
        WebElement firstNameField = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstNameField.sendKeys("Tom");

        Allure.step("Filling the field LASTNAME");
        WebElement lastNameField = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastNameField.sendKeys("Harris");

        Allure.step("Filling the field POSTCODE");
        WebElement postCodeField = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
        postCodeField.sendKeys(option);

        Allure.step("Clicking on the submit button");
        WebElement submitButtonCheckout = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButtonCheckout.click();

        Allure.step("Checking that the checkout overview page is existed");
        String checkoutTitle = driver.findElement(By.xpath("//span[@class='title'][contains(text(),'Checkout: Overview')]")).getText();
        Assert.assertEquals(checkoutTitle,"Checkout: Overview");

        driver.quit();
    }
}
