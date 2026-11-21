package app;

import model.Direccion;
import model.Empleado;
import model.Persona;
import service.EmpleadoService;
import util.ArchivoUtil;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println("AGENCIA DE TURISMO LLANQUIHUE TOUR");
        System.out.println("=================================================");

        // Direcciones
        Direccion dir1 = new Direccion(
                "Costanera 450",
                "Puerto Varas",
                "Los Lagos");

        Direccion dir2 = new Direccion(
                "O'Higgins 123",
                "Llanquihue",
                "Los Lagos");

        // Cliente
        Persona cliente = new Persona(
                "12345678-9",
                "Fernanda López",
                dir1);

        // Cargar empleados desde CSV
        ArrayList<Empleado> empleados =
                ArchivoUtil.cargarEmpleados();

        // Crear servicio
        EmpleadoService servicio =
                new EmpleadoService();

        // Mostrar cliente
        System.out.println("\n--- CLIENTE ---");
        System.out.println(cliente);

        // Mostrar empleados
        System.out.println("\n--- LISTADO DE EMPLEADOS ---");
        servicio.mostrarEmpleados(empleados);

        // Buscar por cargo
        servicio.buscarPorCargo(
                empleados,
                "Guía de Montaña"
        );

        // Contar empleados
        servicio.contarEmpleados(empleados);

        System.out.println("\n=================================================");
        System.out.println("Programa ejecutado correctamente");
    }
}