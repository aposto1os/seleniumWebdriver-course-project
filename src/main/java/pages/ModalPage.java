package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ModalPage {
    private WebDriver driver;
    private By modal = By.id("modal");

    public ModalPage(WebDriver driver) {
        this.driver = driver;
    }

    public void closeModal(){
        WebElement modalElement = driver.findElement(modal);
        var closeDiv = modalElement.findElement(By.className("modal-footer"));
        var close = closeDiv.findElement(By.tagName("p"));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        close.click();
    }
}
