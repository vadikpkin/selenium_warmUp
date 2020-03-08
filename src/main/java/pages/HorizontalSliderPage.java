package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By slider = By.className("sliderContainer");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * value in times to press Keys.ARROW_RIGHT btn
     * max value = 10; min value = 0;
     * one step of slider is 0,5
     * @param value
     */
    public void moveSliderRight(int value) {
        if (value < 0 | value > 10) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < value; i++) {
            driver.findElement(slider).findElement(By.tagName("input")).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getSliderValue(){
        return driver.findElement(slider).findElement(By.id("range")).getText();
    }
}
