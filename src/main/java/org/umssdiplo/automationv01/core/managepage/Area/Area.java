package org.umssdiplo.automationv01.core.managepage.Area;
import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;


public class Area extends BasePage{
    @FindBy(xpath = "//button[@class='mat-button']/span[@class='mat-button-wrapper']")
    private WebElement tabAdminitration;

    @FindBy(xpath = "//div[@class='mat-menu-content']/button[@class='mat-menu-item']")
    private WebElement subAreas;

    @FindBy(xpath = "//div[@class='container'][1]/a[@class='mat-button']")
    private WebElement newArea;

    @FindBy(id = "nameArea")
    private WebElement name;

    @FindBy(name = "description")
    private WebElement description;

    //@FindBy(name = "departament")
    //private List<WebElement> departamentList;

    //@FindBy(xpath = "//div[@class='mat-select-trigger']/div[@class='mat-select-arrow-wrapper']/div[@class='mat-select-arrow']")
    @FindBy(xpath = "//div[@class='mat-form-field-infix']/mat-select[@id='departamentArea']/div[@class='mat-select-trigger']/div[@class='mat-select-value']/span[@class='mat-select-placeholder ng-tns-c15-10 ng-star-inserted']")
    private List<WebElement> departamentList;


    public void setAdminitration(String adminitration) {
        CommonEvents.clickButton(tabAdminitration);
    }

    public void setArea(String area) {
        CommonEvents.clickButton(subAreas);
    }

    public void AddNewArea() {
        CommonEvents.clickButton(newArea);
    }

    public void InsertDatos(DataTable datos) {
        List<List<String>> datosArea = datos.raw();
        for (List<String> dato : datosArea)
            switch (dato.get(0)) {
                case "name":
                    CommonEvents.setInputField(name, dato.get(1));
                    break;
                case "description":
                    CommonEvents.setInputField(description, dato.get(1));
                    break;
                case "department":
                    departamentElementListClick(dato.get(1));
                    break;
            }
    }

    public List<WebElement> getDepartamentList() {
        System.out.print(" + + + + + + + + + + + + + + + + ++ + + + + + + + + + ");
        System.out.print(" Check Select: " + departamentList);
        System.out.print(" + + + + + + + + + + + + + + + + ++ + + + + + + + + + ");
        return departamentList;
    }

    public void departamentElementListClick(String department) {
        System.out.print("department Name: " + department);
        CommonEvents.elementListClick(this.getDepartamentList(), department);
    }
}