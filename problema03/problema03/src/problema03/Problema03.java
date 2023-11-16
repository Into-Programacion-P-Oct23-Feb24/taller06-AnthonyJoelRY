package problema03;

import java.util.*;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        //variables 
        String tipoEm;
        String nombre;
        double sueldo;
        double sueldoFinal = 0;
        double aumento;

        //operaciones 
        System.out.println("Ingrese su nombre y apellido");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el tipo de empleado");
        tipoEm = entrada.nextLine();
        tipoEm = tipoEm.toLowerCase();
        System.out.println("Ingrese su sueldo");
        sueldo = entrada.nextDouble();

        switch (tipoEm) {
            case "tipo 1":
                aumento = (sueldo * 0.05);
                sueldoFinal = sueldo + aumento;
                System.out.printf("--Datos de empleado--\n Nombre: %s\n Tipo "
                        + "de empleado: tipo de emplaedo 1\n Sueldo anterior: "
                        + "%.2f\n Nuevo sueldo: %.2f\n",
                        nombre, sueldo, sueldoFinal);
                break;
        }

        switch (tipoEm) {
            case "tipo 2":
                aumento = (sueldo * 0.07);
                sueldoFinal = sueldo + aumento;
                System.out.printf("--Datos de empleado--\n Nombre: %s\n Tipo "
                        + "de empleado: tipo de emplaedo 2\n Sueldo anterior: "
                        + "%.2f\n Nuevo sueldo: %.2f\n",
                        nombre, sueldo, sueldoFinal);
                break;
        }

        switch (tipoEm) {
            case "tipo 3":
                aumento = (sueldo * 0.09);
                sueldoFinal = sueldo + aumento;
                System.out.printf("--Datos de empleado--\n Nombre: %s\n Tipo "
                        + "de empleado: tipo de emplaedo 3\n Sueldo anterior: "
                        + "%.2f\n Nuevo sueldo: %.2f\n",
                        nombre, sueldo, sueldoFinal);
                break;
        }

        switch (tipoEm) {
            case "tipo 4":
                aumento = (sueldo * 0.12);
                sueldoFinal = sueldo + aumento;
                System.out.printf("--Datos de empleado--\n Nombre: %s\n Tipo "
                        + "de empleado: tipo de emplaedo 4\n Sueldo anterior: "
                        + "%.2f\n Nuevo sueldo: %.2f\n",
                        nombre, sueldo, sueldoFinal);
                break;
        }

        switch (tipoEm) {
            case "tipo 5":
                aumento = (sueldo * 0.15);
                sueldoFinal = sueldo + aumento;
                System.out.printf("--Datos de empleado--\n Nombre: %s\n Tipo "
                        + "de empleado: tipo de emplaedo 5\n Sueldo anterior: "
                        + "%.2f\n Nuevo sueldo: %.2f\n",
                        nombre, sueldo, sueldoFinal);
                break;
        }

    }

}
