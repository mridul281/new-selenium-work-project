package com.internet.herokuapp.TestCases;

import com.internet.herokuapp.Configuration.BaseTest;
import com.internet.herokuapp.Pages.BrokenImages;
import com.internet.herokuapp.Pages.LandingPage;
import org.testng.annotations.Test;

public class BrokenImageTest extends BaseTest {

    @Test
    public void BrokenImageTest() {
        LandingPage lp = new LandingPage(driver);
        BrokenImages bi = new BrokenImages(driver);

    }
}
