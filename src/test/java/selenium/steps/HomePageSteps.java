package selenium.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.pages.Cookies;
import selenium.pages.HomePage;

import static org.testng.AssertJUnit.assertTrue;

public class HomePageSteps {
    private Cookies cookies = new Cookies();
    private HomePage homePage = new HomePage();

    @Given("the user accept cookies")
    public void theUserAcceptCookies() {
        cookies.clickCookie();
    }

    @When("the user click Register button")
    public void theUserClickRegisterButton() {
        homePage.userRegistrateClick();
    }

    @Then("the Registration form opens")
    public void theRegistrationFormOpens() {
        assertTrue(homePage.userRegistrateClick());
    }

}
