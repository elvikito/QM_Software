package org.umssdiplo.automationv01.core.managepage.Adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Carrito extends BasePage {

    @FindBy(xpath = "//button[@title='MX 9.5']")
    private WebElement MX_9_5;

    @FindBy(xpath = "//span[contains(text(), 'Elige tu talla')]")
    private WebElement size;

    public void selectSize() {
        System.out.print(size);
        //CommonEvents.jsClickElement(size);
        //CommonEvents.jsClickElement(MX_9_5);
    }
}
