package com.amazon.questions;


import com.amazon.utils.MensajesFinales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElMensajeEnPantalla implements Question<Boolean> {

    private final String mensaje;

    public ElMensajeEnPantalla(String mensaje){
        this.mensaje=mensaje;
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        String mensajeEnPantalla = actor.recall("Texto leido");

        if (!mensajeEnPantalla.isEmpty()){
        return mensaje.equals(mensajeEnPantalla);
    } else {
            mensajeEnPantalla = MensajesFinales.MENSAJE_CREACION_FALLIDA;
        return mensaje.equals(mensajeEnPantalla);}

    }

        public static ElMensajeEnPantalla esElIndicado (String mensaje) {
            return new ElMensajeEnPantalla(mensaje);

        }
    }



