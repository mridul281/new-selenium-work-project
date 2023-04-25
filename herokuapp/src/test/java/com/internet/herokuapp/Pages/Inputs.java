package com.internet.herokuapp.Pages;

import com.internet.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Inputs extends BasePage {
    public Inputs(WebDriver driver) {
        super(driver);
    }

    //Header VALIDATION
    @FindBy(css = "#content > div > div > h3")
    public WebElement inputsHeader;
    public WebElement getInputsHeader() {
        return inputsHeader;
    }
    //paragraph validation
    @FindBy(css = "#content > div > div > div > p")
    public WebElement inputsParagraph;
    public WebElement getInputsParagraph() {
        return inputsParagraph;
    }
    //Inputs number Field
    @FindBy(css = "#content > div > div > div > input[type=number]")
    public WebElement inputsNumberFields;
    public WebElement getInputsNumberFields() {
        return inputsNumberFields;
    }

}
