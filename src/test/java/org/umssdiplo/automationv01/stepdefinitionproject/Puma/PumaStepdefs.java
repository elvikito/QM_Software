package org.umssdiplo.automationv01.stepdefinitionproject.Puma;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Puma.Puma;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class PumaStepdefs {

    private Puma puma;

    @Given("^'PUMA' page is loaded$")
    public void pumaPageIsLoaded() {
        puma = LoadPage.loginPagePuma();
    }

    @And("^Hover men link 'Header'$")
    public void hoverMenLinkHeader() {
        puma.hoverElement();
    }

    @And("^click in 'Futbol' seccition 'Tennis'$")
    public void clickInFutbolSeccitionTennis() {
        puma.clickFutbol();
    }

    @And("null")
    public void getPriceCalzadoDeFútbolXTF(int arg0, int arg1) {
    }
}
