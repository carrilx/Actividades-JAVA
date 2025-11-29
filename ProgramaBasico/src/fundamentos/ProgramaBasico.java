/*
 * ProgramaBasico.java
 * -------------------
 * Ejemplo de un programa simple en Java que muestra los elementos esenciales del lenguaje:
 * - Variables
 * - Entrada de datos con Scanner
 * - Estructuras condicionales (if / else)
 * - Bucles (for, while)
 * - Métodos
 *
 * Autor: Xaime Carril
 * Fecha: 2025
 */

package fundamentos;

import java.util.Scanner; // Importamos Scanner para leer datos del teclado

public class ProgramaBasico {

    // Método principal: punto de entrada del programa
    public static void main(String[] args) {

        // Creamos un objeto Scanner para leer los datos que introduzca el usuario
        Scanner entrada = new Scanner(System.in);

        // --- 1. DECLARACIÓN DE VARIABLES ---
        // Definimos las variables que usaremos en el programa
        int edad;              // Para guardar la edad del usuario
        String nombre;         // Para guardar el nombre del usuario
        double notaMedia;      // Para guardar la nota media (puede tener decimales)

        // --- 2. ENTRADA DE DATOS ---
        // Solicitamos los datos al usuario y los guardamos en las variables
        System.out.print("Introduce tu nombre: ");
        nombre = entrada.nextLine(); // Lee una línea de texto completa

        System.out.print("Introduce tu edad: ");
        edad = entrada.nextInt(); // Lee un número entero

        System.out.print("Introduce tu nota media: ");
        notaMedia = entrada.nextDouble(); // Lee un número decimal

        // --- 3. SALIDA DE INFORMACIÓN BÁSICA ---
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

        // --- 4. ESTRUCTURAS CONDICIONALES (IF / ELSE) ---
        // Comprobamos si la persona es mayor o menor de edad
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        // Comprobamos si la nota media es suficiente para aprobar
        if (notaMedia >= 5.0) {
            System.out.println("Has aprobado con una nota media de " + notaMedia);
        } else {
            System.out.println("Has suspendido con una nota media de " + notaMedia);
        }

        // --- 5. BUCLE FOR ---
        // Un bucle que repite un bloque de código un número determinado de veces
        System.out.println("\nContando del 1 al 5 con un bucle for:");
        for (int i = 1; i <= 5; i++) { // i empieza en 1 y se incrementa hasta 5
            System.out.println("Número: " + i);
        }

        // --- 6. BUCLE WHILE ---
        // Un bucle que se repite mientras una condición sea verdadera
        System.out.println("\nCuenta atrás desde 5 con un bucle while:");
        int contador = 5; // Variable que usaremos para contar hacia atrás
        while (contador > 0) {
            System.out.println("Contador: " + contador);
            contador--; // Decrementamos el contador en 1
        }

        // --- 7. LLAMADA A UN MÉTODO ---
        // Aquí usamos un método definido más abajo para realizar una suma
        int resultado = sumar(5, 7);
        System.out.println("\nLa suma de 5 + 7 es: " + resultado);

        // Cerramos el Scanner (buena práctica para liberar recursos)
        entrada.close();

        System.out.println("\nPrograma finalizado correctamente ✅");
    }

    // --- 8. DEFINICIÓN DE MÉTODOS ---
    /**
     * Método que recibe dos números enteros, los suma y devuelve el resultado.
     *
     * @param a primer número a sumar
     * @param b segundo número a sumar
     * @return la suma de a y b
     */
    public static int sumar(int a, int b) {
        // El operador "+" realiza la suma de los dos parámetros
        return a + b;
    }
}
