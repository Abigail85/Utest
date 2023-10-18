package com.amazon.stepdefinitions;


import com.amazon.exceptions.ElUsuarioNoFueCreado;
import com.amazon.questions.ElMensajeEnPantalla;
import com.amazon.questions.LeerTextoSiExiste;
import com.amazon.tasks.IngresarDatos;
import com.amazon.tasks.PaginaPrincipal;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.core.annotations.findby.By;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;



import static com.amazon.exceptions.ElUsuarioNoFueCreado.EL_USUARIO_NO_FUE_CREADO;

import static com.amazon.utils.MensajesFinales.MENSAJE_CREACION_EXITOSA;
import static com.amazon.utils.MensajesFinales.MENSAJE_CREACION_FALLIDA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class CrearUsuarioStepDefinitions {

    @Dado("que una persona quiere ingresar a la pagina Utest")
            public void queUnaPersonaQuiereIngresarALaPaginaUtest(){
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.utest.com/"),
                PaginaPrincipal.crearUsuario()

        );
    }

    @Cuando("^completa todos los datos$")
    public void completaTodosLosDatos(DataTable dataTable) {
        Performable tarea = IngresarDatos.paraLlenarElRegistro(dataTable);
        OnStage.theActorInTheSpotlight().attemptsTo(tarea);
    }


    @Entonces("^debe ver el mensaje de bienvenida$")
    public void debeVerSuUsuarioCreadoDeManeraExitosa() {
        OnStage.theActorInTheSpotlight().attemptsTo(LeerTextoSiExiste.delElemento(By.xpath("//div[@class='image-box-header']/child::h1")));
        OnStage.theActorInTheSpotlight().should(seeThat(ElMensajeEnPantalla.esElIndicado(MENSAJE_CREACION_EXITOSA)).orComplainWith(ElUsuarioNoFueCreado.class, EL_USUARIO_NO_FUE_CREADO));
    }
    @Dado("que una persona vuelve ingresar a la pagina Utest")
    public void queUnaPersonaVuelveIngresarALaPaginaUtest(){
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.utest.com/"),
                PaginaPrincipal.crearUsuario()

        );
    }
    @Cuando("^intenta completar con los mismos datos$")
    public void intentaCompletarConLosMismosDatos(DataTable dataTable) {
        Performable tarea = IngresarDatos.paraLlenarElRegistro(dataTable);
        OnStage.theActorInTheSpotlight().attemptsTo(tarea);
    }


    @Entonces("^no debe ver el mensaje de bienvenida$")
    public void debeVerUnMensajeUsuarioCreadoDeManeraIncorrecta() {
        OnStage.theActorInTheSpotlight().attemptsTo(LeerTextoSiExiste.delElemento(By.xpath("//div[@class='image-box-header']/child::h1")));
        OnStage.theActorInTheSpotlight().should(seeThat(ElMensajeEnPantalla.esElIndicado(MENSAJE_CREACION_FALLIDA)).orComplainWith(ElUsuarioNoFueCreado.class, EL_USUARIO_NO_FUE_CREADO));

}

}






