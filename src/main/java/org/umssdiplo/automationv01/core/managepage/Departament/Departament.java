package org.umssdiplo.automationv01.core.managepage.Departament;
import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import java.util.Map;


public class Departament extends BasePage{

    @FindBy(xpath = "//button[@class='mat-button']/span[@class='mat-button-wrapper']")
    private WebElement tabAdminitration;

    @FindBy(xpath = "//button[contains(text(), \"Departaments\")]")
    private WebElement subDepartament;

    @FindBy(xpath = "//div[@class='container'][1]/a[@class='mat-button']")
    private WebElement add;

    @FindBy(name = "name")
    private WebElement name;

    @FindBy(name = "description")
    private WebElement description;

    public static final String INPUT_CONTAINS_BUTTON = "//button/span[contains(text(), '%s')]";

    public static final String deleteBtn = "//form//button/span[contains(text(), \"Delete\")]";

    public static final String iconDelete = "/html/body/app-root/app-departament[@class='ng-star-inserted']/div[@class='container'][2]/mat-card[@class='card mat-card ng-star-inserted'][3]/mat-card-actions[@class='action-buttons mat-card-actions']/button[@class='mat-raised-button mat-warn']";

    public static final String updateBtn = "//mat-card[@class='card mat-card ng-star-inserted'][1]/mat-card-actions[@class='action-buttons mat-card-actions']/button[@class='mat-button mat-primary']";

    public void setAdminitration() {
        CommonEvents.clickButton(tabAdminitration);
    }

    public void setDepartament() {
        CommonEvents.clickButton(subDepartament);
    }

    public void newDepartament() {
        CommonEvents.clickButton(add);
    }

    public void setName(String name) {
        this.name.sendKeys(name);
    }

    public void setDescription(String description) {
        this.description.sendKeys(description);
    }

    public void saveDepartament(String create) {
        By saveBtn = By.xpath(String.format(INPUT_CONTAINS_BUTTON, create));
        CommonEvents.clickElement(saveBtn);
    }

    public void salveDepartament(String update) {
        By salveBnt = By.xpath(String.format(INPUT_CONTAINS_BUTTON, update));
        CommonEvents.clickElement(salveBnt);
    }

    public void deleteDepartament() {
        By by = By.xpath(iconDelete);
        CommonEvents.clickElement(by);
    }

    public void confirmDelete() {
        By by = By.xpath(deleteBtn);
        CommonEvents.clickElement(by);
    }

    public void selecItemEdit() {
        By by = By.xpath(updateBtn);
        CommonEvents.clickElement(by);
    }

    public void clearItemDepartament(){
        name.clear();
        description.clear();
    }

    public void editItemDepartament(DataTable datos) {
        Map<String, String> tablaDatos = datos.asMap(String.class, String.class);
        clearItemDepartament();
        setName(tablaDatos.get("name"));
        setDescription(tablaDatos.get("description"));
        salveDepartament("Update");
    }

    public void verifyRecord(String record) {
        //assertEquals(record, );
    }
}