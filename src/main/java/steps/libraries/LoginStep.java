package steps.libraries;

import com.casinoguru.base.CasinoBase;
import com.casinoguru.pages.LoginPage;
import com.casinoguru.utils.enums.Players;
import org.awaitility.Awaitility;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.awaitility.Awaitility.await;

public class LoginStep extends CasinoBase {
    LoginPage loginPage = new LoginPage();
    public void completeLoginForm() {
       await().atMost(5, SECONDS).until(loginPage.loginButton::isDisplayed);
        loginPage.loginButton.click();
        loginPage.emailField.sendKeys(Players.EXISTING_Player.getEmail());
        loginPage.passwordField.sendKeys(Players.EXISTING_Player.getPassword());
        loginPage.submitButton.click();
    }
    public boolean profileIconIsDisplay() {
        return loginPage.profileIcon.isDisplayed();
    }
}
