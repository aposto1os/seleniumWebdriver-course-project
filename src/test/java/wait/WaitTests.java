package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {
    @Test
    public void testDynamicExample1(){
        var example1Page = homePage.clickDynamicLoadingPageLink().clickExample1Link();
        example1Page.clickStart();
        assertEquals(example1Page.getFinishText(), "Hello World!", "incorrect message");
    }

    @Test
    public void testDynamicExample2(){
        var example2Page = homePage.clickDynamicLoadingPageLink().clickExample2Link();
        example2Page.clickStartButton();
        assertEquals(example2Page.getTextFromFinish(), "Hello World!", "incorrect message");
    }
}
