# SpringBoot-GraphQL01
Aplicación Spring boot con GraphQL basica (vehiculos)

se puede probar con
http://localhost:8080/graphiqls
esto entra en un entorno web para GraphQL:

luego se ejecuan las consultas necesarias, por ejemplo

mutation {
   creaVehicul(tipo: "carruaje", codigoModelo: "car300", nombreMarca: "carruaje", fechaLanz: "2018-05-17") 
  {
    id
  }
}

se pueden ver n elementos creados con
query {
  vehiculos(count: n) 
  {
    id, 
    tipo, 
    codigoModelo
}
}
so solo uno
query {
  vehiculo(id: n) 
  {
    id, 
    tipo, 
    codigoModelo
}
}