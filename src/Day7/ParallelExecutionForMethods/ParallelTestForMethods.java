package Day7.ParallelExecutionForMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTestForMethods {

    @Test
    public void navigateGoogle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        Thread.sleep(3000);

        Assert.assertTrue(driver.getCurrentUrl().contains("google"));

        driver.quit();
    }

    @Test
    public void navigateFacebook() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        Thread.sleep(3000);

        Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));

        driver.quit();
    }

    @Test
    public void navigateESPN() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.espn.com/");

        Thread.sleep(3000);

        Assert.assertTrue(driver.getCurrentUrl().contains("espn"));

        driver.quit();
    }

}
