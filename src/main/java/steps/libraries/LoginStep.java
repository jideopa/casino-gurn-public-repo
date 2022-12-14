package steps.libraries;

import com.casinoguru.base.CasinoBase;
import com.casinoguru.pages.LoginPage;
import com.casinoguru.utils.enums.Players;
import org.awaitility.Awaitility;
import static java.util.concurrent.TimeUnit.SECONDS;
public class LoginStep extends CasinoBase {
    LoginPage login = new LoginPage();
    public void completeLoginForm() {
        Awaitility.await().atMost(5, SECONDS).until(login.loginButton::isDisplayed);
        login.loginButton.click();
        login.emailField.sendKeys(Players.EXISTING_Player.getEmail());
        login.passwordField.sendKeys(Players.EXISTING_Player.getPassword());
        login.submitButton.click();
    }
    public boolean profileIconIsDisplay() {
        return login.profileIcon.isDisplayed();
    }
}
