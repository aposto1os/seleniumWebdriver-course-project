package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressesTests extends BaseTests {

    @Test
    public void testKeyPresses(){
        var keyPressesPage = homePage.clickKeyPressesLink();
        //keyPressesPage.enterText("a" + Keys.BACK_SPACE);
        //assertEquals(keyPressesPage.getAssertionText(), "You entered: BACK_SPACE", "not expected outcome");
        keyPressesPage.enterText(Keys.chord(Keys.LEFT_SHIFT, "p"));
        assertEquals(keyPressesPage.getText(), "P", "not expected outcome");
    }
}
