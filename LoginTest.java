package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.DriverManager;

public class LoginTest {
    private WebDriver driver;
    private page.LoginPage loginPage;
    @BeforeMethod
    public void setup() {
        driver = DriverManager.getDriver();
        driver.get("https://write-wave-gamma.vercel.app/");
        loginPage = new page.LoginPage(driver);
    }

    @Test
    public void testSuccessfulLogin() throws InterruptedException {
    	loginPage.clickLoginBtn();
    	Thread.sleep(3000);
        loginPage.enterEmail("rashmii");
        loginPage.enterPassword("rashmi@123");
        Thread.sleep(2000);
        loginPage.clickLogin();
        
        Thread.sleep(5000);

       
    }

    @AfterMethod
    public void teardown() {
        DriverManager.closeDriver();
    }
}