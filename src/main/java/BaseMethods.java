import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseMethods {
    protected static WebDriver driver;
    protected WebDriverWait wait;

    public BaseMethods(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait =new WebDriverWait(driver, Duration.ofSeconds(30));

    }

    public void clickToButton(WebElement button) {
        wait.until(ExpectedConditions.elementToBeClickable(button)).click();
    }

    public void fillToField(WebElement field, String text) {
        wait.until(ExpectedConditions.visibilityOf(field)).sendKeys(text);
    }

    public String getText(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }

}
