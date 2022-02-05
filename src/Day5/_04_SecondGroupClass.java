package Day5;

import org.testng.annotations.Test;

public class _04_SecondGroupClass {

    // Can add multiple parameters (groups, priority)
    @Test(groups = "Regression", priority = 1)
    public void Test1() {
        System.out.println("Test1");
    }

    @Test(groups = "SmokeTest", priority = 2)
    public void Test2() {
        System.out.println("Test2");
    }

    @Test(groups = "Regression", priority = 3)
    public void Test3() {
        System.out.println("Test3");
    }

    @Test(groups = "SmokeTest", priority = 4)
    public void Test4() {
        System.out.println("Test4");
    }

    // You can add 1 test into multiple groups
    @Test(groups = {"Regression", "SmokeTest"}, priority = 5)
    public void Test5() {
        System.out.println("Test5");
    }

    @Test
    public void Test6() {
        System.out.println("This Test is not in any group!");
    }

}
