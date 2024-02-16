package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTests extends BaseTests {

    @Test
    public void testHover(){
        var hoverPage = homePage.clickHoversPageLink();
        var figureCaption= hoverPage.hoverOverFigure(1);
        assertTrue(figureCaption.isDisplayed(), "caption is not displayed");
        assertEquals(figureCaption.getCaptionText(),"name: user1", "caption text is incorrect");
        assertEquals(figureCaption.getLinkText(),"View profile");
        assertTrue(figureCaption.getLinkAddress().contains("/users/1"), "incorrect link address");

    }
}
