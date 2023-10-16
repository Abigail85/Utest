package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarDatos {
    public static final Target INPUT_DATOS_PERSONALES = Target.the("llenar los campos personales").locatedBy("//input[@id='{0}']");
    public static final Target SELECT_FECHA = Target.the("selecciona fecha").locatedBy("//select[@id='{0}']");
    public static final Target INPUT_CODIGO_POSTAL = Target.the("selecciona el ´pais").located(By.xpath("//div[@class='ui-select-container ui-select-bootstrap dropdown ng-not-empty ng-valid ng-valid-required open direction-up']//input[@type='search']"));
    public static Target SPAN_PAIS = Target.the("selecciona el pais").located(By.xpath("//span[@class='ui-select-match-text pull-left']"));
    public static Target SPAN_PAIS_1 = Target.the("selecciona el pais").located(By.xpath("//div[text()='Canada']"));
    public static Target DIV_CIUDAD = Target.the("selecciona la ciudad").located(By.xpath("/html/body/div[3]/div[1]/span[3]"));
    public static Target DIV_CIUDAD_1 = Target.the("selecciona la ciudad").located(By.xpath("//ng-message[text()='City is required']"));
    public static Target INPUT_PROVINCIA = Target.the("lista de provincias").located(By.xpath("//span[@class='btn btn-default form-control ui-select-toggle']"));
    public static Target SPAN_PROVINCIA_1 = Target.the("lista de provincias").located(By.xpath("//div[text()='Alberta']"));
    public static Target INPUT_PASSWORD = Target.the("escribe la contraseña y la confirma").locatedBy("//input[@id'{0}']");
    public static Target SPAN_CHECK_1 = Target.the("aceptar termino y condicones").located(By.xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));
    public static Target SPAN_CHECK_2 = Target.the("aceptar termino y condicones").located(By.xpath("//span[@class='checkmark signup-consent__checkbox']"));
    public static Target SPAN_CHECK_3 = Target.the("aceptar termino y condicones").located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']']"));


}
