package com.amazon.interactions;

import com.amazon.models.Utest_Datos;
import com.amazon.utils.ConstantesDatosPersonales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static com.amazon.page.Avanzar.SPAN_SIGUIENTE_DATOS_PERSONALES;
import static com.amazon.page.Avanzar.SPAN_SIGUIENTE_DIRECCION;
import static com.amazon.page.IngresarDatos.*;

public class IngresarDatosDeUbicacion implements Interaction {

    private Utest_Datos usuarioDatos;


    public IngresarDatosDeUbicacion(Utest_Datos usuarioDatos) {
        this.usuarioDatos = usuarioDatos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //llena los campos de ubicacion geografica
        actor.attemptsTo(Click.on(SPAN_PAIS));
        actor.attemptsTo(Click.on(DIV_UBICACION_GEOGRAFICA.of(usuarioDatos.getPaisResidencia())));
        actor.attemptsTo(Click.on(BUTTON_CLEAR));
        actor.attemptsTo(Enter.theValue(usuarioDatos.getCiudadResidencia()).into(INPUT_CITY));
        actor.attemptsTo(MoveMouse.to(INPUT_CITY_ARROW));
        actor.attemptsTo(Click.on(INPUT_CITY_ARROW));
        //actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(INPUT_CITY_ARROW));
        actor.attemptsTo(Click.on(INPUT_PROVINCIA));
        actor.attemptsTo(MoveMouse.to(DIV_UBICACION_GEOGRAFICA.of(usuarioDatos.getProvincia())));
        actor.attemptsTo(Click.on(DIV_UBICACION_GEOGRAFICA.of(usuarioDatos.getProvincia())));
        actor.attemptsTo(DoubleClick.on(INPUT_DATOS_PERSONALES.of(ConstantesDatosPersonales.CODIGO_POSTAL)));
        actor.attemptsTo(Enter.theValue(usuarioDatos.getCodigoPostal()).into(INPUT_DATOS_PERSONALES.of(ConstantesDatosPersonales.CODIGO_POSTAL)));
        actor.attemptsTo(Click.on(SPAN_SIGUIENTE_DIRECCION));
    }
    public static IngresarDatosDeUbicacion con(Utest_Datos usuarioDatos){
        return Tasks.instrumented(IngresarDatosDeUbicacion.class,usuarioDatos);
    }
}
