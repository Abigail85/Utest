package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarDatos {
    public static final Target INPUT_DATOS_PERSONALES = Target.the("llenar los campos personales").locatedBy("//input[@id='{0}']");
    public static final Target INPUT_CITY= Target.the("llenar los campos de la ciudad").located(By.xpath("//*[@id=\"city\"]/ngf-single-select/ngf-autocomplete-input/ngf-input-container/div/div[2]/input"));
    public static final Target INPUT_CITY_ARROW= Target.the("seleccionar la ciudad").located(By.xpath("//*[@id=\"cdk-overlay-0\"]/ngf-options-container/ngf-option/div/div"));
    public static final Target BUTTON_CLEAR = Target.the("limpiar el campo de ciudad").locatedBy("//button[@class='clear-btn']");
    public static final Target SELECT_FECHA = Target.the("selecciona fecha").locatedBy("//select[@id='{0}']");
    public static final Target INPUT_CODIGO_POSTAL = Target.the("selecciona el codigo postal").located(By.xpath("//div[@class='ui-select-container ui-select-bootstrap dropdown ng-not-empty ng-valid ng-valid-required open direction-up']//input[@type='search']"));
    public static Target SPAN_PAIS = Target.the("selecciona el pais").located(By.xpath("//span[@class='ui-select-match-text pull-left']"));
    public static Target DIV_UBICACION_GEOGRAFICA= Target.the("selecciona la ubicacion geografica").locatedBy("//div[text()='{0}']");

    public static Target INPUT_PROVINCIA = Target.the("lista de provincias").located(By.xpath("//span[@class='btn btn-default form-control ui-select-toggle']"));

    public static Target INPUT_PASSWORD = Target.the("escribe la contraseña y la confirma").locatedBy("//*[@id='password']");
    public static Target INPUT_CONFIRMA_PASSWORD = Target.the("escribe la contraseña y la confirma").locatedBy("//*[@id='confirmPassword']");
    public static Target SPAN_CHECK_1 = Target.the("aceptar termino y condicones").located(By.xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));
    public static Target SPAN_CHECK_2 = Target.the("aceptar termino y condicones").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static Target SPAN_CHECK_3 = Target.the("aceptar termino y condicones").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));


}
