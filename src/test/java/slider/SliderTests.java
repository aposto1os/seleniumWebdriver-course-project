package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void getSliderValueTest(){
        var sliderPage = homePage.clickHorizontalSliderLink();
        sliderPage.setSlider(4);
        assertEquals(sliderPage.getSlidetIndicator(),4, "incorrect slider position");
    }
}
