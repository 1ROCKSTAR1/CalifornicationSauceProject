package Test;

import Base.BaseTest;
import Page.AutorizationPage;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.NoSuchElementException;

// ТЕСТЫ КОТОРЫЕ ПРОВЕРЯЮТ ПОЛЯ НА ВВОД РАЗЛИЧНЫХ ЗНАЧЕНИЙ
// TESTS WHICH CHECK FIELDS FOR GETTING DIFFERENT VALUES
public class ExperimenthalTest extends BaseTest {

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

    //@Ignore
    @Epic(value = "Проверки полей")
    @Feature(value = "Данные покупателя")
    @Story(value = "Проверки полей страницы заполнения данных юзера")
    @Severity(value = SeverityLevel.NORMAL)
    @Description(value = "Проверка поля NAME на граничные значения и спецсимволы ....")
    @Test(dataProvider = "data2", description = "Проверка поля NAME")
    public void theFirstDataProviderTest(String option) throws NoSuchElementException {

        String checkoutTitle = new AutorizationPage(getDriver())
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .clickOnBackPack()
                .addBackPackToCart()
                .clickBackPackCartIcon()
                .clickCheckoutButton()
                .fillThefirstNameFieldDP(option)
                .fillThelastNameField()
                .fillThepostCodeField()
                .clickOnsumbitButton()
                .getCheckoutTitle();

        Assert.assertEquals(checkoutTitle,"Checkout: Overview");
     }

    @Epic(value = "Проверки полей")
    @Feature(value = "Данные покупателя")
    @Story(value = "Проверки полей страницы заполнения данных юзера")
    @Severity(value = SeverityLevel.NORMAL)
    @Description(value = "Проверка поля LASTNAME на граничные значения и спецсимволы ....")
    @Test(dataProvider = "data2", description = "Проверка поля LASTNAME")
    public void theFirstDataProviderTest2(String option) throws NoSuchElementException {

        String checkoutTitle = new AutorizationPage(getDriver())
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .clickOnBackPack()
                .addBackPackToCart()
                .clickBackPackCartIcon()
                .clickCheckoutButton()
                .fillThefirstNameField()
                .fillThelastNameFieldDP(option)
                .fillThepostCodeField()
                .clickOnsumbitButton()
                .getCheckoutTitle();

        Assert.assertEquals(checkoutTitle,"Checkout: Overview");
    }


    @Epic(value = "Проверки полей")
    @Feature(value = "Данные покупателя")
    @Story(value = "Проверки полей страницы заполнения данных юзера")
    @Severity(value = SeverityLevel.NORMAL)
    @Description(value = "Проверка поля POSTCODE на граничные значения и спецсимволы ....")
    @Test(dataProvider = "data2", description = "Проверка поля POSTCODE")
    public void theFirstDataProviderTest3(String option) throws NoSuchElementException {

        String checkoutTitle = new AutorizationPage(getDriver())
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .clickOnBackPack()
                .addBackPackToCart()
                .clickBackPackCartIcon()
                .clickCheckoutButton()
                .fillThefirstNameField()
                .fillThelastNameField()
                .fillThepostCodeFieldDP(option)
                .clickOnsumbitButton()
                .getCheckoutTitle();

        Assert.assertEquals(checkoutTitle,"Checkout: Overview");
    }
}
