package steps.libraries;

import com.casinoguru.base.CasinoBase;
import com.casinoguru.pages.LogoutPage;

import java.util.concurrent.TimeUnit;

public class LogoutStep extends CasinoBase {

    LogoutPage logout = new LogoutPage();

    public void SuccessfulLogout(){
        logout.DropButton.click();
        logout.LogoutButton.click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean languageButtonIsDisplayed(){
        return logout.LanguageButton.isDisplayed();
    }
}
