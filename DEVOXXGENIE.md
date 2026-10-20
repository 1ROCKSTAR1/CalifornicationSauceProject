# DEVOXXGENIE.md

## Project Guidelines

### Non-Negotiable Rules (MANDATORY)
1.  **Allure Annotations**: Every test class MUST contain `@Feature`. Every test method MUST contain `@Description`. Never skip these.
2.  **@Description Format**: Must be a single line starting with the TC number.

### Build Commands
- **Build:** `mvn clean compile`
- **Test:** `mvn test`
- **Single Test:** `mvn test -Dtest=ClassName#methodName`
- **Clean:** `mvn clean`

### Testing Framework
- **TestNG** is the primary testing framework
- **Allure** is used for test reporting
- Tests in `src/test/java`

### Code Style & Architecture

#### Page Object Model (POM)
- Each page has its own Page Object class with `Page` suffix (e.g., `LoginPage`)
- Page Objects contain NO assertions or test logic
- Page Objects return other Page Objects or perform actions

#### Chain Approach (Fluent Interface)
- Methods should return `this` (the current Page Object instance) to enable method chaining
- Chain methods should be descriptive and follow the action being performed
- Example:
  ```java
  LoginPage loginPage = new LoginPage(driver);
  MainPage mainPage = loginPage
      .enterUsername("user")
      .enterPassword("pass")
      .clickLogin();

#### Element Locators with @FindBy
- Use `@FindBy` annotation for all web elements (NO `driver.findElement()` directly)
- Supported: `@FindBy(id = "id")`, `@FindBy(xpath = "//xpath")`, `@FindBy(css = ".css")`, `@FindBy(name = "name")`, `@FindBy(className = "class")`, `@FindBy(tagName = "tag")`
- Initialize with `PageFactory.initElements(driver, this)` in BasePage constructor

### Naming Conventions
- **Classes (POM):** PascalCase + `Page` suffix (`LoginPage`)
- **Methods:** camelCase, verb-first (`clickSubmit()`, `enterEmail()`)
- **Fields:** camelCase (`usernameInput`, `submitButton`)
- **Constants:** SCREAMING_SNAKE_CASE (`DEFAULT_TIMEOUT`)
- **Test Methods:** camelCase, descriptive (`userShouldLoginWithValidCredentials()`)
- **Test Classes:** PascalCase + `Test` suffix (`LoginPageTest`)

### Test Structure

#### TestNG Annotations
| Annotation | Usage |
|------------|-------|
| `@Test` | Marks a test method |
| `@BeforeMethod` | Setup before each test |
| `@AfterMethod` | Cleanup after each test |
| `@BeforeClass` | One-time setup |
| `@DataProvider` | Data-driven testing |

#### Allure Annotations
```java
@Feature("Sub-feature")
@Description("TC-XXX: Brief description of what this test verifies")