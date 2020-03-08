package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContexMenuPage {

    private WebDriver driver;

    private By contexMenuTrigger = By.id("hot-spot");

    public ContexMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void rightClickContexMenuTrigger(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(contexMenuTrigger)).build().perform();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
}
