Llanquihue Tour - Sumativa 2
Descripción
Llanquihue Tour es una aplicación desarrollada en Java para gestionar información de empleados de una agencia de turismo.

El sistema permite cargar datos desde un archivo CSV, almacenarlos en una colección ArrayList y realizar consultas sobre los empleados registrados.

Paquetes Utilizados
app
Contiene la clase principal del sistema.

Main.java
model
Contiene las clases del modelo de datos.

Persona.java
Empleado.java
Direccion.java
service
Contiene la lógica de negocio del sistema.

EmpleadoService.java
util
Contiene las utilidades para lectura de archivos.

ArchivoUtil.java
Funcionalidades Implementadas
Gestión de personas y empleados.
Aplicación de herencia entre Persona y Empleado.
Aplicación de composición entre Persona y Direccion.
Lectura de empleados desde archivo CSV.
Almacenamiento de datos mediante ArrayList.
Listado completo de empleados.
Búsqueda de empleados por cargo.
Conteo total de empleados.
Archivo Utilizado
El sistema carga información desde:

empleados.csv
Ejemplo:

98765432-1,Juan Pérez,O'Higgins 123,Llanquihue,Los Lagos,Guía de Montaña
11222333-4,Ana María,Costanera 450,Puerto Varas,Los Lagos,Secretaria
Instrucciones de Ejecución
Abrir el proyecto en IntelliJ IDEA.
Verificar que el archivo empleados.csv esté ubicado en la raíz del proyecto.
Compilar el proyecto.
Ejecutar la clase:
app.Main
El sistema mostrará:
Información del cliente.
Listado de empleados.
Búsqueda de empleados por cargo.
Cantidad total de empleados registrados.
Autor
Gubica Muñoz 
Sumativa 2 - Programación Orientada a Objetos
