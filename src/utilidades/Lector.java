package utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lector {

    private static final Scanner scanner = new Scanner(System.in);

    public static String leerString(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine().trim();
    }

    public static char leerCaracter(String mensaje) {
        char caracter = '\0';
        boolean valido = false;
        do {
            System.out.print(mensaje);
            String entrada = scanner.nextLine().trim();
            if (!entrada.isEmpty()) {
                caracter = entrada.charAt(0);
                valido = true;
            } else {
                System.out.println("Entrada inválida. Intenta de nuevo.");
            }
        } while (!valido);
        return caracter;
    }

    public static int leerInt(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Número entero inválido. Intenta de nuevo.");
            }
        }
    }

    public static long leerLong(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Long.parseLong(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Número largo inválido. Intenta de nuevo.");
            }
        }
    }

    public static float leerFloat(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Float.parseFloat(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Número decimal (float) inválido. Intenta de nuevo.");
            }
        }
    }

    public static double leerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Número decimal (double) inválido. Intenta de nuevo.");
            }
        }
    }

    public static boolean leerBoolean(String mensaje) {
        while (true) {
            System.out.print(mensaje + " (sí/no): ");
            String entrada = scanner.nextLine().trim().toLowerCase();
            if (entrada.equals("sí") || entrada.equals("si") || entrada.equals("s")) {
                return true;
            } else if (entrada.equals("no") || entrada.equals("n")) {
                return false;
            } else {
                System.out.println("Entrada inválida. Escribe 'sí' o 'no'.");
            }
        }
    }
}

