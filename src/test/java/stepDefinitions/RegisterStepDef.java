package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RegisterPage;

import java.util.concurrent.TimeUnit;

public class RegisterStepDef {

    WebDriver driver = new ChromeDriver();
    RegisterPage registerPage = new RegisterPage(driver);

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

    @When("User clicks register")
    public void user_clicks_register() {
        try{
            registerPage.clickRegister();
            System.out.println("the user clicks register");
        }catch (Exception e){
            System.out.println("An error occurred  : "+e.getMessage());
        }
    }

    @When("^User enters (.*) and (.*)$")
    public void user_register(String passport,String country) {
        try{
            registerPage.registerDetails(passport,country);

            System.out.println("user enters "+passport+" and "+country);
        }catch (Exception e){
            System.out.println("An error occurred  : "+e.getMessage());
        }
    }

}
