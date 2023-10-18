package com.amazon.interactions;

import com.amazon.models.Utest_Datos;
import com.amazon.utils.ConstantesDatosPersonales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static com.amazon.page.Avanzar.SPAN_SIGUIENTE_DATOS_PERSONALES;
import static com.amazon.page.Avanzar.SPAN_SIGUIENTE_DIRECCION;
import static com.amazon.page.IngresarDatos.*;
import static com.amazon.page.IngresarDatos.INPUT_DATOS_PERSONALES;

public class IngresarDatosPersonales implements Interaction {

    private Utest_Datos usuarioDatos;


    public IngresarDatosPersonales(Utest_Datos usuarioDatos) {
        this.usuarioDatos = usuarioDatos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Guarda nombre,apelliso y correo
        actor.attemptsTo(Enter.theValue(usuarioDatos.getNombre()).into(INPUT_DATOS_PERSONALES.of(ConstantesDatosPersonales.NOMBRE)));
        actor.attemptsTo(Enter.theValue(usuarioDatos.getApellido()).into(INPUT_DATOS_PERSONALES.of(ConstantesDatosPersonales.APELLIDO)));
        actor.attemptsTo(Enter.theValue(usuarioDatos.getCorreo()).into(INPUT_DATOS_PERSONALES.of(ConstantesDatosPersonales.CORREO)));
        actor.attemptsTo(SelectFromOptions.byVisibleText(usuarioDatos.getMesNacimiento()).from(SELECT_FECHA.of(ConstantesDatosPersonales.MES_NACIMIENTO)));
        actor.attemptsTo(SelectFromOptions.byVisibleText(usuarioDatos.getDiaNacimiento()).from(SELECT_FECHA.of(ConstantesDatosPersonales.DIA_NACIMIENTO)));
        actor.attemptsTo(SelectFromOptions.byVisibleText(usuarioDatos.getAnoNacimiento()).from(SELECT_FECHA.of(ConstantesDatosPersonales.ANO_NACIMIENTO)));
        actor.attemptsTo(Click.on(SPAN_SIGUIENTE_DATOS_PERSONALES));
        actor.attemptsTo(Click.on(SPAN_PAIS));
        actor.attemptsTo(Click.on(SPAN_PAIS_1));
        actor.attemptsTo(DoubleClick.on(INPUT_DATOS_PERSONALES.of(ConstantesDatosPersonales.CIUDAD)));
        actor.attemptsTo(Enter.theValue(usuarioDatos.getCiudadResidencia()).into(INPUT_DATOS_PERSONALES.of(ConstantesDatosPersonales.CIUDAD)));
        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(INPUT_DATOS_PERSONALES.of(ConstantesDatosPersonales.CIUDAD)));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(INPUT_DATOS_PERSONALES.of(ConstantesDatosPersonales.CIUDAD)));
        actor.attemptsTo(Click.on(INPUT_PROVINCIA));
        actor.attemptsTo(Click.on(SPAN_PROVINCIA_1));
        actor.attemptsTo(DoubleClick.on(INPUT_DATOS_PERSONALES.of(ConstantesDatosPersonales.CODIGO_POSTAL)));
        actor.attemptsTo(Enter.theValue(usuarioDatos.getCodigoPostal()).into(INPUT_DATOS_PERSONALES.of(ConstantesDatosPersonales.CODIGO_POSTAL)));
        actor.attemptsTo(Click.on(SPAN_SIGUIENTE_DIRECCION));
    }
    public static IngresarDatosPersonales con(Utest_Datos usuarioDatos){
        return Tasks.instrumented(IngresarDatosPersonales.class,usuarioDatos);
    }
}
