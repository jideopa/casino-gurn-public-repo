package steps.definition;

import com.casinoguru.base.CasinoBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.libraries.ChangePasswordStep;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class ChangePasswordStepDefinition extends CasinoBase {
     ChangePasswordStep changePasswordStep = new ChangePasswordStep();
    @And("user is on the change password page")
    public void userIsOnTheChangePasswordPage() {
       changePasswordStep.openChangePasswordPage();
    }
    @When("player change password with a invalid")
    public void playerChangePasswordWithAInvalid() {
        changePasswordStep.completeChangePasswordForm();

    }
    @Then("{string} error message is displayed")
    public void errorMessageIsDisplayed(String error) {
     assertThat(changePasswordStep.errorMessage(),containsString(error));
    }
}
