package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoggingPage;
import java.util.concurrent.TimeUnit;


public class LoginStepDef {
    WebDriver driver = new ChromeDriver();
    LoggingPage loginPage = new LoggingPage(driver);

    @Given("Browser is open")
    public void browser_is_open() {
        try{
            System.out.println("Browser is open");
            System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.navigate().to("https://secured.nedbank.co.za/#/login");
            System.out.println("Browser is open");
        }catch (Exception e){
            System.out.println("An error occurred  : "+e.getMessage());
        }

    }

    @When("^User enters (.*) and (.*)$")
    public void user_enters(String username , String password) {
        try{
            //loginPage.loginDetails(username,password);
            loginPage.enterUsername(username);
            loginPage.enterPassword(password);

            System.out.println("user enters "+username+" and "+password);
        }catch (Exception e){
            System.out.println("An error occurred  : "+e.getMessage());
        }
    }

//    @When("User clicks login")
//    public void user_clicks_login() {
//        try{
//            loginPage.clickNeedHelpLoggingIn();
//            System.out.println("the user clicks Need help logging in? link");
//        }catch (Exception e){
//            System.out.println("An error occurred  : "+e.getMessage());
//        }
//    }
//
//    @Then("User should be redirected to Home page")
//    public void user_should_be_redirected_to_home_page() {
//        try{
//            loginPage.selectForgotYourNedBankIDUsername();
//            System.out.println("The user select Forgot your Nedbank ID username?");
//        }catch (Exception e){
//            System.out.println("An error occurred  : "+e.getMessage());
//        }
//    }
//
//    @Then("I need my Nedbank ID username. should be displayed")
//    public void i_need_my_nedbank_id_username_should_be_displayed() {
//        try{
//            System.out.println(" :::::: "+loginPage.getINeedMyNedBankIDUsername());
//            System.out.println("The user select Forgot your Nedbank ID username?");
//        }catch (Exception e){
//            System.out.println("An error occurred  : "+e.getMessage());
//        }
//    }
}
