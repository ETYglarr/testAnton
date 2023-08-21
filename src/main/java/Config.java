import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class Config {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public static String remote_url_chrome = "http://localhost:4445/wd/hub";

    @BeforeMethod
    public void browserConfig() throws Exception {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-dev-shm-usage");
        options.addArguments("--lang=ru");

        if (System.getProperty("os.name").contains("Windows")) {
            
            WebDriverManager.chromedriver().setup();
            setDriver(new RemoteWebDriver(new URL(remote_url_chrome), options));
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    protected void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
