/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author Usuario
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        
        String acumulador = "";

        // Se crean variables para almacenar la suma total en cada uno
        int totalC1 = 0;
        int totalC2 = 0;
        int totalC3 = 0;
        int totalC4 = 0;

        // El ciclo que inicia en 30 y termina en 10 y decrementando en 1
        for (int i = 30; i >= 10; i--) {

            // Calculamos los múltiplos de i
            int valor1 = i;
            int valor2 = i * 2;
            int valor3 = i * 3;
            int valor4 = i * 4;

           
            totalC1 = totalC1 + valor1;
            totalC2 = totalC2 + valor2;
            totalC3 = totalC3 + valor3;
            totalC4 = totalC4 + valor4;

            // Se concatena y se agregan las variables
            String mensaje = String.format("%d-%d-%d-%d\n", valor1, valor2,
                    valor3, valor4);

            acumulador = acumulador + mensaje;
        }

        acumulador = acumulador + "\n";

        String mensajeFinal = String.format("Totales = %d-%d-%d-%d",
                // Se añade todos los totales para presentar el mensaje
                totalC1,
                totalC2,
                totalC3,
                totalC4);

        acumulador = acumulador + mensajeFinal;

        System.out.println(acumulador);
    }
}
