package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverListener;

import java.time.LocalTime;

public class EventReporter2 implements WebDriverListener {

    @Override
    public void afterGet(WebDriver driver, String url){
        LocalTime time = LocalTime.now();
        System.out.println("test started at " + time);
    }

    @Override
    public void afterQuit(WebDriver driver){
        LocalTime time = LocalTime.now();
        System.out.println("test ended at " + time);
    }
}
