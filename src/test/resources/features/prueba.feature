#Autor: Jaime Torres
#language: es

@HistoriaDeUsuario
  Característica: Verificar el ingreso correcto a la pagina serenity.is
    yo como usuario quiero ingresar a la pagina para verificar que tengo acceso

  @CasoIngreso
  Escenario: Verificar el ingreso correcto
    Dado que Jaime ingresa a la pagina serenity.is
    Cuando digita las credenciales e ingresa a la pagina
    Entonces verifica que pudo ingresar correctamente

    @CasoBusinessUnits
    Escenario: Crear nueva unidad de negocio
      Dado que Jaime ingresa a la pagina serenity.is
      Cuando digita las credenciales e ingresa a la pagina
      Y creo la unidad de negocio desde el menu organization
      Y creo una nueva reunion desde el menu meeting
      Entonces verifica que pudo crear la reunion






