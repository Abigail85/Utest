# language: es
Característica: Crear usuario
  Yo deseo ingresar a una pagina Utest y para ello necesito crear mi usuario


  Escenario: Crear un usuario
    Dado que una persona quiere ingresar a la pagina Utest
    Cuando completa todos los datos
      | nombre | apellido | correo          | mesNacimiento | diaNacimiento | anoNacimiento | paisResidencia | ciudadResidencia   | codigoPostal | sistemaOperativoComputador | versionsistemaOperativo | idiomaComputador | marcaCelular | modeloCelular  | sistemaOperativoCelular | provincia |
      | Alexis | Moros    | amoros@test.com | May           | 5             | 1999          | Canada         | Calgary AB, Canada | 51.0174      | windows                    | 10                      | Spanish          | Alcatel      | One Touch Idol | Android 5.1.1           | Alberta   |
    Entonces debe ver su usuario creado de manera exitosa


























