package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigator;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigator = driver.navigate();
    }

    public void goBack(){
        navigator.back();
    }

    public void goForward(){
        navigator.forward();
    }

    public void refresh(){
        navigator.refresh();
    }

    public void goTo(String url){
        navigator.to(url);
    }

    public void switchToWindow(String title){
        var windows = driver.getWindowHandles();
        for (String window:windows
             ) {
            driver.switchTo().window(window);
            if(driver.getTitle().equals(title)){
                break;
            }
        }
    }

    public void switchToNewTab(){
        var windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);
    }
}
