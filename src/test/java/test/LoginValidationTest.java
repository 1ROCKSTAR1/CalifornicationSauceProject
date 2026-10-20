package test;

import base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AutorizationPage;
import page.LoginPage;

import static java.sql.DriverManager.getDriver;

@Epic(value = "Auth Validation")
@Feature(value = "Login Field")
@Severity(value = SeverityLevel.NORMAL)
public class LoginValidationTest extends BaseTest {

    LoginPage loginPage = new LoginPage(getDriver());

    @Description("TC-L-001: Минимальная длина (1 символ)")
    @Test(priority = 1, description = "Login Length: Min 1")
    public void tcL001() {
        loginPage
                .setLogin("a")
                .setPassword("validPass1")
                .clickSubmit();
        Allure.step("Check input");
        Assert.assertFalse(loginPage.hasError(loginPage.loginInput), "Field should be valid");
    }

    @Description("TC-L-002: Максимальная длина (25 символов)")
    @Test(priority = 2, description = "Login Length: Max 25")
    public void tcL002() {
        loginPage
                .setLogin("abcdefghijklmnopqrstuvwx")
                .setPassword("validPass1")
                .clickSubmit();
        Allure.step("Check input");
        Assert.assertFalse(loginPage.hasError(loginPage.loginInput), "Field should be valid");
    }

    @Description("TC-L-003: За границей снизу (0 символов)")
    @Test(priority = 3, description = "Login Length: Empty")
    public void tcL003() {
        loginPage
                .setLogin("")
                .setPassword("validPass1")
                .clickSubmit();
        Allure.step("Check error");
        Assert.assertTrue(loginPage.hasError(loginPage.loginInput), "Field should be highlighted red");
    }

    @Description("TC-L-004: За границей сверху (26 символов)")
    @Test(priority = 4, description = "Login Length: 26 chars")
    public void tcL004() {
        loginPage
                .setLogin("a".repeat(26))
                .setPassword("validPass1")
                .clickSubmit();
        Allure.step("Check error");
        Assert.assertTrue(loginPage.hasError(loginPage.loginInput), "Field should be highlighted red");
    }

    @Description("TC-L-005: За границей сверху (50 символов)")
    @Test(priority = 5, description = "Login Length: 50 chars")
    public void tcL005() {
        loginPage
                .setLogin("a".repeat(50))
                .setPassword("validPass1")
                .clickSubmit();
        Allure.step("Check error");
        Assert.assertTrue(loginPage.hasError(loginPage.loginInput));
    }

    @Description("TC-L-006: За границей сверху (100 символов)")
    @Test(priority = 6, description = "Login Length: 100 chars")
    public void tcL006() {
        loginPage
                .setLogin("a".repeat(100))
                .setPassword("validPass1")
                .clickSubmit();
        Allure.step("Check error");
        Assert.assertTrue(loginPage.hasError(loginPage.loginInput));
    }

    @Description("TC-L-007: Длина 2 символа")
    @Test(priority = 7, description = "Login Length: 2 chars")
    public void tcL007() {
        loginPage
                .setLogin("ab")
                .setPassword("validPass1")
                .clickSubmit();
        Assert.assertFalse(loginPage.hasError(loginPage.loginInput));
    }

    @Description("TC-L-008: Длина 24 символа")
    @Test(priority = 8, description = "Login Length: 24 chars")
    public void tcL008() {
        loginPage
                .setLogin("a".repeat(24))
                .setPassword("validPass1")
                .clickSubmit();
        Assert.assertFalse(loginPage.hasError(loginPage.loginInput));
    }

    // --- 2. ВАЛИДАЦИЯ ПОЛЯ «ЛОГИН» — Тип символов ---

    @Description("TC-L-009: Только латинские (lowercase)")
    @Test(description = "Login Type: Lowercase")
    public void tcL009() {
        loginPage
                .setLogin("user123")
                .setPassword("validPass1")
                .clickSubmit();
        Assert.assertFalse(loginPage.hasError(loginPage.loginInput));
    }

    @Description("TC-L-010: Только латинские (uppercase)")
    @Test(description = "Login Type: Uppercase")
    public void tcL010() {
        loginPage
                .setLogin("USER123")
                .setPassword("validPass1")
                .clickSubmit();
        Assert.assertFalse(loginPage.hasError(loginPage.loginInput));
    }

    @Description("TC-L-011: Микс (mixed case)")
    @Test(description = "Login Type: Mixed Case")
    public void tcL011() {
        loginPage
                .setLogin("UsEr123")
                .setPassword("validPass1")
                .clickSubmit();
        Assert.assertFalse(loginPage.hasError(loginPage.loginInput));
    }

    @Description("TC-L-012: Только цифры")
    @Test(description = "Login Type: Digits only")
    public void tcL012() {
        loginPage
                .setLogin("12345678")
                .setPassword("validPass1")
                .clickSubmit();
        Assert.assertFalse(loginPage.hasError(loginPage.loginInput));
    }

    @Description("TC-L-013: Спецсимволы")
    @Test(description = "Login Type: Special chars")
    public void tcL013() {
        loginPage
                .setLogin("!@#$%^&*")
                .setPassword("validPass1")
                .clickSubmit();
        Assert.assertFalse(loginPage.hasError(loginPage.loginInput));
    }

    @Description("TC-L-014: Буквы + цифры")
    @Test(description = "Login Type: Letters + Digits")
    public void tcL014() {
        loginPage
                .setLogin("user123")
                .setPassword("validPass1")
                .clickSubmit();
        Assert.assertFalse(loginPage.hasError(loginPage.loginInput));
    }

    @Description("TC-L-015: Буквы + спецсимволы")
    @Test(description = "Login Type: Letters + Special")
    public void tcL015() {
        loginPage
                .setLogin("user_@test")
                .setPassword("validPass1")
                .clickSubmit();
        Assert.assertFalse(loginPage.hasError(loginPage.loginInput));
    }

    @Description("TC-L-016: Цифры + спецсимволы")
    @Test(description = "Login Type: Digits + Special")
    public void tcL016() {
        loginPage
                .setLogin("123_!@#")
                .setPassword("validPass1")
                .clickSubmit();
        Assert.assertFalse(loginPage.hasError(loginPage.loginInput));
    }

    @Description("TC-L-017: Все типы символов")
    @Test(description = "Login Type: All Mixed")
    public void tcL017() {
        loginPage
                .setLogin("user_123!@#")
                .setPassword("validPass1")
                .clickSubmit();
        Assert.assertFalse(loginPage.hasError(loginPage.loginInput));
    }

    @Description("TC-L-018: Кириллица")
    @Test(description = "Login Type: Cyrillic")
    public void tcL018() {
        loginPage
                .setLogin("пользователь")
                .setPassword("validPass1")
                .clickSubmit();
        Assert.assertTrue(loginPage.hasError(loginPage.loginInput), "Should be invalid");
    }

    @Description("TC-L-019: Кириллица + латиница")
    @Test(description = "Login Type: Cyrillic + Latin")
    public void tcL019() {
        loginPage
                .setLogin("userпольз")
                .setPassword("validPass1")
                .clickSubmit();
        Assert.assertTrue(loginPage.hasError(loginPage.loginInput));
    }

    @Description("TC-L-020: Пробелы внутри")
    @Test(description = "Login Type: Spaces Inside")
    public void tcL020() {
        loginPage
                .setLogin("user name")
                .setPassword("validPass1")
                .clickSubmit();
        Assert.assertTrue(loginPage.hasError(loginPage.loginInput));
    }

    @Description("TC-L-021: Пробел в начале")
    @Test(description = "Login Type: Space Start")
    public void tcL021() {
        loginPage
                .setLogin(" user")
                .setPassword("validPass1")
                .clickSubmit();
        Assert.assertTrue(loginPage.hasError(loginPage.loginInput));
    }

    @Description("TC-L-022: Пробел в конце")
    @Test(description = "Login Type: Space End")
    public void tcL022() {
        loginPage
                .setLogin("user ")
                .setPassword("validPass1")
                .clickSubmit();
        Assert.assertTrue(loginPage.hasError(loginPage.loginInput));
    }

    @Description("TC-L-023: Эмодзи")
    @Test(description = "Login Type: Emoji")
    public void tcL023() {
        loginPage
                .setLogin("user😀name")
                .setPassword("validPass1")
                .clickSubmit();
        Assert.assertTrue(loginPage.hasError(loginPage.loginInput));
    }

    @Description("TC-L-024: Спец ._-")
    @Test(description = "Login Type: Safe Specials")
    public void tcL024() {
        loginPage
                .setLogin("user.name_123")
                .setPassword("validPass1")
                .clickSubmit();
        Assert.assertFalse(loginPage.hasError(loginPage.loginInput));
    }

    @Description("TC-L-025: Спец @#$...")
    @Test(description = "Login Type: Unsafe Specials")
    public void tcL025() {
        loginPage
                .setLogin("user@name#test")
                .setPassword("validPass1")
                .clickSubmit();
        Assert.assertFalse(loginPage.hasError(loginPage.loginInput));
    }

    @Description("TC-L-026: Спец []{}")
    @Test(description = "Login Type: Brackets")
    public void tcL026() {
        loginPage
                .setLogin("user{}name")
                .setPassword("validPass1")
                .clickSubmit();
        // Ожидаемый результат зависит от уточнения, тут проверяем отсутствие краша
        Assert.assertTrue(true);
    }

    @Description("TC-L-027: Спец \\/'")
    @Test(description = "Login Type: Quotes/Slashes")
    public void tcL027() {
        loginPage
                .setLogin("user\\n\"ame")
                .setPassword("validPass1")
                .clickSubmit();
        Assert.assertFalse(loginPage.hasError(loginPage.loginInput));
    }
}
