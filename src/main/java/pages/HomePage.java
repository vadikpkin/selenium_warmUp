package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoading selectDynamicLoadingExample2(){
        clickLink("Dynamic Loading");
        clickLink("Example 2: Element rendered after the fact");
        return new DynamicLoading(driver);
    }

    public JavaScriptAlertsPage selectJavaScriptAlertsPage(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }

    public ContexMenuPage selectContexMenuPage(){
        clickLink("Context Menu");
        return new ContexMenuPage(driver);
    }

    public DropDownPage selectDropDownPage(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public HoverPage selectHoverPage(){
        clickLink("Hovers");
        return new HoverPage(driver);
    }

    public HorizontalSliderPage selectHorizontalSliderPage(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
