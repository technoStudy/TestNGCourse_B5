package Day5;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _05_GroupsWithBeforeAfterAnnotations {

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test(groups = "Regression")
    public void Test1() {
        System.out.println("1st Regression Test");
    }

    @Test(groups = "SmokeTest")
    public void Test2() {
        System.out.println("2nd Regression Test");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        System.out.println("After Method");
    }

}
