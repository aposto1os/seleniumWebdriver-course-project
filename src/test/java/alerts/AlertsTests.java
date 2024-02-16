package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {

    @Test
    public void acceptAlertTest(){
        var alertsPage = homePage.clickJavaScriptAlertsLink();
        alertsPage.triggerAlert();
        alertsPage.alert_pressConfirm();
        assertEquals(alertsPage.getAlertPageText(), "You successfully clicked an alert", "incorrect alert text");
    }

    @Test
    public void alertTextTest(){
        var alertsPage = homePage.clickJavaScriptAlertsLink();
        alertsPage.triggerConfirm();
        assertEquals(alertsPage.getTextFromAlertPopup(), "I am a JS Confirm", "wrong message");
    }

    @Test
    public void inputTextInAlertField(){
        String text = "test";
        var alertsPage = homePage.clickJavaScriptAlertsLink();
        alertsPage.triggerPrompt();
        alertsPage.setPromptText(text);
        assertEquals(alertsPage.getAlertPageText(), "You entered: " + text, "incorrect text" );
    }

    @Test
    public void rightClickToGetAlert(){
        var contextMenu = homePage.clickContextMenuLink();
        assertEquals(contextMenu.rightClickBox(), "You selected a context menu", "wrong message");
    }
}


