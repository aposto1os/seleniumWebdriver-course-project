package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPresses {
    private WebDriver driver;
    private By textField = By.id("target");
    private By assertionText = By.id("result");

    public KeyPresses(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(textField).sendKeys(text);
    }

    public String getText(){
        return driver.findElement(textField).getAttribute("value");
    }

    public String getAssertionText(){
        return driver.findElement(assertionText).getText();
    }
}
