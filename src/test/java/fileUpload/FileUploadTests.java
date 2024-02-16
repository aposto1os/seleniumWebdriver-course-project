package fileUpload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void fileUploadTests(){
        String target = "C:\\Users\\User\\Desktop\\prox.ods";
        var fileUploadPage = homePage.clickFileUploadLink();
        fileUploadPage.uploadFile(target);
        fileUploadPage.clickSubmit();
        assertEquals(fileUploadPage.getUploadedFiles(), "prox.ods", "incorrect file");
    }
}
