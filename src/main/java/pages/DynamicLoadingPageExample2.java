package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPageExample2 {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By finish = By.id("finish");

    public DynamicLoadingPageExample2(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartButton(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(finish));
    }

    public String getTextFromFinish(){
        return driver.findElement(finish).getText();
    }
}
