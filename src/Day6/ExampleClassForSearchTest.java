package Day6;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExampleClassForSearchTest {

    @Test
    @Parameters({"searchItem"})
    public void exampleTestMethod(String searchItem) {
        System.out.println(searchItem);
    }

}
