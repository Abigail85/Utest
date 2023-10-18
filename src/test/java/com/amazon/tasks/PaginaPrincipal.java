package com.amazon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static com.amazon.page.PaginaPrincipal.BUTTON_UNETE;


public class PaginaPrincipal {
    public static Performable crearUsuario() {
        return Task.where("{0} buscando items con envío a Colombia",
                Click.on(BUTTON_UNETE)

        );
    }
    public static Performable LeerMensajeEnpantalla() {
        return Task.where("{0} buscando items con envío a Colombia"


        );
    }
}
