package navigation;

import base.BaseTests;
import org.testng.annotations.Test;
import utils.WindowManager;

public class NavigationTests extends BaseTests {

    @Test
    public void navigateTest(){
        homePage.clickDynamicLoadingPageLink().clickExample1Link();
        WindowManager windowmanager = manager();
        windowmanager.goBack();
        windowmanager.goBack();
        windowmanager.goForward();
        windowmanager.refresh();
        windowmanager.goTo("https://google.com");
    }

    @Test
    public void changeTabTest(){
        homePage.clickMultipleWindowsLink().openNewTab();
        WindowManager windowmanager = manager();
        windowmanager.switchToWindow("New Window");
    }

    @Test
    public void openTab(){
        var newTab = homePage.clickDynamicLoadingPageLink().openExample2InNewTab();
        WindowManager manager = manager();
        manager.switchToNewTab();
    }
}
