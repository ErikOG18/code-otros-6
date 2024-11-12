package codeOtros;

import java.util.Scanner;

public class Codigo6 {
    public static void main(String[] args) {
        // Declaración e inicialización del array
        int[] n = new int[20];
        
        // Llenar el array con números aleatorios y mostrarlos
        for (int i = 0; i < 20; i++) {
            n[i] = (int)(Math.random() * 381) + 20;
            System.out.print(n[i] + " ");
        }

        System.out.println("\n¿Qué números quiere resaltar? ");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");

        // Crear una instancia del Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int opcion = Integer.parseInt(scanner.nextLine());
        
        // Determinar el múltiplo según la opción seleccionada
        int multiplo = (opcion == 1) ? 5 : 7;
        
        // Mostrar los números resaltados según la opción del usuario
        for (int e : n) {
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] ");
            } else {
                System.out.print(e + " ");
            }
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
