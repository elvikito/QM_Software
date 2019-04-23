package org.umssdiplo.automationv01.core.managepage.Adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.testng.Assert;

public class Adidas extends BasePage {

    @FindBy(xpath = "//div[@class='glass-navigation-flyout___1AJqi'][1]/a[@class='label']")
    private WebElement mens;

    @FindBy(xpath = "//li/a[contains(text(),'Fútbol')]")
    private WebElement futbol;

    @FindBy(xpath = "//div[@title='Calzado de Fútbol X 18.3 TF']/parent::div//span[contains(@class, 'gl-price__value gl-price__value--sale')]")
    private WebElement calzado;

    @FindBy(xpath = "//a[@href='/calzado-de-futbol-x-18.3-tf/BB9398.html']")
    private WebElement item;

    @FindBy(xpath = "//span[contains(text(), 'Elige tu talla')]")
    private WebElement size;

    @FindBy(xpath = "//button[@title='MX 9.5']")
    private WebElement MX_9_5;

    @FindBy(xpath = "//button[contains(text(), 'Añadir al carrito')]")
    private WebElement button_add_carrito;

    @FindBy(xpath = "//span[@data-auto-id='add-to-bag-product-info-qty']")
    private WebElement quantity;

    @FindBy(xpath = "//a[contains(text(), 'ver carrito')]")
    private WebElement link_carrito;

    @FindBy(css=".name")
    private WebElement titleTenis;

    @FindBy(css=".cart-widget-block > .cart-widget-value")
    private WebElement price_item;

    @FindBy(css=".cart-products-ordertotal > .cart-widget-value")
    private WebElement price_total;

    public void hoverElement() {
        CommonEvents.hoverElement(mens);
    }

    public void clickFutbol() {
        CommonEvents.clickButton(futbol);
    }

    public void checkElement(String text) {
        Assert.assertEquals(calzado.getText(), text);
    }

    public void clickCalzado() {
        CommonEvents.clickButton(item);
    }

    public void selectSize() {
        CommonEvents.jsClickElement(size);
        CommonEvents.jsClickElement(MX_9_5);
    }

    public void addCarrito() {
        CommonEvents.clickButton(button_add_carrito);
    }

    public String getQuantity() {
        return quantity.getText();
    }

    public String getTitle() {
        return titleTenis.getText();
    }

    public String getPriceItem() {
        return price_item.getText();
    }

    public String getPriceTotal() {
        return price_total.getText();
    }

    public void verifiedQuantity(String arg0) {
        Assert.assertEquals(getQuantity(), arg0);
    }

    public void clickLink() {
        CommonEvents.clickButton(link_carrito);
    }

    public void verifiedTitle(String arg0) {
        Assert.assertEquals(getTitle().toLowerCase(), arg0.toLowerCase());
    }

    public void priceItem(String arg0) {
        Assert.assertEquals(getPriceItem(), arg0);
    }

    public void pricetotal(String arg0) {
        Assert.assertEquals(getPriceTotal(), arg0);
    }
}
