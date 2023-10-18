package com.amazon.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.amazon.page.Avanzar.SPAN_COMPLETAR;
import static com.amazon.page.IngresarDatos.*;
import static com.amazon.page.IngresarDatos.SPAN_CHECK_3;

public class IngresarDatosContrasenas implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        int segundos =40;
        actor.attemptsTo(Click.on(INPUT_PASSWORD));
        actor.attemptsTo(Enter.theValue("Abigail85!38").into(INPUT_PASSWORD));
        actor.attemptsTo(Click.on(INPUT_CONFIRMA_PASSWORD));
        actor.attemptsTo(Enter.theValue("Abigail85!38").into(INPUT_CONFIRMA_PASSWORD));
        actor.attemptsTo(Click.on(SPAN_CHECK_1));
        actor.attemptsTo(Click.on(SPAN_CHECK_2));
        actor.attemptsTo(Click.on(SPAN_CHECK_3));
        actor.attemptsTo(Click.on(SPAN_COMPLETAR));
        try {
            Thread.sleep(segundos*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static IngresarDatosContrasenas con(){
        return Tasks.instrumented(IngresarDatosContrasenas.class);
    }
}
