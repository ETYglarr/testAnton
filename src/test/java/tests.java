import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class tests extends Config {

    private LoginPage loginPage;

    @BeforeMethod
    public void setPages() {
        this.loginPage = new LoginPage(driver);
    }

    @Test
    public void test() throws InterruptedException {
        loginPage.openMainPage();
        TimeUnit.SECONDS.sleep(10);
        loginPage.login();
        TimeUnit.SECONDS.sleep(10);
        loginPage.clickToButton(loginPage.user);
        TimeUnit.SECONDS.sleep(10);
        Assert.assertEquals("@Antik96", loginPage.getText(loginPage.userName), "Логин не соотвествует");
        TimeUnit.SECONDS.sleep(10);
        loginPage.clickToButton(loginPage.out);
    }
}
