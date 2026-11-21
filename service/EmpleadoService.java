package service;

import model.Empleado;
import java.util.ArrayList;

public class EmpleadoService {

    public void mostrarEmpleados(ArrayList<Empleado> empleados) {

        for (Empleado empleado : empleados) {

            System.out.println("----------------------");
            System.out.println(empleado);
        }
    }

    public void buscarPorCargo(
            ArrayList<Empleado> empleados,
            String cargo) {

        System.out.println("\n--- BUSQUEDA POR CARGO ---");

        for (Empleado empleado : empleados) {

            if (empleado.getCargo().equalsIgnoreCase(cargo)) {

                System.out.println(empleado);
            }
        }
    }

    public void contarEmpleados(
            ArrayList<Empleado> empleados) {

        System.out.println(
                "\nCantidad total de empleados: "
                        + empleados.size());
    }
}