package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String LeftFrameGetText(){
        movToLeftFrame();
        String text = driver.findElement(By.tagName("body")).getText();
        returnToParentFrame();
        returnToParentFrame();
        return text;
    }

    public String BottomFrameGetText(){
        moveToBottomFrame();
        String text = driver.findElement(By.tagName("body")).getText();
        returnToParentFrame();
        return text;
    }

    private void moveToUpperFrameSet(){
        driver.switchTo().frame(0);
    }

    private void moveToBottomFrame(){
        driver.switchTo().frame(1);
    }

    private void movToLeftFrame(){
        moveToUpperFrameSet();
        driver.switchTo().frame(0);
    }

    private void returnToParentFrame(){
        driver.switchTo().parentFrame();
    }


}
