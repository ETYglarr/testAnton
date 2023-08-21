import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseMethods {

    private final String URL = "https://habr.com/ru/articles/";

    public LoginPage(WebDriver driver) {super(driver);}

    @FindBy(xpath = "//*[contains(text(), 'Профиль')]/ancestor::div[@class = 'tm-dropdown']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class = 'tm-entity-image__pic']/ancestor::div[@class = 'tm-dropdown']")
    public WebElement user;

    @FindBy(xpath = "//a[@class = 'tm-user-item__username']")
    public WebElement userName;

    @FindBy(xpath = "//a[@class = 'tm-user-menu__auth-button' and contains(text(), 'Войти')]")
    public WebElement singIn;

    @FindBy(xpath = "//input[@type = 'email']")
    public WebElement mail;

    @FindBy(xpath = "//input[@type = 'password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type = 'submit']")
    public WebElement logIn;

    @FindBy(xpath = "//span[contains(text(), 'Выход')]")
    public WebElement out;

    public void openMainPage() {
        driver.navigate().to(URL);
    }

    public void login() {
        clickToButton(loginButton);
        clickToButton(singIn);
        fillToField(mail, "antik_96@mail.ru");
        fillToField(password, "Antik123456");
        clickToButton(logIn);
    }
}
