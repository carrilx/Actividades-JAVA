package While;

import java.util.Scanner;

public class SwitchSemana {

    public static void main(String[] args) {

        int dia = 1;

        Scanner miScanner = new Scanner(System.in);

        while (dia >= 1 && dia <= 7) {

            System.out.println("Introduce un número de día (1 = Domingo, 7 = Sábado):");
            dia = miScanner.nextInt();

            switch (dia) {
                case 2: // Lunes
                case 3: // Martes
                case 4: // Miércoles
                case 5: // Jueves
                case 6: // Viernes
                    System.out.println("Día laboral");
                    break;

                case 1: // Domingo
                case 7: // Sábado
                    System.out.println("Fin de semana");
                    break;

                default:
                    System.out.println("A semana so ten 7 días. Por favor, introduce un número válido.");
            }

        }
        miScanner.close();
    }
}
