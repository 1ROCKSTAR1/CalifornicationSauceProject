package Test;

import Base.BaseTest;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ExperimenthalTest {
//    @Epic(value = "Проверки описаний")
//    @Feature(value = "Товары")
//    @Story(value = "Проверка описания футболки")
//    @Severity(value = SeverityLevel.NORMAL)
//    @Description(value = "Проверка авторизации и описания на странице товара (футболка)")
//    @Test
//    public void myFirstTest() throws InterruptedException {
//
//
//
//        final String expectedMessage = "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.";
//
//
//        Selenide.open("https://www.saucedemo.com/");
//
//        SelenideElement login = $(By.xpath("//*[@id='user-name']"));
//        SelenideElement pass = $(By.xpath("//*[@id='password']"));
//        SelenideElement enter = $(By.xpath("//*[@id='login-button']"));
//
//        login.wait(30000);
//
//        login.sendKeys("standard_user");
//        pass.sendKeys("secret_sauce");
//        enter.click();
//
//        SelenideElement tShirt = $(By.xpath("//div[@class='inventory_item_name'][text()='Sauce Labs Bolt T-Shirt']"));
//        tShirt.click();
//
//        SelenideElement tShirtDescription = $(By.xpath("//div[@class='inventory_details_desc large_size']"));
//        String actualMessage = tShirtDescription.getText();
//
//        Assert.assertEquals(actualMessage,expectedMessage);
//    }
}
