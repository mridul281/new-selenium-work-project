package com.internet.herokuapp.Pages;

import com.internet.herokuapp.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrokenImages extends BasePage {

    public BrokenImages(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"content\"]/div/h3")
    public WebElement brokenImageHeader;
    public WebElement getBrokenImageHeader() {
        return brokenImageHeader;
    }

}
