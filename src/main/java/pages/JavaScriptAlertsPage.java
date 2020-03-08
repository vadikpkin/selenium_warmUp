package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {

    private WebDriver driver;
    private By triggerJsAlert = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerJsConfirmAlert = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerJsPromptAlert = By.xpath(".//button[text()='Click for JS Prompt']");
    private By result = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickJsAlert(){
        driver.findElement(triggerJsAlert).click();
    }

    public void clickJsConfirmAlert(){
        driver.findElement(triggerJsConfirmAlert).click();
    }

    public void clickJsPromptAlert(){
        driver.findElement(triggerJsPromptAlert).click();
    }

    public void acceptJsAlert(){
        driver.switchTo().alert().accept();
    }

    public void dismissJsConfirmAlert(){
        driver.switchTo().alert().dismiss();
    }

    public void setStringToJsPromptAlert(String value){
        driver.switchTo().alert().sendKeys(value);
    }

    public String  getResultText() {
        return driver.findElement(result).getText();
    }
}
