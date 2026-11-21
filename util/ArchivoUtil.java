package util;

import model.Direccion;
import model.Empleado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ArchivoUtil {

    public static ArrayList<Empleado> cargarEmpleados() {

        ArrayList<Empleado> empleados = new ArrayList<>();

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("empleados.csv"));

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                String rut = datos[0];
                String nombre = datos[1];
                String calle = datos[2];
                String comuna = datos[3];
                String region = datos[4];
                String cargo = datos[5];

                Direccion direccion = new Direccion(
                        calle,
                        comuna,
                        region
                );

                Empleado empleado = new Empleado(
                        rut,
                        nombre,
                        direccion,
                        cargo
                );

                empleados.add(empleado);
            }

            br.close();

        } catch (Exception e) {

            System.out.println(
                    "Error al leer archivo: "
                            + e.getMessage());
        }

        return empleados;
    }
}