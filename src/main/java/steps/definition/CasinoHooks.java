package steps.definition;

import com.casinoguru.base.CasinoBase;
import com.casinoguru.utils.enums.CasinoURL;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CasinoHooks extends CasinoBase {
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        try {
            driver.manage().window().fullscreen();
            TimeUnit.SECONDS.sleep(4);
            driver.get(CasinoURL.LOGIN_URL.getUrl());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
