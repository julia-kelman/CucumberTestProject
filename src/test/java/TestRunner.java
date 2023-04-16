import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        //will run all the tests in file resources
        features = {"src/test/resources"},
        glue = {"StepsForSelenium"}
)

@RunWith(Cucumber.class)

public class TestRunner {
}
