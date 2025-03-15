package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.CreatePostPage;
import page.DashboardPage;
import utils.DriverManager;

public class LoginTest {
    private WebDriver driver;
    private page.LoginPage loginPage;
	private DashboardPage dashboardPage;
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
        dashboardPage = new DashboardPage(driver);
        Assert.assertTrue(dashboardPage.getWelcomeMessage().contains("rashmii"));
        System.out.println("<---------Login Successfull----------->");
        
        
     
        // Create Post
        dashboardPage.clickCreatePost();
        Thread.sleep(3000);
        CreatePostPage createPostPage = new CreatePostPage(driver);
        createPostPage.enterTitle("My First Test Post");
        Thread.sleep(2000);
        createPostPage.enterContent("This is an automated test post.");
        Thread.sleep(2000);
        createPostPage.uploadfile("C:\\Users\\rashm\\OneDrive\\Pictures\\Screenshots\\mindmap write wave.png");
        Thread.sleep(2000);
        createPostPage.clickPublish();
        
        // Verify Post Creation
        Assert.assertTrue(createPostPage.getSuccessMessage().contains("Post published successfully"));
       
    }

    @AfterMethod
    public void teardown() {
        DriverManager.closeDriver();
    }
}