package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By fileUpload = By.id("file-upload");
    private By submit = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String target){
        driver.findElement(fileUpload).sendKeys(target);
    }

    public void clickSubmit(){
        driver.findElement(submit).click();
    }

    public String getUploadedFiles(){
        return driver.findElement(uploadedFiles).getText();
    }
}
