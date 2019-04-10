package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.Area.Area;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.LoadPage;

import java.util.Map;

public class AreaStepDef extends BasePage {
    private Area area;

    @Given("^Accedo a la pagina$")
    public void areaPageIsLoaded() throws Throwable {
        area = LoadPage.areaPage();
    }

    @When("^Navego al tab \"([^\"]*)\"$")
    public void navego_al_tab(String tab) throws Throwable {
        area.setAdminitration(tab);
    }

    @And("^Ingreso sub menu \"([^\"]*)\"$")
    public void ingresoSubMenu(String _area) throws Throwable {
        area.setArea(_area);
    }

    @When("^Hacer click en add$")
    public void hacer_click_en_add() throws Throwable {
        area.AddNewArea();
    }

    @And("^Lleno datos del Area dialog$")
    public void llenoDatosDelAreaDialog(DataTable datos) {
        Map<String, String> tablaDatos = datos.asMap(String.class, String.class);
        area.InsertDatos(datos);
        area.departamentElementListClick(tablaDatos.get("department"));
    }
}
