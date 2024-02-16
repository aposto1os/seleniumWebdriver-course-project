package base;

import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReporter2;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;

public class BaseTests {
    //private EventFiringWebDriver driver;
    private WebDriver webDriver;
    protected HomePage homePage;
    private WebDriver driver;

    @BeforeClass
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        webDriver = new ChromeDriver(setOptions());
        WebDriverListener listener = new EventReporter2();
        driver = new EventFiringDecorator<WebDriver>(listener).decorate(webDriver);
        //driver.register(new EventReporter());
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        goHome();
        setCookie();

        //driver.manage().
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com");
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenShot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenShot, new File("resources/screenshots/" + result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void teardown(){
        driver.quit();
    }

    public WindowManager manager(){
        WindowManager windowManager = new WindowManager(driver);
        return windowManager;
    }

    private ChromeOptions setOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        //options.addArguments("--headless=new");
        return options;
    }

    private void setCookie(){
        Cookie cookie = new Cookie.Builder("tau", "1")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }

}
