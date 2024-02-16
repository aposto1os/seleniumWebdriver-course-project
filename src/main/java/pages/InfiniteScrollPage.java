package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    By jscrollAdded = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToFifthParagraph(){
        driver.manage().window().fullscreen();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String script = "window.scrollTo(0, document.body.scrollHeight);";
        while (numberOfDivs()<5){
            js.executeScript(script);
        }
    }

    private int numberOfDivs() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(jscrollAdded, 1));
        return driver.findElements(jscrollAdded).size();
    }
}
