package uiTestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features" ,
        glue = {"stepDefinitions"},
    monochrome = false,plugin = {"pretty","html:target/HtmlReports/Report.html"})
public class TestRunnerUI {

}
