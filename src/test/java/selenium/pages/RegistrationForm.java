package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;

public class RegistrationForm extends BasePage {

    //public RegistrationForm(WebDriver driver) {super(driver);}

    @FindBy(id = "fname")
    private WebElement firstNameField;

    @FindBy(id = "lname")
    private WebElement familyNameField;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "subscriber-register-quiz")
    private WebElement quizNumberField;

    @FindBy(id = "subscriber-register-consent")
    private WebElement checkboxGDPR;

    @FindBy(xpath = "//input[@name='Submitted']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@class='open popup-notice-wrapper error']")
    private WebElement wrongSumMessage;

    @FindBy(id = "consent-error")
    private WebElement errorMessageGDPR;

    @FindBy(xpath = "//div[contains(@class, 'popup-notice-wrapper')]")
    private WebElement successfulRegistrationMessage;


    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }


    public void enterFamilyName(String familyName) {
        familyNameField.sendKeys(familyName);
    }


    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }


    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }


    public void enterQuizNumber(String quizNumber) {
        quizNumberField.sendKeys(quizNumber);
    }


    public void markCheckboxGDPR() {
        checkboxGDPR.click();
    }


    public void clickSubmitButton() {
        driver.manage().window().fullscreen();
        waitForElementTobeClickable(submitButton);
        submitButton.click();
    }

    public String firstNameBorderColor() {
        String borderColor = firstNameField.getCssValue("border");
        return borderColor;
    }


    public Boolean visibilityOfWrongSumMessage() {
        return wrongSumMessage.isDisplayed();
    }


    public Boolean visibilityOfErrorMessageGDPR() {
        return errorMessageGDPR.isDisplayed();
    }


    public String colorOfErrorMessageGDPR() {
        String messageColor = errorMessageGDPR.getCssValue("border");
        return messageColor;
    }

    public Boolean successfulRegistration() {
        return successfulRegistrationMessage.isDisplayed();
    }


}
