package steps.definition;

import com.casinoguru.base.CasinoBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import steps.libraries.LoginStep;

public class LoginStepDefinition  extends CasinoBase {
    LoginStep loginStep = new LoginStep();
    @Given("Enter a valid login")
    public void enterAValidLogin() {
        loginStep.completeLoginForm();
    }
    @Then("user should be sign in")
    public void userShouldBeSignIn() {
        Assert.assertTrue(loginStep.profileIconIsDisplay());
    }

}
