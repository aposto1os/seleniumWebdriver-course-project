package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class DynamicLoadingPageExample1 {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loading = By.id("loading");
    private By finish = By.id("finish");

    public DynamicLoadingPageExample1(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(startButton).click();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        FluentWait wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5))
                        .pollingEvery(Duration.ofSeconds(1))
                        .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loading));
    }

    public String getFinishText(){
        return driver.findElement(finish).getText();
    }

}
