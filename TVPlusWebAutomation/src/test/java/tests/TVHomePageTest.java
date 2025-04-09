package tests;


import Utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import pages.TVHomePage;

import static Utils.DriverManager.getDriver;

public class TVHomePageTest extends DriverManager {

    private TVHomePage tvHomePage;

    @BeforeClass
    public void setUP(){
        tvHomePage = new TVHomePage((getDriver()));
    }

    @Test
    public void testHomePageControl(){
        Assert.assertTrue(tvHomePage.homePageControl(), "Ana sayfa açılmadı");
    }
}
