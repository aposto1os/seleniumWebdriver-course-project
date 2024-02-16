package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;
    private By triggerJSAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerJSConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerJSPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");
    private By alertText = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerJSAlertButton).click();
    }

    public void triggerConfirm(){
        driver.findElement(triggerJSConfirmButton).click();
    }

    public String getTextFromAlertPopup(){
        return driver.switchTo().alert().getText();
    }

    public void triggerPrompt(){
        driver.findElement(triggerJSPromptButton).click();
    }

    public void alert_pressConfirm(){
        driver.switchTo().alert().accept();
    }

    public void alert_pressDecline(){
        driver.switchTo().alert().dismiss();
    }

    public String getAlertPageText(){
        return driver.findElement(alertText).getText();
    }

    public void setPromptText(String text){
        driver.switchTo().alert().sendKeys(text);
        alert_pressConfirm();
    }

}
