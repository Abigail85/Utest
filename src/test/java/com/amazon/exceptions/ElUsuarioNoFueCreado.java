package com.amazon.exceptions;


public class ElUsuarioNoFueCreado extends AssertionError{
    public static final String EL_USUARIO_NO_FUE_CREADO = "El mensaje que muestra en pantalla no es el mismo porque el usuario no se creo de manera exitosa";
        public ElUsuarioNoFueCreado(String message, Throwable cause){super(message, cause);}
}
