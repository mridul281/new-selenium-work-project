package com.internet.herokuapp.Pages;


import com.internet.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDrop extends BasePage{
    public DragAndDrop(WebDriver driver) {
        super(driver);
    }
    //HEADER VALIDATION
    @FindBy(css = "#content > div > h3")
    public WebElement dragAndDropHeader;
    public WebElement getDragAndDropHeader() {
        return dragAndDropHeader;
    }
}
