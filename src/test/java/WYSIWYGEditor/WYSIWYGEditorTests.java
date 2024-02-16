package WYSIWYGEditor;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WYSIWYGEditorTests extends BaseTests {
    @Test
    public void TestEditor(){
        var editor = homePage.clickWYSIWYGEditorLink();
        editor.clearEditor();
        String text1 = "hello ";
        String text2 = "world";
        editor.writeInEditor(text1);
        editor.increaseIndent();
        editor.writeInEditor(text2);
        assertEquals(editor.getTextFromEditor(), text1 + text2, "incorrect editor text");
    }
}
