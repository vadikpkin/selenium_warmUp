package test;

import org.testng.annotations.Test;
import pages.DynamicLoading;
import pages.HomePage;

public class DynamicLoadingTest extends BaseTest {

    @Test
    public void dynamicLoadingExample2Test(){
        HomePage homePage = new HomePage(getDriver());
        DynamicLoading dynamicLoading = homePage.selectDynamicLoadingExample2();
        dynamicLoading.clickStart();
    }
}
