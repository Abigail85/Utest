package com.amazon.tasks;


import com.amazon.interactions.IngresarDatosContrasenas;
import com.amazon.interactions.IngresarDatosDeUbicacion;
import com.amazon.interactions.IngresarDatosDispositivos;
import com.amazon.interactions.IngresarDatosPersonales;
import com.amazon.models.Utest_Datos;
import com.amazon.models.Utest_Dispositivos;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;



import java.util.List;
import java.util.Map;




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
            dispositivos.setSistemaOperativoCelular(userData.get("sistemaOperativoCelular"));

        }
    }

    public static Performable paraLlenarElRegistro(DataTable dataTable) {
        return new IngresarDatos(dataTable);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        int segundos =1;
        // Acciones para completar los datos del usuario
        actor.attemptsTo(IngresarDatosPersonales.con(usuarioDatos));
        // Acciones para completar los datos de ubicacion
        actor.attemptsTo(IngresarDatosDeUbicacion.con(usuarioDatos));
        // Acciones para completar los datos de los dispositivos
        actor.attemptsTo(IngresarDatosDispositivos.con(dispositivos));
        // Acciones para completar contraseñas
        actor.attemptsTo(IngresarDatosContrasenas.con());



    }
}


