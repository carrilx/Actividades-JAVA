/*
 * ProgramaAvanzado.java
 * ---------------------
 * Ejemplo de un programa en Java más completo que incluye:
 * - Menú interactivo
 * - Arrays para guardar notas
 * - Métodos separados para organizar el código
 * - Condicionales y bucles
 * - Control de errores en la entrada del usuario
 *
 * Autor: Xaime Carril
 * Fecha: 2025
 */

package fundamentos;

import java.util.Scanner;

public class ProgramaAvanzado {

    // Scanner global para leer datos del usuario
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        // Variables principales
        String nombre;
        int edad;
        double[] notas; // Array para guardar varias notas
        int opcion;

        System.out.println("=== Bienvenido al Programa Avanzado ===");

        // Pedimos información básica al usuario
        System.out.print("Introduce tu nombre: ");
        nombre = entrada.nextLine();
        while (contieneDigitos(nombre)){
        System.out.println("Introduce un nombre valido.");
        nombre = entrada.nextLine();
        }
       
        

        edad = leerEntero("Introduce tu edad: ");

        // Creamos el array de notas
        int cantidadNotas = leerEntero("¿Cuántas notas quieres introducir? ");
        notas = new double[cantidadNotas];

        // Bucle para llenar el array de notas
        for (int i = 0; i < cantidadNotas; i++) {
            notas[i] = leerDecimal("Introduce la nota " + (i + 1) + ": ");
        }

        // Menú interactivo
        do {
            mostrarMenu();
            opcion = leerEntero(""); // lee la opción con control

            switch (opcion) {
                case 1:
                    mostrarDatos(nombre, edad, notas);
                    break;
                case 2:
                    double promedio = calcularPromedio(notas);
                    System.out.println("Promedio de notas: " + promedio);
                    break;
                case 3:
                    int num1 = leerEntero("Introduce un número: ");
                    int num2 = leerEntero("Introduce otro número: ");
                    int suma = sumar(num1, num2);
                    System.out.println("La suma es: " + suma);
                    break;
                case 4:
                    System.out.println("¡Saliendo del programa! ✅");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }

        } while (opcion != 4);

        entrada.close();
    }

    // ---------------- MÉTODOS ----------------

    /**
     * Muestra las opciones del menú
     */
    public static void mostrarMenu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Mostrar datos del usuario");
        System.out.println("2. Calcular promedio de notas");
        System.out.println("3. Sumar dos números");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }

    /**
     * Muestra los datos del usuario
     */
    public static void mostrarDatos(String nombre, int edad, double[] notas) {
        System.out.println("\n--- DATOS DEL USUARIO ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.print("Notas: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }

    /**
     * Calcula el promedio de un array de notas
     */
    public static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    /**
     * Método que suma dos enteros
     */
    public static int sumar(int a, int b) {
        return a + b;
    }

    // =================== MÉTODOS DE LECTURA SEGURA ===================

    /**
     * Lee un número entero del usuario con validación.
     */
    public static int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (entrada.hasNextInt()) {
                int valor = entrada.nextInt();
                entrada.nextLine(); // limpia el buffer
                return valor;
            } else {
                System.out.println("❌ Error: Debes introducir un número entero válido.");
                entrada.nextLine(); // limpia el texto incorrecto
            }
        }
    }
    
    public static boolean contieneDigitos(String texto) {
        for (int i=0; i<texto.length(); i++){
            if (Character.isDigit(texto.charAt(i))){
                return true;
            }
        }
        return false;
    }

    /**
     * Lee un número decimal del usuario con validación.
     */
    public static double leerDecimal(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (entrada.hasNextDouble()) {
                double valor = entrada.nextDouble();
                entrada.nextLine(); // limpia el buffer
                return valor;
            } else {
                System.out.println("❌ Error: Debes introducir un número decimal válido.");
                entrada.nextLine(); // limpia el texto incorrecto
            }
        }
    }
}
