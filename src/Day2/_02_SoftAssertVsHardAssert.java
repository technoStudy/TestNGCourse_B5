package Day2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// Interview Question!!!
public class _02_SoftAssertVsHardAssert {

    // Hard Assert
    // When you use "Hard Assert" if Assertion fails, execution will stop!
    @Test
    public void hardAssert() {
        System.out.println("Before Assertion");
        Assert.fail();
        System.out.println("After Assertion");
    }

    // Soft Assert
    // Use soft Asserts if you want to continue testing even though some assertions failed already!
    @Test
    public void softAssert() {
        System.out.println("Before Assertion");
        SoftAssert sf = new SoftAssert();
        sf.fail();
        System.out.println("After Assertion");

        sf.assertAll(); // will check every assertion and throw an exception if any assertion fails!
    }

}
