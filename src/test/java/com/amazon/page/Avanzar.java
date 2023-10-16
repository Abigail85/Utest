package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Avanzar {
    public static Target SPAN_SIGUIENTE_DATOS_PERSONALES = Target.the("Boton que nos lleva a  la siguiente pantalla").located(By.xpath("//a[@class='btn btn-blue']//span[text()='Next: Location']"));
    public static Target SPAN_SIGUIENTE_DIRECCION = Target.the("Boton que nos lleva a  la siguiente pantalla").located(By.xpath("//a[@class='btn btn-blue pull-right']//span[text()='Next: Devices']"));
    public static Target SPAN_SIGUIENTE_DISPOSITIVOS = Target.the("Boton que nos lleva a  la siguiente pantalla").located(By.xpath("//a[@class='btn btn-blue pull-right']//span[text()='Next: Last Step']"));
    public static Target SPAN_COMPLETAR = Target.the("Boton que completa el formulario").located(By.xpath("//span[text()='Complete Setup']"));
}
