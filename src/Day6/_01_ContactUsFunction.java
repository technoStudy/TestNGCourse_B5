package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _01_ContactUsFunction {

    @Test
    @Parameters({"enquiry"}) // with @Parameters tag testng.xml file is able to understand 'enquiry' data should be sent to @Test
    public void contactUsTest(String enquiry) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://opencart.abstracta.us/index.php?route=common/home");

        WebElement myAccountButton = driver.findElement(By.xpath("//a[@title='My Account']"));
        myAccountButton.click();

        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();

        WebElement usernameInput = driver.findElement(By.id("input-email"));
        usernameInput.sendKeys("test@technostudy.com");

        WebElement passwordInput = driver.findElement(By.id("input-password"));
        passwordInput.sendKeys("Test12345..");

        WebElement submitLoginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        submitLoginButton.click();

        WebElement homePageButton = driver.findElement(By.xpath("//a[text()='Your Store']"));
        homePageButton.click();

        // ------------------************************------------------------

        WebElement contactUsButton = driver.findElement(By.xpath("//a[text()='Contact Us']"));
        contactUsButton.click();

        WebElement enquiryInput = driver.findElement(By.id("input-enquiry"));
        enquiryInput.sendKeys(enquiry);

        Thread.sleep(5000);

        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.toLowerCase().contains("success"));

        driver.quit();

    }

}
