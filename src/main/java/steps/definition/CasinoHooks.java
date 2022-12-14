package steps.definition;

import com.casinoguru.base.CasinoBase;
import com.casinoguru.pages.LoginPage;
import com.casinoguru.utils.enums.CasinoURL;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.awaitility.Awaitility;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CasinoHooks extends CasinoBase {
    LoginPage loginPage = new LoginPage();

    Properties properties = new Properties();
    @Before
    public void setup() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Awaitility.await().atMost(5,TimeUnit.SECONDS);

        try {
            FileReader fileReader = new FileReader("src/test/resources/environment.properties");
            properties.load(fileReader);
            driver.get(properties.getProperty("login"));
        }
        catch (Exception exception){
            exception.printStackTrace();
            throw new RuntimeException(exception);
        }




    }
    @After(order = 1)
    public void tearDown() {
        driver.quit();
    }
    @After(order = 2) // Cucumber After Hook with order 1
    public void takeScreenShotOnFailedScenario(Scenario scenario) {

        System.out.println("Taking screenshot from Cucumber After hook with order=2 if the scenario fails");
        if ((scenario.isFailed())) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }
}
