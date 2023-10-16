package com.amazon.tasks;


import com.amazon.models.Utest_Datos;
import com.amazon.models.Utest_Dispositivos;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;


import java.util.List;
import java.util.Map;

import static com.amazon.page.Avanzar.*;
import static com.amazon.page.IngresarDatos.*;
import static com.amazon.page.IngresarDispositivos.*;


public class IngresarDatos implements Task {
    private Utest_Datos usuarioDatos;
    private Utest_Dispositivos dispositivos;

    public IngresarDatos(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        if (!data.isEmpty()) {
            Map<String, String> userData = data.get(0);
            usuarioDatos = new Utest_Datos();
            dispositivos = new Utest_Dispositivos();

            //datos personales
            usuarioDatos.setNombre(userData.get("nombre"));
            usuarioDatos.setApellido(userData.get("apellido"));
            usuarioDatos.setCorreo(userData.get("correo"));
            usuarioDatos.setMesNacimiento(userData.get("mesNacimiento"));
            usuarioDatos.setDiaNacimiento(userData.get("diaNacimiento"));
            usuarioDatos.setAnoNacimiento(userData.get("anoNacimiento"));
            usuarioDatos.setPaisResidencia(userData.get("paisResidencia"));
            usuarioDatos.setCiudadResidencia(userData.get("ciudadResidencia"));
            usuarioDatos.setCodigoPostal(userData.get("codigoPostal"));
            usuarioDatos.setProvincia(userData.get("provincia"));
            //Datos del dispositivo "Computador"
            dispositivos.setSistemaOperativoComputador(userData.get("sistemaOperativoComputador"));
            dispositivos.setVersionSistemaOperativoComputador(userData.get("versionsistemaOperativo"));
            dispositivos.setIdiomaComputador(userData.get("idiomaComputador"));
            ////Datos del dispositivo "Celular"
            dispositivos.setMarcaCelular(userData.get("marcaCelular"));
            dispositivos.setModeloCelular(userData.get("modeloCelular"));
            dispositivos.setSistemaOperativoCelular(userData.get("msistemaOperativocelular"));



        }
    }

    public static Performable paraLlenarElRegistro(DataTable dataTable) {
        return new IngresarDatos(dataTable);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        // Acciones para completar los datos del usuario
        actor.attemptsTo(Enter.theValue(usuarioDatos.getNombre()).into(INPUT_DATOS_PERSONALES.of("firstName")));
        actor.attemptsTo(Enter.theValue(usuarioDatos.getApellido()).into(INPUT_DATOS_PERSONALES.of("lastName")));
        actor.attemptsTo(Enter.theValue(usuarioDatos.getCorreo()).into(INPUT_DATOS_PERSONALES.of("email")));
        actor.attemptsTo(SelectFromOptions.byVisibleText(usuarioDatos.getMesNacimiento()).from(SELECT_FECHA.of("birthMonth")));
        actor.attemptsTo(SelectFromOptions.byVisibleText(usuarioDatos.getDiaNacimiento()).from(SELECT_FECHA.of("birthDay")));
        actor.attemptsTo(SelectFromOptions.byVisibleText(usuarioDatos.getAnoNacimiento()).from(SELECT_FECHA.of("birthYear")));
        actor.attemptsTo(Click.on(SPAN_SIGUIENTE_DATOS_PERSONALES));
        actor.attemptsTo(Click.on(SPAN_PAIS));
        actor.attemptsTo(Click.on(SPAN_PAIS_1));
        actor.attemptsTo(DoubleClick.on(INPUT_DATOS_PERSONALES.of("city")));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(INPUT_DATOS_PERSONALES.of("city")));
        actor.attemptsTo(Enter.theValue(usuarioDatos.getCiudadResidencia()).into(INPUT_DATOS_PERSONALES.of("city")));
        actor.attemptsTo(Click.on(DIV_CIUDAD));
        actor.attemptsTo(Click.on(INPUT_PROVINCIA));
        actor.attemptsTo(Click.on(SPAN_PROVINCIA_1));
        actor.attemptsTo(Click.on(INPUT_CODIGO_POSTAL));
        actor.attemptsTo(Enter.theValue(usuarioDatos.getCodigoPostal()).into(INPUT_CODIGO_POSTAL));
        actor.attemptsTo(Click.on(SPAN_SIGUIENTE_DIRECCION));
        // Acciones para completar los datos del computador
        actor.attemptsTo(SelectFromOptions.byVisibleText(dispositivos.getSistemaOperativoComputador()).from(SPAN_DATOS_COMPUTADOR.of("Windows")));
        actor.attemptsTo(SelectFromOptions.byVisibleText(dispositivos.getVersionSistemaOperativoComputador()).from(SPAN_DATOS_COMPUTADOR.of("10")));
        actor.attemptsTo(SelectFromOptions.byVisibleText(dispositivos.getIdiomaComputador()).from(SPAN_DATOS_COMPUTADOR.of("Spanish")));
        // Acciones para completar los datos del mobil
        actor.attemptsTo(SelectFromOptions.byVisibleText(dispositivos.getMarcaCelular()).from(SPAN_DATOS_COMPUTADOR.of("Select Brand")));
        actor.attemptsTo(SelectFromOptions.byVisibleText(dispositivos.getModeloCelular()).from(SPAN_DATOS_CELULAR.of("Select a Model")));
        actor.attemptsTo(Enter.theValue(dispositivos.getSistemaOperativoCelular()).into(SPAN_SISTEMA_OPERATIVO_CELULAR));
        actor.attemptsTo(Click.on(SPAN_SIGUIENTE_DISPOSITIVOS));
        // Acciones para completar contraseñas
        actor.attemptsTo(Enter.theValue("12345678").into(INPUT_PASSWORD.of("password")));
        actor.attemptsTo(Enter.theValue("12345678").into(INPUT_PASSWORD.of("confirmPassword")));
        actor.attemptsTo(Click.on(SPAN_CHECK_1));
        actor.attemptsTo(Click.on(SPAN_CHECK_2));
        actor.attemptsTo(Click.on(SPAN_CHECK_3));
        actor.attemptsTo(Click.on(SPAN_COMPLETAR));


    }
}


