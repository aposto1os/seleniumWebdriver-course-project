package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.tagName("input");
    private By sliderIndicator = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSlider(int target){
        for (int i = 0; i < target * 2; i++) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public int getSlidetIndicator(){
        return Integer.parseInt(driver.findElement(sliderIndicator).getText());
    }
}
