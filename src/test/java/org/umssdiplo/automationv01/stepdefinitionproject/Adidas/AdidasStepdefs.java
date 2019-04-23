package org.umssdiplo.automationv01.stepdefinitionproject.Adidas;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Adidas.Adidas;
import org.umssdiplo.automationv01.core.managepage.Adidas.Carrito;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class AdidasStepdefs {

    private Adidas adidas;
    private Carrito carrito;

    @Given("^'Adidas' page is loaded$")
    public void pumaPageIsLoaded() {
        adidas = LoadPage.loginPagePuma();
    }

    @And("^Hover men link 'Header'$")
    public void hoverMenLinkHeader() {
        adidas.hoverElement();
    }

    @And("^click in 'Futbol' seccition 'Tennis'$")
    public void clickInFutbolSeccitionTennis() {
        adidas.clickFutbol();
    }

    @And("^check get price tennis of futbol value is \"([^\"]*)\"$")
    public void checkPriceFirtsTennisOfFutbolValueIs(String arg0) {
        adidas.checkElement(arg0);
    }

    @And("^click in Calzado de Fútbol X 18.3 TF$")
    public void clickCalzadoDeFútbolXTF() {
        adidas.clickCalzado();
    }

    @And("^select size for carrito$")
    public void selectSizeForCarrito() {
        //carrito.selectSize();
        adidas.selectSize();
    }

    @And("^click add in carrito$")
    public void clickAddInCarrito() {
        adidas.addCarrito();
    }

    @Then("^verified quantity is \"([^\"]*)\" modal$")
    public void verifiedQuantityIsModal(String arg0) {
        adidas.verifiedQuantity(arg0);
    }

    @And("^click ver carrito link$")
    public void clickVerCarritoLink() {
        adidas.clickLink();
    }

    @Then("^verified \"([^\"]*)\" title is displayed$")
    public void verifiedTitleIsDisplayed(String arg0) {
        adidas.verifiedTitle(arg0);
    }

    @Then("^price should be \"([^\"]*)\"$")
    public void priceShouldBe(String arg0) {
        adidas.priceItem(arg0);
    }

    @Then("^total should be \"([^\"]*)\"$")
    public void totalShouldBe(String arg0) {
        adidas.pricetotal(arg0);
    }
}
