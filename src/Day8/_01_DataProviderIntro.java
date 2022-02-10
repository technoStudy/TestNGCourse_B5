package Day8;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProviderIntro {

    @Test(dataProvider = "TestData")
    public void test(String data) {
        System.out.println(data);
    }

    @DataProvider(name = "TestData")
    public Object[][] testDataProvider() {

        return new Object[][] {
                {"Test1"}, {"Test2"}, {"Test3"}
        };
    }


    // ----------------------------------------------


    @Test(dataProvider = "FullNameProvider")
    public void printFullName(String firstName, String lastName) {
        System.out.print("FirstName: " + firstName + " - ");
        System.out.println("LastName: " + lastName);
    }

    @DataProvider(name = "FullNameProvider")
    public Object[][] nameProvider() {

        return new Object[][] {
                {"Mark", "Gerrard"}, {"Emily", "Frank"}
        };
    }

}

