package com.amazon.stepdefinitions;

import com.amazon.tasks.IngresarDatos;
import com.amazon.tasks.SeleccionarItem;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;


public class AgregarCarritoStepDefinitions {

    @Dado("que una persona quiere ingresar a la pagina Utest")
    public void queUnaPersonaQuiereIngresarALaPaginaUtest() {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.utest.com/"),
                SeleccionarItem.crearUsuario()

        );
}
    @Cuando("completa todos los datos")
    public void completaTodosLosDatos(DataTable dataTable) {
        Performable tarea = IngresarDatos.paraLlenarElRegistro(dataTable);
        OnStage.theActorInTheSpotlight().attemptsTo(tarea);
    }



    @Entonces("debe ver su usuario creado de manera exitosa")
    public void debeVerSuUsuarioCreadoDeManeraExitosa() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
