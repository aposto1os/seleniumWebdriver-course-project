package frame;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {
    @Test
    public void getTextFromFrames(){
        var framesPage = homePage.clickFramesLink();
        var nestedFramesPage = framesPage.clickNestedFramesLink();
        assertEquals(nestedFramesPage.LeftFrameGetText() + nestedFramesPage.BottomFrameGetText(), "LEFTBOTTOM", "incorrect texts");
    }
}
