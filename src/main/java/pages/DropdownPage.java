package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownPage {
    private WebDriver driver;
    By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectOption(String option){
        findDropdownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions(){
        List<WebElement> selectedOptions = findDropdownElement().getAllSelectedOptions();
        List<String> selectedOptionsStrings = new ArrayList<>();
        for (WebElement element:selectedOptions
             ) {
            selectedOptionsStrings.add(element.getText());
        }
        return selectedOptionsStrings;
    }

    private Select findDropdownElement(){
        return new Select(driver.findElement(dropdown));
    }
}
