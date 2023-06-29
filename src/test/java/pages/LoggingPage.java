package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggingPage {

    WebDriver driver;

    public LoggingPage(WebDriver driver) {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#username")
    WebElement txtUsername;

    @FindBy(css = "#password")
    WebElement txtPassword;

    @FindBy(linkText = "Need help logging in?")
    WebElement linkTextNeedHelp;

    @FindBy(xpath = "//tbody/tr[2]/td[2]")
    WebElement xpForgotYourNedBankID;

    @FindBy(xpath = "//h4[contains(text(),'I need my Nedbank ID username.')]")
    WebElement headerText;

    public void loginDetails(String username,String password){
        txtUsername.sendKeys(username);
        txtPassword.sendKeys(password);
    }
    public void enterUsername(String username){
        txtUsername.sendKeys(username);
    }
    public void enterPassword(String password){
        txtPassword.sendKeys(password);
    }
    public void clickNeedHelpLoggingIn(){
        linkTextNeedHelp.click();
    }
    public void selectForgotYourNedBankIDUsername(){
        xpForgotYourNedBankID.click();
    }
    public String getINeedMyNedBankIDUsername(){
        String expectedText = headerText.getText();
        return expectedText;
    }
}
