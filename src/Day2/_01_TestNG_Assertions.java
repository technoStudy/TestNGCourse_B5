package Day2;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class _01_TestNG_Assertions {

    @Test
    public void assertEquals() {
        String expected = "Hello";
        String actual = "Hello";

        Assert.assertEquals(actual, expected, "Actual result should be equal to Expected result!!");
    }

    @Test
    public void assertEquals2() {
        String expected = "Hello";
        String actual = "hello";

        Assert.assertEquals(actual, expected, "Actual result should be equal to Expected result!!");
    }

    @Test
    public void assertEquals3() {
        String[] expected = {"Hello", "twenty"};
        String[] actual = {"twenty" ,"Hello"};

        Assert.assertEquals(actual, expected, "Actual result should be equal to Expected result!!");
    }

    @Test
    public void assertEqualsNoOrder() {
        String[] expected = {"Hello", "twenty"};
        String[] actual = {"twenty","Hello"};

        Assert.assertEqualsNoOrder(actual, expected);
    }

    @Test
    public void assertSame() {
        String[] expected = {"TechnoStudy"};
        String[] actual = {"TechnoStudy"};

        Assert.assertSame(actual, expected, "Actual and Expected should point to same object!");
    }

    @Test
    public void assertSame2() {
        String[] expected = {"Hello"};
        String[] actual = expected;

        Assert.assertSame(actual, expected, "Actual and Expected should point to same object!");
    }

    @Test
    public void assertNotSame() {
        String[] expected = {"TechnoStudy"};
        String[] actual = {"TechnoStudy"};

        Assert.assertNotSame(actual, expected, "Actual and Expected should not point to same object");
    }

    @Test
    public void assertNotSame2() {
        String[] expected = {"Hello"};
        String[] actual = expected;

        Assert.assertNotSame(actual, expected, "Actual and Expected should not point to same object");
    }

    @Test
    public void assertNotNull() {
        String nullString = null;

        Assert.assertNotNull(nullString);
    }

    @Test
    public void assertNotNull2() {
        String notNullString = "TestNG";

        Assert.assertNotNull(notNullString);
    }

    public boolean isDataAvailable() {
        Random rnd = new Random();
        return rnd.nextBoolean();
    }

    @Test
    public void assertTrue() {
        boolean actual = isDataAvailable();

        Assert.assertTrue(actual);
    }

    @Test
    public void assertFalse() {
        boolean actual = isDataAvailable();

        Assert.assertFalse(actual);
    }

    @Test
    public void assertFail() {
        if (!isDataAvailable()) {
            Assert.fail();
        }
    }

    @Test
    public void assertFail2() {
        try {
            // try to find element
        } catch (NoSuchElementException ex) {
            Assert.fail("Test failed because Selenium cannot find element!");
        }
    }

}
