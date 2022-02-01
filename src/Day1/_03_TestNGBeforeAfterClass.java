package Day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _03_TestNGBeforeAfterClass {

    @BeforeClass // will get executed before any @Test gets executed! (only 1 time)
    public void beforeAllTests() {
        System.out.println("Do something before running any Test!");
    }

    @AfterClass // will get executed after all the @Test s are completed! (only 1 time)
    public void afterAllTest() {
        System.out.println("Do something after all tests are executed!");
    }

    @Test
    public void test1() {
        System.out.println("Running Test 1!");
    }

    @Test
    public void test2() {
        System.out.println("Running Test 2!");
    }

}
