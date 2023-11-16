package problema01;

import java.util.*;

/**
 *
 * @author LAB.ELECT
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        //variables 
        String operacion;
        double numero01;
        double numero02;
        double resultado = 0;

        //Operaciones 
        System.out.println("Ingrese el primer numero");
        numero01 = entrada.nextDouble();
        System.out.println("Ingrese el primer numero");
        numero02 = entrada.nextDouble();
        System.out.println("Ingrese la operacion a realizar");
        entrada.nextLine();
        operacion = entrada.nextLine();
        operacion = operacion.toLowerCase();
        System.out.println("Analizando....");

        if (numero01 > numero02) {

            switch (operacion) {
                case "suma":
                    resultado = numero01 + numero02;
                    System.out.printf("El resultado de la operacion es: %.2f\n", resultado);
                    break;
            }
            switch (operacion) {
                case "resta":
                    resultado = numero01 - numero02;
                    System.out.printf("El resultado de la operacion es: %.2f\n", resultado);
                    break;
            }
            switch (operacion) {
                case "multiplicacion":
                    resultado = numero01 * numero02;
                    System.out.printf("El resultado de la operacion es: %.2f\n", resultado);
                    break;
            }
            switch (operacion) {
                case "division":
                    resultado = numero01 / numero02;
                    System.out.printf("El resultado de la operacion es: %.2f\n", resultado);
                    break;

            }
        } else {

            System.out.printf("numeros no validos \n", resultado);
        }

    }

}
