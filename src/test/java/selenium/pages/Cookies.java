package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cookies extends BasePage{

    @FindBy(css = ".cmplz-accept")
    private WebElement acceptCookieButton;

    @FindBy (css = "#cmplz-cookiebanner-container")
    private WebElement cookieBanner;

    public void clickCookie(){
        waitForElementToBeVisible(cookieBanner);
        acceptCookieButton.click();
        waitForElementToBeStale(cookieBanner);
    }
    public Boolean cookieBannerVisible(){
        return cookieBanner.isDisplayed();
        }
}
