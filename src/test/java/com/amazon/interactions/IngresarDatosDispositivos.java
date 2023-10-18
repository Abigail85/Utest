package com.amazon.interactions;

import com.amazon.models.Utest_Dispositivos;
import com.amazon.utils.ConstantesDatosDispositivos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.actions.Click;


import static com.amazon.page.Avanzar.SPAN_SIGUIENTE_DISPOSITIVOS;
import static com.amazon.page.IngresarDispositivos.*;

public class IngresarDatosDispositivos implements Interaction {

   private Utest_Dispositivos dispositivos;

    public IngresarDatosDispositivos(Utest_Dispositivos dispositivos) {
        this.dispositivos = dispositivos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Selecciona el sistema operativo que usa el usuario
        actor.attemptsTo(
                Click.on(SPAN_DATOS_DISPOSITIVOS.of(dispositivos.getSistemaOperativoComputador())),
                Click.on(DIV_DATOS_DISPOSITIVOS.of(dispositivos.getSistemaOperativoComputador()))
        );
        //Selecciona la version del sistemas operativo que usa el usuario
        actor.attemptsTo(
                Click.on(SPAN_DATOS_DISPOSITIVOS.of(ConstantesDatosDispositivos.VERSION_SISTEMA_OPERATIVO_COMPUTADOR)),
                Click.on(DIV_DATOS_DISPOSITIVOS.of(dispositivos.getVersionSistemaOperativoComputador()))
        );
        //Selecciona el idioma del sistemas operativo que usa el usuario
        actor.attemptsTo(
                Click.on(SPAN_DATOS_DISPOSITIVOS.of(ConstantesDatosDispositivos.LENGUAJE_COMPUTADOR)),
                Click.on(DIV_DATOS_DISPOSITIVOS.of(dispositivos.getIdiomaComputador()))
        );

        // Acciones para completar los datos del Celular
        //Selecciona la marca de celular que usa el usuario
        actor.attemptsTo(
                Click.on(SPAN_DATOS_DISPOSITIVOS.of(ConstantesDatosDispositivos.MARCA_CELULAR)),
                Click.on(DIV_DATOS_DISPOSITIVOS.of(dispositivos.getMarcaCelular()))
        );
        //Selecciona el modelo de celular que usa el usuario
        actor.attemptsTo(
                Click.on(SPAN_DATOS_DISPOSITIVOS.of(ConstantesDatosDispositivos.MODELO_CELULAR)),
                Click.on(DIV_DATOS_DISPOSITIVOS.of(dispositivos.getModeloCelular()))
        );
        //Selecciona el sistemas operativo del celular que usa el usuario
        actor.attemptsTo(
                Click.on(SELECT_DATOS_DISPOSITIVOS.of(ConstantesDatosDispositivos.SISTEMA_OPERATIVO_CELULAR)),
                Click.on(DIV_DATOS_DISPOSITIVOS.of(dispositivos.getSistemaOperativoCelular()))
        );
        //Guarda la informacion
        actor.attemptsTo(Click.on(SPAN_SIGUIENTE_DISPOSITIVOS));

    }

    public static IngresarDatosDispositivos con(Utest_Dispositivos dispositivos){
        return Tasks.instrumented(IngresarDatosDispositivos.class,dispositivos);

    }
}
