package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal {

    public static Target BUTTON_UNETE = Target.the("Ingresa para crear el regsitro del usuario").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
