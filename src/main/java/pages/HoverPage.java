package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {

    private WebDriver driver;
    private By image = By.className("figure");
    private By boxCaption = By.className("figcaption");

    public HoverPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * imageIndex starts from 1
     * @param imageIndex
     */
    public ImageCaption hoverOverImage (int imageIndex){
        Actions actionts = new Actions(driver);
        actionts.moveToElement(driver.findElements(image).get(imageIndex - 1)).build().perform();
        return new ImageCaption(driver.findElement(image).findElement(boxCaption));
    }


    public class ImageCaption{

        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public ImageCaption(WebElement caption){
            this.caption = caption;
        }

        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public String getTitle(){
            return caption.findElement(header).getText();
        }

        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }

        public String getLinkText(){
            return caption.findElement(link).getText();
        }
    }
}
