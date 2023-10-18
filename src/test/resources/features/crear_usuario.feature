# language: es
Característica: Crear usuario
  Yo deseo ingresar a una pagina Utest y para ello necesito crear mi usuario


  Escenario: Crear un usuario exitosamente
    Dado que una persona quiere ingresar a la pagina Utest
    Cuando completa todos los datos
      | nombre   | apellido | correo           | mesNacimiento | diaNacimiento | anoNacimiento | paisResidencia | ciudadResidencia   | codigoPostal | sistemaOperativoComputador | versionsistemaOperativo | idiomaComputador | marcaCelular | modeloCelular  | sistemaOperativoCelular | provincia |
      | Patricia | Gimenez  | Gimenez@test.com | June          | 5             | 1985          | Canada         | Calgary AB, Canada | 51.0174      | Windows                    | 10                      | Spanish          | Alcatel      | One Touch Idol | Android 5.1.1           | Alberta   |
    Entonces debe ver el mensaje de bienvenida

  Escenario: Intento fallido al crear un usuario existente
    Dado que una persona vuelve ingresar a la pagina Utest
    Cuando intenta completar con los mismos datos
      | nombre  | apellido | correo          | mesNacimiento | diaNacimiento | anoNacimiento | paisResidencia | ciudadResidencia   | codigoPostal | sistemaOperativoComputador | versionsistemaOperativo | idiomaComputador | marcaCelular | modeloCelular  | sistemaOperativoCelular | provincia |
      | sam    | hernan   | hernan@test.com | June          | 5             | 1985          | Canada         | Calgary AB, Canada | 51.0174      | Windows                    | 10                      | Spanish          | Alcatel      | One Touch Idol | Android 5.1.1           | Alberta   |
    Entonces no debe ver el mensaje de bienvenida























