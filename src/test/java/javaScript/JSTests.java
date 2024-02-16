package javaScript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JSTests extends BaseTests {
    @Test
    public void scrollToElementTest(){
        homePage.clickLargeAndDeepDOMPageLink().scrollToTable();
    }

    @Test
    public void scrollInInfinitePageTest() {
        homePage.clickInfiniteScrollPageLink().scrollToFifthParagraph();
    }
}
