package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventsPage extends BasePage {

    @FindBy(css = ".page-title")
    private WebElement eventsTitle;

    public String getEventsTitle(){
        return eventsTitle.getText();
    }
}
