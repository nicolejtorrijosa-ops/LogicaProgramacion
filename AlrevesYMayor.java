package Clases;
public class AlrevesYMayor {

    public static void main(String[] args) {

        int[] numeros = new int[5];
        int mayor;

        for (int i = 0; i < 5; i++) {
            numeros[i] = Entrada.leerEntero("Numero " + (i + 1) + ": ");
        }

        System.out.print("Al reves: ");

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        mayor = numeros[0];

        for (int i = 1; i < 5; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El mayor es: " + mayor);

    }
}