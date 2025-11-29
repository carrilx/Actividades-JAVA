package While;

import java.util.Scanner;

public class PedraPapelTesoira3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int victJ1 = 0, victJ2 = 0, empates = 0, partidas = 0;
        boolean seguirXogando = true;

        while (seguirXogando) {
            String J1, J2;

            // Pedir elección J1
            do {
                System.out.print("J1 (pedra/papel/tesoiras): ");
                J1 = sc.nextLine().trim().toLowerCase();
            } while (!J1.equals("pedra") && !J1.equals("papel") && !J1.equals("tesoiras"));

            // Pedir elección J2
            do {
                System.out.print("J2 (pedra/papel/tesoiras): ");
                J2 = sc.nextLine().trim().toLowerCase();
            } while (!J2.equals("pedra") && !J2.equals("papel") && !J2.equals("tesoiras"));

            partidas++;

            // Lógica con if-else
            if (J1.equals(J2)) {
                System.out.println("Empate!");
                empates++;
            } else if (J1.equals("pedra")) {
                if (J2.equals("tesoiras")) {
                    System.out.println("Gaña J1!");
                    victJ1++;
                } else { // J2 papel
                    System.out.println("Gaña J2!");
                    victJ2++;
                }
            } else if (J1.equals("papel")) {
                if (J2.equals("pedra")) {
                    System.out.println("Gaña J1!");
                    victJ1++;
                } else { // J2 tesoiras
                    System.out.println("Gaña J2!");
                    victJ2++;
                }
            } else if (J1.equals("tesoiras")) {
                if (J2.equals("papel")) {
                    System.out.println("Gaña J1!");
                    victJ1++;
                } else { // J2 pedra
                    System.out.println("Gaña J2!");
                    victJ2++;
                }
            }

            // Resumen parcial
            System.out.println("--- Resumo parcial ---");
            System.out.println("Partidas: " + partidas);
            System.out.println("Vitorias J1: " + victJ1);
            System.out.println("Vitorias J2: " + victJ2);
            System.out.println("Empates: " + empates);

            // Preguntar si continuar
            String seguir;
            do {
                System.out.print("Queres xogar outra partida? S/N: ");
                seguir = sc.nextLine().trim().toUpperCase();
            } while (!seguir.equals("S") && !seguir.equals("N"));

            seguirXogando = seguir.equals("S");
            System.out.println();
        }

        // Resumen final
        System.out.println("=== Resumo final ===");
        System.out.println("Partidas: " + partidas);
        System.out.println("Vitorias J1: " + victJ1);
        System.out.println("Vitorias J2: " + victJ2);
        System.out.println("Empates: " + empates);
        if (victJ1 > victJ2) System.out.println("Gañador final: J1");
        else if (victJ2 > victJ1) System.out.println("Gañador final: J2");
        else System.out.println("Empate xeral");
    }
}
