package selenium.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.pages.Cookies;
import selenium.pages.HomePage;
import selenium.pages.RegistrationForm;

import static org.testng.AssertJUnit.assertFalse;

public class RegisterSteps {
    private HomePage homePage = new HomePage();
    private RegistrationForm registrationForm = new RegistrationForm();
    private Cookies cookies = new Cookies();

    @Before
    public void acceptCookies(){
        cookies.clickCookie();
    }

    @Given("the user set first name {string}")
    public void theUserSetFirstname(String firstName) {
        registrationForm.enterFirstName(firstName);
    }

    @Given("the user set family name {string}")
    public void theUserSetFamilyname(String familyName) {
        registrationForm.enterFamilyName(familyName);
    }

    @Given("the user set e-mail {string}")
    public void theUserSetEmail(String email) {
        registrationForm.enterEmail(email);
    }

    @Given("the user set password {string}")
    public void theUserSetPassword(String password) {
        registrationForm.enterPassword(password);
    }

    @Given("the user set quiz number {string}")
    public void theUserSetQuizNumber(String number) {
        registrationForm.enterQuizNumber(number);
    }

    @Given("the user accept GDPR conditions")
    public void theUserAcceptGDPRConditions() {
        registrationForm.markCheckboxGDPR();
    }

    @When("the user click Submit button")
    public void theUserClickSubmitButton() {
        registrationForm.clickSubmitButton();
    }
    @Then("a result for incorrect user data happens")
    public void aResultForIncorrectUserDataHappens(){
        assertFalse(registrationForm.successfulRegistration());
    }
}
