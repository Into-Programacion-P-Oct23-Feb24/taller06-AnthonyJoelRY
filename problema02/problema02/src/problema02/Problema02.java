package problema02;

import java.util.*;

/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        //variables 
        String tipoAuto;
        String nombre;
        double valor;
        double valorFinal = 0;
        double avaluo;

        //operaciones 
        System.out.println("Ingrese su nombre y apellido");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el tipo de auto");
        tipoAuto = entrada.nextLine();
        tipoAuto = tipoAuto.toLowerCase();
        System.out.println("Ingrese el valor del auto");
        valor = entrada.nextDouble();

        switch (tipoAuto) {
            case "tipo 1":
                avaluo = (valor * 0.01) / 100;
                valorFinal = avaluo + 2;
                System.out.printf("Peaje (Buena via): \n Propietario: %s "
                        + "\n Tipo: vehiculo liviano particular "
                        + "\n valor: %.2f\n Peaje: %.2f\n",
                        nombre, valor, valorFinal);
                break;

        }
        switch (tipoAuto) {
            case "tipo 2":
                avaluo = (valor * 0.02) / 100;
                valorFinal = avaluo + 2.5;
                System.out.printf("Peaje (Buena via): \n Propietario: %s "
                        + "\n Tipo: vehiculo grande particular "
                        + "\n valor: %.2f\n Peaje: %.2f\n",
                        nombre, valor, valorFinal);
                break;

        }
        switch (tipoAuto) {
            case "tipo 3":
                avaluo = (valor * 0.04) / 100;
                valorFinal = avaluo + 1.5;
                System.out.printf("Peaje (Buena via): \n Propietario: %s "
                        + "\n Tipo: Taxi "
                        + "\n valor: %.2f\n Peaje: %.2f\n",
                        nombre, valor, valorFinal);
                break;

        }
        switch (tipoAuto) {
            case "tipo 4":
                avaluo = (valor * 0.05) / 100;
                valorFinal = avaluo + 2.2;
                System.out.printf("Peaje (Buena via): \n Propietario: %s "
                        + "\n Tipo:Bus Urbano "
                        + "\n valor: %.2f\n Peaje: %.2f\n",
                        nombre, valor, valorFinal);
                break;

        }

    }
}
