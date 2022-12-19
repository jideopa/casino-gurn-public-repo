package steps.definition;

import com.aventstack.extentreports.util.Assert;
import com.casinoguru.base.CasinoBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import steps.libraries.LogoutStep;

import static org.junit.Assert.assertTrue;

public class LogoutStepDefinition extends CasinoBase {

    LogoutStep logoutStep = new LogoutStep();

    @Given("click the signout button")
    public void OpenMenu() {
        logoutStep.SuccessfulLogout();
    }

    @Then("User should be logged out")
    public void UserLoggedOut() {
        assertTrue(logoutStep.languageButtonIsDisplayed());
    }
}
