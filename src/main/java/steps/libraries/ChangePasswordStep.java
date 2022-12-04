package steps.libraries;

import com.casinoguru.base.CasinoBase;
import com.casinoguru.pages.ChangePasswordPage;
import com.casinoguru.pojo.DataGenerator;
import com.casinoguru.utils.enums.CasinoURL;
import org.awaitility.Awaitility;

import java.util.concurrent.TimeUnit;
public class ChangePasswordStep extends CasinoBase {
    ChangePasswordPage changePasswordPage = new ChangePasswordPage();
    DataGenerator dataGenerator = DataGenerator.getInstance();
    String password = dataGenerator.faker.internet().password();
    public void openChangePasswordPage() {
        driver.get(CasinoURL.PROFILE.getUrl());
        Awaitility.await().atMost(10, TimeUnit.SECONDS).until(changePasswordPage.editButton::isDisplayed);
    }
    public void completeChangePasswordForm() {
        changePasswordPage.editButton.click();
        Awaitility.await().atMost(10, TimeUnit.SECONDS).until(changePasswordPage.changePasswordButton::isDisplayed);
        changePasswordPage.oldPasswordField.sendKeys(dataGenerator.faker.internet().password());
        changePasswordPage.newPasswordField.sendKeys(password);
        changePasswordPage.confirmPassword.sendKeys(password);
        changePasswordPage.changePasswordButton.click();
    }
    public String errorMessage() {
        return changePasswordPage.incorrectPasswordIsDisplay.getText();
    }

}
