package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthenticationLink(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdownLink(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public ForgotPasswordPage clickForgotPasswordLink(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickHoversPageLink(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPresses clickKeyPressesLink(){
        clickLink("Key Presses");
        return new KeyPresses(driver);
    }

    public HorizontalSliderPage clickHorizontalSliderLink(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public JavaScriptAlertsPage clickJavaScriptAlertsLink(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }

    public FileUploadPage clickFileUploadLink(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ModalPage clickModalPageLink(){
        clickLink("Entry Ad");
        return new ModalPage(driver);
    }

    public ContextMenuPage clickContextMenuLink(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WYSIWYGEditorPage clickWYSIWYGEditorLink(){
        clickLink("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
    }

    public FramesPage clickFramesLink(){
        clickLink("Frames");
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingPageLink(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDOMPage clickLargeAndDeepDOMPageLink(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDOMPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScrollPageLink(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindowsLink(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
