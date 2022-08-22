# UD25-API03

## URL de la API

https://ud2503.herokuapp.com/

### Endpoints de ALMACENES

  1- Obtener una lista de los almacenes
  - GET /api/almacenes
  
  2- Obtener un almacen por su codigo
  - GET /api/almacenes/{codigo}
  
  3- Insertar un almacen nuevo desde un request body
  - POST /api/almacenes
  
  4- Actualizar un almacen indicando su codigo y sus campos en el body
  - PUT /api/almacenes/{codigo}
  
  5- Borrar un almacen por su codigo 
  - DELETE /api/almacenes/{codigo}

### Endpoints de CAJAS

  1- Obtener una lista de los cajas
  - GET /api/cajas
  
  2- Obtener un caja por su numero de referencia
  - GET /api/cajas/{numreferencia}
  
  3- Insertar un caja nuevo desde un request body
  - POST /api/cajas
  
  4- Actualizar un caja indicando su numero de referencia y sus campos en el body
  - PUT /api/cajas/{numreferencia}
  
  5- Borrar un caja por su ID 
  - DELETE /api/cajas/{numreferencia}
