import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlerts {
    WebDriver driver;
    String url ="https://the-internet.herokuapp.com/javascript_alerts";

    public void openChrome()
    {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

    @Test
    public void acceptAlert()
    {
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        driver.switchTo().alert().accept();
        String results = driver.findElement(By.id("result")).getText();
        Assert.assertEquals("You successfully clicked an alert",results);

    }

    @Test
    public void dismissAlert()
    {
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        driver.switchTo().alert().dismiss();
    }




//    public static void main(String[] args) {
//        JavaScriptAlerts javaScriptAlerts = new JavaScriptAlerts();
//        javaScriptAlerts.openChrome();
//    }
}
