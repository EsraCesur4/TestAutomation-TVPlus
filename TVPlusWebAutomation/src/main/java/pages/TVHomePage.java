package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TVHomePage extends BasePage {

    private By signUp = By.className("signUp");

    public TVHomePage(WebDriver driver) {
        super(driver);
    }

    public boolean homePageControl(){
        try {
            WebElement signUpElement = find(signUp);
            return signUpElement.isDisplayed();
        } catch (NoSuchElementException e){
            return false;
        }

    }
}
