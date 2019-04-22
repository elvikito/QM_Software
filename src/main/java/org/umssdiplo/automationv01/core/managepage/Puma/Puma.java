package org.umssdiplo.automationv01.core.managepage.Puma;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Puma extends BasePage {

    @FindBy(xpath = "//div[@class='glass-navigation-flyout___1AJqi'][1]/a[@class='label']")
    private WebElement mens;

    @FindBy(xpath = " //li/a[contains(text(),'Fútbol')]")
    private WebElement futbol;

    public void hoverElement() {
        CommonEvents.hoverElement(mens);
    }

    public void clickFutbol() {
        CommonEvents.clickButton(futbol);
    }
}
