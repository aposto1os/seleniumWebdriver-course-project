package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WYSIWYGEditorPage {
    private WebDriver driver;
    private String editorInIframe = "mce_0_ifr";
    private By editor = By.id("tinymce");

    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearEditor(){
        switchToEditor();
        driver.findElement(editor).clear();
        switchToMainSite();
    }

    public void writeInEditor(String text){
        switchToEditor();
        driver.findElement(editor).sendKeys(text);
        switchToMainSite();
    }

    public String getTextFromEditor(){
        switchToEditor();
        String text = driver.findElement(editor).getText();
        switchToMainSite();
        return text;
    }

    public void increaseIndent(){
        var buttons = driver.findElements(By.tagName("button"));
        WebElement increaseIndentButton = null;
        for (var button:buttons
             ) {
            if (button.getAccessibleName().equals("Increase indent")){
                increaseIndentButton = button;
            }
        }
        increaseIndentButton.click();
    }

    private void switchToEditor(){
        driver.switchTo().frame(editorInIframe);
    }

    private void switchToMainSite(){
        driver.switchTo().parentFrame();
    }
}
