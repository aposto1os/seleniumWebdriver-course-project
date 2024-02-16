package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
    private By figure = By.className("figure");
    private By figcaption = By.className("figcaption");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @param index starts at 1.
     */
    public FigureCaption hoverOverFigure(int index){
        var figures = driver.findElements(figure);
        var figure = figures.get(index-1);
        Actions hover = new Actions(driver);
        hover.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(figcaption));
    }

    public class FigureCaption{
        private WebElement figcaption;
        private By captionText = By.tagName("h5");
        private By captionLink = By.tagName("a");

        public FigureCaption(WebElement figcaption) {
            this.figcaption = figcaption;
        }

        public boolean isDisplayed(){
            return figcaption.isDisplayed();
        }

        public String getLinkAddress(){
            return getLink().getAttribute("href");
        }

        public String getLinkText(){
            return getLink().getText();
        }

        public String getCaptionText(){
            return figcaption.findElement(captionText).getText();
        }

        private WebElement getLink(){
            return figcaption.findElement(captionLink);
        }
    }



}
