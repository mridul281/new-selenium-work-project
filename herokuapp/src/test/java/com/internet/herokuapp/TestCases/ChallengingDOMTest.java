package com.internet.herokuapp.TestCases;

import com.internet.herokuapp.Configuration.BaseTest;
import com.internet.herokuapp.Pages.ChallengingDOM;
import com.internet.herokuapp.Pages.LandingPage;
import org.testng.annotations.Test;

public class ChallengingDOMTest extends BaseTest {

    @Test
    public void ChallengingDOMTest() {
        LandingPage lp = new LandingPage(driver);
        ChallengingDOM cd = new ChallengingDOM(driver);
    }
}
