package test;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.JavaScriptAlertsPage;
import static org.testng.Assert.*;

public class JavaScriptAlertsPageTest extends BaseTest {

    @Test
    public void jsAlertAcceptTest(){
        HomePage homePage = new HomePage(getDriver());
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.selectJavaScriptAlertsPage();
        javaScriptAlertsPage.clickJsAlert();
        javaScriptAlertsPage.acceptJsAlert();
        assertEquals(javaScriptAlertsPage.getResultText(), "You successfuly clicked an alert");
    }

    @Test
    public void jsConfirmAlertDismissTest(){
        HomePage homePage = new HomePage(getDriver());
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.selectJavaScriptAlertsPage();
        javaScriptAlertsPage.clickJsConfirmAlert();
        javaScriptAlertsPage.dismissJsConfirmAlert();
        assertEquals(javaScriptAlertsPage.getResultText(), "You clicked: Cancel");
    }

    @Test
    public void jsPromptAlertTest(){
        HomePage homePage = new HomePage(getDriver());
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.selectJavaScriptAlertsPage();
        javaScriptAlertsPage.clickJsPromptAlert();
        String value = "Java AT";
        javaScriptAlertsPage.setStringToJsPromptAlert(value);
        javaScriptAlertsPage.acceptJsAlert();
        assertEquals(javaScriptAlertsPage.getResultText(), "You entered: " + value);
    }
}
