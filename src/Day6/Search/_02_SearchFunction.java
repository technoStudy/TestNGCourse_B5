package Day6.Search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class _02_SearchFunction {

    @Test
    @Parameters({"searchItem"})
    public void searchFunctionTest(String searchItem) {
        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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

        WebElement searchInput = driver.findElement(By.xpath("//input[@name='search']"));
        searchInput.sendKeys(searchItem);

        WebElement searchButton = driver.findElement(By.xpath("//i[@class='fa fa-search']/.."));
        searchButton.click();

        List<WebElement> searchResults = driver.findElements(By.xpath("//h4"));

        for (WebElement searchResult : searchResults) {
            String searchResultText = searchResult.getText();
            System.out.println(searchResultText);
            Assert.assertTrue(searchResultText.toLowerCase().contains(searchItem.toLowerCase()));
        }

        driver.quit();

    }

}
