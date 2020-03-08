package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoading {

    private WebDriver driver;
    private By startBtn = By.cssSelector("#start button");
    private By finish = By.id("finish");

    public DynamicLoading(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(startBtn).click();
        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(finish));
    }

}
