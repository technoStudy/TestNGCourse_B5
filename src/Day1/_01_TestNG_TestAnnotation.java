package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_TestNG_TestAnnotation {

    @Test
    public void test1() {

        String expectedURL = "https://techno.study/";

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study/");

        String actualURL = driver.getCurrentUrl();

        // each test should have at least 1 Assertion (Validation)
        Assert.assertEquals(actualURL, expectedURL);

        driver.quit();

    }

    @Test
    public void test2() {

        String expectedURL = "https://techno.study/sdetcourse";

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study/");

        WebElement sdetCourseLink = driver.findElement(By.xpath("//a[text()='SDET course']"));
        sdetCourseLink.click();

        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL, expectedURL);

        driver.quit();

    }

    @Test
    public void test3() {

        String expectedURL = "https://techno.study/mobileappdeveloper";

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study/");

        WebElement mobileDevCourseLink = driver.findElement(By.xpath("//a[text()='Mobile Dev course']"));
        mobileDevCourseLink.click();

        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL, expectedURL); // actualURL.equals(expectedURL)

        driver.quit();

    }

}
