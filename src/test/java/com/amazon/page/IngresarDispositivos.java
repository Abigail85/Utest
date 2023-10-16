package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarDispositivos {
    public static final Target SPAN_DATOS_COMPUTADOR = Target.the("llenar los campos referentes a tu computadora").locatedBy("//span[text()='{0}']");
    public static final Target SPAN_DATOS_CELULAR = Target.the("selecciona los datos acerca del celular").locatedBy("//span[text()='{0}']");
    public static final Target SPAN_SISTEMA_OPERATIVO_CELULAR = Target.the("selecciona el sistema operativo del celular").located(By.xpath("//span[@class='ui-select-placeholder text-muted ng-hide' and text()='Select OS']"));


}
