package org.umssdiplo.automationv01.stepdefinitionproject;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Departament.Departament;
import org.umssdiplo.automationv01.core.utils.LoadPage;

import java.util.Map;


public class DepartamentStepDef extends BasePage {

    private Departament departament;

    @Given("^Accedo a la pagina initial$")
    public void departamentPageIsLoaded() throws Throwable {
        departament = LoadPage.depatamentPage();
    }

    @When("^select 'departament' option from 'Administration'$")
    public void selectDepartamentOptionFromAdministration() {
        departament.setAdminitration();
        departament.setDepartament();
    }

    @And("^Hacer click en new$")
    public void hacerClickEnNew() {
        departament.newDepartament();
    }

    @And("^Lleno datos del departament dialog$")
    public void llenoDatosDelDepartamentDialog(DataTable datos) throws Throwable {
        Map<String, String> tablaDatos = datos.asMap(String.class, String.class);
        departament.setName(tablaDatos.get("name"));
        departament.setDescription(tablaDatos.get("description"));
        departament.saveDepartament("Create");
    }

    @Then("^Hacer click en Delete Item$")
    public void hacerClickEnDeleteItem() {
        departament.deleteDepartament();
    }

    @And("^Confirm delete element 'departament'$")
    public void confirmDeleteElementDepartament() {
        departament.confirmDelete();
    }

    @And("^Hacer click en un 'Item' para modificarlo$")
    public void hacerClickEnUnItemParaModificarlo() {
        departament.selecItemEdit();
    }

    @And("^datos actualizados para el 'Departament' dialog$")
    public void datosActualizadosParaElDepartamentDialog(DataTable datos) throws Throwable {
        departament.editItemDepartament(datos);
    }

    @Then("^Verificar si existe el nuevo dato en 'departament'$")
    public void verificarSiExisteElNuevoDatoEnDepartament() {

    }

    @Then("^Verificar si ya no existe el dato dentro 'departament'$")
    public void verificarSiYaNoExisteElDatoDentroDepartament() {

    }

    @Then("^Verificar dato cambiado dentro 'departament' \"([^\"]*)\"$")
    public void verificarDatoCambiadoDentroDepartament(String record) throws Throwable{
        departament.verifyRecord(record);
    }
}
