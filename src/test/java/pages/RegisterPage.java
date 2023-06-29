package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement btnRegister;

    @FindBy(xpath = "//span[contains(text(),'Don’t have an SA ID?')]")
    WebElement haveNoSAID;

    @FindBy(css = "#passport")
    WebElement txtPassport;

    @FindBy(css = "#country-name-list")
    WebElement txtCountry;

    @FindBy(xpath = "//span[contains(text(),'Next')]")
    WebElement btnNext;

    public void clickRegister(){
        btnRegister.click();
    }

    public void clickNoSAID(){
        haveNoSAID.click();
    }

    public void clickNext(){
        btnNext.click();
    }

    public void registerDetails(String passport,String country){
        txtPassport.sendKeys(passport);
        txtCountry.sendKeys(country);
    }

}
