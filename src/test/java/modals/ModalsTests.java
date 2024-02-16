package modals;

import base.BaseTests;
import org.testng.annotations.Test;

public class ModalsTests extends BaseTests {
    @Test
    public void testModal(){
        var modalPage = homePage.clickModalPageLink();
        modalPage.closeModal();
    }
}
