package Day5;

import org.testng.annotations.*;

public class _01_TestNGXMLAnnotations {

    @BeforeSuite
    public void beforeSuiteMethod() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuiteMethod() {
        System.out.println("After Suite");
    }

    @BeforeTest // This will get executed before <test> tag not @Test
    public void beforeTestMethod() {
        System.out.println("Before Test");
    }

    @AfterTest // This will get executed after <test> tag not @Test
    public void afterTestMethod() {
        System.out.println("After Test");
    }

    @Test
    public void testMethod() {
        System.out.println("Actual Test");
    }

}
