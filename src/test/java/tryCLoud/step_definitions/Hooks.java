package tryCLoud.step_definitions;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import tryCLoud.utilities.ConfigurationReader;
import tryCLoud.utilities.Driver;

public class Hooks {
    @Before
    public void setUpScenario(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @After
    public void teardownScenario(Scenario scenario){
        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        Driver.closeDriver();
    }
}
