package menutabernaria;

import java.util.Scanner;

/**
 * Programa de gestión para "A Taberna da Ría"
 *
 * @author carri
 */

/*
*1.Pasar todo o que hai no método main a un novo método.
*2.Non permitas que unha opción falsa chegue ao switch
*3.Pedir opción sexa nun metodo aparte.
*4.Contar número de clientes.
*/

public class Taberna2entregar {

    public static Scanner miScanner = new Scanner(System.in);

    // Constantes de precios
    public static final double PRECIO_BEBIDA = 2.50;
    public static final double PRECIO_COMIDA = 10.00;
    public static final double PRECIO_HABITA = 10.00;

    public static void main(String[] args) {
        MenuTaberna();

    }

    public static void MenuTaberna() {

        // Variables para contabilizar ingresos
        double ingresosAluguer = 0;
        double ingresosBebidasComidas = 0;
        int clientesTotales = 0 ;
        int inquilinosTotales = 0;
        boolean tabernaAberta = true;

        // Mensajes de bienvenida
        System.out.println("¡Benvido/a á Taberna da Ría!");
        System.out.println("Xestiona a túa taberna con sabedoría...\n");

        // Bucle principal
        do {
            System.out.println("=== MENÚ DA TABERNA ===");
            System.out.println("1. Atender cliente (servir comida/bebida)");
            System.out.println("2. Alugar habitación");
            System.out.println("3. Ver ingresos totais obtidos");
            System.out.println("4. Pechar a taberna");
            System.out.print("Elixe unha opción: ");
            
            int opcion = ValidarOpcion();

            // Validación de entrada para evitar crashes
            switch (opcion) {
                case 1:
                    // Atender cliente y acumular ingresos
                    double ingresoCliente = atenderCliente();
                    ingresosBebidasComidas += ingresoCliente;
                    clientesTotales += 1;
                    break;

                case 2:
                    // Alugar habitación y acumular ingresos
                    double ingresoHabitacion = alugarHabitacion();
                    ingresosAluguer += ingresoHabitacion;
                    inquilinosTotales += 1;
                    break;

                case 3:
                    // Ver estadísticas
                    verEstatisticas(ingresosAluguer, ingresosBebidasComidas, clientesTotales, inquilinosTotales);
                    break;

                case 4:
                    // Cerrar taberna
                    tabernaAberta = false;
                    break;

/* Esto ya no hace falta ya que valida en el método
                    default:
                   System.out.println("Opción non válida. Por favor, elixe unha opción correcta.\n");
            
*/
            }

        } while (tabernaAberta);

        // Mensaje de despedida
        System.out.println("\n¡Bo descanso, mañá será outro día!");
        miScanner.close(); // Cerrar Scanner al final

    }

    /**
     * Muestra las estadísticas de ingresos de la taberna
     * @param clientesTotales Total de clientes que pidieron comandas
     * @param ingresosAluguer Total de ingresos por alquiler
     * @param ingresosBebidasComidas Total de ingresos por comidas y bebidas
     * @param inquilinosTotales Total de usuarios do aluguer
     */
    public static void verEstatisticas(double ingresosAluguer, double ingresosBebidasComidas, int clientesTotales, int inquilinosTotales) {
        double gananciasT = ingresosAluguer + ingresosBebidasComidas;
 

        System.out.println("\n=== ESTATÍSTICAS DA TABERNA ===");
        System.out.println("Ingresos obtidos por comidas/bebidas: " + ingresosBebidasComidas + " €");
        System.out.println("Ingresos obtidos polo aluguer: " + ingresosAluguer + " €");
        System.out.println("Clientes totales: " + clientesTotales);
        System.out.println("Inquilinos totales: " + inquilinosTotales);
        System.out.println("Ganancias totais: " + gananciasT + " €\n");
    }

    /**
     * Atiende a un cliente tomando su comanda de bebidas y comidas
     *
     * @return Total de ingresos generados por este cliente
     */
    public static double atenderCliente() {
        double totalComidas = 0.0;
        double totalBebidas = 0.0;
        int opcionComanda;

        do {
            System.out.println("\n--- Comanda ---");
            System.out.println("1. Comida (" + PRECIO_COMIDA + " €)");
            System.out.println("2. Bebida (" + PRECIO_BEBIDA + " €)");
            System.out.println("3. Finalizar");
            System.out.print("Elixe unha opción: ");

            // Validación de entrada
            if (miScanner.hasNextInt()) {
                opcionComanda = miScanner.nextInt();
            } else {
                miScanner.next(); // Limpiar buffer
                opcionComanda = -1; // Opción inválida
            }

            if (opcionComanda == 1) {
                // Servir comidas
                System.out.print("Cantos menús?: ");
                if (miScanner.hasNextInt()) {
                    int numMenus = miScanner.nextInt();
                    if (numMenus > 0) {
                        double costoComidas = numMenus * PRECIO_COMIDA;
                        totalComidas += costoComidas;
                        System.out.println("Serviches " + numMenus + " menús que supón un ingreso de "
                                + costoComidas + " €\n");
                    } else {
                        System.out.println("Número non válido.\n");
                    }
                } else {
                    miScanner.next(); // Limpiar buffer
                    System.out.println("Entrada non válida.\n");
                }

            } else if (opcionComanda == 2) {
                // Servir bebidas
                System.out.print("Cantas bebidas?: ");
                if (miScanner.hasNextInt()) {
                    int numBebidas = miScanner.nextInt();
                    if (numBebidas > 0) {
                        double costoBebidas = numBebidas * PRECIO_BEBIDA;
                        totalBebidas += costoBebidas;
                        System.out.println("Serviches " + numBebidas + " bebidas que supón un ingreso de "
                                + costoBebidas + " €\n");
                    } else {
                        System.out.println("Número non válido.\n");
                    }
                } else {
                    miScanner.next(); // Limpiar buffer
                    System.out.println("Entrada non válida.\n");
                }

            } else if (opcionComanda == 3) {
                // Finalizar comanda
                System.out.println("Comanda finalizada.\n");

            } else {
                System.out.println("Opción non válida. Por favor, elixe unha opción correcta.\n");
            }

        } while (opcionComanda != 3);

        // Devolver total de ingresos por este cliente
        return totalComidas + totalBebidas;
    }

    /**
     * Alquila una habitación al cliente
     *
     * @return Costo total del alquiler
     */
    public static double alugarHabitacion() {
        double costoTotal = 0.0;

        System.out.println("\n--- Aluguer de Habitación ---");
        System.out.print("Cantas noites vai hospedarse o cliente?: ");

        // Validación de entrada
        if (miScanner.hasNextInt()) {
            int noites = miScanner.nextInt();

            if (noites > 0) {
                costoTotal = noites * PRECIO_HABITA;
                System.out.println("Habitación alugada por " + noites + " noites");
                System.out.println("Costo total: " + costoTotal + " €\n");
            } else {
                System.out.println("Número de noites non válido. Non se realizou o aluguer.\n");
            }
        } else {
            miScanner.next(); // Limpiar buffer
            System.out.println("Entrada non válida. Non se realizou o aluguer.\n");
        }

        return costoTotal;
    }

    public static int ValidarOpcion() {
        int opcion;
        do{
            opcion = miScanner.nextInt();
            if(opcion<=0 || opcion>=4){
                System.out.println("Introduce valor valido");
            }
        }while(opcion<=0 || opcion>=4);
        return opcion;
    }
}
