package Day2.AssertionTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _01_TestButtons {

    // Create 3 tests for each button
    // Validate message after click on each button

    @Test
    public void clickMeButtonTest() {
        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/buttons");

        WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        clickMeButton.click();

        WebElement dynamicClickMessage = driver.findElement(By.id("dynamicClickMessage"));
        String actual = dynamicClickMessage.getText();

        String expected = "You have done a dynamic click";

        Assert.assertEquals(actual, expected);

        driver.quit();
    }

    @Test
    public void rightClickMeButtonTest() {
        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/buttons");

        Actions actions = new Actions(driver);

        WebElement rightClickMeButton = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickMeButton).perform();

        WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));
        String actual = rightClickMessage.getText();

        String expected = "You have done a right click";

        Assert.assertEquals(actual, expected);

        driver.quit();
    }

    @Test
    public void doubleClickMeButtonTest() {
        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/buttons");

        Actions actions = new Actions(driver);

        WebElement doubleClickMeButton = driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(doubleClickMeButton).perform();

        WebElement doubleClickText = driver.findElement(By.id("doubleClickMessage"));
        String actual = doubleClickText.getText();

        String expected = "You have done a double click";

        Assert.assertEquals(actual, expected);

        driver.quit();
    }

}