package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By example1Link = By.linkText("Example 1: Element on page that is hidden");
    private By example2Link = By.linkText("Example 2: Element rendered after the fact");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingPageExample1 clickExample1Link(){
        driver.findElement(example1Link).click();
        return new DynamicLoadingPageExample1(driver);
    }

    public DynamicLoadingPageExample2 clickExample2Link(){
        driver.findElement(example2Link).click();
        return new DynamicLoadingPageExample2(driver);
    }

    public DynamicLoadingPageExample2 openExample2InNewTab(){
        var target = driver.findElement(example2Link);
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.LEFT_CONTROL).perform();
        target.click();
        actions.release().perform();
        return new DynamicLoadingPageExample2(driver);
    }
}
